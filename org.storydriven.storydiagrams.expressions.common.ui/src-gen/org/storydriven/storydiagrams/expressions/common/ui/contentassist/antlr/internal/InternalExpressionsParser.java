package org.storydriven.storydiagrams.expressions.common.ui.contentassist.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.storydriven.storydiagrams.expressions.common.services.ExpressionsGrammarAccess;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'equiv'", "'imply'", "'or'", "'xor'", "'and'", "'not'", "'('", "')'", "'<='", "'<'", "'>='", "'>'", "'='", "'!='", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'.'"
    };
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_ID=4;
    public static final int T__12=12;
    public static final int T__28=28;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__13=13;
    public static final int RULE_STRING=7;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int T__33=33;
    public static final int T__14=14;
    public static final int T__22=22;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int RULE_WS=10;
    public static final int T__17=17;
    public static final int T__31=31;
    public static final int RULE_INT=5;
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int RULE_BOOLEAN=6;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__24=24;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__18=18;
    public static final int T__15=15;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g"; }


     
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




    // $ANTLR start "entryRuleLExpression"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:61:1: entryRuleLExpression : ruleLExpression EOF ;
    public final void entryRuleLExpression() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: ( ruleLExpression EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:63:1: ruleLExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLExpression_in_entryRuleLExpression67);
            ruleLExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpression74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLExpression"


    // $ANTLR start "ruleLExpression"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:70:1: ruleLExpression : ( ruleEquivalent ) ;
    public final void ruleLExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:74:2: ( ( ruleEquivalent ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( ruleEquivalent )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( ruleEquivalent )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ruleEquivalent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleEquivalent_in_ruleLExpression100);
            ruleEquivalent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 
            }

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
    // $ANTLR end "ruleLExpression"


    // $ANTLR start "entryRuleEquivalent"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:89:1: entryRuleEquivalent : ruleEquivalent EOF ;
    public final void entryRuleEquivalent() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: ( ruleEquivalent EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:91:1: ruleEquivalent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentRule()); 
            }
            pushFollow(FOLLOW_ruleEquivalent_in_entryRuleEquivalent126);
            ruleEquivalent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquivalent133); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEquivalent"


    // $ANTLR start "ruleEquivalent"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:98:1: ruleEquivalent : ( ( rule__Equivalent__Group__0 ) ) ;
    public final void ruleEquivalent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:102:2: ( ( ( rule__Equivalent__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( ( rule__Equivalent__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( ( rule__Equivalent__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( rule__Equivalent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getGroup()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:105:1: ( rule__Equivalent__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:105:2: rule__Equivalent__Group__0
            {
            pushFollow(FOLLOW_rule__Equivalent__Group__0_in_ruleEquivalent159);
            rule__Equivalent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEquivalent"


    // $ANTLR start "entryRuleImplication"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:117:1: entryRuleImplication : ruleImplication EOF ;
    public final void entryRuleImplication() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:118:1: ( ruleImplication EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:119:1: ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication186);
            ruleImplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication193); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:126:1: ruleImplication : ( ( rule__Implication__Group__0 ) ) ;
    public final void ruleImplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:130:2: ( ( ( rule__Implication__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( ( rule__Implication__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( ( rule__Implication__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( rule__Implication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getGroup()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:133:1: ( rule__Implication__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:133:2: rule__Implication__Group__0
            {
            pushFollow(FOLLOW_rule__Implication__Group__0_in_ruleImplication219);
            rule__Implication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:145:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:146:1: ( ruleDisjunction EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:147:1: ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction246);
            ruleDisjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction253); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:154:1: ruleDisjunction : ( ( rule__Disjunction__Group__0 ) ) ;
    public final void ruleDisjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:158:2: ( ( ( rule__Disjunction__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( ( rule__Disjunction__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( ( rule__Disjunction__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( rule__Disjunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getGroup()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:161:1: ( rule__Disjunction__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:161:2: rule__Disjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction279);
            rule__Disjunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:173:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: ( ruleConjunction EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:175:1: ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction306);
            ruleConjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction313); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:182:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:186:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( ( rule__Conjunction__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( rule__Conjunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getGroup()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:189:1: ( rule__Conjunction__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:189:2: rule__Conjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction339);
            rule__Conjunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:201:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:202:1: ( ruleNegation EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:203:1: ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation366);
            ruleNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation373); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:210:1: ruleNegation : ( ( rule__Negation__Alternatives ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:214:2: ( ( ( rule__Negation__Alternatives ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( ( rule__Negation__Alternatives ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( ( rule__Negation__Alternatives ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( rule__Negation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getAlternatives()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:217:1: ( rule__Negation__Alternatives )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:217:2: rule__Negation__Alternatives
            {
            pushFollow(FOLLOW_rule__Negation__Alternatives_in_ruleNegation399);
            rule__Negation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleNegated"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:229:1: entryRuleNegated : ruleNegated EOF ;
    public final void entryRuleNegated() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:230:1: ( ruleNegated EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:231:1: ruleNegated EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedRule()); 
            }
            pushFollow(FOLLOW_ruleNegated_in_entryRuleNegated426);
            ruleNegated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegated433); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNegated"


    // $ANTLR start "ruleNegated"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:238:1: ruleNegated : ( ( rule__Negated__Group__0 ) ) ;
    public final void ruleNegated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:242:2: ( ( ( rule__Negated__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( ( rule__Negated__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( ( rule__Negated__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( rule__Negated__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getGroup()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:245:1: ( rule__Negated__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:245:2: rule__Negated__Group__0
            {
            pushFollow(FOLLOW_rule__Negated__Group__0_in_ruleNegated459);
            rule__Negated__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleNegated"


    // $ANTLR start "entryRuleCExpression"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:257:1: entryRuleCExpression : ruleCExpression EOF ;
    public final void entryRuleCExpression() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:258:1: ( ruleCExpression EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:259:1: ruleCExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCExpression_in_entryRuleCExpression486);
            ruleCExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCExpression493); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCExpression"


    // $ANTLR start "ruleCExpression"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:266:1: ruleCExpression : ( ( rule__CExpression__Alternatives ) ) ;
    public final void ruleCExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:270:2: ( ( ( rule__CExpression__Alternatives ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:271:1: ( ( rule__CExpression__Alternatives ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:271:1: ( ( rule__CExpression__Alternatives ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( rule__CExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getAlternatives()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:273:1: ( rule__CExpression__Alternatives )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:273:2: rule__CExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__CExpression__Alternatives_in_ruleCExpression519);
            rule__CExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleCExpression"


    // $ANTLR start "entryRuleCompare"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:285:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:286:1: ( ruleCompare EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:287:1: ruleCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareRule()); 
            }
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare546);
            ruleCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare553); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:294:1: ruleCompare : ( ( rule__Compare__Group__0 ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:298:2: ( ( ( rule__Compare__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:299:1: ( ( rule__Compare__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:299:1: ( ( rule__Compare__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( rule__Compare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGroup()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:301:1: ( rule__Compare__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:301:2: rule__Compare__Group__0
            {
            pushFollow(FOLLOW_rule__Compare__Group__0_in_ruleCompare579);
            rule__Compare__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleSomeValue"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:313:1: entryRuleSomeValue : ruleSomeValue EOF ;
    public final void entryRuleSomeValue() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:314:1: ( ruleSomeValue EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:315:1: ruleSomeValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSomeValueRule()); 
            }
            pushFollow(FOLLOW_ruleSomeValue_in_entryRuleSomeValue606);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSomeValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeValue613); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSomeValue"


    // $ANTLR start "ruleSomeValue"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:322:1: ruleSomeValue : ( ( rule__SomeValue__Alternatives ) ) ;
    public final void ruleSomeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:326:2: ( ( ( rule__SomeValue__Alternatives ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: ( ( rule__SomeValue__Alternatives ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: ( ( rule__SomeValue__Alternatives ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( rule__SomeValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSomeValueAccess().getAlternatives()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:329:1: ( rule__SomeValue__Alternatives )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:329:2: rule__SomeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__SomeValue__Alternatives_in_ruleSomeValue639);
            rule__SomeValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSomeValueAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleSomeValue"


    // $ANTLR start "entryRuleAExpression"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:341:1: entryRuleAExpression : ruleAExpression EOF ;
    public final void entryRuleAExpression() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:342:1: ( ruleAExpression EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:343:1: ruleAExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAExpression_in_entryRuleAExpression666);
            ruleAExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAExpression673); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAExpression"


    // $ANTLR start "ruleAExpression"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:350:1: ruleAExpression : ( ruleAddition ) ;
    public final void ruleAExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:354:2: ( ( ruleAddition ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:355:1: ( ruleAddition )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:355:1: ( ruleAddition )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleAExpression699);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 
            }

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
    // $ANTLR end "ruleAExpression"


    // $ANTLR start "entryRuleAddition"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:369:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:370:1: ( ruleAddition EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:371:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition725);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition732); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:378:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:382:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: ( ( rule__Addition__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:384:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:385:1: ( rule__Addition__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:385:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition758);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:397:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:398:1: ( ruleMultiplication EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:399:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication785);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication792); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:406:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:410:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:413:1: ( rule__Multiplication__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:413:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication818);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePower"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:425:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:426:1: ( rulePower EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:427:1: rulePower EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerRule()); 
            }
            pushFollow(FOLLOW_rulePower_in_entryRulePower845);
            rulePower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePower852); if (state.failed) return ;

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
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:434:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:438:2: ( ( ( rule__Power__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( ( rule__Power__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( ( rule__Power__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( rule__Power__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getGroup()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:441:1: ( rule__Power__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:441:2: rule__Power__Group__0
            {
            pushFollow(FOLLOW_rule__Power__Group__0_in_rulePower878);
            rule__Power__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:453:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:454:1: ( rulePrimaryExpression EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:455:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression905);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression912); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:462:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:466:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:467:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:467:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:468:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:469:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:469:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression938);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleNumberValue"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:481:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:482:1: ( ruleNumberValue EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:483:1: ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue965);
            ruleNumberValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue972); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:490:1: ruleNumberValue : ( ( rule__NumberValue__NumValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:494:2: ( ( ( rule__NumberValue__NumValueAssignment ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:495:1: ( ( rule__NumberValue__NumValueAssignment ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:495:1: ( ( rule__NumberValue__NumValueAssignment ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:496:1: ( rule__NumberValue__NumValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getNumValueAssignment()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:497:1: ( rule__NumberValue__NumValueAssignment )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:497:2: rule__NumberValue__NumValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberValue__NumValueAssignment_in_ruleNumberValue998);
            rule__NumberValue__NumValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getNumValueAssignment()); 
            }

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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleNUMBER"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:509:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:510:1: ( ruleNUMBER EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:511:1: ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER1025);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER1032); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:518:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:522:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( ( rule__NUMBER__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( ( rule__NUMBER__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( rule__NUMBER__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getGroup()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:525:1: ( rule__NUMBER__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:525:2: rule__NUMBER__Group__0
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__0_in_ruleNUMBER1058);
            rule__NUMBER__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:537:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:538:1: ( ruleBooleanValue EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:539:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1085);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1092); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:546:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:550:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:551:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:551:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:552:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:553:1: ( rule__BooleanValue__ValueAssignment )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:553:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1118);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleStringValue"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:565:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:566:1: ( ruleStringValue EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:567:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1145);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1152); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:574:1: ruleStringValue : ( ( rule__StringValue__StrValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:578:2: ( ( ( rule__StringValue__StrValueAssignment ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:579:1: ( ( rule__StringValue__StrValueAssignment ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:579:1: ( ( rule__StringValue__StrValueAssignment ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:580:1: ( rule__StringValue__StrValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getStrValueAssignment()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:581:1: ( rule__StringValue__StrValueAssignment )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:581:2: rule__StringValue__StrValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__StrValueAssignment_in_ruleStringValue1178);
            rule__StringValue__StrValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getStrValueAssignment()); 
            }

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleVariable"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:593:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:594:1: ( ruleVariable EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:595:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1205);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1212); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:602:1: ruleVariable : ( ( rule__Variable__VarNameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:606:2: ( ( ( rule__Variable__VarNameAssignment ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:607:1: ( ( rule__Variable__VarNameAssignment ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:607:1: ( ( rule__Variable__VarNameAssignment ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:608:1: ( rule__Variable__VarNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarNameAssignment()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:609:1: ( rule__Variable__VarNameAssignment )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:609:2: rule__Variable__VarNameAssignment
            {
            pushFollow(FOLLOW_rule__Variable__VarNameAssignment_in_ruleVariable1238);
            rule__Variable__VarNameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVarNameAssignment()); 
            }

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVARIABLE_VALUE"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:621:1: entryRuleVARIABLE_VALUE : ruleVARIABLE_VALUE EOF ;
    public final void entryRuleVARIABLE_VALUE() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:622:1: ( ruleVARIABLE_VALUE EOF )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:623:1: ruleVARIABLE_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUERule()); 
            }
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_entryRuleVARIABLE_VALUE1265);
            ruleVARIABLE_VALUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUERule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_VALUE1272); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVARIABLE_VALUE"


    // $ANTLR start "ruleVARIABLE_VALUE"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:630:1: ruleVARIABLE_VALUE : ( ( rule__VARIABLE_VALUE__Alternatives ) ) ;
    public final void ruleVARIABLE_VALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:634:2: ( ( ( rule__VARIABLE_VALUE__Alternatives ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:635:1: ( ( rule__VARIABLE_VALUE__Alternatives ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:635:1: ( ( rule__VARIABLE_VALUE__Alternatives ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:636:1: ( rule__VARIABLE_VALUE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getAlternatives()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:637:1: ( rule__VARIABLE_VALUE__Alternatives )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:637:2: rule__VARIABLE_VALUE__Alternatives
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Alternatives_in_ruleVARIABLE_VALUE1298);
            rule__VARIABLE_VALUE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleVARIABLE_VALUE"


    // $ANTLR start "rule__Disjunction__Alternatives_1_0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:649:1: rule__Disjunction__Alternatives_1_0 : ( ( ( rule__Disjunction__Group_1_0_0__0 ) ) | ( ( rule__Disjunction__Group_1_0_1__0 ) ) );
    public final void rule__Disjunction__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:653:1: ( ( ( rule__Disjunction__Group_1_0_0__0 ) ) | ( ( rule__Disjunction__Group_1_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:654:1: ( ( rule__Disjunction__Group_1_0_0__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:654:1: ( ( rule__Disjunction__Group_1_0_0__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:655:1: ( rule__Disjunction__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDisjunctionAccess().getGroup_1_0_0()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:656:1: ( rule__Disjunction__Group_1_0_0__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:656:2: rule__Disjunction__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__0_in_rule__Disjunction__Alternatives_1_01334);
                    rule__Disjunction__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDisjunctionAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:660:6: ( ( rule__Disjunction__Group_1_0_1__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:660:6: ( ( rule__Disjunction__Group_1_0_1__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:661:1: ( rule__Disjunction__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDisjunctionAccess().getGroup_1_0_1()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:662:1: ( rule__Disjunction__Group_1_0_1__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:662:2: rule__Disjunction__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__0_in_rule__Disjunction__Alternatives_1_01352);
                    rule__Disjunction__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDisjunctionAccess().getGroup_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Disjunction__Alternatives_1_0"


    // $ANTLR start "rule__Negation__Alternatives"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:671:1: rule__Negation__Alternatives : ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleCExpression ) );
    public final void rule__Negation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:675:1: ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleCExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)||LA2_0==18) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:676:1: ( ( rule__Negation__Group_0__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:676:1: ( ( rule__Negation__Group_0__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:677:1: ( rule__Negation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegationAccess().getGroup_0()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:678:1: ( rule__Negation__Group_0__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:678:2: rule__Negation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Negation__Group_0__0_in_rule__Negation__Alternatives1385);
                    rule__Negation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:682:6: ( ruleCExpression )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:682:6: ( ruleCExpression )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:683:1: ruleCExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCExpression_in_rule__Negation__Alternatives1403);
                    ruleCExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Negation__Alternatives"


    // $ANTLR start "rule__CExpression__Alternatives"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:693:1: rule__CExpression__Alternatives : ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) | ( ruleVariable ) );
    public final void rule__CExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:697:1: ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) | ( ruleVariable ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred3_InternalExpressions()) ) {
                    alt3=1;
                }
                else if ( (synpred4_InternalExpressions()) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA3_3 = input.LA(2);

                if ( (synpred4_InternalExpressions()) ) {
                    alt3=2;
                }
                else if ( (synpred5_InternalExpressions()) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA3_5 = input.LA(2);

                if ( (synpred4_InternalExpressions()) ) {
                    alt3=2;
                }
                else if ( (true) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( ( rule__CExpression__Group_0__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( ( rule__CExpression__Group_0__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:699:1: ( rule__CExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getGroup_0()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:700:1: ( rule__CExpression__Group_0__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:700:2: rule__CExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CExpression__Group_0__0_in_rule__CExpression__Alternatives1435);
                    rule__CExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:704:6: ( ruleCompare )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:704:6: ( ruleCompare )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:705:1: ruleCompare
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCompare_in_rule__CExpression__Alternatives1453);
                    ruleCompare();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:710:6: ( ruleBooleanValue )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:710:6: ( ruleBooleanValue )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:711:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__CExpression__Alternatives1470);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:716:6: ( ruleVariable )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:716:6: ( ruleVariable )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:717:1: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getVariableParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleVariable_in_rule__CExpression__Alternatives1487);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getVariableParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__CExpression__Alternatives"


    // $ANTLR start "rule__Compare__Alternatives_1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:727:1: rule__Compare__Alternatives_1 : ( ( ( rule__Compare__Group_1_0__0 ) ) | ( ( rule__Compare__Group_1_1__0 ) ) | ( ( rule__Compare__Group_1_2__0 ) ) | ( ( rule__Compare__Group_1_3__0 ) ) | ( ( rule__Compare__Group_1_4__0 ) ) | ( ( rule__Compare__Group_1_5__0 ) ) | ( ( rule__Compare__Group_1_6__0 ) ) );
    public final void rule__Compare__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:731:1: ( ( ( rule__Compare__Group_1_0__0 ) ) | ( ( rule__Compare__Group_1_1__0 ) ) | ( ( rule__Compare__Group_1_2__0 ) ) | ( ( rule__Compare__Group_1_3__0 ) ) | ( ( rule__Compare__Group_1_4__0 ) ) | ( ( rule__Compare__Group_1_5__0 ) ) | ( ( rule__Compare__Group_1_6__0 ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            case 26:
                {
                alt4=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:732:1: ( ( rule__Compare__Group_1_0__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:732:1: ( ( rule__Compare__Group_1_0__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:733:1: ( rule__Compare__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_0()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:734:1: ( rule__Compare__Group_1_0__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:734:2: rule__Compare__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_0__0_in_rule__Compare__Alternatives_11519);
                    rule__Compare__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:738:6: ( ( rule__Compare__Group_1_1__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:738:6: ( ( rule__Compare__Group_1_1__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:739:1: ( rule__Compare__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_1()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:740:1: ( rule__Compare__Group_1_1__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:740:2: rule__Compare__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_1__0_in_rule__Compare__Alternatives_11537);
                    rule__Compare__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:744:6: ( ( rule__Compare__Group_1_2__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:744:6: ( ( rule__Compare__Group_1_2__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:745:1: ( rule__Compare__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_2()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:746:1: ( rule__Compare__Group_1_2__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:746:2: rule__Compare__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_2__0_in_rule__Compare__Alternatives_11555);
                    rule__Compare__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:750:6: ( ( rule__Compare__Group_1_3__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:750:6: ( ( rule__Compare__Group_1_3__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:751:1: ( rule__Compare__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_3()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:752:1: ( rule__Compare__Group_1_3__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:752:2: rule__Compare__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_3__0_in_rule__Compare__Alternatives_11573);
                    rule__Compare__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:756:6: ( ( rule__Compare__Group_1_4__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:756:6: ( ( rule__Compare__Group_1_4__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:757:1: ( rule__Compare__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_4()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:758:1: ( rule__Compare__Group_1_4__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:758:2: rule__Compare__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_4__0_in_rule__Compare__Alternatives_11591);
                    rule__Compare__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:762:6: ( ( rule__Compare__Group_1_5__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:762:6: ( ( rule__Compare__Group_1_5__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:763:1: ( rule__Compare__Group_1_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_5()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:764:1: ( rule__Compare__Group_1_5__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:764:2: rule__Compare__Group_1_5__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_5__0_in_rule__Compare__Alternatives_11609);
                    rule__Compare__Group_1_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:768:6: ( ( rule__Compare__Group_1_6__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:768:6: ( ( rule__Compare__Group_1_6__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:769:1: ( rule__Compare__Group_1_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_6()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:770:1: ( rule__Compare__Group_1_6__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:770:2: rule__Compare__Group_1_6__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_6__0_in_rule__Compare__Alternatives_11627);
                    rule__Compare__Group_1_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_6()); 
                    }

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
    // $ANTLR end "rule__Compare__Alternatives_1"


    // $ANTLR start "rule__SomeValue__Alternatives"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:779:1: rule__SomeValue__Alternatives : ( ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleAExpression ) );
    public final void rule__SomeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:783:1: ( ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleAExpression ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:784:1: ( ruleStringValue )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:784:1: ( ruleStringValue )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:785:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__SomeValue__Alternatives1660);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getStringValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:790:6: ( ruleBooleanValue )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:790:6: ( ruleBooleanValue )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:791:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getBooleanValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__SomeValue__Alternatives1677);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getBooleanValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:796:6: ( ruleAExpression )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:796:6: ( ruleAExpression )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:797:1: ruleAExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getAExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAExpression_in_rule__SomeValue__Alternatives1694);
                    ruleAExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getAExpressionParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__SomeValue__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:807:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:811:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:812:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:812:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:813:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:814:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:814:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01726);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:818:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:818:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:819:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:820:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:820:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01744);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:829:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:833:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:834:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:834:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:835:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:836:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:836:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01777);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:840:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:840:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:841:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:842:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:842:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01795);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:846:6: ( ( rule__Multiplication__Group_1_0_2__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:846:6: ( ( rule__Multiplication__Group_1_0_2__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:847:1: ( rule__Multiplication__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_2()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:848:1: ( rule__Multiplication__Group_1_0_2__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:848:2: rule__Multiplication__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__0_in_rule__Multiplication__Alternatives_1_01813);
                    rule__Multiplication__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_2()); 
                    }

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
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:857:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberValue ) | ( ruleVariable ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:861:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberValue ) | ( ruleVariable ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:862:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:862:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:863:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:864:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:864:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1846);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:868:6: ( ruleNumberValue )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:868:6: ( ruleNumberValue )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:869:1: ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNumberValue_in_rule__PrimaryExpression__Alternatives1864);
                    ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:874:6: ( ruleVariable )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:874:6: ( ruleVariable )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:875:1: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getVariableParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleVariable_in_rule__PrimaryExpression__Alternatives1881);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getVariableParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__VARIABLE_VALUE__Alternatives"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:885:1: rule__VARIABLE_VALUE__Alternatives : ( ( RULE_ID ) | ( ( rule__VARIABLE_VALUE__Group_1__0 ) ) );
    public final void rule__VARIABLE_VALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:889:1: ( ( RULE_ID ) | ( ( rule__VARIABLE_VALUE__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==33) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||(LA9_1>=12 && LA9_1<=16)||(LA9_1>=19 && LA9_1<=32)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:890:1: ( RULE_ID )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:890:1: ( RULE_ID )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:891:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Alternatives1913); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:896:6: ( ( rule__VARIABLE_VALUE__Group_1__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:896:6: ( ( rule__VARIABLE_VALUE__Group_1__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:897:1: ( rule__VARIABLE_VALUE__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_VALUEAccess().getGroup_1()); 
                    }
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:898:1: ( rule__VARIABLE_VALUE__Group_1__0 )
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:898:2: rule__VARIABLE_VALUE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__0_in_rule__VARIABLE_VALUE__Alternatives1930);
                    rule__VARIABLE_VALUE__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_VALUEAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__VARIABLE_VALUE__Alternatives"


    // $ANTLR start "rule__Equivalent__Group__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:909:1: rule__Equivalent__Group__0 : rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1 ;
    public final void rule__Equivalent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:913:1: ( rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:914:2: rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1
            {
            pushFollow(FOLLOW_rule__Equivalent__Group__0__Impl_in_rule__Equivalent__Group__01961);
            rule__Equivalent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equivalent__Group__1_in_rule__Equivalent__Group__01964);
            rule__Equivalent__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Equivalent__Group__0"


    // $ANTLR start "rule__Equivalent__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:921:1: rule__Equivalent__Group__0__Impl : ( ruleImplication ) ;
    public final void rule__Equivalent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:925:1: ( ( ruleImplication ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:926:1: ( ruleImplication )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:926:1: ( ruleImplication )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:927:1: ruleImplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_rule__Equivalent__Group__0__Impl1991);
            ruleImplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Equivalent__Group__0__Impl"


    // $ANTLR start "rule__Equivalent__Group__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:938:1: rule__Equivalent__Group__1 : rule__Equivalent__Group__1__Impl ;
    public final void rule__Equivalent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:942:1: ( rule__Equivalent__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:943:2: rule__Equivalent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equivalent__Group__1__Impl_in_rule__Equivalent__Group__12020);
            rule__Equivalent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Equivalent__Group__1"


    // $ANTLR start "rule__Equivalent__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:949:1: rule__Equivalent__Group__1__Impl : ( ( rule__Equivalent__Group_1__0 )? ) ;
    public final void rule__Equivalent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:953:1: ( ( ( rule__Equivalent__Group_1__0 )? ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:954:1: ( ( rule__Equivalent__Group_1__0 )? )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:954:1: ( ( rule__Equivalent__Group_1__0 )? )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:955:1: ( rule__Equivalent__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getGroup_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:956:1: ( rule__Equivalent__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:956:2: rule__Equivalent__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Equivalent__Group_1__0_in_rule__Equivalent__Group__1__Impl2047);
                    rule__Equivalent__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Equivalent__Group__1__Impl"


    // $ANTLR start "rule__Equivalent__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:970:1: rule__Equivalent__Group_1__0 : rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1 ;
    public final void rule__Equivalent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:974:1: ( rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:975:2: rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equivalent__Group_1__0__Impl_in_rule__Equivalent__Group_1__02082);
            rule__Equivalent__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equivalent__Group_1__1_in_rule__Equivalent__Group_1__02085);
            rule__Equivalent__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Equivalent__Group_1__0"


    // $ANTLR start "rule__Equivalent__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:982:1: rule__Equivalent__Group_1__0__Impl : ( () ) ;
    public final void rule__Equivalent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:986:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:987:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:987:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:988:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:989:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:991:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__0__Impl"


    // $ANTLR start "rule__Equivalent__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1001:1: rule__Equivalent__Group_1__1 : rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2 ;
    public final void rule__Equivalent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1005:1: ( rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1006:2: rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equivalent__Group_1__1__Impl_in_rule__Equivalent__Group_1__12143);
            rule__Equivalent__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equivalent__Group_1__2_in_rule__Equivalent__Group_1__12146);
            rule__Equivalent__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Equivalent__Group_1__1"


    // $ANTLR start "rule__Equivalent__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1013:1: rule__Equivalent__Group_1__1__Impl : ( 'equiv' ) ;
    public final void rule__Equivalent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1017:1: ( ( 'equiv' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1018:1: ( 'equiv' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1018:1: ( 'equiv' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1019:1: 'equiv'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getEquivKeyword_1_1()); 
            }
            match(input,12,FOLLOW_12_in_rule__Equivalent__Group_1__1__Impl2174); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getEquivKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__Equivalent__Group_1__1__Impl"


    // $ANTLR start "rule__Equivalent__Group_1__2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1032:1: rule__Equivalent__Group_1__2 : rule__Equivalent__Group_1__2__Impl ;
    public final void rule__Equivalent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1036:1: ( rule__Equivalent__Group_1__2__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1037:2: rule__Equivalent__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equivalent__Group_1__2__Impl_in_rule__Equivalent__Group_1__22205);
            rule__Equivalent__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Equivalent__Group_1__2"


    // $ANTLR start "rule__Equivalent__Group_1__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1043:1: rule__Equivalent__Group_1__2__Impl : ( ( rule__Equivalent__RightAssignment_1_2 ) ) ;
    public final void rule__Equivalent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1047:1: ( ( ( rule__Equivalent__RightAssignment_1_2 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1048:1: ( ( rule__Equivalent__RightAssignment_1_2 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1048:1: ( ( rule__Equivalent__RightAssignment_1_2 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1049:1: ( rule__Equivalent__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getRightAssignment_1_2()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1050:1: ( rule__Equivalent__RightAssignment_1_2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1050:2: rule__Equivalent__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equivalent__RightAssignment_1_2_in_rule__Equivalent__Group_1__2__Impl2232);
            rule__Equivalent__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Equivalent__Group_1__2__Impl"


    // $ANTLR start "rule__Implication__Group__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1066:1: rule__Implication__Group__0 : rule__Implication__Group__0__Impl rule__Implication__Group__1 ;
    public final void rule__Implication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1070:1: ( rule__Implication__Group__0__Impl rule__Implication__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1071:2: rule__Implication__Group__0__Impl rule__Implication__Group__1
            {
            pushFollow(FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__02268);
            rule__Implication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__02271);
            rule__Implication__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Implication__Group__0"


    // $ANTLR start "rule__Implication__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1078:1: rule__Implication__Group__0__Impl : ( ruleDisjunction ) ;
    public final void rule__Implication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1082:1: ( ( ruleDisjunction ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1083:1: ( ruleDisjunction )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1083:1: ( ruleDisjunction )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1084:1: ruleDisjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_rule__Implication__Group__0__Impl2298);
            ruleDisjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Implication__Group__0__Impl"


    // $ANTLR start "rule__Implication__Group__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1095:1: rule__Implication__Group__1 : rule__Implication__Group__1__Impl ;
    public final void rule__Implication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1099:1: ( rule__Implication__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1100:2: rule__Implication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__12327);
            rule__Implication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Implication__Group__1"


    // $ANTLR start "rule__Implication__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1106:1: rule__Implication__Group__1__Impl : ( ( rule__Implication__Group_1__0 )? ) ;
    public final void rule__Implication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1110:1: ( ( ( rule__Implication__Group_1__0 )? ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1111:1: ( ( rule__Implication__Group_1__0 )? )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1111:1: ( ( rule__Implication__Group_1__0 )? )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1112:1: ( rule__Implication__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getGroup_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1113:1: ( rule__Implication__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1113:2: rule__Implication__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Implication__Group_1__0_in_rule__Implication__Group__1__Impl2354);
                    rule__Implication__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Implication__Group__1__Impl"


    // $ANTLR start "rule__Implication__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1127:1: rule__Implication__Group_1__0 : rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1 ;
    public final void rule__Implication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1131:1: ( rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1132:2: rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Implication__Group_1__0__Impl_in_rule__Implication__Group_1__02389);
            rule__Implication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Implication__Group_1__1_in_rule__Implication__Group_1__02392);
            rule__Implication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Implication__Group_1__0"


    // $ANTLR start "rule__Implication__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1139:1: rule__Implication__Group_1__0__Impl : ( () ) ;
    public final void rule__Implication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1143:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1144:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1144:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1145:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1146:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1148:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__0__Impl"


    // $ANTLR start "rule__Implication__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1158:1: rule__Implication__Group_1__1 : rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2 ;
    public final void rule__Implication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1162:1: ( rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1163:2: rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Implication__Group_1__1__Impl_in_rule__Implication__Group_1__12450);
            rule__Implication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Implication__Group_1__2_in_rule__Implication__Group_1__12453);
            rule__Implication__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Implication__Group_1__1"


    // $ANTLR start "rule__Implication__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1170:1: rule__Implication__Group_1__1__Impl : ( 'imply' ) ;
    public final void rule__Implication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1174:1: ( ( 'imply' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1175:1: ( 'imply' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1175:1: ( 'imply' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1176:1: 'imply'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getImplyKeyword_1_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__Implication__Group_1__1__Impl2481); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getImplyKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__Implication__Group_1__1__Impl"


    // $ANTLR start "rule__Implication__Group_1__2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1189:1: rule__Implication__Group_1__2 : rule__Implication__Group_1__2__Impl ;
    public final void rule__Implication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1193:1: ( rule__Implication__Group_1__2__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1194:2: rule__Implication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Implication__Group_1__2__Impl_in_rule__Implication__Group_1__22512);
            rule__Implication__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Implication__Group_1__2"


    // $ANTLR start "rule__Implication__Group_1__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1200:1: rule__Implication__Group_1__2__Impl : ( ( rule__Implication__RightAssignment_1_2 ) ) ;
    public final void rule__Implication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1204:1: ( ( ( rule__Implication__RightAssignment_1_2 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1205:1: ( ( rule__Implication__RightAssignment_1_2 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1205:1: ( ( rule__Implication__RightAssignment_1_2 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1206:1: ( rule__Implication__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getRightAssignment_1_2()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1207:1: ( rule__Implication__RightAssignment_1_2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1207:2: rule__Implication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Implication__RightAssignment_1_2_in_rule__Implication__Group_1__2__Impl2539);
            rule__Implication__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Implication__Group_1__2__Impl"


    // $ANTLR start "rule__Disjunction__Group__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1223:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1227:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1228:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__02575);
            rule__Disjunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__02578);
            rule__Disjunction__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Disjunction__Group__0"


    // $ANTLR start "rule__Disjunction__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1235:1: rule__Disjunction__Group__0__Impl : ( ruleConjunction ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1239:1: ( ( ruleConjunction ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1240:1: ( ruleConjunction )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1240:1: ( ruleConjunction )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1241:1: ruleConjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_rule__Disjunction__Group__0__Impl2605);
            ruleConjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Disjunction__Group__0__Impl"


    // $ANTLR start "rule__Disjunction__Group__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1252:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1256:1: ( rule__Disjunction__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1257:2: rule__Disjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__12634);
            rule__Disjunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Disjunction__Group__1"


    // $ANTLR start "rule__Disjunction__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1263:1: rule__Disjunction__Group__1__Impl : ( ( rule__Disjunction__Group_1__0 )? ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1267:1: ( ( ( rule__Disjunction__Group_1__0 )? ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1268:1: ( ( rule__Disjunction__Group_1__0 )? )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1268:1: ( ( rule__Disjunction__Group_1__0 )? )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1269:1: ( rule__Disjunction__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getGroup_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1270:1: ( rule__Disjunction__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=14 && LA12_0<=15)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1270:2: rule__Disjunction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Disjunction__Group_1__0_in_rule__Disjunction__Group__1__Impl2661);
                    rule__Disjunction__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Disjunction__Group__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1284:1: rule__Disjunction__Group_1__0 : rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 ;
    public final void rule__Disjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1288:1: ( rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1289:2: rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1__0__Impl_in_rule__Disjunction__Group_1__02696);
            rule__Disjunction__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Disjunction__Group_1__1_in_rule__Disjunction__Group_1__02699);
            rule__Disjunction__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Disjunction__Group_1__0"


    // $ANTLR start "rule__Disjunction__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1296:1: rule__Disjunction__Group_1__0__Impl : ( ( rule__Disjunction__Alternatives_1_0 ) ) ;
    public final void rule__Disjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1300:1: ( ( ( rule__Disjunction__Alternatives_1_0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1301:1: ( ( rule__Disjunction__Alternatives_1_0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1301:1: ( ( rule__Disjunction__Alternatives_1_0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1302:1: ( rule__Disjunction__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getAlternatives_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1303:1: ( rule__Disjunction__Alternatives_1_0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1303:2: rule__Disjunction__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Disjunction__Alternatives_1_0_in_rule__Disjunction__Group_1__0__Impl2726);
            rule__Disjunction__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getAlternatives_1_0()); 
            }

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
    // $ANTLR end "rule__Disjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1313:1: rule__Disjunction__Group_1__1 : rule__Disjunction__Group_1__1__Impl ;
    public final void rule__Disjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1317:1: ( rule__Disjunction__Group_1__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1318:2: rule__Disjunction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1__1__Impl_in_rule__Disjunction__Group_1__12756);
            rule__Disjunction__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Disjunction__Group_1__1"


    // $ANTLR start "rule__Disjunction__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: rule__Disjunction__Group_1__1__Impl : ( ( rule__Disjunction__RightAssignment_1_1 ) ) ;
    public final void rule__Disjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1328:1: ( ( ( rule__Disjunction__RightAssignment_1_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1329:1: ( ( rule__Disjunction__RightAssignment_1_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1329:1: ( ( rule__Disjunction__RightAssignment_1_1 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1330:1: ( rule__Disjunction__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getRightAssignment_1_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1331:1: ( rule__Disjunction__RightAssignment_1_1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1331:2: rule__Disjunction__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Disjunction__RightAssignment_1_1_in_rule__Disjunction__Group_1__1__Impl2783);
            rule__Disjunction__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Disjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1345:1: rule__Disjunction__Group_1_0_0__0 : rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1 ;
    public final void rule__Disjunction__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1349:1: ( rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1350:2: rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__0__Impl_in_rule__Disjunction__Group_1_0_0__02817);
            rule__Disjunction__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__1_in_rule__Disjunction__Group_1_0_0__02820);
            rule__Disjunction__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Disjunction__Group_1_0_0__0"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1357:1: rule__Disjunction__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1361:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1362:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1362:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1363:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1364:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1366:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1376:1: rule__Disjunction__Group_1_0_0__1 : rule__Disjunction__Group_1_0_0__1__Impl ;
    public final void rule__Disjunction__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1380:1: ( rule__Disjunction__Group_1_0_0__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1381:2: rule__Disjunction__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__1__Impl_in_rule__Disjunction__Group_1_0_0__12878);
            rule__Disjunction__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Disjunction__Group_1_0_0__1"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1387:1: rule__Disjunction__Group_1_0_0__1__Impl : ( 'or' ) ;
    public final void rule__Disjunction__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1391:1: ( ( 'or' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1392:1: ( 'or' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1392:1: ( 'or' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1393:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__Disjunction__Group_1_0_0__1__Impl2906); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__Disjunction__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1410:1: rule__Disjunction__Group_1_0_1__0 : rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1 ;
    public final void rule__Disjunction__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1414:1: ( rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1415:2: rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__0__Impl_in_rule__Disjunction__Group_1_0_1__02941);
            rule__Disjunction__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__1_in_rule__Disjunction__Group_1_0_1__02944);
            rule__Disjunction__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Disjunction__Group_1_0_1__0"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1422:1: rule__Disjunction__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1426:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1427:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1427:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1428:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1429:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1431:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1441:1: rule__Disjunction__Group_1_0_1__1 : rule__Disjunction__Group_1_0_1__1__Impl ;
    public final void rule__Disjunction__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1445:1: ( rule__Disjunction__Group_1_0_1__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1446:2: rule__Disjunction__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__1__Impl_in_rule__Disjunction__Group_1_0_1__13002);
            rule__Disjunction__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Disjunction__Group_1_0_1__1"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1452:1: rule__Disjunction__Group_1_0_1__1__Impl : ( 'xor' ) ;
    public final void rule__Disjunction__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1456:1: ( ( 'xor' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1457:1: ( 'xor' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1457:1: ( 'xor' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1458:1: 'xor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Disjunction__Group_1_0_1__1__Impl3030); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1()); 
            }

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
    // $ANTLR end "rule__Disjunction__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Conjunction__Group__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1475:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1479:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1480:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__03065);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__03068);
            rule__Conjunction__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conjunction__Group__0"


    // $ANTLR start "rule__Conjunction__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1487:1: rule__Conjunction__Group__0__Impl : ( ruleNegation ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1491:1: ( ( ruleNegation ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1492:1: ( ruleNegation )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1492:1: ( ruleNegation )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1493:1: ruleNegation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_rule__Conjunction__Group__0__Impl3095);
            ruleNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Conjunction__Group__0__Impl"


    // $ANTLR start "rule__Conjunction__Group__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1504:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1508:1: ( rule__Conjunction__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1509:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__13124);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conjunction__Group__1"


    // $ANTLR start "rule__Conjunction__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1515:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )? ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1519:1: ( ( ( rule__Conjunction__Group_1__0 )? ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1520:1: ( ( rule__Conjunction__Group_1__0 )? )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1520:1: ( ( rule__Conjunction__Group_1__0 )? )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1521:1: ( rule__Conjunction__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1522:1: ( rule__Conjunction__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1522:2: rule__Conjunction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl3151);
                    rule__Conjunction__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Conjunction__Group__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1536:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1540:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1541:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__03186);
            rule__Conjunction__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__03189);
            rule__Conjunction__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conjunction__Group_1__0"


    // $ANTLR start "rule__Conjunction__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1548:1: rule__Conjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1552:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1553:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1553:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1554:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1555:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1557:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1567:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1571:1: ( rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1572:2: rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__13247);
            rule__Conjunction__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__13250);
            rule__Conjunction__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conjunction__Group_1__1"


    // $ANTLR start "rule__Conjunction__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1579:1: rule__Conjunction__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1583:1: ( ( 'and' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1584:1: ( 'and' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1584:1: ( 'and' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1585:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getAndKeyword_1_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Conjunction__Group_1__1__Impl3278); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getAndKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__Conjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1598:1: rule__Conjunction__Group_1__2 : rule__Conjunction__Group_1__2__Impl ;
    public final void rule__Conjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1602:1: ( rule__Conjunction__Group_1__2__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1603:2: rule__Conjunction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__23309);
            rule__Conjunction__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Conjunction__Group_1__2"


    // $ANTLR start "rule__Conjunction__Group_1__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1609:1: rule__Conjunction__Group_1__2__Impl : ( ( rule__Conjunction__RightAssignment_1_2 ) ) ;
    public final void rule__Conjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1613:1: ( ( ( rule__Conjunction__RightAssignment_1_2 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1614:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1614:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1615:1: ( rule__Conjunction__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1616:1: ( rule__Conjunction__RightAssignment_1_2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1616:2: rule__Conjunction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl3336);
            rule__Conjunction__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__Conjunction__Group_1__2__Impl"


    // $ANTLR start "rule__Negation__Group_0__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1632:1: rule__Negation__Group_0__0 : rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1 ;
    public final void rule__Negation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1636:1: ( rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1637:2: rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Negation__Group_0__0__Impl_in_rule__Negation__Group_0__03372);
            rule__Negation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Negation__Group_0__1_in_rule__Negation__Group_0__03375);
            rule__Negation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Negation__Group_0__0"


    // $ANTLR start "rule__Negation__Group_0__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1644:1: rule__Negation__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__Negation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1648:1: ( ( 'not' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1649:1: ( 'not' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1649:1: ( 'not' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1650:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getNotKeyword_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Negation__Group_0__0__Impl3403); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getNotKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__Negation__Group_0__0__Impl"


    // $ANTLR start "rule__Negation__Group_0__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1663:1: rule__Negation__Group_0__1 : rule__Negation__Group_0__1__Impl ;
    public final void rule__Negation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1667:1: ( rule__Negation__Group_0__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1668:2: rule__Negation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group_0__1__Impl_in_rule__Negation__Group_0__13434);
            rule__Negation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Negation__Group_0__1"


    // $ANTLR start "rule__Negation__Group_0__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1674:1: rule__Negation__Group_0__1__Impl : ( ruleNegated ) ;
    public final void rule__Negation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1678:1: ( ( ruleNegated ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1679:1: ( ruleNegated )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1679:1: ( ruleNegated )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1680:1: ruleNegated
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleNegated_in_rule__Negation__Group_0__1__Impl3461);
            ruleNegated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__Negation__Group_0__1__Impl"


    // $ANTLR start "rule__Negated__Group__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1695:1: rule__Negated__Group__0 : rule__Negated__Group__0__Impl rule__Negated__Group__1 ;
    public final void rule__Negated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1699:1: ( rule__Negated__Group__0__Impl rule__Negated__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1700:2: rule__Negated__Group__0__Impl rule__Negated__Group__1
            {
            pushFollow(FOLLOW_rule__Negated__Group__0__Impl_in_rule__Negated__Group__03494);
            rule__Negated__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Negated__Group__1_in_rule__Negated__Group__03497);
            rule__Negated__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Negated__Group__0"


    // $ANTLR start "rule__Negated__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1707:1: rule__Negated__Group__0__Impl : ( () ) ;
    public final void rule__Negated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1711:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1712:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1712:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1713:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getNotAction_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1714:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1716:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getNotAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negated__Group__0__Impl"


    // $ANTLR start "rule__Negated__Group__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1726:1: rule__Negated__Group__1 : rule__Negated__Group__1__Impl ;
    public final void rule__Negated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1730:1: ( rule__Negated__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1731:2: rule__Negated__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negated__Group__1__Impl_in_rule__Negated__Group__13555);
            rule__Negated__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Negated__Group__1"


    // $ANTLR start "rule__Negated__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1737:1: rule__Negated__Group__1__Impl : ( ( rule__Negated__NotAssignment_1 ) ) ;
    public final void rule__Negated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1741:1: ( ( ( rule__Negated__NotAssignment_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1742:1: ( ( rule__Negated__NotAssignment_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1742:1: ( ( rule__Negated__NotAssignment_1 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1743:1: ( rule__Negated__NotAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getNotAssignment_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1744:1: ( rule__Negated__NotAssignment_1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1744:2: rule__Negated__NotAssignment_1
            {
            pushFollow(FOLLOW_rule__Negated__NotAssignment_1_in_rule__Negated__Group__1__Impl3582);
            rule__Negated__NotAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getNotAssignment_1()); 
            }

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
    // $ANTLR end "rule__Negated__Group__1__Impl"


    // $ANTLR start "rule__CExpression__Group_0__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1758:1: rule__CExpression__Group_0__0 : rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1 ;
    public final void rule__CExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1762:1: ( rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1763:2: rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__CExpression__Group_0__0__Impl_in_rule__CExpression__Group_0__03616);
            rule__CExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CExpression__Group_0__1_in_rule__CExpression__Group_0__03619);
            rule__CExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CExpression__Group_0__0"


    // $ANTLR start "rule__CExpression__Group_0__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1770:1: rule__CExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__CExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1774:1: ( ( '(' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1775:1: ( '(' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1775:1: ( '(' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1776:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__CExpression__Group_0__0__Impl3647); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__CExpression__Group_0__0__Impl"


    // $ANTLR start "rule__CExpression__Group_0__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1789:1: rule__CExpression__Group_0__1 : rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2 ;
    public final void rule__CExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1793:1: ( rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1794:2: rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__CExpression__Group_0__1__Impl_in_rule__CExpression__Group_0__13678);
            rule__CExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CExpression__Group_0__2_in_rule__CExpression__Group_0__13681);
            rule__CExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CExpression__Group_0__1"


    // $ANTLR start "rule__CExpression__Group_0__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1801:1: rule__CExpression__Group_0__1__Impl : ( ruleLExpression ) ;
    public final void rule__CExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1805:1: ( ( ruleLExpression ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1806:1: ( ruleLExpression )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1806:1: ( ruleLExpression )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1807:1: ruleLExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleLExpression_in_rule__CExpression__Group_0__1__Impl3708);
            ruleLExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__CExpression__Group_0__1__Impl"


    // $ANTLR start "rule__CExpression__Group_0__2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1818:1: rule__CExpression__Group_0__2 : rule__CExpression__Group_0__2__Impl ;
    public final void rule__CExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1822:1: ( rule__CExpression__Group_0__2__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1823:2: rule__CExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__CExpression__Group_0__2__Impl_in_rule__CExpression__Group_0__23737);
            rule__CExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CExpression__Group_0__2"


    // $ANTLR start "rule__CExpression__Group_0__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1829:1: rule__CExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__CExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1833:1: ( ( ')' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1834:1: ( ')' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1834:1: ( ')' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1835:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__CExpression__Group_0__2__Impl3765); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }

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
    // $ANTLR end "rule__CExpression__Group_0__2__Impl"


    // $ANTLR start "rule__Compare__Group__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1854:1: rule__Compare__Group__0 : rule__Compare__Group__0__Impl rule__Compare__Group__1 ;
    public final void rule__Compare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1858:1: ( rule__Compare__Group__0__Impl rule__Compare__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1859:2: rule__Compare__Group__0__Impl rule__Compare__Group__1
            {
            pushFollow(FOLLOW_rule__Compare__Group__0__Impl_in_rule__Compare__Group__03802);
            rule__Compare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group__1_in_rule__Compare__Group__03805);
            rule__Compare__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group__0"


    // $ANTLR start "rule__Compare__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1866:1: rule__Compare__Group__0__Impl : ( ruleSomeValue ) ;
    public final void rule__Compare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1870:1: ( ( ruleSomeValue ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1871:1: ( ruleSomeValue )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1871:1: ( ruleSomeValue )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1872:1: ruleSomeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getSomeValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSomeValue_in_rule__Compare__Group__0__Impl3832);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getSomeValueParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Compare__Group__0__Impl"


    // $ANTLR start "rule__Compare__Group__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1883:1: rule__Compare__Group__1 : rule__Compare__Group__1__Impl rule__Compare__Group__2 ;
    public final void rule__Compare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1887:1: ( rule__Compare__Group__1__Impl rule__Compare__Group__2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1888:2: rule__Compare__Group__1__Impl rule__Compare__Group__2
            {
            pushFollow(FOLLOW_rule__Compare__Group__1__Impl_in_rule__Compare__Group__13861);
            rule__Compare__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group__2_in_rule__Compare__Group__13864);
            rule__Compare__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group__1"


    // $ANTLR start "rule__Compare__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1895:1: rule__Compare__Group__1__Impl : ( ( rule__Compare__Alternatives_1 ) ) ;
    public final void rule__Compare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1899:1: ( ( ( rule__Compare__Alternatives_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1900:1: ( ( rule__Compare__Alternatives_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1900:1: ( ( rule__Compare__Alternatives_1 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1901:1: ( rule__Compare__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getAlternatives_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1902:1: ( rule__Compare__Alternatives_1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1902:2: rule__Compare__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Compare__Alternatives_1_in_rule__Compare__Group__1__Impl3891);
            rule__Compare__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getAlternatives_1()); 
            }

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
    // $ANTLR end "rule__Compare__Group__1__Impl"


    // $ANTLR start "rule__Compare__Group__2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1912:1: rule__Compare__Group__2 : rule__Compare__Group__2__Impl ;
    public final void rule__Compare__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1916:1: ( rule__Compare__Group__2__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1917:2: rule__Compare__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group__2__Impl_in_rule__Compare__Group__23921);
            rule__Compare__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group__2"


    // $ANTLR start "rule__Compare__Group__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1923:1: rule__Compare__Group__2__Impl : ( ( rule__Compare__RightAssignment_2 ) ) ;
    public final void rule__Compare__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1927:1: ( ( ( rule__Compare__RightAssignment_2 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1928:1: ( ( rule__Compare__RightAssignment_2 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1928:1: ( ( rule__Compare__RightAssignment_2 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1929:1: ( rule__Compare__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getRightAssignment_2()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1930:1: ( rule__Compare__RightAssignment_2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1930:2: rule__Compare__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Compare__RightAssignment_2_in_rule__Compare__Group__2__Impl3948);
            rule__Compare__RightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getRightAssignment_2()); 
            }

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
    // $ANTLR end "rule__Compare__Group__2__Impl"


    // $ANTLR start "rule__Compare__Group_1_0__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1946:1: rule__Compare__Group_1_0__0 : rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1 ;
    public final void rule__Compare__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1950:1: ( rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1951:2: rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_0__0__Impl_in_rule__Compare__Group_1_0__03984);
            rule__Compare__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_0__1_in_rule__Compare__Group_1_0__03987);
            rule__Compare__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_0__0"


    // $ANTLR start "rule__Compare__Group_1_0__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1958:1: rule__Compare__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1962:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1963:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1963:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1964:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1965:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1967:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_0__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1977:1: rule__Compare__Group_1_0__1 : rule__Compare__Group_1_0__1__Impl ;
    public final void rule__Compare__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1981:1: ( rule__Compare__Group_1_0__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1982:2: rule__Compare__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_0__1__Impl_in_rule__Compare__Group_1_0__14045);
            rule__Compare__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_0__1"


    // $ANTLR start "rule__Compare__Group_1_0__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1988:1: rule__Compare__Group_1_0__1__Impl : ( '<=' ) ;
    public final void rule__Compare__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1992:1: ( ( '<=' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1993:1: ( '<=' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1993:1: ( '<=' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:1994:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Compare__Group_1_0__1__Impl4073); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1()); 
            }

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
    // $ANTLR end "rule__Compare__Group_1_0__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2011:1: rule__Compare__Group_1_1__0 : rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1 ;
    public final void rule__Compare__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2015:1: ( rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2016:2: rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_1__0__Impl_in_rule__Compare__Group_1_1__04108);
            rule__Compare__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_1__1_in_rule__Compare__Group_1_1__04111);
            rule__Compare__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_1__0"


    // $ANTLR start "rule__Compare__Group_1_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2023:1: rule__Compare__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2027:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2028:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2028:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2029:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2030:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2032:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_1__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2042:1: rule__Compare__Group_1_1__1 : rule__Compare__Group_1_1__1__Impl ;
    public final void rule__Compare__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2046:1: ( rule__Compare__Group_1_1__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2047:2: rule__Compare__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_1__1__Impl_in_rule__Compare__Group_1_1__14169);
            rule__Compare__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_1__1"


    // $ANTLR start "rule__Compare__Group_1_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2053:1: rule__Compare__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__Compare__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2057:1: ( ( '<' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2058:1: ( '<' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2058:1: ( '<' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2059:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Compare__Group_1_1__1__Impl4197); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1()); 
            }

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
    // $ANTLR end "rule__Compare__Group_1_1__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_2__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2076:1: rule__Compare__Group_1_2__0 : rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1 ;
    public final void rule__Compare__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2080:1: ( rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2081:2: rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_2__0__Impl_in_rule__Compare__Group_1_2__04232);
            rule__Compare__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_2__1_in_rule__Compare__Group_1_2__04235);
            rule__Compare__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_2__0"


    // $ANTLR start "rule__Compare__Group_1_2__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2088:1: rule__Compare__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2092:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2093:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2093:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2094:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2095:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2097:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_2__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_2__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2107:1: rule__Compare__Group_1_2__1 : rule__Compare__Group_1_2__1__Impl ;
    public final void rule__Compare__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2111:1: ( rule__Compare__Group_1_2__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2112:2: rule__Compare__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_2__1__Impl_in_rule__Compare__Group_1_2__14293);
            rule__Compare__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_2__1"


    // $ANTLR start "rule__Compare__Group_1_2__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2118:1: rule__Compare__Group_1_2__1__Impl : ( '>=' ) ;
    public final void rule__Compare__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2122:1: ( ( '>=' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2123:1: ( '>=' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2123:1: ( '>=' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2124:1: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Compare__Group_1_2__1__Impl4321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
            }

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
    // $ANTLR end "rule__Compare__Group_1_2__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_3__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2141:1: rule__Compare__Group_1_3__0 : rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1 ;
    public final void rule__Compare__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2145:1: ( rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2146:2: rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_3__0__Impl_in_rule__Compare__Group_1_3__04356);
            rule__Compare__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_3__1_in_rule__Compare__Group_1_3__04359);
            rule__Compare__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_3__0"


    // $ANTLR start "rule__Compare__Group_1_3__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2153:1: rule__Compare__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2157:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2158:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2158:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2159:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2160:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2162:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_3__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_3__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2172:1: rule__Compare__Group_1_3__1 : rule__Compare__Group_1_3__1__Impl ;
    public final void rule__Compare__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2176:1: ( rule__Compare__Group_1_3__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2177:2: rule__Compare__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_3__1__Impl_in_rule__Compare__Group_1_3__14417);
            rule__Compare__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_3__1"


    // $ANTLR start "rule__Compare__Group_1_3__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2183:1: rule__Compare__Group_1_3__1__Impl : ( '>' ) ;
    public final void rule__Compare__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2187:1: ( ( '>' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2188:1: ( '>' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2188:1: ( '>' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2189:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__Compare__Group_1_3__1__Impl4445); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1()); 
            }

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
    // $ANTLR end "rule__Compare__Group_1_3__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_4__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2206:1: rule__Compare__Group_1_4__0 : rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1 ;
    public final void rule__Compare__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2210:1: ( rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2211:2: rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_4__0__Impl_in_rule__Compare__Group_1_4__04480);
            rule__Compare__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_4__1_in_rule__Compare__Group_1_4__04483);
            rule__Compare__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_4__0"


    // $ANTLR start "rule__Compare__Group_1_4__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2218:1: rule__Compare__Group_1_4__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2222:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2223:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2223:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2224:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2225:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2227:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_4__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_4__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2237:1: rule__Compare__Group_1_4__1 : rule__Compare__Group_1_4__1__Impl ;
    public final void rule__Compare__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2241:1: ( rule__Compare__Group_1_4__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2242:2: rule__Compare__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_4__1__Impl_in_rule__Compare__Group_1_4__14541);
            rule__Compare__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_4__1"


    // $ANTLR start "rule__Compare__Group_1_4__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2248:1: rule__Compare__Group_1_4__1__Impl : ( '=' ) ;
    public final void rule__Compare__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2252:1: ( ( '=' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2253:1: ( '=' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2253:1: ( '=' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2254:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__Compare__Group_1_4__1__Impl4569); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1()); 
            }

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
    // $ANTLR end "rule__Compare__Group_1_4__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_5__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2271:1: rule__Compare__Group_1_5__0 : rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1 ;
    public final void rule__Compare__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2275:1: ( rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2276:2: rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_5__0__Impl_in_rule__Compare__Group_1_5__04604);
            rule__Compare__Group_1_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_5__1_in_rule__Compare__Group_1_5__04607);
            rule__Compare__Group_1_5__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_5__0"


    // $ANTLR start "rule__Compare__Group_1_5__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2283:1: rule__Compare__Group_1_5__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2287:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2288:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2288:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2289:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2290:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2292:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_5__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_5__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2302:1: rule__Compare__Group_1_5__1 : rule__Compare__Group_1_5__1__Impl ;
    public final void rule__Compare__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2306:1: ( rule__Compare__Group_1_5__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2307:2: rule__Compare__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_5__1__Impl_in_rule__Compare__Group_1_5__14665);
            rule__Compare__Group_1_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_5__1"


    // $ANTLR start "rule__Compare__Group_1_5__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2313:1: rule__Compare__Group_1_5__1__Impl : ( '!=' ) ;
    public final void rule__Compare__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2317:1: ( ( '!=' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2318:1: ( '!=' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2318:1: ( '!=' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2319:1: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Compare__Group_1_5__1__Impl4693); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1()); 
            }

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
    // $ANTLR end "rule__Compare__Group_1_5__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_6__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2336:1: rule__Compare__Group_1_6__0 : rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1 ;
    public final void rule__Compare__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2340:1: ( rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2341:2: rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_6__0__Impl_in_rule__Compare__Group_1_6__04728);
            rule__Compare__Group_1_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_6__1_in_rule__Compare__Group_1_6__04731);
            rule__Compare__Group_1_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_6__0"


    // $ANTLR start "rule__Compare__Group_1_6__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2348:1: rule__Compare__Group_1_6__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2352:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2353:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2353:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2354:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2355:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2357:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_6__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_6__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2367:1: rule__Compare__Group_1_6__1 : rule__Compare__Group_1_6__1__Impl ;
    public final void rule__Compare__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2371:1: ( rule__Compare__Group_1_6__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2372:2: rule__Compare__Group_1_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_6__1__Impl_in_rule__Compare__Group_1_6__14789);
            rule__Compare__Group_1_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Compare__Group_1_6__1"


    // $ANTLR start "rule__Compare__Group_1_6__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2378:1: rule__Compare__Group_1_6__1__Impl : ( '~' ) ;
    public final void rule__Compare__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2382:1: ( ( '~' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2383:1: ( '~' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2383:1: ( '~' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2384:1: '~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getTildeKeyword_1_6_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Compare__Group_1_6__1__Impl4817); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getTildeKeyword_1_6_1()); 
            }

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
    // $ANTLR end "rule__Compare__Group_1_6__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2401:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2405:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2406:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04852);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04855);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2413:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2417:1: ( ( ruleMultiplication ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2418:1: ( ruleMultiplication )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2418:1: ( ruleMultiplication )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2419:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4882);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2430:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2434:1: ( rule__Addition__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2435:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__14911);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2441:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2445:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2446:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2446:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2447:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2448:1: ( rule__Addition__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=27 && LA14_0<=28)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2448:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl4938);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2462:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2466:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2467:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__04973);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__04976);
            rule__Addition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2474:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2478:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2479:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2479:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2480:1: ( rule__Addition__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2481:1: ( rule__Addition__Alternatives_1_0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2481:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl5003);
            rule__Addition__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }

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
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2491:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2495:1: ( rule__Addition__Group_1__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2496:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__15033);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2502:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2506:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2507:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2507:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2508:1: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2509:1: ( rule__Addition__RightAssignment_1_1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2509:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl5060);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2523:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2527:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2528:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__05094);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__05097);
            rule__Addition__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2535:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2539:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2540:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2540:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2541:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2542:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2544:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2554:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2558:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2559:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__15155);
            rule__Addition__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2565:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2569:1: ( ( '+' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2570:1: ( '+' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2570:1: ( '+' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2571:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Addition__Group_1_0_0__1__Impl5183); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2588:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2592:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2593:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__05218);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__05221);
            rule__Addition__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2600:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2604:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2605:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2605:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2606:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2607:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2609:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2619:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2623:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2624:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15279);
            rule__Addition__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2630:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2634:1: ( ( '-' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2635:1: ( '-' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2635:1: ( '-' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2636:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Addition__Group_1_0_1__1__Impl5307); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }

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
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2653:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2657:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2658:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05342);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05345);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2665:1: rule__Multiplication__Group__0__Impl : ( rulePower ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2669:1: ( ( rulePower ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2670:1: ( rulePower )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2670:1: ( rulePower )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2671:1: rulePower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl5372);
            rulePower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2682:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2686:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2687:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15401);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2693:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2697:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2698:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2698:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2699:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2700:1: ( rule__Multiplication__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=29 && LA15_0<=31)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2700:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5428);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2714:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2718:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2719:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05463);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05466);
            rule__Multiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2726:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2730:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2731:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2731:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2732:1: ( rule__Multiplication__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2733:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2733:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl5493);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }

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
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2743:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2747:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2748:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15523);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2754:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2758:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2759:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2759:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2760:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2761:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2761:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5550);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2775:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2779:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2780:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__05584);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__05587);
            rule__Multiplication__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2787:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2791:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2792:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2792:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2793:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2794:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2796:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2806:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2810:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2811:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__15645);
            rule__Multiplication__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2817:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2821:1: ( ( '*' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2822:1: ( '*' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2822:1: ( '*' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2823:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Multiplication__Group_1_0_0__1__Impl5673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2840:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2844:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2845:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__05708);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__05711);
            rule__Multiplication__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2852:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2856:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2857:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2857:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2858:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2859:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2861:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2871:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2875:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2876:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__15769);
            rule__Multiplication__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2882:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2886:1: ( ( '/' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2887:1: ( '/' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2887:1: ( '/' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2888:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Multiplication__Group_1_0_1__1__Impl5797); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2905:1: rule__Multiplication__Group_1_0_2__0 : rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1 ;
    public final void rule__Multiplication__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2909:1: ( rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2910:2: rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__0__Impl_in_rule__Multiplication__Group_1_0_2__05832);
            rule__Multiplication__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__1_in_rule__Multiplication__Group_1_0_2__05835);
            rule__Multiplication__Group_1_0_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Multiplication__Group_1_0_2__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2917:1: rule__Multiplication__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2921:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2922:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2922:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2923:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2924:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2926:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2936:1: rule__Multiplication__Group_1_0_2__1 : rule__Multiplication__Group_1_0_2__1__Impl ;
    public final void rule__Multiplication__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2940:1: ( rule__Multiplication__Group_1_0_2__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2941:2: rule__Multiplication__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__1__Impl_in_rule__Multiplication__Group_1_0_2__15893);
            rule__Multiplication__Group_1_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Multiplication__Group_1_0_2__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2947:1: rule__Multiplication__Group_1_0_2__1__Impl : ( '%' ) ;
    public final void rule__Multiplication__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2951:1: ( ( '%' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2952:1: ( '%' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2952:1: ( '%' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2953:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Multiplication__Group_1_0_2__1__Impl5921); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1()); 
            }

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
    // $ANTLR end "rule__Multiplication__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Power__Group__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2970:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2974:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2975:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__05956);
            rule__Power__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Power__Group__1_in_rule__Power__Group__05959);
            rule__Power__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Power__Group__0"


    // $ANTLR start "rule__Power__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2982:1: rule__Power__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2986:1: ( ( rulePrimaryExpression ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2987:1: ( rulePrimaryExpression )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2987:1: ( rulePrimaryExpression )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2988:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Power__Group__0__Impl5986);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Power__Group__0__Impl"


    // $ANTLR start "rule__Power__Group__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:2999:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3003:1: ( rule__Power__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3004:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__16015);
            rule__Power__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Power__Group__1"


    // $ANTLR start "rule__Power__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3010:1: rule__Power__Group__1__Impl : ( ( rule__Power__Group_1__0 )* ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3014:1: ( ( ( rule__Power__Group_1__0 )* ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3015:1: ( ( rule__Power__Group_1__0 )* )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3015:1: ( ( rule__Power__Group_1__0 )* )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3016:1: ( rule__Power__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getGroup_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3017:1: ( rule__Power__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3017:2: rule__Power__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl6042);
            	    rule__Power__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Power__Group__1__Impl"


    // $ANTLR start "rule__Power__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3031:1: rule__Power__Group_1__0 : rule__Power__Group_1__0__Impl rule__Power__Group_1__1 ;
    public final void rule__Power__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3035:1: ( rule__Power__Group_1__0__Impl rule__Power__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3036:2: rule__Power__Group_1__0__Impl rule__Power__Group_1__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__06077);
            rule__Power__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__06080);
            rule__Power__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Power__Group_1__0"


    // $ANTLR start "rule__Power__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3043:1: rule__Power__Group_1__0__Impl : ( ( rule__Power__Group_1_0__0 ) ) ;
    public final void rule__Power__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3047:1: ( ( ( rule__Power__Group_1_0__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3048:1: ( ( rule__Power__Group_1_0__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3048:1: ( ( rule__Power__Group_1_0__0 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3049:1: ( rule__Power__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getGroup_1_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3050:1: ( rule__Power__Group_1_0__0 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3050:2: rule__Power__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl6107);
            rule__Power__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__Power__Group_1__0__Impl"


    // $ANTLR start "rule__Power__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3060:1: rule__Power__Group_1__1 : rule__Power__Group_1__1__Impl ;
    public final void rule__Power__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3064:1: ( rule__Power__Group_1__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3065:2: rule__Power__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__16137);
            rule__Power__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Power__Group_1__1"


    // $ANTLR start "rule__Power__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3071:1: rule__Power__Group_1__1__Impl : ( ( rule__Power__RightAssignment_1_1 ) ) ;
    public final void rule__Power__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3075:1: ( ( ( rule__Power__RightAssignment_1_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3076:1: ( ( rule__Power__RightAssignment_1_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3076:1: ( ( rule__Power__RightAssignment_1_1 ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3077:1: ( rule__Power__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3078:1: ( rule__Power__RightAssignment_1_1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3078:2: rule__Power__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl6164);
            rule__Power__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Power__Group_1__1__Impl"


    // $ANTLR start "rule__Power__Group_1_0__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3092:1: rule__Power__Group_1_0__0 : rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 ;
    public final void rule__Power__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3096:1: ( rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3097:2: rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__06198);
            rule__Power__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__06201);
            rule__Power__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Power__Group_1_0__0"


    // $ANTLR start "rule__Power__Group_1_0__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3104:1: rule__Power__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Power__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3108:1: ( ( () ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3109:1: ( () )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3109:1: ( () )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3110:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3111:1: ()
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3113:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1_0__0__Impl"


    // $ANTLR start "rule__Power__Group_1_0__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3123:1: rule__Power__Group_1_0__1 : rule__Power__Group_1_0__1__Impl ;
    public final void rule__Power__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3127:1: ( rule__Power__Group_1_0__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3128:2: rule__Power__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__16259);
            rule__Power__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Power__Group_1_0__1"


    // $ANTLR start "rule__Power__Group_1_0__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3134:1: rule__Power__Group_1_0__1__Impl : ( '^' ) ;
    public final void rule__Power__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3138:1: ( ( '^' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3139:1: ( '^' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3139:1: ( '^' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3140:1: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Power__Group_1_0__1__Impl6287); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
            }

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
    // $ANTLR end "rule__Power__Group_1_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3157:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3161:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3162:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__06322);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__06325);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3169:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3173:1: ( ( '(' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3174:1: ( '(' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3174:1: ( '(' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3175:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__PrimaryExpression__Group_0__0__Impl6353); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3188:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3192:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3193:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__16384);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__16387);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3200:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleAExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3204:1: ( ( ruleAExpression ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3205:1: ( ruleAExpression )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3205:1: ( ruleAExpression )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3206:1: ruleAExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleAExpression_in_rule__PrimaryExpression__Group_0__1__Impl6414);
            ruleAExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3217:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3221:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3222:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__26443);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3228:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3232:1: ( ( ')' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3233:1: ( ')' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3233:1: ( ')' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3234:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__PrimaryExpression__Group_0__2__Impl6471); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__NUMBER__Group__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3253:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3257:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3258:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__0__Impl_in_rule__NUMBER__Group__06508);
            rule__NUMBER__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NUMBER__Group__1_in_rule__NUMBER__Group__06511);
            rule__NUMBER__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NUMBER__Group__0"


    // $ANTLR start "rule__NUMBER__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3265:1: rule__NUMBER__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3269:1: ( ( RULE_INT ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3270:1: ( RULE_INT )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3270:1: ( RULE_INT )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3271:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Group__0__Impl6538); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group__0__Impl"


    // $ANTLR start "rule__NUMBER__Group__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3282:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3286:1: ( rule__NUMBER__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3287:2: rule__NUMBER__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__1__Impl_in_rule__NUMBER__Group__16567);
            rule__NUMBER__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NUMBER__Group__1"


    // $ANTLR start "rule__NUMBER__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3293:1: rule__NUMBER__Group__1__Impl : ( ( rule__NUMBER__Group_1__0 )? ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3297:1: ( ( ( rule__NUMBER__Group_1__0 )? ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3298:1: ( ( rule__NUMBER__Group_1__0 )? )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3298:1: ( ( rule__NUMBER__Group_1__0 )? )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3299:1: ( rule__NUMBER__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getGroup_1()); 
            }
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3300:1: ( rule__NUMBER__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3300:2: rule__NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NUMBER__Group_1__0_in_rule__NUMBER__Group__1__Impl6594);
                    rule__NUMBER__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3314:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3318:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3319:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_1__0__Impl_in_rule__NUMBER__Group_1__06629);
            rule__NUMBER__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NUMBER__Group_1__1_in_rule__NUMBER__Group_1__06632);
            rule__NUMBER__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NUMBER__Group_1__0"


    // $ANTLR start "rule__NUMBER__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3326:1: rule__NUMBER__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3330:1: ( ( '.' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3331:1: ( '.' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3331:1: ( '.' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3332:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__NUMBER__Group_1__0__Impl6660); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group_1__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3345:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3349:1: ( rule__NUMBER__Group_1__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3350:2: rule__NUMBER__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_1__1__Impl_in_rule__NUMBER__Group_1__16691);
            rule__NUMBER__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NUMBER__Group_1__1"


    // $ANTLR start "rule__NUMBER__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3356:1: rule__NUMBER__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3360:1: ( ( RULE_INT ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3361:1: ( RULE_INT )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3361:1: ( RULE_INT )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3362:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Group_1__1__Impl6718); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__NUMBER__Group_1__1__Impl"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3377:1: rule__VARIABLE_VALUE__Group_1__0 : rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1 ;
    public final void rule__VARIABLE_VALUE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3381:1: ( rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3382:2: rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__0__Impl_in_rule__VARIABLE_VALUE__Group_1__06751);
            rule__VARIABLE_VALUE__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__1_in_rule__VARIABLE_VALUE__Group_1__06754);
            rule__VARIABLE_VALUE__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__0"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3389:1: rule__VARIABLE_VALUE__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__VARIABLE_VALUE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3393:1: ( ( RULE_ID ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3394:1: ( RULE_ID )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3394:1: ( RULE_ID )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3395:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__0__Impl6781); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__0__Impl"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3406:1: rule__VARIABLE_VALUE__Group_1__1 : rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2 ;
    public final void rule__VARIABLE_VALUE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3410:1: ( rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2 )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3411:2: rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__1__Impl_in_rule__VARIABLE_VALUE__Group_1__16810);
            rule__VARIABLE_VALUE__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__2_in_rule__VARIABLE_VALUE__Group_1__16813);
            rule__VARIABLE_VALUE__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__1"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3418:1: rule__VARIABLE_VALUE__Group_1__1__Impl : ( '.' ) ;
    public final void rule__VARIABLE_VALUE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3422:1: ( ( '.' ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3423:1: ( '.' )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3423:1: ( '.' )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3424:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__VARIABLE_VALUE__Group_1__1__Impl6841); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__1__Impl"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3437:1: rule__VARIABLE_VALUE__Group_1__2 : rule__VARIABLE_VALUE__Group_1__2__Impl ;
    public final void rule__VARIABLE_VALUE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3441:1: ( rule__VARIABLE_VALUE__Group_1__2__Impl )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3442:2: rule__VARIABLE_VALUE__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__2__Impl_in_rule__VARIABLE_VALUE__Group_1__26872);
            rule__VARIABLE_VALUE__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__2"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3448:1: rule__VARIABLE_VALUE__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__VARIABLE_VALUE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3452:1: ( ( RULE_ID ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3453:1: ( RULE_ID )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3453:1: ( RULE_ID )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3454:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__2__Impl6899); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 
            }

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
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__2__Impl"


    // $ANTLR start "rule__Equivalent__RightAssignment_1_2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3472:1: rule__Equivalent__RightAssignment_1_2 : ( ruleEquivalent ) ;
    public final void rule__Equivalent__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3476:1: ( ( ruleEquivalent ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3477:1: ( ruleEquivalent )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3477:1: ( ruleEquivalent )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3478:1: ruleEquivalent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleEquivalent_in_rule__Equivalent__RightAssignment_1_26939);
            ruleEquivalent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Equivalent__RightAssignment_1_2"


    // $ANTLR start "rule__Implication__RightAssignment_1_2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3487:1: rule__Implication__RightAssignment_1_2 : ( ruleImplication ) ;
    public final void rule__Implication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3491:1: ( ( ruleImplication ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3492:1: ( ruleImplication )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3492:1: ( ruleImplication )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3493:1: ruleImplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_rule__Implication__RightAssignment_1_26970);
            ruleImplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Implication__RightAssignment_1_2"


    // $ANTLR start "rule__Disjunction__RightAssignment_1_1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3502:1: rule__Disjunction__RightAssignment_1_1 : ( ruleDisjunction ) ;
    public final void rule__Disjunction__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3506:1: ( ( ruleDisjunction ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3507:1: ( ruleDisjunction )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3507:1: ( ruleDisjunction )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3508:1: ruleDisjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_rule__Disjunction__RightAssignment_1_17001);
            ruleDisjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Disjunction__RightAssignment_1_1"


    // $ANTLR start "rule__Conjunction__RightAssignment_1_2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3517:1: rule__Conjunction__RightAssignment_1_2 : ( ruleConjunction ) ;
    public final void rule__Conjunction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3521:1: ( ( ruleConjunction ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3522:1: ( ruleConjunction )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3522:1: ( ruleConjunction )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3523:1: ruleConjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_rule__Conjunction__RightAssignment_1_27032);
            ruleConjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__Conjunction__RightAssignment_1_2"


    // $ANTLR start "rule__Negated__NotAssignment_1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3532:1: rule__Negated__NotAssignment_1 : ( ruleCExpression ) ;
    public final void rule__Negated__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3536:1: ( ( ruleCExpression ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3537:1: ( ruleCExpression )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3537:1: ( ruleCExpression )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3538:1: ruleCExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCExpression_in_rule__Negated__NotAssignment_17063);
            ruleCExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Negated__NotAssignment_1"


    // $ANTLR start "rule__Compare__RightAssignment_2"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3547:1: rule__Compare__RightAssignment_2 : ( ruleSomeValue ) ;
    public final void rule__Compare__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3551:1: ( ( ruleSomeValue ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3552:1: ( ruleSomeValue )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3552:1: ( ruleSomeValue )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3553:1: ruleSomeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSomeValue_in_rule__Compare__RightAssignment_27094);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Compare__RightAssignment_2"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3562:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3566:1: ( ( ruleMultiplication ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3567:1: ( ruleMultiplication )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3567:1: ( ruleMultiplication )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3568:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_17125);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3577:1: rule__Multiplication__RightAssignment_1_1 : ( rulePower ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3581:1: ( ( rulePower ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3582:1: ( rulePower )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3582:1: ( rulePower )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3583:1: rulePower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_17156);
            rulePower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__Power__RightAssignment_1_1"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3592:1: rule__Power__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Power__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3596:1: ( ( rulePrimaryExpression ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3597:1: ( rulePrimaryExpression )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3597:1: ( rulePrimaryExpression )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3598:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Power__RightAssignment_1_17187);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Power__RightAssignment_1_1"


    // $ANTLR start "rule__NumberValue__NumValueAssignment"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3607:1: rule__NumberValue__NumValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberValue__NumValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3611:1: ( ( ruleNUMBER ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3612:1: ( ruleNUMBER )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3612:1: ( ruleNUMBER )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3613:1: ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_rule__NumberValue__NumValueAssignment7218);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__NumberValue__NumValueAssignment"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3622:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3626:1: ( ( RULE_BOOLEAN ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3627:1: ( RULE_BOOLEAN )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3627:1: ( RULE_BOOLEAN )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3628:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7249); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__StrValueAssignment"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3637:1: rule__StringValue__StrValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__StrValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3641:1: ( ( RULE_STRING ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3642:1: ( RULE_STRING )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3642:1: ( RULE_STRING )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3643:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__StrValueAssignment7280); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0()); 
            }

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
    // $ANTLR end "rule__StringValue__StrValueAssignment"


    // $ANTLR start "rule__Variable__VarNameAssignment"
    // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3652:1: rule__Variable__VarNameAssignment : ( ruleVARIABLE_VALUE ) ;
    public final void rule__Variable__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3656:1: ( ( ruleVARIABLE_VALUE ) )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3657:1: ( ruleVARIABLE_VALUE )
            {
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3657:1: ( ruleVARIABLE_VALUE )
            // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:3658:1: ruleVARIABLE_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_rule__Variable__VarNameAssignment7311);
            ruleVARIABLE_VALUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Variable__VarNameAssignment"

    // $ANTLR start synpred3_InternalExpressions
    public final void synpred3_InternalExpressions_fragment() throws RecognitionException {   
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( ( ( rule__CExpression__Group_0__0 ) ) )
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( ( rule__CExpression__Group_0__0 ) )
        {
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:698:1: ( ( rule__CExpression__Group_0__0 ) )
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:699:1: ( rule__CExpression__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCExpressionAccess().getGroup_0()); 
        }
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:700:1: ( rule__CExpression__Group_0__0 )
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:700:2: rule__CExpression__Group_0__0
        {
        pushFollow(FOLLOW_rule__CExpression__Group_0__0_in_synpred3_InternalExpressions1435);
        rule__CExpression__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalExpressions

    // $ANTLR start synpred4_InternalExpressions
    public final void synpred4_InternalExpressions_fragment() throws RecognitionException {   
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:704:6: ( ( ruleCompare ) )
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:704:6: ( ruleCompare )
        {
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:704:6: ( ruleCompare )
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:705:1: ruleCompare
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleCompare_in_synpred4_InternalExpressions1453);
        ruleCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalExpressions

    // $ANTLR start synpred5_InternalExpressions
    public final void synpred5_InternalExpressions_fragment() throws RecognitionException {   
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:710:6: ( ( ruleBooleanValue ) )
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:710:6: ( ruleBooleanValue )
        {
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:710:6: ( ruleBooleanValue )
        // ../org.storydriven.storydiagrams.expressions.common.ui/src-gen/org/storydriven/modeling/expressions/common/ui/contentassist/antlr/internal/InternalExpressions.g:711:1: ruleBooleanValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_ruleBooleanValue_in_synpred5_InternalExpressions1470);
        ruleBooleanValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalExpressions

    // Delegated rules

    public final boolean synpred5_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleLExpression_in_entryRuleLExpression67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpression74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_ruleLExpression100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_entryRuleEquivalent126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquivalent133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__0_in_ruleEquivalent159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0_in_ruleImplication219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Alternatives_in_ruleNegation399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegated_in_entryRuleNegated426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegated433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__Group__0_in_ruleNegated459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_entryRuleCExpression486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCExpression493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Alternatives_in_ruleCExpression519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__0_in_ruleCompare579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeValue_in_entryRuleSomeValue606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeValue613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SomeValue__Alternatives_in_ruleSomeValue639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_entryRuleAExpression666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAExpression673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAExpression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0_in_rulePower878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberValue__NumValueAssignment_in_ruleNumberValue998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__0_in_ruleNUMBER1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__StrValueAssignment_in_ruleStringValue1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__VarNameAssignment_in_ruleVariable1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_entryRuleVARIABLE_VALUE1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_VALUE1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Alternatives_in_ruleVARIABLE_VALUE1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__0_in_rule__Disjunction__Alternatives_1_01334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__0_in_rule__Disjunction__Alternatives_1_01352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__0_in_rule__Negation__Alternatives1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_rule__Negation__Alternatives1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__0_in_rule__CExpression__Alternatives1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_rule__CExpression__Alternatives1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__CExpression__Alternatives1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__CExpression__Alternatives1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__0_in_rule__Compare__Alternatives_11519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__0_in_rule__Compare__Alternatives_11537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__0_in_rule__Compare__Alternatives_11555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__0_in_rule__Compare__Alternatives_11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__0_in_rule__Compare__Alternatives_11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__0_in_rule__Compare__Alternatives_11609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__0_in_rule__Compare__Alternatives_11627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__SomeValue__Alternatives1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__SomeValue__Alternatives1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_rule__SomeValue__Alternatives1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__0_in_rule__Multiplication__Alternatives_1_01813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_rule__PrimaryExpression__Alternatives1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__PrimaryExpression__Alternatives1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Alternatives1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__0_in_rule__VARIABLE_VALUE__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__0__Impl_in_rule__Equivalent__Group__01961 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__1_in_rule__Equivalent__Group__01964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_rule__Equivalent__Group__0__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__1__Impl_in_rule__Equivalent__Group__12020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__0_in_rule__Equivalent__Group__1__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__0__Impl_in_rule__Equivalent__Group_1__02082 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__1_in_rule__Equivalent__Group_1__02085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__1__Impl_in_rule__Equivalent__Group_1__12143 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__2_in_rule__Equivalent__Group_1__12146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Equivalent__Group_1__1__Impl2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__2__Impl_in_rule__Equivalent__Group_1__22205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__RightAssignment_1_2_in_rule__Equivalent__Group_1__2__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__02268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__02271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_rule__Implication__Group__0__Impl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__12327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__0_in_rule__Implication__Group__1__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__0__Impl_in_rule__Implication__Group_1__02389 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__1_in_rule__Implication__Group_1__02392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__1__Impl_in_rule__Implication__Group_1__12450 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__2_in_rule__Implication__Group_1__12453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Implication__Group_1__1__Impl2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__2__Impl_in_rule__Implication__Group_1__22512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__RightAssignment_1_2_in_rule__Implication__Group_1__2__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__02575 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__02578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Disjunction__Group__0__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__0_in_rule__Disjunction__Group__1__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__0__Impl_in_rule__Disjunction__Group_1__02696 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__1_in_rule__Disjunction__Group_1__02699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Alternatives_1_0_in_rule__Disjunction__Group_1__0__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__1__Impl_in_rule__Disjunction__Group_1__12756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__RightAssignment_1_1_in_rule__Disjunction__Group_1__1__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__0__Impl_in_rule__Disjunction__Group_1_0_0__02817 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__1_in_rule__Disjunction__Group_1_0_0__02820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__1__Impl_in_rule__Disjunction__Group_1_0_0__12878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Disjunction__Group_1_0_0__1__Impl2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__0__Impl_in_rule__Disjunction__Group_1_0_1__02941 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__1_in_rule__Disjunction__Group_1_0_1__02944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__1__Impl_in_rule__Disjunction__Group_1_0_1__13002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Disjunction__Group_1_0_1__1__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__03065 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__03068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__Conjunction__Group__0__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__13124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__03186 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__03189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__13247 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__13250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Conjunction__Group_1__1__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__23309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__0__Impl_in_rule__Negation__Group_0__03372 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__1_in_rule__Negation__Group_0__03375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Negation__Group_0__0__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__1__Impl_in_rule__Negation__Group_0__13434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegated_in_rule__Negation__Group_0__1__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__Group__0__Impl_in_rule__Negated__Group__03494 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Negated__Group__1_in_rule__Negated__Group__03497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__Group__1__Impl_in_rule__Negated__Group__13555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__NotAssignment_1_in_rule__Negated__Group__1__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__0__Impl_in_rule__CExpression__Group_0__03616 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__1_in_rule__CExpression__Group_0__03619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CExpression__Group_0__0__Impl3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__1__Impl_in_rule__CExpression__Group_0__13678 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__2_in_rule__CExpression__Group_0__13681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpression_in_rule__CExpression__Group_0__1__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__2__Impl_in_rule__CExpression__Group_0__23737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CExpression__Group_0__2__Impl3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__0__Impl_in_rule__Compare__Group__03802 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__Compare__Group__1_in_rule__Compare__Group__03805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeValue_in_rule__Compare__Group__0__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__1__Impl_in_rule__Compare__Group__13861 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__Compare__Group__2_in_rule__Compare__Group__13864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Alternatives_1_in_rule__Compare__Group__1__Impl3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__2__Impl_in_rule__Compare__Group__23921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__RightAssignment_2_in_rule__Compare__Group__2__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__0__Impl_in_rule__Compare__Group_1_0__03984 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__1_in_rule__Compare__Group_1_0__03987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__1__Impl_in_rule__Compare__Group_1_0__14045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Compare__Group_1_0__1__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__0__Impl_in_rule__Compare__Group_1_1__04108 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__1_in_rule__Compare__Group_1_1__04111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__1__Impl_in_rule__Compare__Group_1_1__14169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Compare__Group_1_1__1__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__0__Impl_in_rule__Compare__Group_1_2__04232 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__1_in_rule__Compare__Group_1_2__04235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__1__Impl_in_rule__Compare__Group_1_2__14293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Compare__Group_1_2__1__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__0__Impl_in_rule__Compare__Group_1_3__04356 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__1_in_rule__Compare__Group_1_3__04359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__1__Impl_in_rule__Compare__Group_1_3__14417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Compare__Group_1_3__1__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__0__Impl_in_rule__Compare__Group_1_4__04480 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__1_in_rule__Compare__Group_1_4__04483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__1__Impl_in_rule__Compare__Group_1_4__14541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Compare__Group_1_4__1__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__0__Impl_in_rule__Compare__Group_1_5__04604 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__1_in_rule__Compare__Group_1_5__04607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__1__Impl_in_rule__Compare__Group_1_5__14665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Compare__Group_1_5__1__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__0__Impl_in_rule__Compare__Group_1_6__04728 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__1_in_rule__Compare__Group_1_6__04731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__1__Impl_in_rule__Compare__Group_1_6__14789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Compare__Group_1_6__1__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04852 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__14911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl4938 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__04973 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__04976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__15033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__05094 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__05097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__15155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Addition__Group_1_0_0__1__Impl5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__05218 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__05221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Addition__Group_1_0_1__1__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05342 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5428 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05463 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__05584 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__05587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__15645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Multiplication__Group_1_0_0__1__Impl5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__05708 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__05711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__15769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Multiplication__Group_1_0_1__1__Impl5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__0__Impl_in_rule__Multiplication__Group_1_0_2__05832 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__1_in_rule__Multiplication__Group_1_0_2__05835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__1__Impl_in_rule__Multiplication__Group_1_0_2__15893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Multiplication__Group_1_0_2__1__Impl5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__05956 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Power__Group__1_in_rule__Power__Group__05959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Power__Group__0__Impl5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__16015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl6042 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__06077 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__06080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__16137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__06198 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__06201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__16259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Power__Group_1_0__1__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__06322 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__06325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimaryExpression__Group_0__0__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__16384 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__16387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_rule__PrimaryExpression__Group_0__1__Impl6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__26443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrimaryExpression__Group_0__2__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__0__Impl_in_rule__NUMBER__Group__06508 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__1_in_rule__NUMBER__Group__06511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Group__0__Impl6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__1__Impl_in_rule__NUMBER__Group__16567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__0_in_rule__NUMBER__Group__1__Impl6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__0__Impl_in_rule__NUMBER__Group_1__06629 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__1_in_rule__NUMBER__Group_1__06632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NUMBER__Group_1__0__Impl6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__1__Impl_in_rule__NUMBER__Group_1__16691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Group_1__1__Impl6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__0__Impl_in_rule__VARIABLE_VALUE__Group_1__06751 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__1_in_rule__VARIABLE_VALUE__Group_1__06754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__0__Impl6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__1__Impl_in_rule__VARIABLE_VALUE__Group_1__16810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__2_in_rule__VARIABLE_VALUE__Group_1__16813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VARIABLE_VALUE__Group_1__1__Impl6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__2__Impl_in_rule__VARIABLE_VALUE__Group_1__26872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__2__Impl6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_rule__Equivalent__RightAssignment_1_26939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_rule__Implication__RightAssignment_1_26970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_rule__Disjunction__RightAssignment_1_17001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Conjunction__RightAssignment_1_27032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_rule__Negated__NotAssignment_17063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeValue_in_rule__Compare__RightAssignment_27094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_17125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_17156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Power__RightAssignment_1_17187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__NumberValue__NumValueAssignment7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__StrValueAssignment7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_rule__Variable__VarNameAssignment7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__0_in_synpred3_InternalExpressions1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_synpred4_InternalExpressions1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_synpred5_InternalExpressions1470 = new BitSet(new long[]{0x0000000000000002L});

}