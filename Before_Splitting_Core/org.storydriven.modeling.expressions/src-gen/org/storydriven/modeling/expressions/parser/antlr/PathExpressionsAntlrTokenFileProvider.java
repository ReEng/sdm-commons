/*
* generated by Xtext
*/
package org.storydriven.modeling.expressions.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PathExpressionsAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.tokens");
	}
}
