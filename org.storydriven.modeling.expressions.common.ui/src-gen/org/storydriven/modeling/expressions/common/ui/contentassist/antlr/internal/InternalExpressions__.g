lexer grammar InternalExpressions;
@header {
package org.storydriven.modeling.expressions.common.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T12 : 'equiv' ;
T13 : 'imply' ;
T14 : 'or' ;
T15 : 'xor' ;
T16 : 'and' ;
T17 : 'not' ;
T18 : '(' ;
T19 : ')' ;
T20 : '<=' ;
T21 : '<' ;
T22 : '>=' ;
T23 : '>' ;
T24 : '=' ;
T25 : '!=' ;
T26 : '~' ;
T27 : '+' ;
T28 : '-' ;
T29 : '*' ;
T30 : '/' ;
T31 : '%' ;
T32 : '^' ;
T33 : '[' ;
T34 : ']' ;
T35 : '.' ;

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3668
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3670
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3672
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3674
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3676
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3678
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3680
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3682
RULE_ANY_OTHER : .;


