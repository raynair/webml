/**********************************************************************************
Copyright (c) 2008, malime           _JNNN                                         
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
package de.malime.jet.taglibs.webmenu;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.XPathContextExtender;
import org.eclipse.jet.taglib.AbstractEmptyTag;
import org.eclipse.jet.taglib.EmptyTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;

public class RelativeNavigationTag extends AbstractEmptyTag implements EmptyTag {
	
	public void doAction(TagInfo tagInfo, JET2Context context, JET2Writer out ) throws JET2TagException {
		String from = tagInfo.getAttribute( "from" );
		if ( from == null)
			throw new JET2TagException( "value for 'from' has to be defined" );
		String fromValue = calculateLocalResource(context, from );
		String to = tagInfo.getAttribute( "to" );
		if ( to == null)
			throw new JET2TagException( "value for 'to' has to be defined" );
		String toValue = calculateLocalResource(context, to );
		out.write( calculateRelativePath(fromValue, toValue) );
	}

	private String calculateLocalResource(JET2Context context, String path ) {
		String pathValue;
		XPathContextExtender xpathExtender = XPathContextExtender.getInstance( context );
		pathValue = xpathExtender.resolveAsString(xpathExtender.currentXPathContextObject(), path );
		if( pathValue != null )
			return pathValue;
		else
			return path;
	}

	private String calculateRelativePath(String from, String to) {
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
		return rc;
	}

}