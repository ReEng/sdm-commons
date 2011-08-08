lexer grammar InternalExpressions;
@header {
package org.storydriven.modeling.expressions.common.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'equiv' ;
T14 : 'imply' ;
T15 : 'or' ;
T16 : 'xor' ;
T17 : 'and' ;
T18 : 'not' ;
T19 : '(' ;
T20 : ')' ;
T21 : '<=' ;
T22 : '<' ;
T23 : '>=' ;
T24 : '>' ;
T25 : '=' ;
T26 : '!=' ;
T27 : '~' ;
T28 : '+' ;
T29 : '-' ;
T30 : '*' ;
T31 : '/' ;
T32 : '%' ;
T33 : '^' ;
T34 : '[' ;
T35 : ']' ;
T36 : '.' ;

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3588
RULE_BOOLEAN : ('true'|'false');

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3590
RULE_STRING_TERMINAL : '"' RULE_STRING '"';

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3592
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3594
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3596
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3598
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3600
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3602
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g" 3604
RULE_ANY_OTHER : .;


