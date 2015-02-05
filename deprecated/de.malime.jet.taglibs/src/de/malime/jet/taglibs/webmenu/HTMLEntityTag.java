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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.XPathContextExtender;
import org.eclipse.jet.taglib.AbstractEmptyTag;
import org.eclipse.jet.taglib.EmptyTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;

public class HTMLEntityTag extends AbstractEmptyTag implements EmptyTag {
	
	public void doAction(TagInfo tagInfo, JET2Context context, JET2Writer out ) throws JET2TagException {
		String utf8 = tagInfo.getAttribute( "utf8" );
		if ( utf8 == null)
			throw new JET2TagException( "value for 'utf8' has to be defined" );
		String utf8Value = calculateLocalResource(context, utf8 );
		out.write( calculateHTMLEntity( utf8Value ) );
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

	private String calculateHTMLEntity(String utf8 ) {
		String[] replace = { "ä", "ü", "ö", "ß", "Ä", "Ü", "Ö" };
		String[] with = { "&auml;", "&uuml;", "&ouml;", "&szlig;", "&Auml;", "&Uuml;", "&Ouml;" }; 
		String html = utf8;
		for( int ii = 0; ii < replace.length; ii++ ) {
			Pattern pattern = Pattern.compile(replace[ii]);
			Matcher matcher = pattern.matcher(html);
			html = matcher.replaceAll(with[ii]);
		}       
        return html;
	}

}