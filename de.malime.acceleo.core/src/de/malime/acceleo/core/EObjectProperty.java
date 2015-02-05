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
 * The Class EObjectProperty.
 */
public class EObjectProperty {
	
	/** The logger. */
	private static Logger logger = Logger.getLogger( EObjectProperty.class );

	/** The properties. */
	static Hashtable<EObject,Hashtable<String,String>> properties = new Hashtable<EObject,Hashtable<String,String>>();

	/**
	 * Exist e object property.
	 *
	 * @param eobject the eobject
	 * @param name the name
	 * @return true, if successful
	 */
	public static boolean exist(EObject eobject, String name) {
		String value = get( eobject, name );
		return !( value == null || "".equals( value ) );
	}

	/**
	 * Find e object property.
	 *
	 * @param eobject the eobject
	 * @param key the key
	 * @return the string
	 */
	public static String get(EObject eobject, String key ) {
		if( eobject == null || key == null ) throw new IllegalArgumentException( "Either the EObject " + eobject + " or the key " + key + " is set to null" );
		Hashtable<String,String> assignments = properties.get( eobject ); 
		if( assignments != null ) {
			String value = assignments.get( key );
			if( value != null ) 
				return value;
		}
		return "";
	}

	/**
	 * Find e object keys.
	 *
	 * @param eobject the eobject
	 * @param valuepattern the valuepattern
	 * @return the sets the
	 */
	public static Set<String> selectByValue(EObject eobject, String valuepattern) {
		if( eobject == null || valuepattern == null ) throw new IllegalArgumentException( "Either the EObject " + eobject + " or the pattern " + valuepattern + " is set to null" );
		Set<String> keys = new HashSet<String>();
		Hashtable<String,String> assignments = properties.get( eobject ); 
		if( assignments != null ) {
			Pattern pattern = Pattern.compile( valuepattern );
			Enumeration<String> enums = assignments.keys();
			while( enums.hasMoreElements() ) {
				String key = enums.nextElement();
				String value = assignments.get( key );
				if( value == null || "".equals( value ) ) continue;
	    		Matcher matcher = pattern.matcher( value );
	    		if (matcher.find()) {
	    			keys.add( key );
	    		}
			}
		}
		return keys;
	}

	/**
	 * Find e object values.
	 *
	 * @param eobject the eobject
	 * @param keypattern the keypattern
	 * @return the sets the
	 */
	public static Set<String> selectByKey(EObject eobject, String keypattern) {
		if( eobject == null || keypattern == null ) throw new IllegalArgumentException( "Either the EObject " + eobject + " or the pattern " + keypattern + " is set to null" );
		Set<String> keys = new HashSet<String>();
		Hashtable<String,String> assignments = properties.get( eobject ); 
		if( assignments != null ) {
			Pattern pattern = Pattern.compile( keypattern );
			Enumeration<String> enums = assignments.keys();
			while( enums.hasMoreElements() ) {
				String key = enums.nextElement();
				String value = assignments.get( key );
				if( value == null || "".equals( value ) ) continue;
	    		Matcher matcher = pattern.matcher( key );
	    		if (matcher.find()) {
	    			keys.add( key );
	    		}
			}
		}
		return keys;
	}

	/**
	 * Sets the e object property.
	 *
	 * @param eobject the eobject
	 * @param key the key
	 * @param value the value
	 * @return the string
	 */
	public static synchronized void set(EObject eobject, String key, String value) {
		if( eobject == null || key == null ) throw new IllegalArgumentException( "Either the EObject " + eobject + " or the key " + key + " is set to null" );
		Hashtable<String,String> assignments = properties.get( eobject ); 
    	if( value == null || "".equals( value ) ) {
    		if( assignments == null ) return;
    		assignments.remove( key );
    		if( assignments.size() == 0 ) {
    			properties.remove( eobject );
    		}
    		return;
    	} else if( assignments == null ) {
			assignments = new Hashtable<String,String>();
			properties.put( eobject, assignments );
		}
		assignments.put( key, value ); 
	}

    /**
     * Reset.
     *
     * @param eobject the eobject
     */
    public static synchronized void reset( EObject eobject ) {
		if( eobject == null ) throw new IllegalArgumentException( "The EObject " + eobject + " is set to null" );
		properties.remove( eobject ); 
    }

}