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
package de.malime.acceleo.core;

import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

/**
 * The Class TimerService.
 *
 * @author rame
 */
public class TimerService {
	/** The logger. */
	private static Logger logger = Logger.getLogger( TimerService.class );
	/** The globals. */
	static Hashtable<String,Long> globals = new Hashtable<String,Long>();
	
	/**
	 * Start timer.
	 *
	 * @param eObj the e obj
	 * @param name the name
	 */
	public static void startTimer( EObject eObj, String name ) {
		if( name == null ) return;
		Long start = new Long( System.nanoTime() );
		synchronized( globals ) {
			globals.put( name, start );
		}
		if( logger.isTraceEnabled() ) {
			logger.trace( "Generate Timer '" + name + "' at '" + start + "'" );
		}
	}
	
	/**
	 * Stop timer.
	 *
	 * @param eObj the e obj
	 * @param name the name
	 * @return the string
	 */
	public static String stopTimer( EObject eObj, String name ) {
		if( name == null ) return "No timer given";
		Long stop = new Long( System.nanoTime() );
		Long start = globals.get( name );
		if( start == null ) return "Timer '" + name + "' unkown";
		long duration = stop - start;
		long nanos = duration % 1000;
		duration = ( duration - nanos ) / 1000;
		long micros = duration % 1000;
		duration = ( duration - micros ) / 1000;
		long millis = duration % 1000;
		duration = ( duration - millis ) / 1000;
		long secs = duration % 60;
		duration = ( duration - secs ) / 60;
		long mins = duration % 60;
		duration = ( duration - mins ) / 60;
		long hrs = duration % 24;
		duration = ( duration -hrs ) / 24;
		String value = String.format( "%d:%02d:%02d:%02d,%03d,%03d,%03d", duration, hrs, mins, secs, millis, micros, nanos );
		if( logger.isTraceEnabled() ) {
			logger.trace( "Generated Timer '" + name + "' ran '" +value + "'" );
		}
		return value; 
	}
}
