lexer grammar InternalPathExpressions;
@header {
package org.storydriven.storydiagrams.expressions.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'NO_REPEAT' ;
T12 : '+' ;
T13 : '*' ;
T14 : '-->' ;
T15 : '<>-->' ;
T16 : '--><>' ;
T17 : '(' ;
T18 : ')' ;
T19 : '|' ;
T20 : '.' ;
T21 : '[' ;
T22 : ']' ;
T23 : ',' ;
T24 : '!' ;

// $ANTLR src "../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g" 1660
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g" 1662
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g" 1664
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g" 1666
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g" 1668
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g" 1670
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g" 1672
RULE_ANY_OTHER : .;


