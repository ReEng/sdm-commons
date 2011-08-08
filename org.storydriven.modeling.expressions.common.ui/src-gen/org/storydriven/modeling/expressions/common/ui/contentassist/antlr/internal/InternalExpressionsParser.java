package org.storydriven.modeling.expressions.common.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.storydriven.modeling.expressions.common.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_STRING_TERMINAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'equiv'", "'imply'", "'or'", "'xor'", "'and'", "'not'", "'('", "')'", "'<='", "'<'", "'>='", "'>'", "'='", "'!='", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'['", "']'", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_STRING_TERMINAL=8;
    public static final int RULE_INT=5;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalExpressionsParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g"; }


     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleLExpression
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:61:1: entryRuleLExpression : ruleLExpression EOF ;
    public final void entryRuleLExpression() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: ( ruleLExpression EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:63:1: ruleLExpression EOF
            {
             before(grammarAccess.getLExpressionRule()); 
            pushFollow(FOLLOW_ruleLExpression_in_entryRuleLExpression61);
            ruleLExpression();
            _fsp--;

             after(grammarAccess.getLExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpression68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLExpression


    // $ANTLR start ruleLExpression
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:70:1: ruleLExpression : ( ruleEquivalent ) ;
    public final void ruleLExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:74:2: ( ( ruleEquivalent ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( ruleEquivalent )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( ruleEquivalent )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ruleEquivalent
            {
             before(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 
            pushFollow(FOLLOW_ruleEquivalent_in_ruleLExpression94);
            ruleEquivalent();
            _fsp--;

             after(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLExpression


    // $ANTLR start entryRuleEquivalent
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:89:1: entryRuleEquivalent : ruleEquivalent EOF ;
    public final void entryRuleEquivalent() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: ( ruleEquivalent EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:91:1: ruleEquivalent EOF
            {
             before(grammarAccess.getEquivalentRule()); 
            pushFollow(FOLLOW_ruleEquivalent_in_entryRuleEquivalent120);
            ruleEquivalent();
            _fsp--;

             after(grammarAccess.getEquivalentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquivalent127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEquivalent


    // $ANTLR start ruleEquivalent
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:98:1: ruleEquivalent : ( ( rule__Equivalent__Group__0 ) ) ;
    public final void ruleEquivalent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:102:2: ( ( ( rule__Equivalent__Group__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( ( rule__Equivalent__Group__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( ( rule__Equivalent__Group__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( rule__Equivalent__Group__0 )
            {
             before(grammarAccess.getEquivalentAccess().getGroup()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:105:1: ( rule__Equivalent__Group__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:105:2: rule__Equivalent__Group__0
            {
            pushFollow(FOLLOW_rule__Equivalent__Group__0_in_ruleEquivalent153);
            rule__Equivalent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEquivalentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEquivalent


    // $ANTLR start entryRuleImplication
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:117:1: entryRuleImplication : ruleImplication EOF ;
    public final void entryRuleImplication() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:118:1: ( ruleImplication EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:119:1: ruleImplication EOF
            {
             before(grammarAccess.getImplicationRule()); 
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication180);
            ruleImplication();
            _fsp--;

             after(grammarAccess.getImplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleImplication


    // $ANTLR start ruleImplication
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:126:1: ruleImplication : ( ( rule__Implication__Group__0 ) ) ;
    public final void ruleImplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:130:2: ( ( ( rule__Implication__Group__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( ( rule__Implication__Group__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( ( rule__Implication__Group__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( rule__Implication__Group__0 )
            {
             before(grammarAccess.getImplicationAccess().getGroup()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:133:1: ( rule__Implication__Group__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:133:2: rule__Implication__Group__0
            {
            pushFollow(FOLLOW_rule__Implication__Group__0_in_ruleImplication213);
            rule__Implication__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleImplication


    // $ANTLR start entryRuleDisjunction
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:145:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:146:1: ( ruleDisjunction EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:147:1: ruleDisjunction EOF
            {
             before(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction240);
            ruleDisjunction();
            _fsp--;

             after(grammarAccess.getDisjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDisjunction


    // $ANTLR start ruleDisjunction
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:154:1: ruleDisjunction : ( ( rule__Disjunction__Group__0 ) ) ;
    public final void ruleDisjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:158:2: ( ( ( rule__Disjunction__Group__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( ( rule__Disjunction__Group__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( ( rule__Disjunction__Group__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( rule__Disjunction__Group__0 )
            {
             before(grammarAccess.getDisjunctionAccess().getGroup()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:161:1: ( rule__Disjunction__Group__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:161:2: rule__Disjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction273);
            rule__Disjunction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDisjunction


    // $ANTLR start entryRuleConjunction
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:173:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: ( ruleConjunction EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:175:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction300);
            ruleConjunction();
            _fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleConjunction


    // $ANTLR start ruleConjunction
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:182:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:186:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( ( rule__Conjunction__Group__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:189:1: ( rule__Conjunction__Group__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:189:2: rule__Conjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction333);
            rule__Conjunction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConjunction


    // $ANTLR start entryRuleNegation
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:201:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:202:1: ( ruleNegation EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:203:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation360);
            ruleNegation();
            _fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNegation


    // $ANTLR start ruleNegation
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:210:1: ruleNegation : ( ( rule__Negation__Alternatives ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:214:2: ( ( ( rule__Negation__Alternatives ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( ( rule__Negation__Alternatives ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( ( rule__Negation__Alternatives ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( rule__Negation__Alternatives )
            {
             before(grammarAccess.getNegationAccess().getAlternatives()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:217:1: ( rule__Negation__Alternatives )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:217:2: rule__Negation__Alternatives
            {
            pushFollow(FOLLOW_rule__Negation__Alternatives_in_ruleNegation393);
            rule__Negation__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNegationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNegation


    // $ANTLR start entryRuleNegated
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:229:1: entryRuleNegated : ruleNegated EOF ;
    public final void entryRuleNegated() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:230:1: ( ruleNegated EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:231:1: ruleNegated EOF
            {
             before(grammarAccess.getNegatedRule()); 
            pushFollow(FOLLOW_ruleNegated_in_entryRuleNegated420);
            ruleNegated();
            _fsp--;

             after(grammarAccess.getNegatedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegated427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNegated


    // $ANTLR start ruleNegated
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:238:1: ruleNegated : ( ( rule__Negated__Group__0 ) ) ;
    public final void ruleNegated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:242:2: ( ( ( rule__Negated__Group__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( ( rule__Negated__Group__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( ( rule__Negated__Group__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( rule__Negated__Group__0 )
            {
             before(grammarAccess.getNegatedAccess().getGroup()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:245:1: ( rule__Negated__Group__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:245:2: rule__Negated__Group__0
            {
            pushFollow(FOLLOW_rule__Negated__Group__0_in_ruleNegated453);
            rule__Negated__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNegatedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNegated


    // $ANTLR start entryRuleCExpression
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:257:1: entryRuleCExpression : ruleCExpression EOF ;
    public final void entryRuleCExpression() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:258:1: ( ruleCExpression EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:259:1: ruleCExpression EOF
            {
             before(grammarAccess.getCExpressionRule()); 
            pushFollow(FOLLOW_ruleCExpression_in_entryRuleCExpression480);
            ruleCExpression();
            _fsp--;

             after(grammarAccess.getCExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCExpression487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCExpression


    // $ANTLR start ruleCExpression
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:266:1: ruleCExpression : ( ( rule__CExpression__Alternatives ) ) ;
    public final void ruleCExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:270:2: ( ( ( rule__CExpression__Alternatives ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:271:1: ( ( rule__CExpression__Alternatives ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:271:1: ( ( rule__CExpression__Alternatives ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( rule__CExpression__Alternatives )
            {
             before(grammarAccess.getCExpressionAccess().getAlternatives()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:273:1: ( rule__CExpression__Alternatives )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:273:2: rule__CExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__CExpression__Alternatives_in_ruleCExpression513);
            rule__CExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCExpression


    // $ANTLR start entryRuleCompare
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:285:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:286:1: ( ruleCompare EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:287:1: ruleCompare EOF
            {
             before(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare540);
            ruleCompare();
            _fsp--;

             after(grammarAccess.getCompareRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCompare


    // $ANTLR start ruleCompare
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:294:1: ruleCompare : ( ( rule__Compare__Group__0 ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:298:2: ( ( ( rule__Compare__Group__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:299:1: ( ( rule__Compare__Group__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:299:1: ( ( rule__Compare__Group__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( rule__Compare__Group__0 )
            {
             before(grammarAccess.getCompareAccess().getGroup()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:301:1: ( rule__Compare__Group__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:301:2: rule__Compare__Group__0
            {
            pushFollow(FOLLOW_rule__Compare__Group__0_in_ruleCompare573);
            rule__Compare__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCompareAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompare


    // $ANTLR start entryRuleAExpression
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:313:1: entryRuleAExpression : ruleAExpression EOF ;
    public final void entryRuleAExpression() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:314:1: ( ruleAExpression EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:315:1: ruleAExpression EOF
            {
             before(grammarAccess.getAExpressionRule()); 
            pushFollow(FOLLOW_ruleAExpression_in_entryRuleAExpression600);
            ruleAExpression();
            _fsp--;

             after(grammarAccess.getAExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAExpression607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAExpression


    // $ANTLR start ruleAExpression
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:322:1: ruleAExpression : ( ruleAddition ) ;
    public final void ruleAExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:326:2: ( ( ruleAddition ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: ( ruleAddition )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: ( ruleAddition )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ruleAddition
            {
             before(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_ruleAddition_in_ruleAExpression633);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAExpression


    // $ANTLR start entryRuleAddition
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:341:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:342:1: ( ruleAddition EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:343:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition659);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition666); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:350:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:354:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:355:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:355:1: ( ( rule__Addition__Group__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:357:1: ( rule__Addition__Group__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:357:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition692);
            rule__Addition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:369:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:370:1: ( ruleMultiplication EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:371:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication719);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication726); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMultiplication


    // $ANTLR start ruleMultiplication
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:378:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:382:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:384:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:385:1: ( rule__Multiplication__Group__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:385:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication752);
            rule__Multiplication__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRulePower
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:397:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:398:1: ( rulePower EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:399:1: rulePower EOF
            {
             before(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_rulePower_in_entryRulePower779);
            rulePower();
            _fsp--;

             after(grammarAccess.getPowerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePower786); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePower


    // $ANTLR start rulePower
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:406:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:410:2: ( ( ( rule__Power__Group__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( ( rule__Power__Group__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( ( rule__Power__Group__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: ( rule__Power__Group__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:413:1: ( rule__Power__Group__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:413:2: rule__Power__Group__0
            {
            pushFollow(FOLLOW_rule__Power__Group__0_in_rulePower812);
            rule__Power__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPowerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePower


    // $ANTLR start entryRulePrimaryExpression
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:425:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:426:1: ( rulePrimaryExpression EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:427:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression839);
            rulePrimaryExpression();
            _fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression846); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePrimaryExpression


    // $ANTLR start rulePrimaryExpression
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:434:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:438:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:441:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:441:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression872);
            rule__PrimaryExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrimaryExpression


    // $ANTLR start entryRuleNumberValue
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:453:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:454:1: ( ruleNumberValue EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:455:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue899);
            ruleNumberValue();
            _fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue906); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNumberValue


    // $ANTLR start ruleNumberValue
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:462:1: ruleNumberValue : ( ( rule__NumberValue__Alternatives ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:466:2: ( ( ( rule__NumberValue__Alternatives ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:467:1: ( ( rule__NumberValue__Alternatives ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:467:1: ( ( rule__NumberValue__Alternatives ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:468:1: ( rule__NumberValue__Alternatives )
            {
             before(grammarAccess.getNumberValueAccess().getAlternatives()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:469:1: ( rule__NumberValue__Alternatives )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:469:2: rule__NumberValue__Alternatives
            {
            pushFollow(FOLLOW_rule__NumberValue__Alternatives_in_ruleNumberValue932);
            rule__NumberValue__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNumberValue


    // $ANTLR start entryRuleNUMBER
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:481:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:482:1: ( ruleNUMBER EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:483:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER959);
            ruleNUMBER();
            _fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER966); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNUMBER


    // $ANTLR start ruleNUMBER
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:490:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:494:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:495:1: ( ( rule__NUMBER__Group__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:495:1: ( ( rule__NUMBER__Group__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:496:1: ( rule__NUMBER__Group__0 )
            {
             before(grammarAccess.getNUMBERAccess().getGroup()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:497:1: ( rule__NUMBER__Group__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:497:2: rule__NUMBER__Group__0
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__0_in_ruleNUMBER992);
            rule__NUMBER__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNUMBER


    // $ANTLR start entryRuleBooleanValue
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:509:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:510:1: ( ruleBooleanValue EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:511:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1019);
            ruleBooleanValue();
            _fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1026); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBooleanValue


    // $ANTLR start ruleBooleanValue
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:518:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:522:2: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( ( rule__BooleanValue__Alternatives ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( ( rule__BooleanValue__Alternatives ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:525:1: ( rule__BooleanValue__Alternatives )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:525:2: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue1052);
            rule__BooleanValue__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBooleanValue


    // $ANTLR start entryRuleVARIABLE_VALUE
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:537:1: entryRuleVARIABLE_VALUE : ruleVARIABLE_VALUE EOF ;
    public final void entryRuleVARIABLE_VALUE() throws RecognitionException {
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:538:1: ( ruleVARIABLE_VALUE EOF )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:539:1: ruleVARIABLE_VALUE EOF
            {
             before(grammarAccess.getVARIABLE_VALUERule()); 
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_entryRuleVARIABLE_VALUE1079);
            ruleVARIABLE_VALUE();
            _fsp--;

             after(grammarAccess.getVARIABLE_VALUERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_VALUE1086); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVARIABLE_VALUE


    // $ANTLR start ruleVARIABLE_VALUE
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:546:1: ruleVARIABLE_VALUE : ( ( rule__VARIABLE_VALUE__Alternatives ) ) ;
    public final void ruleVARIABLE_VALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:550:2: ( ( ( rule__VARIABLE_VALUE__Alternatives ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:551:1: ( ( rule__VARIABLE_VALUE__Alternatives ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:551:1: ( ( rule__VARIABLE_VALUE__Alternatives ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:552:1: ( rule__VARIABLE_VALUE__Alternatives )
            {
             before(grammarAccess.getVARIABLE_VALUEAccess().getAlternatives()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:553:1: ( rule__VARIABLE_VALUE__Alternatives )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:553:2: rule__VARIABLE_VALUE__Alternatives
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Alternatives_in_ruleVARIABLE_VALUE1112);
            rule__VARIABLE_VALUE__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getVARIABLE_VALUEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVARIABLE_VALUE


    // $ANTLR start rule__Disjunction__Alternatives_1_0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:565:1: rule__Disjunction__Alternatives_1_0 : ( ( ( rule__Disjunction__Group_1_0_0__0 ) ) | ( ( rule__Disjunction__Group_1_0_1__0 ) ) );
    public final void rule__Disjunction__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:569:1: ( ( ( rule__Disjunction__Group_1_0_0__0 ) ) | ( ( rule__Disjunction__Group_1_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("565:1: rule__Disjunction__Alternatives_1_0 : ( ( ( rule__Disjunction__Group_1_0_0__0 ) ) | ( ( rule__Disjunction__Group_1_0_1__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:570:1: ( ( rule__Disjunction__Group_1_0_0__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:570:1: ( ( rule__Disjunction__Group_1_0_0__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:571:1: ( rule__Disjunction__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getDisjunctionAccess().getGroup_1_0_0()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:572:1: ( rule__Disjunction__Group_1_0_0__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:572:2: rule__Disjunction__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__0_in_rule__Disjunction__Alternatives_1_01148);
                    rule__Disjunction__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDisjunctionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:576:6: ( ( rule__Disjunction__Group_1_0_1__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:576:6: ( ( rule__Disjunction__Group_1_0_1__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:577:1: ( rule__Disjunction__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getDisjunctionAccess().getGroup_1_0_1()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:578:1: ( rule__Disjunction__Group_1_0_1__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:578:2: rule__Disjunction__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__0_in_rule__Disjunction__Alternatives_1_01166);
                    rule__Disjunction__Group_1_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDisjunctionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Alternatives_1_0


    // $ANTLR start rule__Negation__Alternatives
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:587:1: rule__Negation__Alternatives : ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleCExpression ) );
    public final void rule__Negation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:591:1: ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleCExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_BOOLEAN)||LA2_0==19||LA2_0==34) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("587:1: rule__Negation__Alternatives : ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleCExpression ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:592:1: ( ( rule__Negation__Group_0__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:592:1: ( ( rule__Negation__Group_0__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:593:1: ( rule__Negation__Group_0__0 )
                    {
                     before(grammarAccess.getNegationAccess().getGroup_0()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:594:1: ( rule__Negation__Group_0__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:594:2: rule__Negation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Negation__Group_0__0_in_rule__Negation__Alternatives1199);
                    rule__Negation__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNegationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:598:6: ( ruleCExpression )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:598:6: ( ruleCExpression )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:599:1: ruleCExpression
                    {
                     before(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCExpression_in_rule__Negation__Alternatives1217);
                    ruleCExpression();
                    _fsp--;

                     after(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Negation__Alternatives


    // $ANTLR start rule__CExpression__Alternatives
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:609:1: rule__CExpression__Alternatives : ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) );
    public final void rule__CExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:613:1: ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
            case 34:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                    {
                    alt3=2;
                    }
                    break;
                case EOF:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 20:
                    {
                    alt3=3;
                    }
                    break;
                case 36:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==RULE_ID) ) {
                        int LA3_6 = input.LA(4);

                        if ( ((LA3_6>=21 && LA3_6<=33)) ) {
                            alt3=2;
                        }
                        else if ( (LA3_6==EOF||(LA3_6>=13 && LA3_6<=17)||LA3_6==20) ) {
                            alt3=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("609:1: rule__CExpression__Alternatives : ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) );", 3, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("609:1: rule__CExpression__Alternatives : ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) );", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("609:1: rule__CExpression__Alternatives : ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) );", 3, 3, input);

                    throw nvae;
                }

                }
                break;
            case RULE_BOOLEAN:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("609:1: rule__CExpression__Alternatives : ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:614:1: ( ( rule__CExpression__Group_0__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:614:1: ( ( rule__CExpression__Group_0__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:615:1: ( rule__CExpression__Group_0__0 )
                    {
                     before(grammarAccess.getCExpressionAccess().getGroup_0()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:616:1: ( rule__CExpression__Group_0__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:616:2: rule__CExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CExpression__Group_0__0_in_rule__CExpression__Alternatives1249);
                    rule__CExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:620:6: ( ruleCompare )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:620:6: ( ruleCompare )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:621:1: ruleCompare
                    {
                     before(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompare_in_rule__CExpression__Alternatives1267);
                    ruleCompare();
                    _fsp--;

                     after(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:626:6: ( ruleBooleanValue )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:626:6: ( ruleBooleanValue )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:627:1: ruleBooleanValue
                    {
                     before(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__CExpression__Alternatives1284);
                    ruleBooleanValue();
                    _fsp--;

                     after(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CExpression__Alternatives


    // $ANTLR start rule__Compare__Alternatives_1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:637:1: rule__Compare__Alternatives_1 : ( ( ( rule__Compare__Group_1_0__0 ) ) | ( ( rule__Compare__Group_1_1__0 ) ) | ( ( rule__Compare__Group_1_2__0 ) ) | ( ( rule__Compare__Group_1_3__0 ) ) | ( ( rule__Compare__Group_1_4__0 ) ) | ( ( rule__Compare__Group_1_5__0 ) ) | ( ( rule__Compare__Group_1_6__0 ) ) );
    public final void rule__Compare__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:641:1: ( ( ( rule__Compare__Group_1_0__0 ) ) | ( ( rule__Compare__Group_1_1__0 ) ) | ( ( rule__Compare__Group_1_2__0 ) ) | ( ( rule__Compare__Group_1_3__0 ) ) | ( ( rule__Compare__Group_1_4__0 ) ) | ( ( rule__Compare__Group_1_5__0 ) ) | ( ( rule__Compare__Group_1_6__0 ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            case 25:
                {
                alt4=5;
                }
                break;
            case 26:
                {
                alt4=6;
                }
                break;
            case 27:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("637:1: rule__Compare__Alternatives_1 : ( ( ( rule__Compare__Group_1_0__0 ) ) | ( ( rule__Compare__Group_1_1__0 ) ) | ( ( rule__Compare__Group_1_2__0 ) ) | ( ( rule__Compare__Group_1_3__0 ) ) | ( ( rule__Compare__Group_1_4__0 ) ) | ( ( rule__Compare__Group_1_5__0 ) ) | ( ( rule__Compare__Group_1_6__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:642:1: ( ( rule__Compare__Group_1_0__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:642:1: ( ( rule__Compare__Group_1_0__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:643:1: ( rule__Compare__Group_1_0__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_0()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:644:1: ( rule__Compare__Group_1_0__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:644:2: rule__Compare__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_0__0_in_rule__Compare__Alternatives_11316);
                    rule__Compare__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:648:6: ( ( rule__Compare__Group_1_1__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:648:6: ( ( rule__Compare__Group_1_1__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:649:1: ( rule__Compare__Group_1_1__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_1()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:650:1: ( rule__Compare__Group_1_1__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:650:2: rule__Compare__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_1__0_in_rule__Compare__Alternatives_11334);
                    rule__Compare__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:654:6: ( ( rule__Compare__Group_1_2__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:654:6: ( ( rule__Compare__Group_1_2__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:655:1: ( rule__Compare__Group_1_2__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_2()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:656:1: ( rule__Compare__Group_1_2__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:656:2: rule__Compare__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_2__0_in_rule__Compare__Alternatives_11352);
                    rule__Compare__Group_1_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:660:6: ( ( rule__Compare__Group_1_3__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:660:6: ( ( rule__Compare__Group_1_3__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:661:1: ( rule__Compare__Group_1_3__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_3()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:662:1: ( rule__Compare__Group_1_3__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:662:2: rule__Compare__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_3__0_in_rule__Compare__Alternatives_11370);
                    rule__Compare__Group_1_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:666:6: ( ( rule__Compare__Group_1_4__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:666:6: ( ( rule__Compare__Group_1_4__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:667:1: ( rule__Compare__Group_1_4__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_4()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:668:1: ( rule__Compare__Group_1_4__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:668:2: rule__Compare__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_4__0_in_rule__Compare__Alternatives_11388);
                    rule__Compare__Group_1_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:672:6: ( ( rule__Compare__Group_1_5__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:672:6: ( ( rule__Compare__Group_1_5__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:673:1: ( rule__Compare__Group_1_5__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_5()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:674:1: ( rule__Compare__Group_1_5__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:674:2: rule__Compare__Group_1_5__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_5__0_in_rule__Compare__Alternatives_11406);
                    rule__Compare__Group_1_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:678:6: ( ( rule__Compare__Group_1_6__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:678:6: ( ( rule__Compare__Group_1_6__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:679:1: ( rule__Compare__Group_1_6__0 )
                    {
                     before(grammarAccess.getCompareAccess().getGroup_1_6()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:680:1: ( rule__Compare__Group_1_6__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:680:2: rule__Compare__Group_1_6__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_6__0_in_rule__Compare__Alternatives_11424);
                    rule__Compare__Group_1_6__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCompareAccess().getGroup_1_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Alternatives_1


    // $ANTLR start rule__Addition__Alternatives_1_0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:689:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:693:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("689:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:694:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:694:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:695:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:696:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:696:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01457);
                    rule__Addition__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:700:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:700:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:701:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:702:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:702:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01475);
                    rule__Addition__Group_1_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Alternatives_1_0


    // $ANTLR start rule__Multiplication__Alternatives_1_0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:711:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:715:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("711:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:716:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:716:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:717:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:718:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:718:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01508);
                    rule__Multiplication__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:722:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:722:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:723:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:724:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:724:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01526);
                    rule__Multiplication__Group_1_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:728:6: ( ( rule__Multiplication__Group_1_0_2__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:728:6: ( ( rule__Multiplication__Group_1_0_2__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:729:1: ( rule__Multiplication__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_2()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:730:1: ( rule__Multiplication__Group_1_0_2__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:730:2: rule__Multiplication__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__0_in_rule__Multiplication__Alternatives_1_01544);
                    rule__Multiplication__Group_1_0_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Alternatives_1_0


    // $ANTLR start rule__PrimaryExpression__Alternatives
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:739:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberValue ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:743:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberValue ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("739:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberValue ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:744:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:744:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:745:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:746:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:746:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1577);
                    rule__PrimaryExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:750:6: ( ruleNumberValue )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:750:6: ( ruleNumberValue )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:751:1: ruleNumberValue
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumberValue_in_rule__PrimaryExpression__Alternatives1595);
                    ruleNumberValue();
                    _fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimaryExpression__Alternatives


    // $ANTLR start rule__NumberValue__Alternatives
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:761:1: rule__NumberValue__Alternatives : ( ( ( rule__NumberValue__NumValueAssignment_0 ) ) | ( ( rule__NumberValue__VarNameAssignment_1 ) ) );
    public final void rule__NumberValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:765:1: ( ( ( rule__NumberValue__NumValueAssignment_0 ) ) | ( ( rule__NumberValue__VarNameAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("761:1: rule__NumberValue__Alternatives : ( ( ( rule__NumberValue__NumValueAssignment_0 ) ) | ( ( rule__NumberValue__VarNameAssignment_1 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:766:1: ( ( rule__NumberValue__NumValueAssignment_0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:766:1: ( ( rule__NumberValue__NumValueAssignment_0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:767:1: ( rule__NumberValue__NumValueAssignment_0 )
                    {
                     before(grammarAccess.getNumberValueAccess().getNumValueAssignment_0()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:768:1: ( rule__NumberValue__NumValueAssignment_0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:768:2: rule__NumberValue__NumValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__NumberValue__NumValueAssignment_0_in_rule__NumberValue__Alternatives1627);
                    rule__NumberValue__NumValueAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getNumberValueAccess().getNumValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:772:6: ( ( rule__NumberValue__VarNameAssignment_1 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:772:6: ( ( rule__NumberValue__VarNameAssignment_1 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:773:1: ( rule__NumberValue__VarNameAssignment_1 )
                    {
                     before(grammarAccess.getNumberValueAccess().getVarNameAssignment_1()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:774:1: ( rule__NumberValue__VarNameAssignment_1 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:774:2: rule__NumberValue__VarNameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NumberValue__VarNameAssignment_1_in_rule__NumberValue__Alternatives1645);
                    rule__NumberValue__VarNameAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getNumberValueAccess().getVarNameAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberValue__Alternatives


    // $ANTLR start rule__BooleanValue__Alternatives
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:783:1: rule__BooleanValue__Alternatives : ( ( ( rule__BooleanValue__ValueAssignment_0 ) ) | ( ( rule__BooleanValue__VarNameAssignment_1 ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:787:1: ( ( ( rule__BooleanValue__ValueAssignment_0 ) ) | ( ( rule__BooleanValue__VarNameAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_BOOLEAN) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("783:1: rule__BooleanValue__Alternatives : ( ( ( rule__BooleanValue__ValueAssignment_0 ) ) | ( ( rule__BooleanValue__VarNameAssignment_1 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:788:1: ( ( rule__BooleanValue__ValueAssignment_0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:788:1: ( ( rule__BooleanValue__ValueAssignment_0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:789:1: ( rule__BooleanValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBooleanValueAccess().getValueAssignment_0()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:790:1: ( rule__BooleanValue__ValueAssignment_0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:790:2: rule__BooleanValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_0_in_rule__BooleanValue__Alternatives1678);
                    rule__BooleanValue__ValueAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBooleanValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:794:6: ( ( rule__BooleanValue__VarNameAssignment_1 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:794:6: ( ( rule__BooleanValue__VarNameAssignment_1 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:795:1: ( rule__BooleanValue__VarNameAssignment_1 )
                    {
                     before(grammarAccess.getBooleanValueAccess().getVarNameAssignment_1()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:796:1: ( rule__BooleanValue__VarNameAssignment_1 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:796:2: rule__BooleanValue__VarNameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BooleanValue__VarNameAssignment_1_in_rule__BooleanValue__Alternatives1696);
                    rule__BooleanValue__VarNameAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getBooleanValueAccess().getVarNameAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BooleanValue__Alternatives


    // $ANTLR start rule__VARIABLE_VALUE__Alternatives
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:805:1: rule__VARIABLE_VALUE__Alternatives : ( ( RULE_ID ) | ( ( rule__VARIABLE_VALUE__Group_1__0 ) ) );
    public final void rule__VARIABLE_VALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:809:1: ( ( RULE_ID ) | ( ( rule__VARIABLE_VALUE__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==36) ) {
                    alt10=2;
                }
                else if ( (LA10_1==EOF||(LA10_1>=13 && LA10_1<=17)||(LA10_1>=20 && LA10_1<=33)||LA10_1==35) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("805:1: rule__VARIABLE_VALUE__Alternatives : ( ( RULE_ID ) | ( ( rule__VARIABLE_VALUE__Group_1__0 ) ) );", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("805:1: rule__VARIABLE_VALUE__Alternatives : ( ( RULE_ID ) | ( ( rule__VARIABLE_VALUE__Group_1__0 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:810:1: ( RULE_ID )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:810:1: ( RULE_ID )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:811:1: RULE_ID
                    {
                     before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Alternatives1729); 
                     after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:816:6: ( ( rule__VARIABLE_VALUE__Group_1__0 ) )
                    {
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:816:6: ( ( rule__VARIABLE_VALUE__Group_1__0 ) )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:817:1: ( rule__VARIABLE_VALUE__Group_1__0 )
                    {
                     before(grammarAccess.getVARIABLE_VALUEAccess().getGroup_1()); 
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:818:1: ( rule__VARIABLE_VALUE__Group_1__0 )
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:818:2: rule__VARIABLE_VALUE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__0_in_rule__VARIABLE_VALUE__Alternatives1746);
                    rule__VARIABLE_VALUE__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVARIABLE_VALUEAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VARIABLE_VALUE__Alternatives


    // $ANTLR start rule__Equivalent__Group__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:829:1: rule__Equivalent__Group__0 : rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1 ;
    public final void rule__Equivalent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:833:1: ( rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:834:2: rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1
            {
            pushFollow(FOLLOW_rule__Equivalent__Group__0__Impl_in_rule__Equivalent__Group__01777);
            rule__Equivalent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Equivalent__Group__1_in_rule__Equivalent__Group__01780);
            rule__Equivalent__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__Group__0


    // $ANTLR start rule__Equivalent__Group__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:841:1: rule__Equivalent__Group__0__Impl : ( ruleImplication ) ;
    public final void rule__Equivalent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:845:1: ( ( ruleImplication ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:846:1: ( ruleImplication )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:846:1: ( ruleImplication )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:847:1: ruleImplication
            {
             before(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleImplication_in_rule__Equivalent__Group__0__Impl1807);
            ruleImplication();
            _fsp--;

             after(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__Group__0__Impl


    // $ANTLR start rule__Equivalent__Group__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:858:1: rule__Equivalent__Group__1 : rule__Equivalent__Group__1__Impl ;
    public final void rule__Equivalent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:862:1: ( rule__Equivalent__Group__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:863:2: rule__Equivalent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equivalent__Group__1__Impl_in_rule__Equivalent__Group__11836);
            rule__Equivalent__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__Group__1


    // $ANTLR start rule__Equivalent__Group__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:869:1: rule__Equivalent__Group__1__Impl : ( ( rule__Equivalent__Group_1__0 )? ) ;
    public final void rule__Equivalent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:873:1: ( ( ( rule__Equivalent__Group_1__0 )? ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:874:1: ( ( rule__Equivalent__Group_1__0 )? )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:874:1: ( ( rule__Equivalent__Group_1__0 )? )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:875:1: ( rule__Equivalent__Group_1__0 )?
            {
             before(grammarAccess.getEquivalentAccess().getGroup_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:876:1: ( rule__Equivalent__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:876:2: rule__Equivalent__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Equivalent__Group_1__0_in_rule__Equivalent__Group__1__Impl1863);
                    rule__Equivalent__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEquivalentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__Group__1__Impl


    // $ANTLR start rule__Equivalent__Group_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:890:1: rule__Equivalent__Group_1__0 : rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1 ;
    public final void rule__Equivalent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:894:1: ( rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:895:2: rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equivalent__Group_1__0__Impl_in_rule__Equivalent__Group_1__01898);
            rule__Equivalent__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Equivalent__Group_1__1_in_rule__Equivalent__Group_1__01901);
            rule__Equivalent__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__Group_1__0


    // $ANTLR start rule__Equivalent__Group_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:902:1: rule__Equivalent__Group_1__0__Impl : ( () ) ;
    public final void rule__Equivalent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:906:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:907:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:907:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:908:1: ()
            {
             before(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:909:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:911:1: 
            {
            }

             after(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__Group_1__0__Impl


    // $ANTLR start rule__Equivalent__Group_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:921:1: rule__Equivalent__Group_1__1 : rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2 ;
    public final void rule__Equivalent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:925:1: ( rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:926:2: rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equivalent__Group_1__1__Impl_in_rule__Equivalent__Group_1__11959);
            rule__Equivalent__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Equivalent__Group_1__2_in_rule__Equivalent__Group_1__11962);
            rule__Equivalent__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__Group_1__1


    // $ANTLR start rule__Equivalent__Group_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:933:1: rule__Equivalent__Group_1__1__Impl : ( 'equiv' ) ;
    public final void rule__Equivalent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:937:1: ( ( 'equiv' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:938:1: ( 'equiv' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:938:1: ( 'equiv' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:939:1: 'equiv'
            {
             before(grammarAccess.getEquivalentAccess().getEquivKeyword_1_1()); 
            match(input,13,FOLLOW_13_in_rule__Equivalent__Group_1__1__Impl1990); 
             after(grammarAccess.getEquivalentAccess().getEquivKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__Group_1__1__Impl


    // $ANTLR start rule__Equivalent__Group_1__2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:952:1: rule__Equivalent__Group_1__2 : rule__Equivalent__Group_1__2__Impl ;
    public final void rule__Equivalent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:956:1: ( rule__Equivalent__Group_1__2__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:957:2: rule__Equivalent__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equivalent__Group_1__2__Impl_in_rule__Equivalent__Group_1__22021);
            rule__Equivalent__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__Group_1__2


    // $ANTLR start rule__Equivalent__Group_1__2__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:963:1: rule__Equivalent__Group_1__2__Impl : ( ( rule__Equivalent__RightAssignment_1_2 ) ) ;
    public final void rule__Equivalent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:967:1: ( ( ( rule__Equivalent__RightAssignment_1_2 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:968:1: ( ( rule__Equivalent__RightAssignment_1_2 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:968:1: ( ( rule__Equivalent__RightAssignment_1_2 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:969:1: ( rule__Equivalent__RightAssignment_1_2 )
            {
             before(grammarAccess.getEquivalentAccess().getRightAssignment_1_2()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:970:1: ( rule__Equivalent__RightAssignment_1_2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:970:2: rule__Equivalent__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equivalent__RightAssignment_1_2_in_rule__Equivalent__Group_1__2__Impl2048);
            rule__Equivalent__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getEquivalentAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__Group_1__2__Impl


    // $ANTLR start rule__Implication__Group__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:986:1: rule__Implication__Group__0 : rule__Implication__Group__0__Impl rule__Implication__Group__1 ;
    public final void rule__Implication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:990:1: ( rule__Implication__Group__0__Impl rule__Implication__Group__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:991:2: rule__Implication__Group__0__Impl rule__Implication__Group__1
            {
            pushFollow(FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__02084);
            rule__Implication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__02087);
            rule__Implication__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__Group__0


    // $ANTLR start rule__Implication__Group__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:998:1: rule__Implication__Group__0__Impl : ( ruleDisjunction ) ;
    public final void rule__Implication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1002:1: ( ( ruleDisjunction ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1003:1: ( ruleDisjunction )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1003:1: ( ruleDisjunction )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1004:1: ruleDisjunction
            {
             before(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDisjunction_in_rule__Implication__Group__0__Impl2114);
            ruleDisjunction();
            _fsp--;

             after(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__Group__0__Impl


    // $ANTLR start rule__Implication__Group__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1015:1: rule__Implication__Group__1 : rule__Implication__Group__1__Impl ;
    public final void rule__Implication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1019:1: ( rule__Implication__Group__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1020:2: rule__Implication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__12143);
            rule__Implication__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__Group__1


    // $ANTLR start rule__Implication__Group__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1026:1: rule__Implication__Group__1__Impl : ( ( rule__Implication__Group_1__0 )? ) ;
    public final void rule__Implication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1030:1: ( ( ( rule__Implication__Group_1__0 )? ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1031:1: ( ( rule__Implication__Group_1__0 )? )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1031:1: ( ( rule__Implication__Group_1__0 )? )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1032:1: ( rule__Implication__Group_1__0 )?
            {
             before(grammarAccess.getImplicationAccess().getGroup_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1033:1: ( rule__Implication__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1033:2: rule__Implication__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Implication__Group_1__0_in_rule__Implication__Group__1__Impl2170);
                    rule__Implication__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__Group__1__Impl


    // $ANTLR start rule__Implication__Group_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1047:1: rule__Implication__Group_1__0 : rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1 ;
    public final void rule__Implication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1051:1: ( rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1052:2: rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Implication__Group_1__0__Impl_in_rule__Implication__Group_1__02205);
            rule__Implication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Implication__Group_1__1_in_rule__Implication__Group_1__02208);
            rule__Implication__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__Group_1__0


    // $ANTLR start rule__Implication__Group_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1059:1: rule__Implication__Group_1__0__Impl : ( () ) ;
    public final void rule__Implication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1063:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1064:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1064:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1065:1: ()
            {
             before(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1066:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1068:1: 
            {
            }

             after(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__Group_1__0__Impl


    // $ANTLR start rule__Implication__Group_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1078:1: rule__Implication__Group_1__1 : rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2 ;
    public final void rule__Implication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1082:1: ( rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1083:2: rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Implication__Group_1__1__Impl_in_rule__Implication__Group_1__12266);
            rule__Implication__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Implication__Group_1__2_in_rule__Implication__Group_1__12269);
            rule__Implication__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__Group_1__1


    // $ANTLR start rule__Implication__Group_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1090:1: rule__Implication__Group_1__1__Impl : ( 'imply' ) ;
    public final void rule__Implication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1094:1: ( ( 'imply' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1095:1: ( 'imply' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1095:1: ( 'imply' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1096:1: 'imply'
            {
             before(grammarAccess.getImplicationAccess().getImplyKeyword_1_1()); 
            match(input,14,FOLLOW_14_in_rule__Implication__Group_1__1__Impl2297); 
             after(grammarAccess.getImplicationAccess().getImplyKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__Group_1__1__Impl


    // $ANTLR start rule__Implication__Group_1__2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1109:1: rule__Implication__Group_1__2 : rule__Implication__Group_1__2__Impl ;
    public final void rule__Implication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1113:1: ( rule__Implication__Group_1__2__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1114:2: rule__Implication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Implication__Group_1__2__Impl_in_rule__Implication__Group_1__22328);
            rule__Implication__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__Group_1__2


    // $ANTLR start rule__Implication__Group_1__2__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1120:1: rule__Implication__Group_1__2__Impl : ( ( rule__Implication__RightAssignment_1_2 ) ) ;
    public final void rule__Implication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1124:1: ( ( ( rule__Implication__RightAssignment_1_2 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1125:1: ( ( rule__Implication__RightAssignment_1_2 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1125:1: ( ( rule__Implication__RightAssignment_1_2 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1126:1: ( rule__Implication__RightAssignment_1_2 )
            {
             before(grammarAccess.getImplicationAccess().getRightAssignment_1_2()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1127:1: ( rule__Implication__RightAssignment_1_2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1127:2: rule__Implication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Implication__RightAssignment_1_2_in_rule__Implication__Group_1__2__Impl2355);
            rule__Implication__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getImplicationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__Group_1__2__Impl


    // $ANTLR start rule__Disjunction__Group__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1143:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1147:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1148:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__02391);
            rule__Disjunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__02394);
            rule__Disjunction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group__0


    // $ANTLR start rule__Disjunction__Group__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1155:1: rule__Disjunction__Group__0__Impl : ( ruleConjunction ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1159:1: ( ( ruleConjunction ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1160:1: ( ruleConjunction )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1160:1: ( ruleConjunction )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1161:1: ruleConjunction
            {
             before(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Disjunction__Group__0__Impl2421);
            ruleConjunction();
            _fsp--;

             after(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group__0__Impl


    // $ANTLR start rule__Disjunction__Group__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1172:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1176:1: ( rule__Disjunction__Group__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1177:2: rule__Disjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__12450);
            rule__Disjunction__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group__1


    // $ANTLR start rule__Disjunction__Group__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1183:1: rule__Disjunction__Group__1__Impl : ( ( rule__Disjunction__Group_1__0 )? ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1187:1: ( ( ( rule__Disjunction__Group_1__0 )? ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1188:1: ( ( rule__Disjunction__Group_1__0 )? )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1188:1: ( ( rule__Disjunction__Group_1__0 )? )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1189:1: ( rule__Disjunction__Group_1__0 )?
            {
             before(grammarAccess.getDisjunctionAccess().getGroup_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1190:1: ( rule__Disjunction__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=15 && LA13_0<=16)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1190:2: rule__Disjunction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Disjunction__Group_1__0_in_rule__Disjunction__Group__1__Impl2477);
                    rule__Disjunction__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDisjunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group__1__Impl


    // $ANTLR start rule__Disjunction__Group_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1204:1: rule__Disjunction__Group_1__0 : rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 ;
    public final void rule__Disjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1208:1: ( rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1209:2: rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1__0__Impl_in_rule__Disjunction__Group_1__02512);
            rule__Disjunction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_1__1_in_rule__Disjunction__Group_1__02515);
            rule__Disjunction__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1__0


    // $ANTLR start rule__Disjunction__Group_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1216:1: rule__Disjunction__Group_1__0__Impl : ( ( rule__Disjunction__Alternatives_1_0 ) ) ;
    public final void rule__Disjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1220:1: ( ( ( rule__Disjunction__Alternatives_1_0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1221:1: ( ( rule__Disjunction__Alternatives_1_0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1221:1: ( ( rule__Disjunction__Alternatives_1_0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1222:1: ( rule__Disjunction__Alternatives_1_0 )
            {
             before(grammarAccess.getDisjunctionAccess().getAlternatives_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1223:1: ( rule__Disjunction__Alternatives_1_0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1223:2: rule__Disjunction__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Disjunction__Alternatives_1_0_in_rule__Disjunction__Group_1__0__Impl2542);
            rule__Disjunction__Alternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1__0__Impl


    // $ANTLR start rule__Disjunction__Group_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1233:1: rule__Disjunction__Group_1__1 : rule__Disjunction__Group_1__1__Impl ;
    public final void rule__Disjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1237:1: ( rule__Disjunction__Group_1__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1238:2: rule__Disjunction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1__1__Impl_in_rule__Disjunction__Group_1__12572);
            rule__Disjunction__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1__1


    // $ANTLR start rule__Disjunction__Group_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1244:1: rule__Disjunction__Group_1__1__Impl : ( ( rule__Disjunction__RightAssignment_1_1 ) ) ;
    public final void rule__Disjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1248:1: ( ( ( rule__Disjunction__RightAssignment_1_1 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1249:1: ( ( rule__Disjunction__RightAssignment_1_1 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1249:1: ( ( rule__Disjunction__RightAssignment_1_1 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1250:1: ( rule__Disjunction__RightAssignment_1_1 )
            {
             before(grammarAccess.getDisjunctionAccess().getRightAssignment_1_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1251:1: ( rule__Disjunction__RightAssignment_1_1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1251:2: rule__Disjunction__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Disjunction__RightAssignment_1_1_in_rule__Disjunction__Group_1__1__Impl2599);
            rule__Disjunction__RightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1__1__Impl


    // $ANTLR start rule__Disjunction__Group_1_0_0__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1265:1: rule__Disjunction__Group_1_0_0__0 : rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1 ;
    public final void rule__Disjunction__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1269:1: ( rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1270:2: rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__0__Impl_in_rule__Disjunction__Group_1_0_0__02633);
            rule__Disjunction__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__1_in_rule__Disjunction__Group_1_0_0__02636);
            rule__Disjunction__Group_1_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1_0_0__0


    // $ANTLR start rule__Disjunction__Group_1_0_0__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1277:1: rule__Disjunction__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1281:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1282:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1282:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1283:1: ()
            {
             before(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1284:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1286:1: 
            {
            }

             after(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1_0_0__0__Impl


    // $ANTLR start rule__Disjunction__Group_1_0_0__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1296:1: rule__Disjunction__Group_1_0_0__1 : rule__Disjunction__Group_1_0_0__1__Impl ;
    public final void rule__Disjunction__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1300:1: ( rule__Disjunction__Group_1_0_0__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1301:2: rule__Disjunction__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__1__Impl_in_rule__Disjunction__Group_1_0_0__12694);
            rule__Disjunction__Group_1_0_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1_0_0__1


    // $ANTLR start rule__Disjunction__Group_1_0_0__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1307:1: rule__Disjunction__Group_1_0_0__1__Impl : ( 'or' ) ;
    public final void rule__Disjunction__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1311:1: ( ( 'or' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1312:1: ( 'or' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1312:1: ( 'or' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1313:1: 'or'
            {
             before(grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1()); 
            match(input,15,FOLLOW_15_in_rule__Disjunction__Group_1_0_0__1__Impl2722); 
             after(grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1_0_0__1__Impl


    // $ANTLR start rule__Disjunction__Group_1_0_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1330:1: rule__Disjunction__Group_1_0_1__0 : rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1 ;
    public final void rule__Disjunction__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1334:1: ( rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1335:2: rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__0__Impl_in_rule__Disjunction__Group_1_0_1__02757);
            rule__Disjunction__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__1_in_rule__Disjunction__Group_1_0_1__02760);
            rule__Disjunction__Group_1_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1_0_1__0


    // $ANTLR start rule__Disjunction__Group_1_0_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1342:1: rule__Disjunction__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1346:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1347:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1347:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1348:1: ()
            {
             before(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1349:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1351:1: 
            {
            }

             after(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1_0_1__0__Impl


    // $ANTLR start rule__Disjunction__Group_1_0_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1361:1: rule__Disjunction__Group_1_0_1__1 : rule__Disjunction__Group_1_0_1__1__Impl ;
    public final void rule__Disjunction__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1365:1: ( rule__Disjunction__Group_1_0_1__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1366:2: rule__Disjunction__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__1__Impl_in_rule__Disjunction__Group_1_0_1__12818);
            rule__Disjunction__Group_1_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1_0_1__1


    // $ANTLR start rule__Disjunction__Group_1_0_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1372:1: rule__Disjunction__Group_1_0_1__1__Impl : ( 'xor' ) ;
    public final void rule__Disjunction__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1376:1: ( ( 'xor' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1377:1: ( 'xor' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1377:1: ( 'xor' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1378:1: 'xor'
            {
             before(grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1()); 
            match(input,16,FOLLOW_16_in_rule__Disjunction__Group_1_0_1__1__Impl2846); 
             after(grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__Group_1_0_1__1__Impl


    // $ANTLR start rule__Conjunction__Group__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1395:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1399:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1400:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__02881);
            rule__Conjunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__02884);
            rule__Conjunction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group__0


    // $ANTLR start rule__Conjunction__Group__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1407:1: rule__Conjunction__Group__0__Impl : ( ruleNegation ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1411:1: ( ( ruleNegation ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1412:1: ( ruleNegation )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1412:1: ( ruleNegation )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1413:1: ruleNegation
            {
             before(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNegation_in_rule__Conjunction__Group__0__Impl2911);
            ruleNegation();
            _fsp--;

             after(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group__0__Impl


    // $ANTLR start rule__Conjunction__Group__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1424:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1428:1: ( rule__Conjunction__Group__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1429:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__12940);
            rule__Conjunction__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group__1


    // $ANTLR start rule__Conjunction__Group__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1435:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )? ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1439:1: ( ( ( rule__Conjunction__Group_1__0 )? ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1440:1: ( ( rule__Conjunction__Group_1__0 )? )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1440:1: ( ( rule__Conjunction__Group_1__0 )? )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1441:1: ( rule__Conjunction__Group_1__0 )?
            {
             before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1442:1: ( rule__Conjunction__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1442:2: rule__Conjunction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl2967);
                    rule__Conjunction__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConjunctionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group__1__Impl


    // $ANTLR start rule__Conjunction__Group_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1456:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1460:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1461:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__03002);
            rule__Conjunction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__03005);
            rule__Conjunction__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group_1__0


    // $ANTLR start rule__Conjunction__Group_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1468:1: rule__Conjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1472:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1473:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1473:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1474:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1475:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1477:1: 
            {
            }

             after(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group_1__0__Impl


    // $ANTLR start rule__Conjunction__Group_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1487:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1491:1: ( rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1492:2: rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__13063);
            rule__Conjunction__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__13066);
            rule__Conjunction__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group_1__1


    // $ANTLR start rule__Conjunction__Group_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1499:1: rule__Conjunction__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1503:1: ( ( 'and' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1504:1: ( 'and' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1504:1: ( 'and' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1505:1: 'and'
            {
             before(grammarAccess.getConjunctionAccess().getAndKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Conjunction__Group_1__1__Impl3094); 
             after(grammarAccess.getConjunctionAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group_1__1__Impl


    // $ANTLR start rule__Conjunction__Group_1__2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1518:1: rule__Conjunction__Group_1__2 : rule__Conjunction__Group_1__2__Impl ;
    public final void rule__Conjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1522:1: ( rule__Conjunction__Group_1__2__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1523:2: rule__Conjunction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__23125);
            rule__Conjunction__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group_1__2


    // $ANTLR start rule__Conjunction__Group_1__2__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1529:1: rule__Conjunction__Group_1__2__Impl : ( ( rule__Conjunction__RightAssignment_1_2 ) ) ;
    public final void rule__Conjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1533:1: ( ( ( rule__Conjunction__RightAssignment_1_2 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1534:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1534:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1535:1: ( rule__Conjunction__RightAssignment_1_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1536:1: ( rule__Conjunction__RightAssignment_1_2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1536:2: rule__Conjunction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl3152);
            rule__Conjunction__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__Group_1__2__Impl


    // $ANTLR start rule__Negation__Group_0__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1552:1: rule__Negation__Group_0__0 : rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1 ;
    public final void rule__Negation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1556:1: ( rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1557:2: rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Negation__Group_0__0__Impl_in_rule__Negation__Group_0__03188);
            rule__Negation__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Negation__Group_0__1_in_rule__Negation__Group_0__03191);
            rule__Negation__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Negation__Group_0__0


    // $ANTLR start rule__Negation__Group_0__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1564:1: rule__Negation__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__Negation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1568:1: ( ( 'not' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1569:1: ( 'not' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1569:1: ( 'not' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1570:1: 'not'
            {
             before(grammarAccess.getNegationAccess().getNotKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Negation__Group_0__0__Impl3219); 
             after(grammarAccess.getNegationAccess().getNotKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Negation__Group_0__0__Impl


    // $ANTLR start rule__Negation__Group_0__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1583:1: rule__Negation__Group_0__1 : rule__Negation__Group_0__1__Impl ;
    public final void rule__Negation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1587:1: ( rule__Negation__Group_0__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1588:2: rule__Negation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group_0__1__Impl_in_rule__Negation__Group_0__13250);
            rule__Negation__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Negation__Group_0__1


    // $ANTLR start rule__Negation__Group_0__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1594:1: rule__Negation__Group_0__1__Impl : ( ruleNegated ) ;
    public final void rule__Negation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1598:1: ( ( ruleNegated ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1599:1: ( ruleNegated )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1599:1: ( ruleNegated )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1600:1: ruleNegated
            {
             before(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleNegated_in_rule__Negation__Group_0__1__Impl3277);
            ruleNegated();
            _fsp--;

             after(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Negation__Group_0__1__Impl


    // $ANTLR start rule__Negated__Group__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1615:1: rule__Negated__Group__0 : rule__Negated__Group__0__Impl rule__Negated__Group__1 ;
    public final void rule__Negated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1619:1: ( rule__Negated__Group__0__Impl rule__Negated__Group__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1620:2: rule__Negated__Group__0__Impl rule__Negated__Group__1
            {
            pushFollow(FOLLOW_rule__Negated__Group__0__Impl_in_rule__Negated__Group__03310);
            rule__Negated__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Negated__Group__1_in_rule__Negated__Group__03313);
            rule__Negated__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Negated__Group__0


    // $ANTLR start rule__Negated__Group__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1627:1: rule__Negated__Group__0__Impl : ( () ) ;
    public final void rule__Negated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1631:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1632:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1632:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1633:1: ()
            {
             before(grammarAccess.getNegatedAccess().getNotAction_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1634:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1636:1: 
            {
            }

             after(grammarAccess.getNegatedAccess().getNotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Negated__Group__0__Impl


    // $ANTLR start rule__Negated__Group__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1646:1: rule__Negated__Group__1 : rule__Negated__Group__1__Impl ;
    public final void rule__Negated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1650:1: ( rule__Negated__Group__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1651:2: rule__Negated__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negated__Group__1__Impl_in_rule__Negated__Group__13371);
            rule__Negated__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Negated__Group__1


    // $ANTLR start rule__Negated__Group__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1657:1: rule__Negated__Group__1__Impl : ( ( rule__Negated__NotAssignment_1 ) ) ;
    public final void rule__Negated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1661:1: ( ( ( rule__Negated__NotAssignment_1 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1662:1: ( ( rule__Negated__NotAssignment_1 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1662:1: ( ( rule__Negated__NotAssignment_1 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1663:1: ( rule__Negated__NotAssignment_1 )
            {
             before(grammarAccess.getNegatedAccess().getNotAssignment_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1664:1: ( rule__Negated__NotAssignment_1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1664:2: rule__Negated__NotAssignment_1
            {
            pushFollow(FOLLOW_rule__Negated__NotAssignment_1_in_rule__Negated__Group__1__Impl3398);
            rule__Negated__NotAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getNegatedAccess().getNotAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Negated__Group__1__Impl


    // $ANTLR start rule__CExpression__Group_0__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1678:1: rule__CExpression__Group_0__0 : rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1 ;
    public final void rule__CExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1682:1: ( rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1683:2: rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__CExpression__Group_0__0__Impl_in_rule__CExpression__Group_0__03432);
            rule__CExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CExpression__Group_0__1_in_rule__CExpression__Group_0__03435);
            rule__CExpression__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CExpression__Group_0__0


    // $ANTLR start rule__CExpression__Group_0__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1690:1: rule__CExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__CExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1694:1: ( ( '(' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1695:1: ( '(' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1695:1: ( '(' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1696:1: '('
            {
             before(grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,19,FOLLOW_19_in_rule__CExpression__Group_0__0__Impl3463); 
             after(grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CExpression__Group_0__0__Impl


    // $ANTLR start rule__CExpression__Group_0__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1709:1: rule__CExpression__Group_0__1 : rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2 ;
    public final void rule__CExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1713:1: ( rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1714:2: rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__CExpression__Group_0__1__Impl_in_rule__CExpression__Group_0__13494);
            rule__CExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CExpression__Group_0__2_in_rule__CExpression__Group_0__13497);
            rule__CExpression__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CExpression__Group_0__1


    // $ANTLR start rule__CExpression__Group_0__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1721:1: rule__CExpression__Group_0__1__Impl : ( ruleLExpression ) ;
    public final void rule__CExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1725:1: ( ( ruleLExpression ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1726:1: ( ruleLExpression )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1726:1: ( ruleLExpression )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1727:1: ruleLExpression
            {
             before(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleLExpression_in_rule__CExpression__Group_0__1__Impl3524);
            ruleLExpression();
            _fsp--;

             after(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CExpression__Group_0__1__Impl


    // $ANTLR start rule__CExpression__Group_0__2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1738:1: rule__CExpression__Group_0__2 : rule__CExpression__Group_0__2__Impl ;
    public final void rule__CExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1742:1: ( rule__CExpression__Group_0__2__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1743:2: rule__CExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__CExpression__Group_0__2__Impl_in_rule__CExpression__Group_0__23553);
            rule__CExpression__Group_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CExpression__Group_0__2


    // $ANTLR start rule__CExpression__Group_0__2__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1749:1: rule__CExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__CExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1753:1: ( ( ')' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1754:1: ( ')' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1754:1: ( ')' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1755:1: ')'
            {
             before(grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,20,FOLLOW_20_in_rule__CExpression__Group_0__2__Impl3581); 
             after(grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CExpression__Group_0__2__Impl


    // $ANTLR start rule__Compare__Group__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1774:1: rule__Compare__Group__0 : rule__Compare__Group__0__Impl rule__Compare__Group__1 ;
    public final void rule__Compare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1778:1: ( rule__Compare__Group__0__Impl rule__Compare__Group__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1779:2: rule__Compare__Group__0__Impl rule__Compare__Group__1
            {
            pushFollow(FOLLOW_rule__Compare__Group__0__Impl_in_rule__Compare__Group__03618);
            rule__Compare__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Compare__Group__1_in_rule__Compare__Group__03621);
            rule__Compare__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group__0


    // $ANTLR start rule__Compare__Group__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1786:1: rule__Compare__Group__0__Impl : ( ruleAExpression ) ;
    public final void rule__Compare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1790:1: ( ( ruleAExpression ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1791:1: ( ruleAExpression )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1791:1: ( ruleAExpression )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1792:1: ruleAExpression
            {
             before(grammarAccess.getCompareAccess().getAExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAExpression_in_rule__Compare__Group__0__Impl3648);
            ruleAExpression();
            _fsp--;

             after(grammarAccess.getCompareAccess().getAExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group__0__Impl


    // $ANTLR start rule__Compare__Group__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1803:1: rule__Compare__Group__1 : rule__Compare__Group__1__Impl rule__Compare__Group__2 ;
    public final void rule__Compare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1807:1: ( rule__Compare__Group__1__Impl rule__Compare__Group__2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1808:2: rule__Compare__Group__1__Impl rule__Compare__Group__2
            {
            pushFollow(FOLLOW_rule__Compare__Group__1__Impl_in_rule__Compare__Group__13677);
            rule__Compare__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Compare__Group__2_in_rule__Compare__Group__13680);
            rule__Compare__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group__1


    // $ANTLR start rule__Compare__Group__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1815:1: rule__Compare__Group__1__Impl : ( ( rule__Compare__Alternatives_1 ) ) ;
    public final void rule__Compare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1819:1: ( ( ( rule__Compare__Alternatives_1 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1820:1: ( ( rule__Compare__Alternatives_1 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1820:1: ( ( rule__Compare__Alternatives_1 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1821:1: ( rule__Compare__Alternatives_1 )
            {
             before(grammarAccess.getCompareAccess().getAlternatives_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1822:1: ( rule__Compare__Alternatives_1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1822:2: rule__Compare__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Compare__Alternatives_1_in_rule__Compare__Group__1__Impl3707);
            rule__Compare__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getCompareAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group__1__Impl


    // $ANTLR start rule__Compare__Group__2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1832:1: rule__Compare__Group__2 : rule__Compare__Group__2__Impl ;
    public final void rule__Compare__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1836:1: ( rule__Compare__Group__2__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1837:2: rule__Compare__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group__2__Impl_in_rule__Compare__Group__23737);
            rule__Compare__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group__2


    // $ANTLR start rule__Compare__Group__2__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1843:1: rule__Compare__Group__2__Impl : ( ( rule__Compare__RightAssignment_2 ) ) ;
    public final void rule__Compare__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1847:1: ( ( ( rule__Compare__RightAssignment_2 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1848:1: ( ( rule__Compare__RightAssignment_2 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1848:1: ( ( rule__Compare__RightAssignment_2 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1849:1: ( rule__Compare__RightAssignment_2 )
            {
             before(grammarAccess.getCompareAccess().getRightAssignment_2()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1850:1: ( rule__Compare__RightAssignment_2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1850:2: rule__Compare__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Compare__RightAssignment_2_in_rule__Compare__Group__2__Impl3764);
            rule__Compare__RightAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCompareAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group__2__Impl


    // $ANTLR start rule__Compare__Group_1_0__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1866:1: rule__Compare__Group_1_0__0 : rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1 ;
    public final void rule__Compare__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1870:1: ( rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1871:2: rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_0__0__Impl_in_rule__Compare__Group_1_0__03800);
            rule__Compare__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Compare__Group_1_0__1_in_rule__Compare__Group_1_0__03803);
            rule__Compare__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_0__0


    // $ANTLR start rule__Compare__Group_1_0__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1878:1: rule__Compare__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1882:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1883:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1883:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1884:1: ()
            {
             before(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1885:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1887:1: 
            {
            }

             after(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_0__0__Impl


    // $ANTLR start rule__Compare__Group_1_0__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1897:1: rule__Compare__Group_1_0__1 : rule__Compare__Group_1_0__1__Impl ;
    public final void rule__Compare__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1901:1: ( rule__Compare__Group_1_0__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1902:2: rule__Compare__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_0__1__Impl_in_rule__Compare__Group_1_0__13861);
            rule__Compare__Group_1_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_0__1


    // $ANTLR start rule__Compare__Group_1_0__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1908:1: rule__Compare__Group_1_0__1__Impl : ( '<=' ) ;
    public final void rule__Compare__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1912:1: ( ( '<=' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1913:1: ( '<=' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1913:1: ( '<=' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1914:1: '<='
            {
             before(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1()); 
            match(input,21,FOLLOW_21_in_rule__Compare__Group_1_0__1__Impl3889); 
             after(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_0__1__Impl


    // $ANTLR start rule__Compare__Group_1_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1931:1: rule__Compare__Group_1_1__0 : rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1 ;
    public final void rule__Compare__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1935:1: ( rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1936:2: rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_1__0__Impl_in_rule__Compare__Group_1_1__03924);
            rule__Compare__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Compare__Group_1_1__1_in_rule__Compare__Group_1_1__03927);
            rule__Compare__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_1__0


    // $ANTLR start rule__Compare__Group_1_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1943:1: rule__Compare__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1947:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1948:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1948:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1949:1: ()
            {
             before(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1950:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1952:1: 
            {
            }

             after(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_1__0__Impl


    // $ANTLR start rule__Compare__Group_1_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1962:1: rule__Compare__Group_1_1__1 : rule__Compare__Group_1_1__1__Impl ;
    public final void rule__Compare__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1966:1: ( rule__Compare__Group_1_1__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1967:2: rule__Compare__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_1__1__Impl_in_rule__Compare__Group_1_1__13985);
            rule__Compare__Group_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_1__1


    // $ANTLR start rule__Compare__Group_1_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1973:1: rule__Compare__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__Compare__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1977:1: ( ( '<' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1978:1: ( '<' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1978:1: ( '<' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1979:1: '<'
            {
             before(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1()); 
            match(input,22,FOLLOW_22_in_rule__Compare__Group_1_1__1__Impl4013); 
             after(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_1__1__Impl


    // $ANTLR start rule__Compare__Group_1_2__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1996:1: rule__Compare__Group_1_2__0 : rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1 ;
    public final void rule__Compare__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2000:1: ( rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2001:2: rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_2__0__Impl_in_rule__Compare__Group_1_2__04048);
            rule__Compare__Group_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Compare__Group_1_2__1_in_rule__Compare__Group_1_2__04051);
            rule__Compare__Group_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_2__0


    // $ANTLR start rule__Compare__Group_1_2__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2008:1: rule__Compare__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2012:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2013:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2013:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2014:1: ()
            {
             before(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2015:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2017:1: 
            {
            }

             after(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_2__0__Impl


    // $ANTLR start rule__Compare__Group_1_2__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2027:1: rule__Compare__Group_1_2__1 : rule__Compare__Group_1_2__1__Impl ;
    public final void rule__Compare__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2031:1: ( rule__Compare__Group_1_2__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2032:2: rule__Compare__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_2__1__Impl_in_rule__Compare__Group_1_2__14109);
            rule__Compare__Group_1_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_2__1


    // $ANTLR start rule__Compare__Group_1_2__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2038:1: rule__Compare__Group_1_2__1__Impl : ( '>=' ) ;
    public final void rule__Compare__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2042:1: ( ( '>=' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2043:1: ( '>=' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2043:1: ( '>=' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2044:1: '>='
            {
             before(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
            match(input,23,FOLLOW_23_in_rule__Compare__Group_1_2__1__Impl4137); 
             after(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_2__1__Impl


    // $ANTLR start rule__Compare__Group_1_3__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2061:1: rule__Compare__Group_1_3__0 : rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1 ;
    public final void rule__Compare__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2065:1: ( rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2066:2: rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_3__0__Impl_in_rule__Compare__Group_1_3__04172);
            rule__Compare__Group_1_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Compare__Group_1_3__1_in_rule__Compare__Group_1_3__04175);
            rule__Compare__Group_1_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_3__0


    // $ANTLR start rule__Compare__Group_1_3__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2073:1: rule__Compare__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2077:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2078:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2078:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2079:1: ()
            {
             before(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2080:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2082:1: 
            {
            }

             after(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_3__0__Impl


    // $ANTLR start rule__Compare__Group_1_3__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2092:1: rule__Compare__Group_1_3__1 : rule__Compare__Group_1_3__1__Impl ;
    public final void rule__Compare__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2096:1: ( rule__Compare__Group_1_3__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2097:2: rule__Compare__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_3__1__Impl_in_rule__Compare__Group_1_3__14233);
            rule__Compare__Group_1_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_3__1


    // $ANTLR start rule__Compare__Group_1_3__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2103:1: rule__Compare__Group_1_3__1__Impl : ( '>' ) ;
    public final void rule__Compare__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2107:1: ( ( '>' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2108:1: ( '>' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2108:1: ( '>' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2109:1: '>'
            {
             before(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1()); 
            match(input,24,FOLLOW_24_in_rule__Compare__Group_1_3__1__Impl4261); 
             after(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_3__1__Impl


    // $ANTLR start rule__Compare__Group_1_4__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2126:1: rule__Compare__Group_1_4__0 : rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1 ;
    public final void rule__Compare__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2130:1: ( rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2131:2: rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_4__0__Impl_in_rule__Compare__Group_1_4__04296);
            rule__Compare__Group_1_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Compare__Group_1_4__1_in_rule__Compare__Group_1_4__04299);
            rule__Compare__Group_1_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_4__0


    // $ANTLR start rule__Compare__Group_1_4__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2138:1: rule__Compare__Group_1_4__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2142:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2143:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2143:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2144:1: ()
            {
             before(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2145:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2147:1: 
            {
            }

             after(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_4__0__Impl


    // $ANTLR start rule__Compare__Group_1_4__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2157:1: rule__Compare__Group_1_4__1 : rule__Compare__Group_1_4__1__Impl ;
    public final void rule__Compare__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2161:1: ( rule__Compare__Group_1_4__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2162:2: rule__Compare__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_4__1__Impl_in_rule__Compare__Group_1_4__14357);
            rule__Compare__Group_1_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_4__1


    // $ANTLR start rule__Compare__Group_1_4__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2168:1: rule__Compare__Group_1_4__1__Impl : ( '=' ) ;
    public final void rule__Compare__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2172:1: ( ( '=' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2173:1: ( '=' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2173:1: ( '=' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2174:1: '='
            {
             before(grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1()); 
            match(input,25,FOLLOW_25_in_rule__Compare__Group_1_4__1__Impl4385); 
             after(grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_4__1__Impl


    // $ANTLR start rule__Compare__Group_1_5__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2191:1: rule__Compare__Group_1_5__0 : rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1 ;
    public final void rule__Compare__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2195:1: ( rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2196:2: rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_5__0__Impl_in_rule__Compare__Group_1_5__04420);
            rule__Compare__Group_1_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Compare__Group_1_5__1_in_rule__Compare__Group_1_5__04423);
            rule__Compare__Group_1_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_5__0


    // $ANTLR start rule__Compare__Group_1_5__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2203:1: rule__Compare__Group_1_5__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2207:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2208:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2208:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2209:1: ()
            {
             before(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2210:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2212:1: 
            {
            }

             after(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_5__0__Impl


    // $ANTLR start rule__Compare__Group_1_5__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2222:1: rule__Compare__Group_1_5__1 : rule__Compare__Group_1_5__1__Impl ;
    public final void rule__Compare__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2226:1: ( rule__Compare__Group_1_5__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2227:2: rule__Compare__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_5__1__Impl_in_rule__Compare__Group_1_5__14481);
            rule__Compare__Group_1_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_5__1


    // $ANTLR start rule__Compare__Group_1_5__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2233:1: rule__Compare__Group_1_5__1__Impl : ( '!=' ) ;
    public final void rule__Compare__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2237:1: ( ( '!=' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2238:1: ( '!=' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2238:1: ( '!=' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2239:1: '!='
            {
             before(grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1()); 
            match(input,26,FOLLOW_26_in_rule__Compare__Group_1_5__1__Impl4509); 
             after(grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_5__1__Impl


    // $ANTLR start rule__Compare__Group_1_6__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2256:1: rule__Compare__Group_1_6__0 : rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1 ;
    public final void rule__Compare__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2260:1: ( rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2261:2: rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_6__0__Impl_in_rule__Compare__Group_1_6__04544);
            rule__Compare__Group_1_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Compare__Group_1_6__1_in_rule__Compare__Group_1_6__04547);
            rule__Compare__Group_1_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_6__0


    // $ANTLR start rule__Compare__Group_1_6__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2268:1: rule__Compare__Group_1_6__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2272:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2273:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2273:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2274:1: ()
            {
             before(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2275:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2277:1: 
            {
            }

             after(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_6__0__Impl


    // $ANTLR start rule__Compare__Group_1_6__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2287:1: rule__Compare__Group_1_6__1 : rule__Compare__Group_1_6__1__Impl ;
    public final void rule__Compare__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2291:1: ( rule__Compare__Group_1_6__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2292:2: rule__Compare__Group_1_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_6__1__Impl_in_rule__Compare__Group_1_6__14605);
            rule__Compare__Group_1_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_6__1


    // $ANTLR start rule__Compare__Group_1_6__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2298:1: rule__Compare__Group_1_6__1__Impl : ( '~' ) ;
    public final void rule__Compare__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2302:1: ( ( '~' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2303:1: ( '~' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2303:1: ( '~' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2304:1: '~'
            {
             before(grammarAccess.getCompareAccess().getTildeKeyword_1_6_1()); 
            match(input,27,FOLLOW_27_in_rule__Compare__Group_1_6__1__Impl4633); 
             after(grammarAccess.getCompareAccess().getTildeKeyword_1_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__Group_1_6__1__Impl


    // $ANTLR start rule__Addition__Group__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2321:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2325:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2326:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04668);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04671);
            rule__Addition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__0


    // $ANTLR start rule__Addition__Group__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2333:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2337:1: ( ( ruleMultiplication ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2338:1: ( ruleMultiplication )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2338:1: ( ruleMultiplication )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2339:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4698);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__0__Impl


    // $ANTLR start rule__Addition__Group__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2350:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2354:1: ( rule__Addition__Group__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2355:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__14727);
            rule__Addition__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__1


    // $ANTLR start rule__Addition__Group__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2361:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2365:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2366:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2366:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2367:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2368:1: ( rule__Addition__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=28 && LA15_0<=29)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2368:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl4754);
            	    rule__Addition__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group__1__Impl


    // $ANTLR start rule__Addition__Group_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2382:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2386:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2387:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__04789);
            rule__Addition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__04792);
            rule__Addition__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__0


    // $ANTLR start rule__Addition__Group_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2394:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2398:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2399:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2399:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2400:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2401:1: ( rule__Addition__Alternatives_1_0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2401:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl4819);
            rule__Addition__Alternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__0__Impl


    // $ANTLR start rule__Addition__Group_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2411:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2415:1: ( rule__Addition__Group_1__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2416:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__14849);
            rule__Addition__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__1


    // $ANTLR start rule__Addition__Group_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2422:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2426:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2427:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2427:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2428:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2429:1: ( rule__Addition__RightAssignment_1_1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2429:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl4876);
            rule__Addition__RightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1__1__Impl


    // $ANTLR start rule__Addition__Group_1_0_0__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2443:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2447:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2448:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__04910);
            rule__Addition__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__04913);
            rule__Addition__Group_1_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_0__0


    // $ANTLR start rule__Addition__Group_1_0_0__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2455:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2459:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2460:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2460:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2461:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2462:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2464:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_0__0__Impl


    // $ANTLR start rule__Addition__Group_1_0_0__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2474:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2478:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2479:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__14971);
            rule__Addition__Group_1_0_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_0__1


    // $ANTLR start rule__Addition__Group_1_0_0__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2485:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2489:1: ( ( '+' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2490:1: ( '+' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2490:1: ( '+' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2491:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,28,FOLLOW_28_in_rule__Addition__Group_1_0_0__1__Impl4999); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_0__1__Impl


    // $ANTLR start rule__Addition__Group_1_0_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2508:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2512:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2513:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__05034);
            rule__Addition__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__05037);
            rule__Addition__Group_1_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_1__0


    // $ANTLR start rule__Addition__Group_1_0_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2520:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2524:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2525:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2525:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2526:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2527:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2529:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_1__0__Impl


    // $ANTLR start rule__Addition__Group_1_0_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2539:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2543:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2544:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15095);
            rule__Addition__Group_1_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_1__1


    // $ANTLR start rule__Addition__Group_1_0_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2550:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2554:1: ( ( '-' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2555:1: ( '-' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2555:1: ( '-' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2556:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,29,FOLLOW_29_in_rule__Addition__Group_1_0_1__1__Impl5123); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__Group_1_0_1__1__Impl


    // $ANTLR start rule__Multiplication__Group__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2573:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2577:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2578:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05158);
            rule__Multiplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05161);
            rule__Multiplication__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__0


    // $ANTLR start rule__Multiplication__Group__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2585:1: rule__Multiplication__Group__0__Impl : ( rulePower ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2589:1: ( ( rulePower ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2590:1: ( rulePower )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2590:1: ( rulePower )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2591:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl5188);
            rulePower();
            _fsp--;

             after(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__0__Impl


    // $ANTLR start rule__Multiplication__Group__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2602:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2606:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2607:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15217);
            rule__Multiplication__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__1


    // $ANTLR start rule__Multiplication__Group__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2613:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2617:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2618:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2618:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2619:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2620:1: ( rule__Multiplication__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=30 && LA16_0<=32)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2620:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5244);
            	    rule__Multiplication__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group__1__Impl


    // $ANTLR start rule__Multiplication__Group_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2634:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2638:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2639:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05279);
            rule__Multiplication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05282);
            rule__Multiplication__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__0


    // $ANTLR start rule__Multiplication__Group_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2646:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2650:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2651:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2651:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2652:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2653:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2653:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl5309);
            rule__Multiplication__Alternatives_1_0();
            _fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__0__Impl


    // $ANTLR start rule__Multiplication__Group_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2663:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2667:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2668:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15339);
            rule__Multiplication__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__1


    // $ANTLR start rule__Multiplication__Group_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2674:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2678:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2679:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2679:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2680:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2681:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2681:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5366);
            rule__Multiplication__RightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1__1__Impl


    // $ANTLR start rule__Multiplication__Group_1_0_0__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2695:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2699:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2700:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__05400);
            rule__Multiplication__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__05403);
            rule__Multiplication__Group_1_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_0__0


    // $ANTLR start rule__Multiplication__Group_1_0_0__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2707:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2711:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2712:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2712:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2713:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2714:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2716:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_0__0__Impl


    // $ANTLR start rule__Multiplication__Group_1_0_0__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2726:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2730:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2731:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__15461);
            rule__Multiplication__Group_1_0_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_0__1


    // $ANTLR start rule__Multiplication__Group_1_0_0__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2737:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2741:1: ( ( '*' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2742:1: ( '*' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2742:1: ( '*' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2743:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,30,FOLLOW_30_in_rule__Multiplication__Group_1_0_0__1__Impl5489); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_0__1__Impl


    // $ANTLR start rule__Multiplication__Group_1_0_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2760:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2764:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2765:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__05524);
            rule__Multiplication__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__05527);
            rule__Multiplication__Group_1_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_1__0


    // $ANTLR start rule__Multiplication__Group_1_0_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2772:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2776:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2777:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2777:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2778:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2779:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2781:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_1__0__Impl


    // $ANTLR start rule__Multiplication__Group_1_0_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2791:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2795:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2796:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__15585);
            rule__Multiplication__Group_1_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_1__1


    // $ANTLR start rule__Multiplication__Group_1_0_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2802:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2806:1: ( ( '/' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2807:1: ( '/' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2807:1: ( '/' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2808:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,31,FOLLOW_31_in_rule__Multiplication__Group_1_0_1__1__Impl5613); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_1__1__Impl


    // $ANTLR start rule__Multiplication__Group_1_0_2__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2825:1: rule__Multiplication__Group_1_0_2__0 : rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1 ;
    public final void rule__Multiplication__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2829:1: ( rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2830:2: rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__0__Impl_in_rule__Multiplication__Group_1_0_2__05648);
            rule__Multiplication__Group_1_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__1_in_rule__Multiplication__Group_1_0_2__05651);
            rule__Multiplication__Group_1_0_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_2__0


    // $ANTLR start rule__Multiplication__Group_1_0_2__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2837:1: rule__Multiplication__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2841:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2842:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2842:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2843:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2844:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2846:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_2__0__Impl


    // $ANTLR start rule__Multiplication__Group_1_0_2__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2856:1: rule__Multiplication__Group_1_0_2__1 : rule__Multiplication__Group_1_0_2__1__Impl ;
    public final void rule__Multiplication__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2860:1: ( rule__Multiplication__Group_1_0_2__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2861:2: rule__Multiplication__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__1__Impl_in_rule__Multiplication__Group_1_0_2__15709);
            rule__Multiplication__Group_1_0_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_2__1


    // $ANTLR start rule__Multiplication__Group_1_0_2__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2867:1: rule__Multiplication__Group_1_0_2__1__Impl : ( '%' ) ;
    public final void rule__Multiplication__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2871:1: ( ( '%' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2872:1: ( '%' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2872:1: ( '%' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2873:1: '%'
            {
             before(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1()); 
            match(input,32,FOLLOW_32_in_rule__Multiplication__Group_1_0_2__1__Impl5737); 
             after(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__Group_1_0_2__1__Impl


    // $ANTLR start rule__Power__Group__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2890:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2894:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2895:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__05772);
            rule__Power__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group__1_in_rule__Power__Group__05775);
            rule__Power__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group__0


    // $ANTLR start rule__Power__Group__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2902:1: rule__Power__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2906:1: ( ( rulePrimaryExpression ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2907:1: ( rulePrimaryExpression )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2907:1: ( rulePrimaryExpression )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2908:1: rulePrimaryExpression
            {
             before(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Power__Group__0__Impl5802);
            rulePrimaryExpression();
            _fsp--;

             after(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group__0__Impl


    // $ANTLR start rule__Power__Group__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2919:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2923:1: ( rule__Power__Group__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2924:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__15831);
            rule__Power__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group__1


    // $ANTLR start rule__Power__Group__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2930:1: rule__Power__Group__1__Impl : ( ( rule__Power__Group_1__0 )* ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2934:1: ( ( ( rule__Power__Group_1__0 )* ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2935:1: ( ( rule__Power__Group_1__0 )* )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2935:1: ( ( rule__Power__Group_1__0 )* )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2936:1: ( rule__Power__Group_1__0 )*
            {
             before(grammarAccess.getPowerAccess().getGroup_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2937:1: ( rule__Power__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2937:2: rule__Power__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl5858);
            	    rule__Power__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPowerAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group__1__Impl


    // $ANTLR start rule__Power__Group_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2951:1: rule__Power__Group_1__0 : rule__Power__Group_1__0__Impl rule__Power__Group_1__1 ;
    public final void rule__Power__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2955:1: ( rule__Power__Group_1__0__Impl rule__Power__Group_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2956:2: rule__Power__Group_1__0__Impl rule__Power__Group_1__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__05893);
            rule__Power__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__05896);
            rule__Power__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1__0


    // $ANTLR start rule__Power__Group_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2963:1: rule__Power__Group_1__0__Impl : ( ( rule__Power__Group_1_0__0 ) ) ;
    public final void rule__Power__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2967:1: ( ( ( rule__Power__Group_1_0__0 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2968:1: ( ( rule__Power__Group_1_0__0 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2968:1: ( ( rule__Power__Group_1_0__0 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2969:1: ( rule__Power__Group_1_0__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup_1_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2970:1: ( rule__Power__Group_1_0__0 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2970:2: rule__Power__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl5923);
            rule__Power__Group_1_0__0();
            _fsp--;


            }

             after(grammarAccess.getPowerAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1__0__Impl


    // $ANTLR start rule__Power__Group_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2980:1: rule__Power__Group_1__1 : rule__Power__Group_1__1__Impl ;
    public final void rule__Power__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2984:1: ( rule__Power__Group_1__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2985:2: rule__Power__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__15953);
            rule__Power__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1__1


    // $ANTLR start rule__Power__Group_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2991:1: rule__Power__Group_1__1__Impl : ( ( rule__Power__RightAssignment_1_1 ) ) ;
    public final void rule__Power__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2995:1: ( ( ( rule__Power__RightAssignment_1_1 ) ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2996:1: ( ( rule__Power__RightAssignment_1_1 ) )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2996:1: ( ( rule__Power__RightAssignment_1_1 ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2997:1: ( rule__Power__RightAssignment_1_1 )
            {
             before(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2998:1: ( rule__Power__RightAssignment_1_1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2998:2: rule__Power__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl5980);
            rule__Power__RightAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1__1__Impl


    // $ANTLR start rule__Power__Group_1_0__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3012:1: rule__Power__Group_1_0__0 : rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 ;
    public final void rule__Power__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3016:1: ( rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3017:2: rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__06014);
            rule__Power__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__06017);
            rule__Power__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1_0__0


    // $ANTLR start rule__Power__Group_1_0__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3024:1: rule__Power__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Power__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3028:1: ( ( () ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3029:1: ( () )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3029:1: ( () )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3030:1: ()
            {
             before(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3031:1: ()
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3033:1: 
            {
            }

             after(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1_0__0__Impl


    // $ANTLR start rule__Power__Group_1_0__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3043:1: rule__Power__Group_1_0__1 : rule__Power__Group_1_0__1__Impl ;
    public final void rule__Power__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3047:1: ( rule__Power__Group_1_0__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3048:2: rule__Power__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__16075);
            rule__Power__Group_1_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1_0__1


    // $ANTLR start rule__Power__Group_1_0__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3054:1: rule__Power__Group_1_0__1__Impl : ( '^' ) ;
    public final void rule__Power__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3058:1: ( ( '^' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3059:1: ( '^' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3059:1: ( '^' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3060:1: '^'
            {
             before(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
            match(input,33,FOLLOW_33_in_rule__Power__Group_1_0__1__Impl6103); 
             after(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__Group_1_0__1__Impl


    // $ANTLR start rule__PrimaryExpression__Group_0__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3077:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3081:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3082:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__06138);
            rule__PrimaryExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__06141);
            rule__PrimaryExpression__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimaryExpression__Group_0__0


    // $ANTLR start rule__PrimaryExpression__Group_0__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3089:1: rule__PrimaryExpression__Group_0__0__Impl : ( '[' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3093:1: ( ( '[' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3094:1: ( '[' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3094:1: ( '[' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3095:1: '['
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__PrimaryExpression__Group_0__0__Impl6169); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimaryExpression__Group_0__0__Impl


    // $ANTLR start rule__PrimaryExpression__Group_0__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3108:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3112:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3113:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__16200);
            rule__PrimaryExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__16203);
            rule__PrimaryExpression__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimaryExpression__Group_0__1


    // $ANTLR start rule__PrimaryExpression__Group_0__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3120:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleAExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3124:1: ( ( ruleAExpression ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3125:1: ( ruleAExpression )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3125:1: ( ruleAExpression )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3126:1: ruleAExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleAExpression_in_rule__PrimaryExpression__Group_0__1__Impl6230);
            ruleAExpression();
            _fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimaryExpression__Group_0__1__Impl


    // $ANTLR start rule__PrimaryExpression__Group_0__2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3137:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3141:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3142:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__26259);
            rule__PrimaryExpression__Group_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimaryExpression__Group_0__2


    // $ANTLR start rule__PrimaryExpression__Group_0__2__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3148:1: rule__PrimaryExpression__Group_0__2__Impl : ( ']' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3152:1: ( ( ']' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3153:1: ( ']' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3153:1: ( ']' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3154:1: ']'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,35,FOLLOW_35_in_rule__PrimaryExpression__Group_0__2__Impl6287); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimaryExpression__Group_0__2__Impl


    // $ANTLR start rule__NUMBER__Group__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3173:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3177:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3178:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__0__Impl_in_rule__NUMBER__Group__06324);
            rule__NUMBER__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NUMBER__Group__1_in_rule__NUMBER__Group__06327);
            rule__NUMBER__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NUMBER__Group__0


    // $ANTLR start rule__NUMBER__Group__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3185:1: rule__NUMBER__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3189:1: ( ( RULE_INT ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3190:1: ( RULE_INT )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3190:1: ( RULE_INT )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3191:1: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Group__0__Impl6354); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NUMBER__Group__0__Impl


    // $ANTLR start rule__NUMBER__Group__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3202:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3206:1: ( rule__NUMBER__Group__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3207:2: rule__NUMBER__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__1__Impl_in_rule__NUMBER__Group__16383);
            rule__NUMBER__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NUMBER__Group__1


    // $ANTLR start rule__NUMBER__Group__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3213:1: rule__NUMBER__Group__1__Impl : ( ( rule__NUMBER__Group_1__0 )? ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3217:1: ( ( ( rule__NUMBER__Group_1__0 )? ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3218:1: ( ( rule__NUMBER__Group_1__0 )? )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3218:1: ( ( rule__NUMBER__Group_1__0 )? )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3219:1: ( rule__NUMBER__Group_1__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_1()); 
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3220:1: ( rule__NUMBER__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3220:2: rule__NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NUMBER__Group_1__0_in_rule__NUMBER__Group__1__Impl6410);
                    rule__NUMBER__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNUMBERAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NUMBER__Group__1__Impl


    // $ANTLR start rule__NUMBER__Group_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3234:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3238:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3239:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_1__0__Impl_in_rule__NUMBER__Group_1__06445);
            rule__NUMBER__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NUMBER__Group_1__1_in_rule__NUMBER__Group_1__06448);
            rule__NUMBER__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NUMBER__Group_1__0


    // $ANTLR start rule__NUMBER__Group_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3246:1: rule__NUMBER__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3250:1: ( ( '.' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3251:1: ( '.' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3251:1: ( '.' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3252:1: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__NUMBER__Group_1__0__Impl6476); 
             after(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NUMBER__Group_1__0__Impl


    // $ANTLR start rule__NUMBER__Group_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3265:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3269:1: ( rule__NUMBER__Group_1__1__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3270:2: rule__NUMBER__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_1__1__Impl_in_rule__NUMBER__Group_1__16507);
            rule__NUMBER__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NUMBER__Group_1__1


    // $ANTLR start rule__NUMBER__Group_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3276:1: rule__NUMBER__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3280:1: ( ( RULE_INT ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3281:1: ( RULE_INT )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3281:1: ( RULE_INT )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3282:1: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Group_1__1__Impl6534); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NUMBER__Group_1__1__Impl


    // $ANTLR start rule__VARIABLE_VALUE__Group_1__0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3297:1: rule__VARIABLE_VALUE__Group_1__0 : rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1 ;
    public final void rule__VARIABLE_VALUE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3301:1: ( rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3302:2: rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__0__Impl_in_rule__VARIABLE_VALUE__Group_1__06567);
            rule__VARIABLE_VALUE__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__1_in_rule__VARIABLE_VALUE__Group_1__06570);
            rule__VARIABLE_VALUE__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VARIABLE_VALUE__Group_1__0


    // $ANTLR start rule__VARIABLE_VALUE__Group_1__0__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3309:1: rule__VARIABLE_VALUE__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__VARIABLE_VALUE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3313:1: ( ( RULE_ID ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3314:1: ( RULE_ID )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3314:1: ( RULE_ID )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3315:1: RULE_ID
            {
             before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__0__Impl6597); 
             after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VARIABLE_VALUE__Group_1__0__Impl


    // $ANTLR start rule__VARIABLE_VALUE__Group_1__1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3326:1: rule__VARIABLE_VALUE__Group_1__1 : rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2 ;
    public final void rule__VARIABLE_VALUE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3330:1: ( rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2 )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3331:2: rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__1__Impl_in_rule__VARIABLE_VALUE__Group_1__16626);
            rule__VARIABLE_VALUE__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__2_in_rule__VARIABLE_VALUE__Group_1__16629);
            rule__VARIABLE_VALUE__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VARIABLE_VALUE__Group_1__1


    // $ANTLR start rule__VARIABLE_VALUE__Group_1__1__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3338:1: rule__VARIABLE_VALUE__Group_1__1__Impl : ( '.' ) ;
    public final void rule__VARIABLE_VALUE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3342:1: ( ( '.' ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3343:1: ( '.' )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3343:1: ( '.' )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3344:1: '.'
            {
             before(grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__VARIABLE_VALUE__Group_1__1__Impl6657); 
             after(grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VARIABLE_VALUE__Group_1__1__Impl


    // $ANTLR start rule__VARIABLE_VALUE__Group_1__2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3357:1: rule__VARIABLE_VALUE__Group_1__2 : rule__VARIABLE_VALUE__Group_1__2__Impl ;
    public final void rule__VARIABLE_VALUE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3361:1: ( rule__VARIABLE_VALUE__Group_1__2__Impl )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3362:2: rule__VARIABLE_VALUE__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__2__Impl_in_rule__VARIABLE_VALUE__Group_1__26688);
            rule__VARIABLE_VALUE__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VARIABLE_VALUE__Group_1__2


    // $ANTLR start rule__VARIABLE_VALUE__Group_1__2__Impl
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3368:1: rule__VARIABLE_VALUE__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__VARIABLE_VALUE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3372:1: ( ( RULE_ID ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3373:1: ( RULE_ID )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3373:1: ( RULE_ID )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3374:1: RULE_ID
            {
             before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__2__Impl6715); 
             after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VARIABLE_VALUE__Group_1__2__Impl


    // $ANTLR start rule__Equivalent__RightAssignment_1_2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3392:1: rule__Equivalent__RightAssignment_1_2 : ( ruleImplication ) ;
    public final void rule__Equivalent__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3396:1: ( ( ruleImplication ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3397:1: ( ruleImplication )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3397:1: ( ruleImplication )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3398:1: ruleImplication
            {
             before(grammarAccess.getEquivalentAccess().getRightImplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleImplication_in_rule__Equivalent__RightAssignment_1_26755);
            ruleImplication();
            _fsp--;

             after(grammarAccess.getEquivalentAccess().getRightImplicationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Equivalent__RightAssignment_1_2


    // $ANTLR start rule__Implication__RightAssignment_1_2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3407:1: rule__Implication__RightAssignment_1_2 : ( ruleDisjunction ) ;
    public final void rule__Implication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3411:1: ( ( ruleDisjunction ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3412:1: ( ruleDisjunction )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3412:1: ( ruleDisjunction )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3413:1: ruleDisjunction
            {
             before(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleDisjunction_in_rule__Implication__RightAssignment_1_26786);
            ruleDisjunction();
            _fsp--;

             after(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Implication__RightAssignment_1_2


    // $ANTLR start rule__Disjunction__RightAssignment_1_1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3422:1: rule__Disjunction__RightAssignment_1_1 : ( ruleConjunction ) ;
    public final void rule__Disjunction__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3426:1: ( ( ruleConjunction ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3427:1: ( ruleConjunction )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3427:1: ( ruleConjunction )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3428:1: ruleConjunction
            {
             before(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConjunction_in_rule__Disjunction__RightAssignment_1_16817);
            ruleConjunction();
            _fsp--;

             after(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Disjunction__RightAssignment_1_1


    // $ANTLR start rule__Conjunction__RightAssignment_1_2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3437:1: rule__Conjunction__RightAssignment_1_2 : ( ruleNegation ) ;
    public final void rule__Conjunction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3441:1: ( ( ruleNegation ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3442:1: ( ruleNegation )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3442:1: ( ruleNegation )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3443:1: ruleNegation
            {
             before(grammarAccess.getConjunctionAccess().getRightNegationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleNegation_in_rule__Conjunction__RightAssignment_1_26848);
            ruleNegation();
            _fsp--;

             after(grammarAccess.getConjunctionAccess().getRightNegationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Conjunction__RightAssignment_1_2


    // $ANTLR start rule__Negated__NotAssignment_1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3452:1: rule__Negated__NotAssignment_1 : ( ruleCExpression ) ;
    public final void rule__Negated__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3456:1: ( ( ruleCExpression ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3457:1: ( ruleCExpression )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3457:1: ( ruleCExpression )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3458:1: ruleCExpression
            {
             before(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCExpression_in_rule__Negated__NotAssignment_16879);
            ruleCExpression();
            _fsp--;

             after(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Negated__NotAssignment_1


    // $ANTLR start rule__Compare__RightAssignment_2
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3467:1: rule__Compare__RightAssignment_2 : ( ruleAExpression ) ;
    public final void rule__Compare__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3471:1: ( ( ruleAExpression ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3472:1: ( ruleAExpression )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3472:1: ( ruleAExpression )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3473:1: ruleAExpression
            {
             before(grammarAccess.getCompareAccess().getRightAExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAExpression_in_rule__Compare__RightAssignment_26910);
            ruleAExpression();
            _fsp--;

             after(grammarAccess.getCompareAccess().getRightAExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Compare__RightAssignment_2


    // $ANTLR start rule__Addition__RightAssignment_1_1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3482:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3486:1: ( ( ruleMultiplication ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3487:1: ( ruleMultiplication )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3487:1: ( ruleMultiplication )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3488:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_16941);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Addition__RightAssignment_1_1


    // $ANTLR start rule__Multiplication__RightAssignment_1_1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3497:1: rule__Multiplication__RightAssignment_1_1 : ( rulePower ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3501:1: ( ( rulePower ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3502:1: ( rulePower )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3502:1: ( rulePower )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3503:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_16972);
            rulePower();
            _fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Multiplication__RightAssignment_1_1


    // $ANTLR start rule__Power__RightAssignment_1_1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3512:1: rule__Power__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Power__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3516:1: ( ( rulePrimaryExpression ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3517:1: ( rulePrimaryExpression )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3517:1: ( rulePrimaryExpression )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3518:1: rulePrimaryExpression
            {
             before(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Power__RightAssignment_1_17003);
            rulePrimaryExpression();
            _fsp--;

             after(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Power__RightAssignment_1_1


    // $ANTLR start rule__NumberValue__NumValueAssignment_0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3527:1: rule__NumberValue__NumValueAssignment_0 : ( ruleNUMBER ) ;
    public final void rule__NumberValue__NumValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3531:1: ( ( ruleNUMBER ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3532:1: ( ruleNUMBER )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3532:1: ( ruleNUMBER )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3533:1: ruleNUMBER
            {
             before(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNUMBER_in_rule__NumberValue__NumValueAssignment_07034);
            ruleNUMBER();
            _fsp--;

             after(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberValue__NumValueAssignment_0


    // $ANTLR start rule__NumberValue__VarNameAssignment_1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3542:1: rule__NumberValue__VarNameAssignment_1 : ( ruleVARIABLE_VALUE ) ;
    public final void rule__NumberValue__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3546:1: ( ( ruleVARIABLE_VALUE ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3547:1: ( ruleVARIABLE_VALUE )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3547:1: ( ruleVARIABLE_VALUE )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3548:1: ruleVARIABLE_VALUE
            {
             before(grammarAccess.getNumberValueAccess().getVarNameVARIABLE_VALUEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_rule__NumberValue__VarNameAssignment_17065);
            ruleVARIABLE_VALUE();
            _fsp--;

             after(grammarAccess.getNumberValueAccess().getVarNameVARIABLE_VALUEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberValue__VarNameAssignment_1


    // $ANTLR start rule__BooleanValue__ValueAssignment_0
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3557:1: rule__BooleanValue__ValueAssignment_0 : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3561:1: ( ( RULE_BOOLEAN ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3562:1: ( RULE_BOOLEAN )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3562:1: ( RULE_BOOLEAN )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3563:1: RULE_BOOLEAN
            {
             before(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment_07096); 
             after(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BooleanValue__ValueAssignment_0


    // $ANTLR start rule__BooleanValue__VarNameAssignment_1
    // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3572:1: rule__BooleanValue__VarNameAssignment_1 : ( ruleVARIABLE_VALUE ) ;
    public final void rule__BooleanValue__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3576:1: ( ( ruleVARIABLE_VALUE ) )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3577:1: ( ruleVARIABLE_VALUE )
            {
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3577:1: ( ruleVARIABLE_VALUE )
            // ../org.storydriven.modeling.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3578:1: ruleVARIABLE_VALUE
            {
             before(grammarAccess.getBooleanValueAccess().getVarNameVARIABLE_VALUEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_rule__BooleanValue__VarNameAssignment_17127);
            ruleVARIABLE_VALUE();
            _fsp--;

             after(grammarAccess.getBooleanValueAccess().getVarNameVARIABLE_VALUEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BooleanValue__VarNameAssignment_1


 

    public static final BitSet FOLLOW_ruleLExpression_in_entryRuleLExpression61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpression68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_ruleLExpression94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_entryRuleEquivalent120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquivalent127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__0_in_ruleEquivalent153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0_in_ruleImplication213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Alternatives_in_ruleNegation393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegated_in_entryRuleNegated420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegated427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__Group__0_in_ruleNegated453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_entryRuleCExpression480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCExpression487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Alternatives_in_ruleCExpression513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__0_in_ruleCompare573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_entryRuleAExpression600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAExpression607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAExpression633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0_in_rulePower812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberValue__Alternatives_in_ruleNumberValue932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__0_in_ruleNUMBER992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_entryRuleVARIABLE_VALUE1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_VALUE1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Alternatives_in_ruleVARIABLE_VALUE1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__0_in_rule__Disjunction__Alternatives_1_01148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__0_in_rule__Disjunction__Alternatives_1_01166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__0_in_rule__Negation__Alternatives1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_rule__Negation__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__0_in_rule__CExpression__Alternatives1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_rule__CExpression__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__CExpression__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__0_in_rule__Compare__Alternatives_11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__0_in_rule__Compare__Alternatives_11334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__0_in_rule__Compare__Alternatives_11352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__0_in_rule__Compare__Alternatives_11370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__0_in_rule__Compare__Alternatives_11388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__0_in_rule__Compare__Alternatives_11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__0_in_rule__Compare__Alternatives_11424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__0_in_rule__Multiplication__Alternatives_1_01544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_rule__PrimaryExpression__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberValue__NumValueAssignment_0_in_rule__NumberValue__Alternatives1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberValue__VarNameAssignment_1_in_rule__NumberValue__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_0_in_rule__BooleanValue__Alternatives1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__VarNameAssignment_1_in_rule__BooleanValue__Alternatives1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__0_in_rule__VARIABLE_VALUE__Alternatives1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__0__Impl_in_rule__Equivalent__Group__01777 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__1_in_rule__Equivalent__Group__01780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_rule__Equivalent__Group__0__Impl1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__1__Impl_in_rule__Equivalent__Group__11836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__0_in_rule__Equivalent__Group__1__Impl1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__0__Impl_in_rule__Equivalent__Group_1__01898 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__1_in_rule__Equivalent__Group_1__01901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__1__Impl_in_rule__Equivalent__Group_1__11959 = new BitSet(new long[]{0x00000004000C0070L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__2_in_rule__Equivalent__Group_1__11962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Equivalent__Group_1__1__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__2__Impl_in_rule__Equivalent__Group_1__22021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__RightAssignment_1_2_in_rule__Equivalent__Group_1__2__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__02084 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__02087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_rule__Implication__Group__0__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__12143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__0_in_rule__Implication__Group__1__Impl2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__0__Impl_in_rule__Implication__Group_1__02205 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__1_in_rule__Implication__Group_1__02208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__1__Impl_in_rule__Implication__Group_1__12266 = new BitSet(new long[]{0x00000004000C0070L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__2_in_rule__Implication__Group_1__12269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Implication__Group_1__1__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__2__Impl_in_rule__Implication__Group_1__22328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__RightAssignment_1_2_in_rule__Implication__Group_1__2__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__02391 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__02394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Disjunction__Group__0__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__0_in_rule__Disjunction__Group__1__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__0__Impl_in_rule__Disjunction__Group_1__02512 = new BitSet(new long[]{0x00000004000C0070L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__1_in_rule__Disjunction__Group_1__02515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Alternatives_1_0_in_rule__Disjunction__Group_1__0__Impl2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__1__Impl_in_rule__Disjunction__Group_1__12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__RightAssignment_1_1_in_rule__Disjunction__Group_1__1__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__0__Impl_in_rule__Disjunction__Group_1_0_0__02633 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__1_in_rule__Disjunction__Group_1_0_0__02636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__1__Impl_in_rule__Disjunction__Group_1_0_0__12694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Disjunction__Group_1_0_0__1__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__0__Impl_in_rule__Disjunction__Group_1_0_1__02757 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__1_in_rule__Disjunction__Group_1_0_1__02760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__1__Impl_in_rule__Disjunction__Group_1_0_1__12818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Disjunction__Group_1_0_1__1__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__02881 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__02884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__Conjunction__Group__0__Impl2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__12940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__03002 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__03005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__13063 = new BitSet(new long[]{0x00000004000C0070L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__13066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Conjunction__Group_1__1__Impl3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__23125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__0__Impl_in_rule__Negation__Group_0__03188 = new BitSet(new long[]{0x0000000400080070L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__1_in_rule__Negation__Group_0__03191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Negation__Group_0__0__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__1__Impl_in_rule__Negation__Group_0__13250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegated_in_rule__Negation__Group_0__1__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__Group__0__Impl_in_rule__Negated__Group__03310 = new BitSet(new long[]{0x0000000400080070L});
    public static final BitSet FOLLOW_rule__Negated__Group__1_in_rule__Negated__Group__03313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__Group__1__Impl_in_rule__Negated__Group__13371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__NotAssignment_1_in_rule__Negated__Group__1__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__0__Impl_in_rule__CExpression__Group_0__03432 = new BitSet(new long[]{0x00000004000C0070L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__1_in_rule__CExpression__Group_0__03435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CExpression__Group_0__0__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__1__Impl_in_rule__CExpression__Group_0__13494 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__2_in_rule__CExpression__Group_0__13497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpression_in_rule__CExpression__Group_0__1__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__2__Impl_in_rule__CExpression__Group_0__23553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CExpression__Group_0__2__Impl3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__0__Impl_in_rule__Compare__Group__03618 = new BitSet(new long[]{0x000000000FE00000L});
    public static final BitSet FOLLOW_rule__Compare__Group__1_in_rule__Compare__Group__03621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_rule__Compare__Group__0__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__1__Impl_in_rule__Compare__Group__13677 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__Compare__Group__2_in_rule__Compare__Group__13680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Alternatives_1_in_rule__Compare__Group__1__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__2__Impl_in_rule__Compare__Group__23737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__RightAssignment_2_in_rule__Compare__Group__2__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__0__Impl_in_rule__Compare__Group_1_0__03800 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__1_in_rule__Compare__Group_1_0__03803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__1__Impl_in_rule__Compare__Group_1_0__13861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Compare__Group_1_0__1__Impl3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__0__Impl_in_rule__Compare__Group_1_1__03924 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__1_in_rule__Compare__Group_1_1__03927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__1__Impl_in_rule__Compare__Group_1_1__13985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Compare__Group_1_1__1__Impl4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__0__Impl_in_rule__Compare__Group_1_2__04048 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__1_in_rule__Compare__Group_1_2__04051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__1__Impl_in_rule__Compare__Group_1_2__14109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Compare__Group_1_2__1__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__0__Impl_in_rule__Compare__Group_1_3__04172 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__1_in_rule__Compare__Group_1_3__04175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__1__Impl_in_rule__Compare__Group_1_3__14233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Compare__Group_1_3__1__Impl4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__0__Impl_in_rule__Compare__Group_1_4__04296 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__1_in_rule__Compare__Group_1_4__04299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__1__Impl_in_rule__Compare__Group_1_4__14357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Compare__Group_1_4__1__Impl4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__0__Impl_in_rule__Compare__Group_1_5__04420 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__1_in_rule__Compare__Group_1_5__04423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__1__Impl_in_rule__Compare__Group_1_5__14481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Compare__Group_1_5__1__Impl4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__0__Impl_in_rule__Compare__Group_1_6__04544 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__1_in_rule__Compare__Group_1_6__04547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__1__Impl_in_rule__Compare__Group_1_6__14605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Compare__Group_1_6__1__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04668 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__14727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl4754 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__04789 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__04792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__14849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__04910 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__04913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__14971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Addition__Group_1_0_0__1__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__05034 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__05037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Addition__Group_1_0_1__1__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05158 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5244 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05279 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__05400 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__05403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__15461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Multiplication__Group_1_0_0__1__Impl5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__05524 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__05527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__15585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Multiplication__Group_1_0_1__1__Impl5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__0__Impl_in_rule__Multiplication__Group_1_0_2__05648 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__1_in_rule__Multiplication__Group_1_0_2__05651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__1__Impl_in_rule__Multiplication__Group_1_0_2__15709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Multiplication__Group_1_0_2__1__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__05772 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1_in_rule__Power__Group__05775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Power__Group__0__Impl5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__15831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl5858 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__05893 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__05896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__15953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__06014 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__06017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__16075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Power__Group_1_0__1__Impl6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__06138 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__06141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PrimaryExpression__Group_0__0__Impl6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__16200 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__16203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_rule__PrimaryExpression__Group_0__1__Impl6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__26259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PrimaryExpression__Group_0__2__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__0__Impl_in_rule__NUMBER__Group__06324 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__1_in_rule__NUMBER__Group__06327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Group__0__Impl6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__1__Impl_in_rule__NUMBER__Group__16383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__0_in_rule__NUMBER__Group__1__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__0__Impl_in_rule__NUMBER__Group_1__06445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__1_in_rule__NUMBER__Group_1__06448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__NUMBER__Group_1__0__Impl6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__1__Impl_in_rule__NUMBER__Group_1__16507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Group_1__1__Impl6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__0__Impl_in_rule__VARIABLE_VALUE__Group_1__06567 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__1_in_rule__VARIABLE_VALUE__Group_1__06570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__0__Impl6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__1__Impl_in_rule__VARIABLE_VALUE__Group_1__16626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__2_in_rule__VARIABLE_VALUE__Group_1__16629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VARIABLE_VALUE__Group_1__1__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__2__Impl_in_rule__VARIABLE_VALUE__Group_1__26688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__2__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_rule__Equivalent__RightAssignment_1_26755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_rule__Implication__RightAssignment_1_26786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Disjunction__RightAssignment_1_16817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__Conjunction__RightAssignment_1_26848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_rule__Negated__NotAssignment_16879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_rule__Compare__RightAssignment_26910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_16941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_16972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Power__RightAssignment_1_17003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__NumberValue__NumValueAssignment_07034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_rule__NumberValue__VarNameAssignment_17065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment_07096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_rule__BooleanValue__VarNameAssignment_17127 = new BitSet(new long[]{0x0000000000000002L});

}