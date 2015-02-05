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

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

/**
 * Die  Class GlobalVariable.
 */
public class GlobalProperty {
	private static Logger logger = Logger.getLogger( GlobalProperty.class );
	
	/** The globals. */
	static Hashtable<String,String> globals = new Hashtable<String,String>();
	
	/**
	 * Exist global property.
	 *
	 * @param eobject the eobject
	 * @param key the key
	 * @return true, if successful
	 */
    public static boolean exist(EObject eobject, String key) {
    	String value = get( eobject, key ); 
   		return !( value == null || "".equals( value ) );
    }

    /**
     * Find gobal keys.
     *
     * @param eobject the eobject
     * @param valuepattern the valuepattern
     * @return the sets the
     */
    public static Set<String> selectByValue(EObject eobject, String valuepattern ) {
   		if( valuepattern == null ) throw new IllegalArgumentException( "The pattern " + valuepattern + " is set to null" );
    	Set<String> keys = new HashSet<String>();
   		Pattern pattern = Pattern.compile( valuepattern );
   		Enumeration<String> enums = globals.keys();
    	while( enums.hasMoreElements() ) {
    		String key = enums.nextElement();
    		String value = globals.get( key );
    		if( value == null || "".equals( value ) ) continue;
        	Matcher matcher = pattern.matcher( value );
        	if (matcher.find()) {
        		keys.add( key );
        	}
    	}
    	return keys;
    }

    /**
     * Find gobal values.
     *
     * @param eobject the eobject
     * @param keypattern the keypattern
     * @return the sets the
     */
    public static Set<String> selectByKey(EObject eobject, String keypattern ) {
   		if( keypattern == null ) throw new IllegalArgumentException( "The pattern " + keypattern + " is set to null" );
    	Set<String> keys = new HashSet<String>();
   		Pattern pattern = Pattern.compile( keypattern );
   		Enumeration<String> enums = globals.keys();
    	while( enums.hasMoreElements() ) {
    		String key = enums.nextElement();
    		String value = globals.get( key );
    		if( value == null || "".equals( value ) ) continue;
        	Matcher matcher = pattern.matcher( key );
        	if (matcher.find()) {
        		keys.add( key );
        	}
    	}
    	return keys;
    }

    /**
     * Gets the global property.
     *
     * @param eobject the eobject
     * @param key the name
     * @return the global property
     */
    public static String get(EObject eobject, String key ) {
    	if( key == null ) throw new IllegalArgumentException( "The key " + key + " is set to null" ); 
   		String value = globals.get( key ); 
   		if( value != null )
   			return value;
   		return "";
    }

    /**
     * Sets the global property.
     *
     * @param eobject the eobject
     * @param key the key
     * @param value the value
     * @return the string
     */
    public static synchronized String set(EObject eobject, String key, String value ) {
    	if( key == null ) throw new IllegalArgumentException( "The key " + key + " is set to null" );
    	if( value == null || "".equals( value ) ) {
    		globals.remove( key );
    	} else {
    		globals.put( key, value ); 
    	}
		return null;
    }
    
    /**
     * Reset.
     *
     * @return the string
     */
    public static synchronized String reset() {
    	globals = new Hashtable<String,String>();
    	return null;
    }
    
    /**
     * Load properties.
     *
     * @param filename the filename
     * @param pattern the pattern
     * @return true, if successful
     */
    public static boolean loadProperties( String filename, String pattern ) {
    	return false;
    }
    
    /**
     * Save properties.
     *
     * @param filename the filename
     * @param pattern the pattern
     * @return true, if successful
     */
    public static boolean saveProperties( String filename, String pattern ) {
    	return false;
    }
}
