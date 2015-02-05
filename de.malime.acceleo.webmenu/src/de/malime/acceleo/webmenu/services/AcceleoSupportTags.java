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
package de.malime.acceleo.webmenu.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Class AcceleoSupportTags.
 */
public class AcceleoSupportTags {
//	private static Logger logger = Logger.getLogger( AcceleoSupportTags.class );
	/**
	 * Instantiates a new acceleo support tags.
	 */
	public AcceleoSupportTags() {
	}
	
	/**
	 * Calculate relative path.
	 *
	 * @param from the from
	 * @param to the to
	 * @return the string
	 */
	public static String calculateRelativePath(String from, String to) {
		String rc = "";
		String[] splitfrom = from.split( "/" );
		String[] splitto = to.split( "/" );
		int offset = 0;
		int max = splitfrom.length - 1;
		if( splitto.length < max ) { 
			max = splitto.length; 
		}
		while( offset < max && splitfrom[ offset ].equals( splitto[ offset ] ) ) { 
			offset++;
		}
		for( int ii = offset; ii < splitfrom.length - 1; ii++ ) { 
			rc += "../"; 
		}
		for( int ii = offset; ii < splitto.length - 1; ii++ ) { 
			rc += splitto[ ii ] + "/"; 
		}
		rc = rc + splitto[ splitto.length - 1 ];
//		logger.debug( "Calculated as relative path '" + rc + "' from '" + from + "' to '" + to + "'" );
		return rc;
	}

	/**
	 * Calculate html entity.
	 *
	 * @param utf8 the utf8
	 * @return the string
	 */
	public static String calculateHTMLEntity(String utf8 ) {
		String[] replace = { "ä", "ü", "ö", "ß", "Ä", "Ü", "Ö" };
		String[] with = { "&auml;", "&uuml;", "&ouml;", "&szlig;", "&Auml;", "&Uuml;", "&Ouml;" }; 
		String html = utf8;
		for( int ii = 0; ii < replace.length; ii++ ) {
			Pattern pattern = Pattern.compile(replace[ii]);
			Matcher matcher = pattern.matcher(html);
			html = matcher.replaceAll(with[ii]);
		}       
//		logger.debug( "Calculated as html entity '" + html + "' from '" + utf8 + "'" );
        return html;
	}
	
}
