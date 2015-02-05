/**********************************************************************************
Copyright (c) 2011, malime           _JNNN                                         
                                  _NNF""        ____NNNNNNNN4___                   
All rights reserved.           _JNF`       ,__NN""""        """4NN4__              
                             _NF"          ´"                     "4_F_.           
Redistribution and use     ,JN"                                      ´LFL.         
in source and binary       4"                                          ´\/\.       
forms, with or without     ,_            JN`                              "L4     
modification, are          ´NL.         JNF    __.                         ´LL.   
permitted provided that      "JN______JNF`      N()              _           ´.L.  
the following conditions       """"""""`´NL.   ()N`           _JN"            4/L  
are met:                                  ´`N_NNF           _N"               4J) 
                                            ,NN` ,_.      ,NN                 ´LN 
 * Redistributions of source code         JN"    ""NN)___NN`                  N(.
    must retain the above copyright       NF             N4)    "4L_           NJ 
    notice, this list of conditions                      F()       4F)         NN 
    and the following disclaimer.                        ""         4N.        NJ.
 * Redistribution in binary form must reproduce                     \N       ,NN 
    the above copyright notice, this list of               ,_J`      (N)     (FN` 
    conditions and the following disclaimer in           _NN"        (N)     NJ)  
    the documentation and/or other materials            (NF          (N     (N)   
    provided with the distribution.                     NN          ,N`    JNF    
                                                        "NL.            ,JNN`      
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS        "NF_.     __JNN"`        
AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED          """"""""""            
WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
************************************************************************** rame **/
package de.malime.eclipse.log4j.appender;

import java.net.URL;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

/**
 * The Class MessageConsoleAppender.
 */
public class MessageConsoleAppender extends AppenderSkeleton {
	public class Log4JPreferenceConstants {
		public static final String COLOR_TRACE = "traceColor";
		public static final String COLOR_DEBUG = "debugColor";
		public static final String COLOR_INFO = "infoColor";
		public static final String COLOR_WARN = "warnColor";
		public static final String COLOR_ERROR = "errorColor";
		public static final String ROOT_LEVEL = "rootLevel";
	}

	/** The descriptor. */
	private static ImageDescriptor descriptor = null;
	static {
		URL url = FileLocator.find( Platform.getBundle("org.apache.log4j"), new Path("./icons/log4j.png"), null);
		descriptor = ImageDescriptor.createFromURL(url);
	}
	/** Die Preferences bei der Darstellung **/	
	private IPreferenceStore store;
	
	/** The console. */
	private MessageConsole console;
	
	/** The stream debug. */
	private MessageConsoleStream streamTrace;
	
	/** The color debug. */
	private Color colorTrace;
	
	/** The stream debug. */
	private MessageConsoleStream streamDebug;
	
	/** The color debug. */
	private Color colorDebug;

	/** The stream info. */
	private MessageConsoleStream streamInfo;
	
	/** The color info. */
	private Color colorInfo;
	
	/** The stream warning. */
	private MessageConsoleStream streamWarning;
	
	/** The color warning. */
	private Color colorWarning;
	
	/** The stream error. */
	private MessageConsoleStream streamError;	
	
	/** The color error. */
	private Color colorError;
	
    /**
     * Sets the title.
     *
     * @param title the new title
     */
    public void setTitle( String title ) {
		console = new MessageConsole(title, descriptor);
		console.setWaterMarks(0x4f5880, 0x500000);
		ConsolePlugin.getDefault().getConsoleManager().addConsoles( new IConsole[] { console });
		streamTrace = console.newMessageStream();
		streamDebug = console.newMessageStream();
		streamInfo = console.newMessageStream();
		streamWarning = console.newMessageStream();
		streamError = console.newMessageStream();
		initPreferences();
		resetColors();
// TODO: Hier ist der Aktivator eingebunden, damit über Preferences über eclipse eingestellt werden können		
//		store = Activator.getDefault().getPreferenceStore();
//		store.addPropertyChangeListener(new IPropertyChangeListener() {
//			public void propertyChange(PropertyChangeEvent event) {
//				initPreferences();
//				resetColors();
//		}});
	}        

    /* (non-Javadoc)
     * @see org.apache.log4j.AppenderSkeleton#append(org.apache.log4j.spi.LoggingEvent)
     */
    protected void append( LoggingEvent event ) {
        String message = getLayout().format( event );
        int level = event.getLevel().toInt();
        if( level == Level.INFO_INT ) {
        	streamInfo.println( message );
        } else if( level==Level.WARN_INT ) {
        	streamWarning.println( message );
        } else if( level==Level.ERROR_INT || level==Level.FATAL_INT ) {
        	streamError.println( message );
        } else if( level == Level.DEBUG_INT ) {
        	streamDebug.println(message);
        } else {
        	streamTrace.println(message);
        }
    }

    /* (non-Javadoc)
     * @see org.apache.log4j.AppenderSkeleton#requiresLayout()
     */
    public boolean requiresLayout() {
        return true;
    }

    /* (non-Javadoc)
     * @see org.apache.log4j.AppenderSkeleton#close()
     */
    public void close() {
    	disposeColors();
    }
        
    /**
     * Inits the preferences.
     */
    private void initPreferences() {
		disposeColors();		
		colorTrace = new Color(null, getConsoleColor( Log4JPreferenceConstants.COLOR_TRACE, new RGB( 0,0, 0 ) ) );
		colorDebug = new Color(null, getConsoleColor(  Log4JPreferenceConstants.COLOR_DEBUG, new RGB( 0, 0, 0 ) ) );
		colorInfo = new Color(null, getConsoleColor( Log4JPreferenceConstants.COLOR_INFO, new RGB( 0, 0, 255 ) ) );
		colorWarning = new Color(null, getConsoleColor( Log4JPreferenceConstants.COLOR_WARN, new RGB( 255, 155, 32 ) ) );
		colorError = new Color(null, getConsoleColor( Log4JPreferenceConstants.COLOR_ERROR, new RGB( 255, 0, 0 ) ) );
    }	
    
    private RGB getConsoleColor( String name, RGB fallbackrgb ) {
    	if( store == null ) return fallbackrgb;
		RGB rgb = PreferenceConverter.getDefaultColor(store, name );
		return ( rgb == null ) ? fallbackrgb : rgb;
    }
    
    /**
     * Dispose colors.
     */
    private void disposeColors() {
		if( colorTrace != null ) colorTrace.dispose();
		if( colorDebug != null ) colorDebug.dispose();
		if( colorInfo != null ) colorInfo.dispose();
		if( colorWarning != null ) colorWarning.dispose();
		if( colorError != null ) colorError.dispose();
	}

	/**
	 * Reset colors.
	 */
	private void resetColors() {
		resetColor( colorTrace, streamTrace );
		resetColor( colorDebug, streamDebug );
		resetColor( colorInfo, streamInfo );
		resetColor( colorWarning, streamWarning );
		resetColor( colorError, streamError );
	}

	/**
	 * Reset color.
	 *
	 * @param c the c
	 * @param stream the stream
	 */
	private void resetColor(Color c, MessageConsoleStream stream) {
		if( c != null && !c.isDisposed() ) {
			stream.setColor( c );
		} else {
			stream.setColor( null );
		}
	}
	
}
