package org.storydriven.modeling.expressions.common.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsLexer extends Lexer {
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_STRING_TERMINAL=8;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=37;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING=7;
    public static final int RULE_INT=5;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=11;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalExpressionsLexer() {;} 
    public InternalExpressionsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:10:5: ( 'equiv' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:10:7: 'equiv'
            {
            match("equiv"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:11:5: ( 'imply' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:11:7: 'imply'
            {
            match("imply"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:12:5: ( 'or' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:12:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:13:5: ( 'xor' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:13:7: 'xor'
            {
            match("xor"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:14:5: ( 'and' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:14:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:15:5: ( 'not' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:15:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:16:5: ( '(' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:16:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:17:5: ( ')' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:17:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:18:5: ( '<=' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:18:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:19:5: ( '<' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:19:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:20:5: ( '>=' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:20:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:21:5: ( '>' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:21:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:22:5: ( '=' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:22:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:23:5: ( '!=' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:23:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:24:5: ( '~' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:24:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:25:5: ( '+' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:25:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:26:5: ( '-' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:26:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:27:5: ( '*' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:27:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:28:5: ( '/' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:28:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:29:5: ( '%' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:29:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:30:5: ( '^' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:30:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:31:5: ( '[' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:31:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:32:5: ( ']' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:32:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:33:5: ( '.' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:33:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start RULE_BOOLEAN
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3588:14: ( ( 'true' | 'false' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3588:16: ( 'true' | 'false' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3588:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3588:16: ( 'true' | 'false' )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3588:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3588:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BOOLEAN

    // $ANTLR start RULE_STRING_TERMINAL
    public final void mRULE_STRING_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_TERMINAL;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3590:22: ( '\"' RULE_STRING '\"' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3590:24: '\"' RULE_STRING '\"'
            {
            match('\"'); 
            mRULE_STRING(); 
            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING_TERMINAL

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3592:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3592:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3592:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3592:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3592:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3594:10: ( ( '0' .. '9' )+ )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3594:12: ( '0' .. '9' )+
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3594:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3594:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3596:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3598:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3598:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3598:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3598:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3600:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3600:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3600:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3600:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3600:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3600:41: ( '\\r' )? '\\n'
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3600:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3600:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3602:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3602:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3602:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3604:16: ( . )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3604:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | RULE_BOOLEAN | RULE_STRING_TERMINAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=33;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:106: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 26 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:119: RULE_STRING_TERMINAL
                {
                mRULE_STRING_TERMINAL(); 

                }
                break;
            case 27 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:140: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:148: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:157: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:169: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:185: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:201: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1:209: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\6\40\2\uffff\1\51\1\53\1\uffff\1\36\4\uffff\1\64\1\uffff"+
        "\1\66\3\uffff\2\40\1\36\2\uffff\1\36\2\uffff\1\40\1\uffff\1\40\1"+
        "\103\3\40\24\uffff\2\40\2\uffff\1\74\2\uffff\2\40\1\uffff\1\120"+
        "\1\121\1\122\2\40\1\uffff\1\74\3\uffff\2\40\3\uffff\1\131\1\40\2"+
        "\uffff\1\133\1\134\1\uffff\1\131\2\uffff";
    static final String DFA13_eofS =
        "\135\uffff";
    static final String DFA13_minS =
        "\1\0\1\161\1\155\1\162\1\157\1\156\1\157\2\uffff\2\75\1\uffff\1"+
        "\75\4\uffff\1\52\1\uffff\1\101\3\uffff\1\162\1\141\1\0\2\uffff\1"+
        "\0\2\uffff\1\165\1\uffff\1\160\1\60\1\162\1\144\1\164\24\uffff\1"+
        "\165\1\154\1\uffff\2\0\2\uffff\1\151\1\154\1\uffff\3\60\1\145\1"+
        "\163\1\42\3\0\1\uffff\1\166\1\171\3\uffff\1\60\1\145\1\0\1\uffff"+
        "\2\60\1\uffff\1\60\2\uffff";
    static final String DFA13_maxS =
        "\1\ufffe\1\161\1\155\1\162\1\157\1\156\1\157\2\uffff\2\75\1\uffff"+
        "\1\75\4\uffff\1\57\1\uffff\1\172\3\uffff\1\162\1\141\1\ufffe\2\uffff"+
        "\1\ufffe\2\uffff\1\165\1\uffff\1\160\1\172\1\162\1\144\1\164\24"+
        "\uffff\1\165\1\154\1\uffff\2\ufffe\2\uffff\1\151\1\154\1\uffff\3"+
        "\172\1\145\1\163\1\164\3\ufffe\1\uffff\1\166\1\171\3\uffff\1\172"+
        "\1\145\1\ufffe\1\uffff\2\172\1\uffff\1\172\2\uffff";
    static final String DFA13_acceptS =
        "\7\uffff\1\7\1\10\2\uffff\1\15\1\uffff\1\17\1\20\1\21\1\22\1\uffff"+
        "\1\24\1\uffff\1\26\1\27\1\30\3\uffff\1\33\1\34\1\uffff\1\40\1\41"+
        "\1\uffff\1\33\5\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
        "\1\20\1\21\1\22\1\36\1\37\1\23\1\24\1\25\1\26\1\27\1\30\2\uffff"+
        "\1\35\2\uffff\1\34\1\40\2\uffff\1\3\11\uffff\1\32\2\uffff\1\4\1"+
        "\5\1\6\3\uffff\1\32\2\uffff\1\31\1\uffff\1\1\1\2";
    static final String DFA13_specialS =
        "\135\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\14\1\31\2\36\1\22\1\36\1"+
            "\34\1\7\1\10\1\20\1\16\1\36\1\17\1\26\1\21\12\33\2\36\1\11\1"+
            "\13\1\12\2\36\32\32\1\24\1\36\1\25\1\23\1\32\1\36\1\5\3\32\1"+
            "\1\1\30\2\32\1\2\4\32\1\6\1\3\4\32\1\27\3\32\1\4\2\32\3\36\1"+
            "\15\uff80\36",
            "\1\37",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "",
            "\1\50",
            "\1\52",
            "",
            "\1\55",
            "",
            "",
            "",
            "",
            "\1\62\4\uffff\1\63",
            "",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\42\74\1\76\4\74\1\75\uffd7\74",
            "",
            "",
            "\uffff\74",
            "",
            "",
            "\1\101",
            "",
            "\1\102",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "",
            "\42\114\1\112\4\114\1\113\64\114\1\111\uffa2\114",
            "\uffff\115",
            "",
            "",
            "\1\116",
            "\1\117",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\123",
            "\1\124",
            "\1\125\4\uffff\1\125\64\uffff\1\125\5\uffff\1\125\3\uffff\1"+
            "\125\7\uffff\1\125\3\uffff\1\125\1\uffff\1\125",
            "\uffff\115",
            "\42\74\1\126\uffdc\74",
            "\42\114\1\112\4\114\1\113\64\114\1\111\uffa2\114",
            "",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\132",
            "\42\114\1\112\4\114\1\113\64\114\1\111\uffa2\114",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | RULE_BOOLEAN | RULE_STRING_TERMINAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}