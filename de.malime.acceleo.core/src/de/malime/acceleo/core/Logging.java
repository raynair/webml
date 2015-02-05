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

/**
 * The Class AcceleoLog4J.
 */
public class Logging {
	/** The logger. */
	private static Logger logger = Logger.getLogger( Logging.class );
	/** The loggers. */
	static Hashtable<String,Logger> loggers = new Hashtable<String,Logger>();

	/**
	 * Fatal.
	 *
	 * @param name the name
	 * @param message the message
	 * @return the string
	 */
	public static void fatal( String name, String message ) {
		Logger _logger = getLogger( name );
		if( _logger != null ) {
			if( logger.isTraceEnabled() ) {
				logger.trace( "Fatal '" + message + "' to logger '" + name + "'" );
			}
			_logger.fatal( message );
		}
	}
	
	/**
	 * Error.
	 *
	 * @param name the name
	 * @param message the message
	 * @return the string
	 */
	public static void error( String name, String message ) {
		Logger _logger = getLogger( name );
		if( _logger != null ) {
			if( logger.isTraceEnabled() ) {
				logger.trace( "Error '" + message + "' to logger '" + name + "'" );
			}
			_logger.error( message );
		}
	}
	
	/**
	 * Warn.
	 *
	 * @param name the name
	 * @param message the message
	 * @return the string
	 */
	public static void warn( String name, String message ) {
		Logger _logger = getLogger( name );
		if( _logger != null ) {
			if( logger.isTraceEnabled() ) {
				logger.trace( "Warn '" + message + "' to logger '" + name + "'" );
			}
			_logger.warn( message );
		}
	}
	
	/**
	 * Info.
	 *
	 * @param name the name
	 * @param message the message
	 * @return the string
	 */
	public static void info( String name, String message ) {
		Logger _logger = getLogger( name );
		if( _logger != null && _logger.isInfoEnabled() ) {
			if( logger.isTraceEnabled() ) {
				logger.trace( "Info '" + message + "' to logger '" + name + "'" );
			}
			_logger.info( message );
		}
	}
	
	/**
	 * Debug.
	 *
	 * @param name the name
	 * @param message the message
	 * @return the string
	 */
	public static void debug( String name, String message ) {
		Logger _logger = getLogger( name );
		if( _logger != null && _logger.isDebugEnabled() ) {
			if( logger.isTraceEnabled() ) {
				logger.trace( "Debug '" + message + "' to logger '" + name + "'" );
			}
			_logger.debug( message );
		}
	}
	
	/**
	 * Trace.
	 *
	 * @param name the name
	 * @param message the message
	 * @return the string
	 */
	public static void trace( String name, String message ) {
		Logger _logger = getLogger( name );
		if( _logger != null && _logger.isTraceEnabled() ) {
			if( logger.isTraceEnabled() ) {
				logger.trace( "Trace '" + message + "' to logger '" + name + "'" );
			}
			_logger.trace( message );
		}
	}
	
	/**
	 * Gets the logger.
	 *
	 * @param name the name
	 * @return the logger
	 */
	private static Logger getLogger( String name ) {
		if( logger.isTraceEnabled() ) {
			logger.trace( "Searching for logger with name '" + name + "' ..." );
		}
		Logger _logger = loggers.get( name );
		if( _logger == null ) {
			if( logger.isTraceEnabled() ) {
				logger.trace( "Creating logger with name '" + name + "'" );
			}
			_logger = Logger.getLogger( name );
			loggers.put( name, _logger );
		}
		return _logger;
	}	
}
