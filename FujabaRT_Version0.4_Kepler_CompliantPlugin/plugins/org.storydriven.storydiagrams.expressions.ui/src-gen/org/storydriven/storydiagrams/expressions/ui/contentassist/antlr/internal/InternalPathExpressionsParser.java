package org.storydriven.storydiagrams.expressions.ui.contentassist.antlr.internal; 

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.storydriven.storydiagrams.expressions.services.PathExpressionsGrammarAccess;

@SuppressWarnings("all")
public class InternalPathExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NO_REPEAT'", "'+'", "'*'", "'-->'", "'<>-->'", "'--><>'", "'('", "')'", "'|'", "'.'", "'['", "']'", "','", "'!'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__13=13;
    public static final int RULE_STRING=6;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int T__22=22;
    public static final int RULE_WS=9;
    public static final int T__17=17;
    public static final int EOF=-1;
    public static final int RULE_INT=5;
    public static final int T__16=16;
    public static final int T__24=24;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__18=18;
    public static final int T__15=15;

    // delegates
    // delegators


        public InternalPathExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPathExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPathExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g"; }


     
     	private PathExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PathExpressionsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulePathExpression"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:60:1: entryRulePathExpression : rulePathExpression EOF ;
    public final void entryRulePathExpression() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:61:1: ( rulePathExpression EOF )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:62:1: rulePathExpression EOF
            {
             before(grammarAccess.getPathExpressionRule()); 
            pushFollow(FOLLOW_rulePathExpression_in_entryRulePathExpression61);
            rulePathExpression();

            state._fsp--;

             after(grammarAccess.getPathExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpression68); 

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
    // $ANTLR end "entryRulePathExpression"


    // $ANTLR start "rulePathExpression"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:69:1: rulePathExpression : ( ( rule__PathExpression__Alternatives ) ) ;
    public final void rulePathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:73:2: ( ( ( rule__PathExpression__Alternatives ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:74:1: ( ( rule__PathExpression__Alternatives ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:74:1: ( ( rule__PathExpression__Alternatives ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:75:1: ( rule__PathExpression__Alternatives )
            {
             before(grammarAccess.getPathExpressionAccess().getAlternatives()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:76:1: ( rule__PathExpression__Alternatives )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:76:2: rule__PathExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PathExpression__Alternatives_in_rulePathExpression94);
            rule__PathExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePathExpression"


    // $ANTLR start "entryRulePath"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:88:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:89:1: ( rulePath EOF )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:90:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath121);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath128); 

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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:97:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:101:2: ( ( ( rule__Path__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:102:1: ( ( rule__Path__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:102:1: ( ( rule__Path__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:103:1: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:104:1: ( rule__Path__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:104:2: rule__Path__Group__0
            {
            pushFollow(FOLLOW_rule__Path__Group__0_in_rulePath154);
            rule__Path__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getGroup()); 

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
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRulePathSegment"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:116:1: entryRulePathSegment : rulePathSegment EOF ;
    public final void entryRulePathSegment() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:117:1: ( rulePathSegment EOF )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:118:1: rulePathSegment EOF
            {
             before(grammarAccess.getPathSegmentRule()); 
            pushFollow(FOLLOW_rulePathSegment_in_entryRulePathSegment181);
            rulePathSegment();

            state._fsp--;

             after(grammarAccess.getPathSegmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathSegment188); 

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
    // $ANTLR end "entryRulePathSegment"


    // $ANTLR start "rulePathSegment"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:125:1: rulePathSegment : ( ( rule__PathSegment__Group__0 ) ) ;
    public final void rulePathSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:129:2: ( ( ( rule__PathSegment__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:130:1: ( ( rule__PathSegment__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:130:1: ( ( rule__PathSegment__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:131:1: ( rule__PathSegment__Group__0 )
            {
             before(grammarAccess.getPathSegmentAccess().getGroup()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:132:1: ( rule__PathSegment__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:132:2: rule__PathSegment__Group__0
            {
            pushFollow(FOLLOW_rule__PathSegment__Group__0_in_rulePathSegment214);
            rule__PathSegment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathSegmentAccess().getGroup()); 

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
    // $ANTLR end "rulePathSegment"


    // $ANTLR start "entryRulePathSegmentDescription"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:144:1: entryRulePathSegmentDescription : rulePathSegmentDescription EOF ;
    public final void entryRulePathSegmentDescription() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:145:1: ( rulePathSegmentDescription EOF )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:146:1: rulePathSegmentDescription EOF
            {
             before(grammarAccess.getPathSegmentDescriptionRule()); 
            pushFollow(FOLLOW_rulePathSegmentDescription_in_entryRulePathSegmentDescription241);
            rulePathSegmentDescription();

            state._fsp--;

             after(grammarAccess.getPathSegmentDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathSegmentDescription248); 

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
    // $ANTLR end "entryRulePathSegmentDescription"


    // $ANTLR start "rulePathSegmentDescription"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:153:1: rulePathSegmentDescription : ( ( rule__PathSegmentDescription__Group__0 ) ) ;
    public final void rulePathSegmentDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:157:2: ( ( ( rule__PathSegmentDescription__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:158:1: ( ( rule__PathSegmentDescription__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:158:1: ( ( rule__PathSegmentDescription__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:159:1: ( rule__PathSegmentDescription__Group__0 )
            {
             before(grammarAccess.getPathSegmentDescriptionAccess().getGroup()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:160:1: ( rule__PathSegmentDescription__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:160:2: rule__PathSegmentDescription__Group__0
            {
            pushFollow(FOLLOW_rule__PathSegmentDescription__Group__0_in_rulePathSegmentDescription274);
            rule__PathSegmentDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathSegmentDescriptionAccess().getGroup()); 

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
    // $ANTLR end "rulePathSegmentDescription"


    // $ANTLR start "entryRuleRestrictionList"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:172:1: entryRuleRestrictionList : ruleRestrictionList EOF ;
    public final void entryRuleRestrictionList() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:173:1: ( ruleRestrictionList EOF )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:174:1: ruleRestrictionList EOF
            {
             before(grammarAccess.getRestrictionListRule()); 
            pushFollow(FOLLOW_ruleRestrictionList_in_entryRuleRestrictionList301);
            ruleRestrictionList();

            state._fsp--;

             after(grammarAccess.getRestrictionListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionList308); 

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
    // $ANTLR end "entryRuleRestrictionList"


    // $ANTLR start "ruleRestrictionList"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:181:1: ruleRestrictionList : ( ( rule__RestrictionList__Group__0 ) ) ;
    public final void ruleRestrictionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:185:2: ( ( ( rule__RestrictionList__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:186:1: ( ( rule__RestrictionList__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:186:1: ( ( rule__RestrictionList__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:187:1: ( rule__RestrictionList__Group__0 )
            {
             before(grammarAccess.getRestrictionListAccess().getGroup()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:188:1: ( rule__RestrictionList__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:188:2: rule__RestrictionList__Group__0
            {
            pushFollow(FOLLOW_rule__RestrictionList__Group__0_in_ruleRestrictionList334);
            rule__RestrictionList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionListAccess().getGroup()); 

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
    // $ANTLR end "ruleRestrictionList"


    // $ANTLR start "entryRuleImplicitPathDescription"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:200:1: entryRuleImplicitPathDescription : ruleImplicitPathDescription EOF ;
    public final void entryRuleImplicitPathDescription() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:201:1: ( ruleImplicitPathDescription EOF )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:202:1: ruleImplicitPathDescription EOF
            {
             before(grammarAccess.getImplicitPathDescriptionRule()); 
            pushFollow(FOLLOW_ruleImplicitPathDescription_in_entryRuleImplicitPathDescription361);
            ruleImplicitPathDescription();

            state._fsp--;

             after(grammarAccess.getImplicitPathDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitPathDescription368); 

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
    // $ANTLR end "entryRuleImplicitPathDescription"


    // $ANTLR start "ruleImplicitPathDescription"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:209:1: ruleImplicitPathDescription : ( ( rule__ImplicitPathDescription__KindAssignment ) ) ;
    public final void ruleImplicitPathDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:213:2: ( ( ( rule__ImplicitPathDescription__KindAssignment ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:214:1: ( ( rule__ImplicitPathDescription__KindAssignment ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:214:1: ( ( rule__ImplicitPathDescription__KindAssignment ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:215:1: ( rule__ImplicitPathDescription__KindAssignment )
            {
             before(grammarAccess.getImplicitPathDescriptionAccess().getKindAssignment()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:216:1: ( rule__ImplicitPathDescription__KindAssignment )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:216:2: rule__ImplicitPathDescription__KindAssignment
            {
            pushFollow(FOLLOW_rule__ImplicitPathDescription__KindAssignment_in_ruleImplicitPathDescription394);
            rule__ImplicitPathDescription__KindAssignment();

            state._fsp--;


            }

             after(grammarAccess.getImplicitPathDescriptionAccess().getKindAssignment()); 

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
    // $ANTLR end "ruleImplicitPathDescription"


    // $ANTLR start "entryRuleExplicitPathDescription"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:228:1: entryRuleExplicitPathDescription : ruleExplicitPathDescription EOF ;
    public final void entryRuleExplicitPathDescription() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:229:1: ( ruleExplicitPathDescription EOF )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:230:1: ruleExplicitPathDescription EOF
            {
             before(grammarAccess.getExplicitPathDescriptionRule()); 
            pushFollow(FOLLOW_ruleExplicitPathDescription_in_entryRuleExplicitPathDescription421);
            ruleExplicitPathDescription();

            state._fsp--;

             after(grammarAccess.getExplicitPathDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitPathDescription428); 

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
    // $ANTLR end "entryRuleExplicitPathDescription"


    // $ANTLR start "ruleExplicitPathDescription"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:237:1: ruleExplicitPathDescription : ( ( rule__ExplicitPathDescription__AssociationNameAssignment ) ) ;
    public final void ruleExplicitPathDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:241:2: ( ( ( rule__ExplicitPathDescription__AssociationNameAssignment ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:242:1: ( ( rule__ExplicitPathDescription__AssociationNameAssignment ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:242:1: ( ( rule__ExplicitPathDescription__AssociationNameAssignment ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:243:1: ( rule__ExplicitPathDescription__AssociationNameAssignment )
            {
             before(grammarAccess.getExplicitPathDescriptionAccess().getAssociationNameAssignment()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:244:1: ( rule__ExplicitPathDescription__AssociationNameAssignment )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:244:2: rule__ExplicitPathDescription__AssociationNameAssignment
            {
            pushFollow(FOLLOW_rule__ExplicitPathDescription__AssociationNameAssignment_in_ruleExplicitPathDescription454);
            rule__ExplicitPathDescription__AssociationNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExplicitPathDescriptionAccess().getAssociationNameAssignment()); 

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
    // $ANTLR end "ruleExplicitPathDescription"


    // $ANTLR start "entryRuleTypeRestriction"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:256:1: entryRuleTypeRestriction : ruleTypeRestriction EOF ;
    public final void entryRuleTypeRestriction() throws RecognitionException {
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:257:1: ( ruleTypeRestriction EOF )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:258:1: ruleTypeRestriction EOF
            {
             before(grammarAccess.getTypeRestrictionRule()); 
            pushFollow(FOLLOW_ruleTypeRestriction_in_entryRuleTypeRestriction481);
            ruleTypeRestriction();

            state._fsp--;

             after(grammarAccess.getTypeRestrictionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRestriction488); 

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
    // $ANTLR end "entryRuleTypeRestriction"


    // $ANTLR start "ruleTypeRestriction"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:265:1: ruleTypeRestriction : ( ( rule__TypeRestriction__Group__0 ) ) ;
    public final void ruleTypeRestriction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:269:2: ( ( ( rule__TypeRestriction__Group__0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:270:1: ( ( rule__TypeRestriction__Group__0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:270:1: ( ( rule__TypeRestriction__Group__0 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:271:1: ( rule__TypeRestriction__Group__0 )
            {
             before(grammarAccess.getTypeRestrictionAccess().getGroup()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:272:1: ( rule__TypeRestriction__Group__0 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:272:2: rule__TypeRestriction__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRestriction__Group__0_in_ruleTypeRestriction514);
            rule__TypeRestriction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRestrictionAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeRestriction"


    // $ANTLR start "ruleRepeatOperator"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:285:1: ruleRepeatOperator : ( ( rule__RepeatOperator__Alternatives ) ) ;
    public final void ruleRepeatOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:289:1: ( ( ( rule__RepeatOperator__Alternatives ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:290:1: ( ( rule__RepeatOperator__Alternatives ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:290:1: ( ( rule__RepeatOperator__Alternatives ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:291:1: ( rule__RepeatOperator__Alternatives )
            {
             before(grammarAccess.getRepeatOperatorAccess().getAlternatives()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:292:1: ( rule__RepeatOperator__Alternatives )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:292:2: rule__RepeatOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__RepeatOperator__Alternatives_in_ruleRepeatOperator551);
            rule__RepeatOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRepeatOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRepeatOperator"


    // $ANTLR start "ruleImplicitPathKind"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:304:1: ruleImplicitPathKind : ( ( rule__ImplicitPathKind__Alternatives ) ) ;
    public final void ruleImplicitPathKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:308:1: ( ( ( rule__ImplicitPathKind__Alternatives ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:309:1: ( ( rule__ImplicitPathKind__Alternatives ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:309:1: ( ( rule__ImplicitPathKind__Alternatives ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:310:1: ( rule__ImplicitPathKind__Alternatives )
            {
             before(grammarAccess.getImplicitPathKindAccess().getAlternatives()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:311:1: ( rule__ImplicitPathKind__Alternatives )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:311:2: rule__ImplicitPathKind__Alternatives
            {
            pushFollow(FOLLOW_rule__ImplicitPathKind__Alternatives_in_ruleImplicitPathKind587);
            rule__ImplicitPathKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImplicitPathKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleImplicitPathKind"


    // $ANTLR start "rule__PathExpression__Alternatives"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:322:1: rule__PathExpression__Alternatives : ( ( ( rule__PathExpression__PathAlternativesAssignment_0 ) ) | ( ( rule__PathExpression__Group_1__0 ) ) );
    public final void rule__PathExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:326:1: ( ( ( rule__PathExpression__PathAlternativesAssignment_0 ) ) | ( ( rule__PathExpression__Group_1__0 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:327:1: ( ( rule__PathExpression__PathAlternativesAssignment_0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:327:1: ( ( rule__PathExpression__PathAlternativesAssignment_0 ) )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:328:1: ( rule__PathExpression__PathAlternativesAssignment_0 )
                    {
                     before(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_0()); 
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:329:1: ( rule__PathExpression__PathAlternativesAssignment_0 )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:329:2: rule__PathExpression__PathAlternativesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PathExpression__PathAlternativesAssignment_0_in_rule__PathExpression__Alternatives622);
                    rule__PathExpression__PathAlternativesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:333:6: ( ( rule__PathExpression__Group_1__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:333:6: ( ( rule__PathExpression__Group_1__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:334:1: ( rule__PathExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPathExpressionAccess().getGroup_1()); 
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:335:1: ( rule__PathExpression__Group_1__0 )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:335:2: rule__PathExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PathExpression__Group_1__0_in_rule__PathExpression__Alternatives640);
                    rule__PathExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PathExpression__Alternatives"


    // $ANTLR start "rule__PathSegment__Alternatives_0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:344:1: rule__PathSegment__Alternatives_0 : ( ( ( rule__PathSegment__AlternativesAssignment_0_0 ) ) | ( ( rule__PathSegment__Group_0_1__0 ) ) );
    public final void rule__PathSegment__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:348:1: ( ( ( rule__PathSegment__AlternativesAssignment_0_0 ) ) | ( ( rule__PathSegment__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=14 && LA2_0<=16)) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:349:1: ( ( rule__PathSegment__AlternativesAssignment_0_0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:349:1: ( ( rule__PathSegment__AlternativesAssignment_0_0 ) )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:350:1: ( rule__PathSegment__AlternativesAssignment_0_0 )
                    {
                     before(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_0()); 
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:351:1: ( rule__PathSegment__AlternativesAssignment_0_0 )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:351:2: rule__PathSegment__AlternativesAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__PathSegment__AlternativesAssignment_0_0_in_rule__PathSegment__Alternatives_0673);
                    rule__PathSegment__AlternativesAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:355:6: ( ( rule__PathSegment__Group_0_1__0 ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:355:6: ( ( rule__PathSegment__Group_0_1__0 ) )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:356:1: ( rule__PathSegment__Group_0_1__0 )
                    {
                     before(grammarAccess.getPathSegmentAccess().getGroup_0_1()); 
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:357:1: ( rule__PathSegment__Group_0_1__0 )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:357:2: rule__PathSegment__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__PathSegment__Group_0_1__0_in_rule__PathSegment__Alternatives_0691);
                    rule__PathSegment__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathSegmentAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__PathSegment__Alternatives_0"


    // $ANTLR start "rule__PathSegmentDescription__Alternatives_0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:366:1: rule__PathSegmentDescription__Alternatives_0 : ( ( ruleImplicitPathDescription ) | ( ruleExplicitPathDescription ) );
    public final void rule__PathSegmentDescription__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:370:1: ( ( ruleImplicitPathDescription ) | ( ruleExplicitPathDescription ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=14 && LA3_0<=16)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:371:1: ( ruleImplicitPathDescription )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:371:1: ( ruleImplicitPathDescription )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:372:1: ruleImplicitPathDescription
                    {
                     before(grammarAccess.getPathSegmentDescriptionAccess().getImplicitPathDescriptionParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleImplicitPathDescription_in_rule__PathSegmentDescription__Alternatives_0724);
                    ruleImplicitPathDescription();

                    state._fsp--;

                     after(grammarAccess.getPathSegmentDescriptionAccess().getImplicitPathDescriptionParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:377:6: ( ruleExplicitPathDescription )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:377:6: ( ruleExplicitPathDescription )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:378:1: ruleExplicitPathDescription
                    {
                     before(grammarAccess.getPathSegmentDescriptionAccess().getExplicitPathDescriptionParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleExplicitPathDescription_in_rule__PathSegmentDescription__Alternatives_0741);
                    ruleExplicitPathDescription();

                    state._fsp--;

                     after(grammarAccess.getPathSegmentDescriptionAccess().getExplicitPathDescriptionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__PathSegmentDescription__Alternatives_0"


    // $ANTLR start "rule__RepeatOperator__Alternatives"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:388:1: rule__RepeatOperator__Alternatives : ( ( ( 'NO_REPEAT' ) ) | ( ( '+' ) ) | ( ( '*' ) ) );
    public final void rule__RepeatOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:392:1: ( ( ( 'NO_REPEAT' ) ) | ( ( '+' ) ) | ( ( '*' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:393:1: ( ( 'NO_REPEAT' ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:393:1: ( ( 'NO_REPEAT' ) )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:394:1: ( 'NO_REPEAT' )
                    {
                     before(grammarAccess.getRepeatOperatorAccess().getNO_REPEATEnumLiteralDeclaration_0()); 
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:395:1: ( 'NO_REPEAT' )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:395:3: 'NO_REPEAT'
                    {
                    match(input,11,FOLLOW_11_in_rule__RepeatOperator__Alternatives774); 

                    }

                     after(grammarAccess.getRepeatOperatorAccess().getNO_REPEATEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:400:6: ( ( '+' ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:400:6: ( ( '+' ) )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:401:1: ( '+' )
                    {
                     before(grammarAccess.getRepeatOperatorAccess().getAT_LEAST_ONCEEnumLiteralDeclaration_1()); 
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:402:1: ( '+' )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:402:3: '+'
                    {
                    match(input,12,FOLLOW_12_in_rule__RepeatOperator__Alternatives795); 

                    }

                     after(grammarAccess.getRepeatOperatorAccess().getAT_LEAST_ONCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:407:6: ( ( '*' ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:407:6: ( ( '*' ) )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:408:1: ( '*' )
                    {
                     before(grammarAccess.getRepeatOperatorAccess().getARBITRARYEnumLiteralDeclaration_2()); 
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:409:1: ( '*' )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:409:3: '*'
                    {
                    match(input,13,FOLLOW_13_in_rule__RepeatOperator__Alternatives816); 

                    }

                     after(grammarAccess.getRepeatOperatorAccess().getARBITRARYEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__RepeatOperator__Alternatives"


    // $ANTLR start "rule__ImplicitPathKind__Alternatives"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:419:1: rule__ImplicitPathKind__Alternatives : ( ( ( '-->' ) ) | ( ( '<>-->' ) ) | ( ( '--><>' ) ) );
    public final void rule__ImplicitPathKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:423:1: ( ( ( '-->' ) ) | ( ( '<>-->' ) ) | ( ( '--><>' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:424:1: ( ( '-->' ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:424:1: ( ( '-->' ) )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:425:1: ( '-->' )
                    {
                     before(grammarAccess.getImplicitPathKindAccess().getANYEnumLiteralDeclaration_0()); 
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:426:1: ( '-->' )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:426:3: '-->'
                    {
                    match(input,14,FOLLOW_14_in_rule__ImplicitPathKind__Alternatives852); 

                    }

                     after(grammarAccess.getImplicitPathKindAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:431:6: ( ( '<>-->' ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:431:6: ( ( '<>-->' ) )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:432:1: ( '<>-->' )
                    {
                     before(grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_SOURCEEnumLiteralDeclaration_1()); 
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:433:1: ( '<>-->' )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:433:3: '<>-->'
                    {
                    match(input,15,FOLLOW_15_in_rule__ImplicitPathKind__Alternatives873); 

                    }

                     after(grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_SOURCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:438:6: ( ( '--><>' ) )
                    {
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:438:6: ( ( '--><>' ) )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:439:1: ( '--><>' )
                    {
                     before(grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_TARGETEnumLiteralDeclaration_2()); 
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:440:1: ( '--><>' )
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:440:3: '--><>'
                    {
                    match(input,16,FOLLOW_16_in_rule__ImplicitPathKind__Alternatives894); 

                    }

                     after(grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_TARGETEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ImplicitPathKind__Alternatives"


    // $ANTLR start "rule__PathExpression__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:452:1: rule__PathExpression__Group_1__0 : rule__PathExpression__Group_1__0__Impl rule__PathExpression__Group_1__1 ;
    public final void rule__PathExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:456:1: ( rule__PathExpression__Group_1__0__Impl rule__PathExpression__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:457:2: rule__PathExpression__Group_1__0__Impl rule__PathExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PathExpression__Group_1__0__Impl_in_rule__PathExpression__Group_1__0927);
            rule__PathExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpression__Group_1__1_in_rule__PathExpression__Group_1__0930);
            rule__PathExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1__0"


    // $ANTLR start "rule__PathExpression__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:464:1: rule__PathExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PathExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:468:1: ( ( '(' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:469:1: ( '(' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:469:1: ( '(' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:470:1: '('
            {
             before(grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__PathExpression__Group_1__0__Impl958); 
             after(grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__PathExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PathExpression__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:483:1: rule__PathExpression__Group_1__1 : rule__PathExpression__Group_1__1__Impl rule__PathExpression__Group_1__2 ;
    public final void rule__PathExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:487:1: ( rule__PathExpression__Group_1__1__Impl rule__PathExpression__Group_1__2 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:488:2: rule__PathExpression__Group_1__1__Impl rule__PathExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__PathExpression__Group_1__1__Impl_in_rule__PathExpression__Group_1__1989);
            rule__PathExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpression__Group_1__2_in_rule__PathExpression__Group_1__1992);
            rule__PathExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1__1"


    // $ANTLR start "rule__PathExpression__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:495:1: rule__PathExpression__Group_1__1__Impl : ( ( rule__PathExpression__PathAlternativesAssignment_1_1 ) ) ;
    public final void rule__PathExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:499:1: ( ( ( rule__PathExpression__PathAlternativesAssignment_1_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:500:1: ( ( rule__PathExpression__PathAlternativesAssignment_1_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:500:1: ( ( rule__PathExpression__PathAlternativesAssignment_1_1 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:501:1: ( rule__PathExpression__PathAlternativesAssignment_1_1 )
            {
             before(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_1_1()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:502:1: ( rule__PathExpression__PathAlternativesAssignment_1_1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:502:2: rule__PathExpression__PathAlternativesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PathExpression__PathAlternativesAssignment_1_1_in_rule__PathExpression__Group_1__1__Impl1019);
            rule__PathExpression__PathAlternativesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_1_1()); 

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
    // $ANTLR end "rule__PathExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PathExpression__Group_1__2"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:512:1: rule__PathExpression__Group_1__2 : rule__PathExpression__Group_1__2__Impl rule__PathExpression__Group_1__3 ;
    public final void rule__PathExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:516:1: ( rule__PathExpression__Group_1__2__Impl rule__PathExpression__Group_1__3 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:517:2: rule__PathExpression__Group_1__2__Impl rule__PathExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__PathExpression__Group_1__2__Impl_in_rule__PathExpression__Group_1__21049);
            rule__PathExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpression__Group_1__3_in_rule__PathExpression__Group_1__21052);
            rule__PathExpression__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1__2"


    // $ANTLR start "rule__PathExpression__Group_1__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:524:1: rule__PathExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PathExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:528:1: ( ( ')' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:529:1: ( ')' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:529:1: ( ')' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:530:1: ')'
            {
             before(grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,18,FOLLOW_18_in_rule__PathExpression__Group_1__2__Impl1080); 
             after(grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__PathExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PathExpression__Group_1__3"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:543:1: rule__PathExpression__Group_1__3 : rule__PathExpression__Group_1__3__Impl ;
    public final void rule__PathExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:547:1: ( rule__PathExpression__Group_1__3__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:548:2: rule__PathExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PathExpression__Group_1__3__Impl_in_rule__PathExpression__Group_1__31111);
            rule__PathExpression__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1__3"


    // $ANTLR start "rule__PathExpression__Group_1__3__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:554:1: rule__PathExpression__Group_1__3__Impl : ( ( ( rule__PathExpression__Group_1_3__0 ) ) ( ( rule__PathExpression__Group_1_3__0 )* ) ) ;
    public final void rule__PathExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:558:1: ( ( ( ( rule__PathExpression__Group_1_3__0 ) ) ( ( rule__PathExpression__Group_1_3__0 )* ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:559:1: ( ( ( rule__PathExpression__Group_1_3__0 ) ) ( ( rule__PathExpression__Group_1_3__0 )* ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:559:1: ( ( ( rule__PathExpression__Group_1_3__0 ) ) ( ( rule__PathExpression__Group_1_3__0 )* ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:560:1: ( ( rule__PathExpression__Group_1_3__0 ) ) ( ( rule__PathExpression__Group_1_3__0 )* )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:560:1: ( ( rule__PathExpression__Group_1_3__0 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:561:1: ( rule__PathExpression__Group_1_3__0 )
            {
             before(grammarAccess.getPathExpressionAccess().getGroup_1_3()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:562:1: ( rule__PathExpression__Group_1_3__0 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:562:2: rule__PathExpression__Group_1_3__0
            {
            pushFollow(FOLLOW_rule__PathExpression__Group_1_3__0_in_rule__PathExpression__Group_1__3__Impl1140);
            rule__PathExpression__Group_1_3__0();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getGroup_1_3()); 

            }

            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:565:1: ( ( rule__PathExpression__Group_1_3__0 )* )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:566:1: ( rule__PathExpression__Group_1_3__0 )*
            {
             before(grammarAccess.getPathExpressionAccess().getGroup_1_3()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:567:1: ( rule__PathExpression__Group_1_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:567:2: rule__PathExpression__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__PathExpression__Group_1_3__0_in_rule__PathExpression__Group_1__3__Impl1152);
            	    rule__PathExpression__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPathExpressionAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__PathExpression__Group_1__3__Impl"


    // $ANTLR start "rule__PathExpression__Group_1_3__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:586:1: rule__PathExpression__Group_1_3__0 : rule__PathExpression__Group_1_3__0__Impl rule__PathExpression__Group_1_3__1 ;
    public final void rule__PathExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:590:1: ( rule__PathExpression__Group_1_3__0__Impl rule__PathExpression__Group_1_3__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:591:2: rule__PathExpression__Group_1_3__0__Impl rule__PathExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__PathExpression__Group_1_3__0__Impl_in_rule__PathExpression__Group_1_3__01193);
            rule__PathExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpression__Group_1_3__1_in_rule__PathExpression__Group_1_3__01196);
            rule__PathExpression__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1_3__0"


    // $ANTLR start "rule__PathExpression__Group_1_3__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:598:1: rule__PathExpression__Group_1_3__0__Impl : ( '|' ) ;
    public final void rule__PathExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:602:1: ( ( '|' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:603:1: ( '|' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:603:1: ( '|' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:604:1: '|'
            {
             before(grammarAccess.getPathExpressionAccess().getVerticalLineKeyword_1_3_0()); 
            match(input,19,FOLLOW_19_in_rule__PathExpression__Group_1_3__0__Impl1224); 
             after(grammarAccess.getPathExpressionAccess().getVerticalLineKeyword_1_3_0()); 

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
    // $ANTLR end "rule__PathExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__PathExpression__Group_1_3__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:617:1: rule__PathExpression__Group_1_3__1 : rule__PathExpression__Group_1_3__1__Impl rule__PathExpression__Group_1_3__2 ;
    public final void rule__PathExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:621:1: ( rule__PathExpression__Group_1_3__1__Impl rule__PathExpression__Group_1_3__2 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:622:2: rule__PathExpression__Group_1_3__1__Impl rule__PathExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__PathExpression__Group_1_3__1__Impl_in_rule__PathExpression__Group_1_3__11255);
            rule__PathExpression__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpression__Group_1_3__2_in_rule__PathExpression__Group_1_3__11258);
            rule__PathExpression__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1_3__1"


    // $ANTLR start "rule__PathExpression__Group_1_3__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:629:1: rule__PathExpression__Group_1_3__1__Impl : ( '(' ) ;
    public final void rule__PathExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:633:1: ( ( '(' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:634:1: ( '(' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:634:1: ( '(' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:635:1: '('
            {
             before(grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_3_1()); 
            match(input,17,FOLLOW_17_in_rule__PathExpression__Group_1_3__1__Impl1286); 
             after(grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_3_1()); 

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
    // $ANTLR end "rule__PathExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__PathExpression__Group_1_3__2"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:648:1: rule__PathExpression__Group_1_3__2 : rule__PathExpression__Group_1_3__2__Impl rule__PathExpression__Group_1_3__3 ;
    public final void rule__PathExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:652:1: ( rule__PathExpression__Group_1_3__2__Impl rule__PathExpression__Group_1_3__3 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:653:2: rule__PathExpression__Group_1_3__2__Impl rule__PathExpression__Group_1_3__3
            {
            pushFollow(FOLLOW_rule__PathExpression__Group_1_3__2__Impl_in_rule__PathExpression__Group_1_3__21317);
            rule__PathExpression__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpression__Group_1_3__3_in_rule__PathExpression__Group_1_3__21320);
            rule__PathExpression__Group_1_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1_3__2"


    // $ANTLR start "rule__PathExpression__Group_1_3__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:660:1: rule__PathExpression__Group_1_3__2__Impl : ( ( rule__PathExpression__PathAlternativesAssignment_1_3_2 ) ) ;
    public final void rule__PathExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:664:1: ( ( ( rule__PathExpression__PathAlternativesAssignment_1_3_2 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:665:1: ( ( rule__PathExpression__PathAlternativesAssignment_1_3_2 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:665:1: ( ( rule__PathExpression__PathAlternativesAssignment_1_3_2 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:666:1: ( rule__PathExpression__PathAlternativesAssignment_1_3_2 )
            {
             before(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_1_3_2()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:667:1: ( rule__PathExpression__PathAlternativesAssignment_1_3_2 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:667:2: rule__PathExpression__PathAlternativesAssignment_1_3_2
            {
            pushFollow(FOLLOW_rule__PathExpression__PathAlternativesAssignment_1_3_2_in_rule__PathExpression__Group_1_3__2__Impl1347);
            rule__PathExpression__PathAlternativesAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getPathAlternativesAssignment_1_3_2()); 

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
    // $ANTLR end "rule__PathExpression__Group_1_3__2__Impl"


    // $ANTLR start "rule__PathExpression__Group_1_3__3"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:677:1: rule__PathExpression__Group_1_3__3 : rule__PathExpression__Group_1_3__3__Impl ;
    public final void rule__PathExpression__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:681:1: ( rule__PathExpression__Group_1_3__3__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:682:2: rule__PathExpression__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_rule__PathExpression__Group_1_3__3__Impl_in_rule__PathExpression__Group_1_3__31377);
            rule__PathExpression__Group_1_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group_1_3__3"


    // $ANTLR start "rule__PathExpression__Group_1_3__3__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:688:1: rule__PathExpression__Group_1_3__3__Impl : ( ')' ) ;
    public final void rule__PathExpression__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:692:1: ( ( ')' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:693:1: ( ')' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:693:1: ( ')' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:694:1: ')'
            {
             before(grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_3_3()); 
            match(input,18,FOLLOW_18_in_rule__PathExpression__Group_1_3__3__Impl1405); 
             after(grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_3_3()); 

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
    // $ANTLR end "rule__PathExpression__Group_1_3__3__Impl"


    // $ANTLR start "rule__Path__Group__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:715:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:719:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:720:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__01444);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group__1_in_rule__Path__Group__01447);
            rule__Path__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0"


    // $ANTLR start "rule__Path__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:727:1: rule__Path__Group__0__Impl : ( ( rule__Path__SegmentsAssignment_0 ) ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:731:1: ( ( ( rule__Path__SegmentsAssignment_0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:732:1: ( ( rule__Path__SegmentsAssignment_0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:732:1: ( ( rule__Path__SegmentsAssignment_0 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:733:1: ( rule__Path__SegmentsAssignment_0 )
            {
             before(grammarAccess.getPathAccess().getSegmentsAssignment_0()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:734:1: ( rule__Path__SegmentsAssignment_0 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:734:2: rule__Path__SegmentsAssignment_0
            {
            pushFollow(FOLLOW_rule__Path__SegmentsAssignment_0_in_rule__Path__Group__0__Impl1474);
            rule__Path__SegmentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getSegmentsAssignment_0()); 

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
    // $ANTLR end "rule__Path__Group__0__Impl"


    // $ANTLR start "rule__Path__Group__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:744:1: rule__Path__Group__1 : rule__Path__Group__1__Impl ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:748:1: ( rule__Path__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:749:2: rule__Path__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__11504);
            rule__Path__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1"


    // $ANTLR start "rule__Path__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:755:1: rule__Path__Group__1__Impl : ( ( rule__Path__Group_1__0 )* ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:759:1: ( ( ( rule__Path__Group_1__0 )* ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:760:1: ( ( rule__Path__Group_1__0 )* )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:760:1: ( ( rule__Path__Group_1__0 )* )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:761:1: ( rule__Path__Group_1__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_1()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:762:1: ( rule__Path__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:762:2: rule__Path__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__1__Impl1531);
            	    rule__Path__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPathAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Path__Group__1__Impl"


    // $ANTLR start "rule__Path__Group_1__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:776:1: rule__Path__Group_1__0 : rule__Path__Group_1__0__Impl rule__Path__Group_1__1 ;
    public final void rule__Path__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:780:1: ( rule__Path__Group_1__0__Impl rule__Path__Group_1__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:781:2: rule__Path__Group_1__0__Impl rule__Path__Group_1__1
            {
            pushFollow(FOLLOW_rule__Path__Group_1__0__Impl_in_rule__Path__Group_1__01566);
            rule__Path__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__01569);
            rule__Path__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__0"


    // $ANTLR start "rule__Path__Group_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:788:1: rule__Path__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Path__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:792:1: ( ( '.' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:793:1: ( '.' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:793:1: ( '.' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:794:1: '.'
            {
             before(grammarAccess.getPathAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Path__Group_1__0__Impl1597); 
             after(grammarAccess.getPathAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Path__Group_1__0__Impl"


    // $ANTLR start "rule__Path__Group_1__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:807:1: rule__Path__Group_1__1 : rule__Path__Group_1__1__Impl ;
    public final void rule__Path__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:811:1: ( rule__Path__Group_1__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:812:2: rule__Path__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group_1__1__Impl_in_rule__Path__Group_1__11628);
            rule__Path__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_1__1"


    // $ANTLR start "rule__Path__Group_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:818:1: rule__Path__Group_1__1__Impl : ( ( rule__Path__SegmentsAssignment_1_1 ) ) ;
    public final void rule__Path__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:822:1: ( ( ( rule__Path__SegmentsAssignment_1_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:823:1: ( ( rule__Path__SegmentsAssignment_1_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:823:1: ( ( rule__Path__SegmentsAssignment_1_1 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:824:1: ( rule__Path__SegmentsAssignment_1_1 )
            {
             before(grammarAccess.getPathAccess().getSegmentsAssignment_1_1()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:825:1: ( rule__Path__SegmentsAssignment_1_1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:825:2: rule__Path__SegmentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Path__SegmentsAssignment_1_1_in_rule__Path__Group_1__1__Impl1655);
            rule__Path__SegmentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getSegmentsAssignment_1_1()); 

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
    // $ANTLR end "rule__Path__Group_1__1__Impl"


    // $ANTLR start "rule__PathSegment__Group__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:839:1: rule__PathSegment__Group__0 : rule__PathSegment__Group__0__Impl rule__PathSegment__Group__1 ;
    public final void rule__PathSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:843:1: ( rule__PathSegment__Group__0__Impl rule__PathSegment__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:844:2: rule__PathSegment__Group__0__Impl rule__PathSegment__Group__1
            {
            pushFollow(FOLLOW_rule__PathSegment__Group__0__Impl_in_rule__PathSegment__Group__01689);
            rule__PathSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathSegment__Group__1_in_rule__PathSegment__Group__01692);
            rule__PathSegment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegment__Group__0"


    // $ANTLR start "rule__PathSegment__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:851:1: rule__PathSegment__Group__0__Impl : ( ( rule__PathSegment__Alternatives_0 ) ) ;
    public final void rule__PathSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:855:1: ( ( ( rule__PathSegment__Alternatives_0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:856:1: ( ( rule__PathSegment__Alternatives_0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:856:1: ( ( rule__PathSegment__Alternatives_0 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:857:1: ( rule__PathSegment__Alternatives_0 )
            {
             before(grammarAccess.getPathSegmentAccess().getAlternatives_0()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:858:1: ( rule__PathSegment__Alternatives_0 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:858:2: rule__PathSegment__Alternatives_0
            {
            pushFollow(FOLLOW_rule__PathSegment__Alternatives_0_in_rule__PathSegment__Group__0__Impl1719);
            rule__PathSegment__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPathSegmentAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__PathSegment__Group__0__Impl"


    // $ANTLR start "rule__PathSegment__Group__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:868:1: rule__PathSegment__Group__1 : rule__PathSegment__Group__1__Impl ;
    public final void rule__PathSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:872:1: ( rule__PathSegment__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:873:2: rule__PathSegment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PathSegment__Group__1__Impl_in_rule__PathSegment__Group__11749);
            rule__PathSegment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegment__Group__1"


    // $ANTLR start "rule__PathSegment__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:879:1: rule__PathSegment__Group__1__Impl : ( ( rule__PathSegment__RepeatOperatorAssignment_1 )? ) ;
    public final void rule__PathSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:883:1: ( ( ( rule__PathSegment__RepeatOperatorAssignment_1 )? ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:884:1: ( ( rule__PathSegment__RepeatOperatorAssignment_1 )? )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:884:1: ( ( rule__PathSegment__RepeatOperatorAssignment_1 )? )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:885:1: ( rule__PathSegment__RepeatOperatorAssignment_1 )?
            {
             before(grammarAccess.getPathSegmentAccess().getRepeatOperatorAssignment_1()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:886:1: ( rule__PathSegment__RepeatOperatorAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=13)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:886:2: rule__PathSegment__RepeatOperatorAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PathSegment__RepeatOperatorAssignment_1_in_rule__PathSegment__Group__1__Impl1776);
                    rule__PathSegment__RepeatOperatorAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathSegmentAccess().getRepeatOperatorAssignment_1()); 

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
    // $ANTLR end "rule__PathSegment__Group__1__Impl"


    // $ANTLR start "rule__PathSegment__Group_0_1__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:900:1: rule__PathSegment__Group_0_1__0 : rule__PathSegment__Group_0_1__0__Impl rule__PathSegment__Group_0_1__1 ;
    public final void rule__PathSegment__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:904:1: ( rule__PathSegment__Group_0_1__0__Impl rule__PathSegment__Group_0_1__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:905:2: rule__PathSegment__Group_0_1__0__Impl rule__PathSegment__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__PathSegment__Group_0_1__0__Impl_in_rule__PathSegment__Group_0_1__01811);
            rule__PathSegment__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathSegment__Group_0_1__1_in_rule__PathSegment__Group_0_1__01814);
            rule__PathSegment__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegment__Group_0_1__0"


    // $ANTLR start "rule__PathSegment__Group_0_1__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:912:1: rule__PathSegment__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__PathSegment__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:916:1: ( ( '(' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:917:1: ( '(' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:917:1: ( '(' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:918:1: '('
            {
             before(grammarAccess.getPathSegmentAccess().getLeftParenthesisKeyword_0_1_0()); 
            match(input,17,FOLLOW_17_in_rule__PathSegment__Group_0_1__0__Impl1842); 
             after(grammarAccess.getPathSegmentAccess().getLeftParenthesisKeyword_0_1_0()); 

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
    // $ANTLR end "rule__PathSegment__Group_0_1__0__Impl"


    // $ANTLR start "rule__PathSegment__Group_0_1__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:931:1: rule__PathSegment__Group_0_1__1 : rule__PathSegment__Group_0_1__1__Impl rule__PathSegment__Group_0_1__2 ;
    public final void rule__PathSegment__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:935:1: ( rule__PathSegment__Group_0_1__1__Impl rule__PathSegment__Group_0_1__2 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:936:2: rule__PathSegment__Group_0_1__1__Impl rule__PathSegment__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__PathSegment__Group_0_1__1__Impl_in_rule__PathSegment__Group_0_1__11873);
            rule__PathSegment__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathSegment__Group_0_1__2_in_rule__PathSegment__Group_0_1__11876);
            rule__PathSegment__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegment__Group_0_1__1"


    // $ANTLR start "rule__PathSegment__Group_0_1__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:943:1: rule__PathSegment__Group_0_1__1__Impl : ( ( rule__PathSegment__AlternativesAssignment_0_1_1 ) ) ;
    public final void rule__PathSegment__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:947:1: ( ( ( rule__PathSegment__AlternativesAssignment_0_1_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:948:1: ( ( rule__PathSegment__AlternativesAssignment_0_1_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:948:1: ( ( rule__PathSegment__AlternativesAssignment_0_1_1 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:949:1: ( rule__PathSegment__AlternativesAssignment_0_1_1 )
            {
             before(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_1_1()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:950:1: ( rule__PathSegment__AlternativesAssignment_0_1_1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:950:2: rule__PathSegment__AlternativesAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__PathSegment__AlternativesAssignment_0_1_1_in_rule__PathSegment__Group_0_1__1__Impl1903);
            rule__PathSegment__AlternativesAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_1_1()); 

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
    // $ANTLR end "rule__PathSegment__Group_0_1__1__Impl"


    // $ANTLR start "rule__PathSegment__Group_0_1__2"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:960:1: rule__PathSegment__Group_0_1__2 : rule__PathSegment__Group_0_1__2__Impl rule__PathSegment__Group_0_1__3 ;
    public final void rule__PathSegment__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:964:1: ( rule__PathSegment__Group_0_1__2__Impl rule__PathSegment__Group_0_1__3 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:965:2: rule__PathSegment__Group_0_1__2__Impl rule__PathSegment__Group_0_1__3
            {
            pushFollow(FOLLOW_rule__PathSegment__Group_0_1__2__Impl_in_rule__PathSegment__Group_0_1__21933);
            rule__PathSegment__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathSegment__Group_0_1__3_in_rule__PathSegment__Group_0_1__21936);
            rule__PathSegment__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegment__Group_0_1__2"


    // $ANTLR start "rule__PathSegment__Group_0_1__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:972:1: rule__PathSegment__Group_0_1__2__Impl : ( ( ( rule__PathSegment__Group_0_1_2__0 ) ) ( ( rule__PathSegment__Group_0_1_2__0 )* ) ) ;
    public final void rule__PathSegment__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:976:1: ( ( ( ( rule__PathSegment__Group_0_1_2__0 ) ) ( ( rule__PathSegment__Group_0_1_2__0 )* ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:977:1: ( ( ( rule__PathSegment__Group_0_1_2__0 ) ) ( ( rule__PathSegment__Group_0_1_2__0 )* ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:977:1: ( ( ( rule__PathSegment__Group_0_1_2__0 ) ) ( ( rule__PathSegment__Group_0_1_2__0 )* ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:978:1: ( ( rule__PathSegment__Group_0_1_2__0 ) ) ( ( rule__PathSegment__Group_0_1_2__0 )* )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:978:1: ( ( rule__PathSegment__Group_0_1_2__0 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:979:1: ( rule__PathSegment__Group_0_1_2__0 )
            {
             before(grammarAccess.getPathSegmentAccess().getGroup_0_1_2()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:980:1: ( rule__PathSegment__Group_0_1_2__0 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:980:2: rule__PathSegment__Group_0_1_2__0
            {
            pushFollow(FOLLOW_rule__PathSegment__Group_0_1_2__0_in_rule__PathSegment__Group_0_1__2__Impl1965);
            rule__PathSegment__Group_0_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPathSegmentAccess().getGroup_0_1_2()); 

            }

            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:983:1: ( ( rule__PathSegment__Group_0_1_2__0 )* )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:984:1: ( rule__PathSegment__Group_0_1_2__0 )*
            {
             before(grammarAccess.getPathSegmentAccess().getGroup_0_1_2()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:985:1: ( rule__PathSegment__Group_0_1_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:985:2: rule__PathSegment__Group_0_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PathSegment__Group_0_1_2__0_in_rule__PathSegment__Group_0_1__2__Impl1977);
            	    rule__PathSegment__Group_0_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPathSegmentAccess().getGroup_0_1_2()); 

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
    // $ANTLR end "rule__PathSegment__Group_0_1__2__Impl"


    // $ANTLR start "rule__PathSegment__Group_0_1__3"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:996:1: rule__PathSegment__Group_0_1__3 : rule__PathSegment__Group_0_1__3__Impl ;
    public final void rule__PathSegment__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1000:1: ( rule__PathSegment__Group_0_1__3__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1001:2: rule__PathSegment__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PathSegment__Group_0_1__3__Impl_in_rule__PathSegment__Group_0_1__32010);
            rule__PathSegment__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegment__Group_0_1__3"


    // $ANTLR start "rule__PathSegment__Group_0_1__3__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1007:1: rule__PathSegment__Group_0_1__3__Impl : ( ')' ) ;
    public final void rule__PathSegment__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1011:1: ( ( ')' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1012:1: ( ')' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1012:1: ( ')' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1013:1: ')'
            {
             before(grammarAccess.getPathSegmentAccess().getRightParenthesisKeyword_0_1_3()); 
            match(input,18,FOLLOW_18_in_rule__PathSegment__Group_0_1__3__Impl2038); 
             after(grammarAccess.getPathSegmentAccess().getRightParenthesisKeyword_0_1_3()); 

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
    // $ANTLR end "rule__PathSegment__Group_0_1__3__Impl"


    // $ANTLR start "rule__PathSegment__Group_0_1_2__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1034:1: rule__PathSegment__Group_0_1_2__0 : rule__PathSegment__Group_0_1_2__0__Impl rule__PathSegment__Group_0_1_2__1 ;
    public final void rule__PathSegment__Group_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1038:1: ( rule__PathSegment__Group_0_1_2__0__Impl rule__PathSegment__Group_0_1_2__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1039:2: rule__PathSegment__Group_0_1_2__0__Impl rule__PathSegment__Group_0_1_2__1
            {
            pushFollow(FOLLOW_rule__PathSegment__Group_0_1_2__0__Impl_in_rule__PathSegment__Group_0_1_2__02077);
            rule__PathSegment__Group_0_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathSegment__Group_0_1_2__1_in_rule__PathSegment__Group_0_1_2__02080);
            rule__PathSegment__Group_0_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegment__Group_0_1_2__0"


    // $ANTLR start "rule__PathSegment__Group_0_1_2__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1046:1: rule__PathSegment__Group_0_1_2__0__Impl : ( '|' ) ;
    public final void rule__PathSegment__Group_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1050:1: ( ( '|' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1051:1: ( '|' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1051:1: ( '|' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1052:1: '|'
            {
             before(grammarAccess.getPathSegmentAccess().getVerticalLineKeyword_0_1_2_0()); 
            match(input,19,FOLLOW_19_in_rule__PathSegment__Group_0_1_2__0__Impl2108); 
             after(grammarAccess.getPathSegmentAccess().getVerticalLineKeyword_0_1_2_0()); 

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
    // $ANTLR end "rule__PathSegment__Group_0_1_2__0__Impl"


    // $ANTLR start "rule__PathSegment__Group_0_1_2__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1065:1: rule__PathSegment__Group_0_1_2__1 : rule__PathSegment__Group_0_1_2__1__Impl ;
    public final void rule__PathSegment__Group_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1069:1: ( rule__PathSegment__Group_0_1_2__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1070:2: rule__PathSegment__Group_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PathSegment__Group_0_1_2__1__Impl_in_rule__PathSegment__Group_0_1_2__12139);
            rule__PathSegment__Group_0_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegment__Group_0_1_2__1"


    // $ANTLR start "rule__PathSegment__Group_0_1_2__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1076:1: rule__PathSegment__Group_0_1_2__1__Impl : ( ( rule__PathSegment__AlternativesAssignment_0_1_2_1 ) ) ;
    public final void rule__PathSegment__Group_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1080:1: ( ( ( rule__PathSegment__AlternativesAssignment_0_1_2_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1081:1: ( ( rule__PathSegment__AlternativesAssignment_0_1_2_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1081:1: ( ( rule__PathSegment__AlternativesAssignment_0_1_2_1 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1082:1: ( rule__PathSegment__AlternativesAssignment_0_1_2_1 )
            {
             before(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_1_2_1()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1083:1: ( rule__PathSegment__AlternativesAssignment_0_1_2_1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1083:2: rule__PathSegment__AlternativesAssignment_0_1_2_1
            {
            pushFollow(FOLLOW_rule__PathSegment__AlternativesAssignment_0_1_2_1_in_rule__PathSegment__Group_0_1_2__1__Impl2166);
            rule__PathSegment__AlternativesAssignment_0_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPathSegmentAccess().getAlternativesAssignment_0_1_2_1()); 

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
    // $ANTLR end "rule__PathSegment__Group_0_1_2__1__Impl"


    // $ANTLR start "rule__PathSegmentDescription__Group__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1097:1: rule__PathSegmentDescription__Group__0 : rule__PathSegmentDescription__Group__0__Impl rule__PathSegmentDescription__Group__1 ;
    public final void rule__PathSegmentDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1101:1: ( rule__PathSegmentDescription__Group__0__Impl rule__PathSegmentDescription__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1102:2: rule__PathSegmentDescription__Group__0__Impl rule__PathSegmentDescription__Group__1
            {
            pushFollow(FOLLOW_rule__PathSegmentDescription__Group__0__Impl_in_rule__PathSegmentDescription__Group__02200);
            rule__PathSegmentDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathSegmentDescription__Group__1_in_rule__PathSegmentDescription__Group__02203);
            rule__PathSegmentDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegmentDescription__Group__0"


    // $ANTLR start "rule__PathSegmentDescription__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1109:1: rule__PathSegmentDescription__Group__0__Impl : ( ( rule__PathSegmentDescription__Alternatives_0 ) ) ;
    public final void rule__PathSegmentDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1113:1: ( ( ( rule__PathSegmentDescription__Alternatives_0 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1114:1: ( ( rule__PathSegmentDescription__Alternatives_0 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1114:1: ( ( rule__PathSegmentDescription__Alternatives_0 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1115:1: ( rule__PathSegmentDescription__Alternatives_0 )
            {
             before(grammarAccess.getPathSegmentDescriptionAccess().getAlternatives_0()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1116:1: ( rule__PathSegmentDescription__Alternatives_0 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1116:2: rule__PathSegmentDescription__Alternatives_0
            {
            pushFollow(FOLLOW_rule__PathSegmentDescription__Alternatives_0_in_rule__PathSegmentDescription__Group__0__Impl2230);
            rule__PathSegmentDescription__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPathSegmentDescriptionAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__PathSegmentDescription__Group__0__Impl"


    // $ANTLR start "rule__PathSegmentDescription__Group__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1126:1: rule__PathSegmentDescription__Group__1 : rule__PathSegmentDescription__Group__1__Impl ;
    public final void rule__PathSegmentDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1130:1: ( rule__PathSegmentDescription__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1131:2: rule__PathSegmentDescription__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PathSegmentDescription__Group__1__Impl_in_rule__PathSegmentDescription__Group__12260);
            rule__PathSegmentDescription__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegmentDescription__Group__1"


    // $ANTLR start "rule__PathSegmentDescription__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1137:1: rule__PathSegmentDescription__Group__1__Impl : ( ( rule__PathSegmentDescription__RestrictionListAssignment_1 )? ) ;
    public final void rule__PathSegmentDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1141:1: ( ( ( rule__PathSegmentDescription__RestrictionListAssignment_1 )? ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1142:1: ( ( rule__PathSegmentDescription__RestrictionListAssignment_1 )? )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1142:1: ( ( rule__PathSegmentDescription__RestrictionListAssignment_1 )? )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1143:1: ( rule__PathSegmentDescription__RestrictionListAssignment_1 )?
            {
             before(grammarAccess.getPathSegmentDescriptionAccess().getRestrictionListAssignment_1()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1144:1: ( rule__PathSegmentDescription__RestrictionListAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1144:2: rule__PathSegmentDescription__RestrictionListAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PathSegmentDescription__RestrictionListAssignment_1_in_rule__PathSegmentDescription__Group__1__Impl2287);
                    rule__PathSegmentDescription__RestrictionListAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathSegmentDescriptionAccess().getRestrictionListAssignment_1()); 

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
    // $ANTLR end "rule__PathSegmentDescription__Group__1__Impl"


    // $ANTLR start "rule__RestrictionList__Group__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1158:1: rule__RestrictionList__Group__0 : rule__RestrictionList__Group__0__Impl rule__RestrictionList__Group__1 ;
    public final void rule__RestrictionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1162:1: ( rule__RestrictionList__Group__0__Impl rule__RestrictionList__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1163:2: rule__RestrictionList__Group__0__Impl rule__RestrictionList__Group__1
            {
            pushFollow(FOLLOW_rule__RestrictionList__Group__0__Impl_in_rule__RestrictionList__Group__02322);
            rule__RestrictionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestrictionList__Group__1_in_rule__RestrictionList__Group__02325);
            rule__RestrictionList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictionList__Group__0"


    // $ANTLR start "rule__RestrictionList__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1170:1: rule__RestrictionList__Group__0__Impl : ( '[' ) ;
    public final void rule__RestrictionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1174:1: ( ( '[' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1175:1: ( '[' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1175:1: ( '[' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1176:1: '['
            {
             before(grammarAccess.getRestrictionListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__RestrictionList__Group__0__Impl2353); 
             after(grammarAccess.getRestrictionListAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__RestrictionList__Group__0__Impl"


    // $ANTLR start "rule__RestrictionList__Group__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1189:1: rule__RestrictionList__Group__1 : rule__RestrictionList__Group__1__Impl rule__RestrictionList__Group__2 ;
    public final void rule__RestrictionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1193:1: ( rule__RestrictionList__Group__1__Impl rule__RestrictionList__Group__2 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1194:2: rule__RestrictionList__Group__1__Impl rule__RestrictionList__Group__2
            {
            pushFollow(FOLLOW_rule__RestrictionList__Group__1__Impl_in_rule__RestrictionList__Group__12384);
            rule__RestrictionList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestrictionList__Group__2_in_rule__RestrictionList__Group__12387);
            rule__RestrictionList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictionList__Group__1"


    // $ANTLR start "rule__RestrictionList__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1201:1: rule__RestrictionList__Group__1__Impl : ( ( rule__RestrictionList__RestrictionsAssignment_1 ) ) ;
    public final void rule__RestrictionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1205:1: ( ( ( rule__RestrictionList__RestrictionsAssignment_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1206:1: ( ( rule__RestrictionList__RestrictionsAssignment_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1206:1: ( ( rule__RestrictionList__RestrictionsAssignment_1 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1207:1: ( rule__RestrictionList__RestrictionsAssignment_1 )
            {
             before(grammarAccess.getRestrictionListAccess().getRestrictionsAssignment_1()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1208:1: ( rule__RestrictionList__RestrictionsAssignment_1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1208:2: rule__RestrictionList__RestrictionsAssignment_1
            {
            pushFollow(FOLLOW_rule__RestrictionList__RestrictionsAssignment_1_in_rule__RestrictionList__Group__1__Impl2414);
            rule__RestrictionList__RestrictionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionListAccess().getRestrictionsAssignment_1()); 

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
    // $ANTLR end "rule__RestrictionList__Group__1__Impl"


    // $ANTLR start "rule__RestrictionList__Group__2"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1218:1: rule__RestrictionList__Group__2 : rule__RestrictionList__Group__2__Impl rule__RestrictionList__Group__3 ;
    public final void rule__RestrictionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1222:1: ( rule__RestrictionList__Group__2__Impl rule__RestrictionList__Group__3 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1223:2: rule__RestrictionList__Group__2__Impl rule__RestrictionList__Group__3
            {
            pushFollow(FOLLOW_rule__RestrictionList__Group__2__Impl_in_rule__RestrictionList__Group__22444);
            rule__RestrictionList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestrictionList__Group__3_in_rule__RestrictionList__Group__22447);
            rule__RestrictionList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictionList__Group__2"


    // $ANTLR start "rule__RestrictionList__Group__2__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1230:1: rule__RestrictionList__Group__2__Impl : ( ( rule__RestrictionList__Group_2__0 )* ) ;
    public final void rule__RestrictionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1234:1: ( ( ( rule__RestrictionList__Group_2__0 )* ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1235:1: ( ( rule__RestrictionList__Group_2__0 )* )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1235:1: ( ( rule__RestrictionList__Group_2__0 )* )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1236:1: ( rule__RestrictionList__Group_2__0 )*
            {
             before(grammarAccess.getRestrictionListAccess().getGroup_2()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1237:1: ( rule__RestrictionList__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1237:2: rule__RestrictionList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RestrictionList__Group_2__0_in_rule__RestrictionList__Group__2__Impl2474);
            	    rule__RestrictionList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRestrictionListAccess().getGroup_2()); 

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
    // $ANTLR end "rule__RestrictionList__Group__2__Impl"


    // $ANTLR start "rule__RestrictionList__Group__3"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1247:1: rule__RestrictionList__Group__3 : rule__RestrictionList__Group__3__Impl ;
    public final void rule__RestrictionList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1251:1: ( rule__RestrictionList__Group__3__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1252:2: rule__RestrictionList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RestrictionList__Group__3__Impl_in_rule__RestrictionList__Group__32505);
            rule__RestrictionList__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictionList__Group__3"


    // $ANTLR start "rule__RestrictionList__Group__3__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1258:1: rule__RestrictionList__Group__3__Impl : ( ']' ) ;
    public final void rule__RestrictionList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1262:1: ( ( ']' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1263:1: ( ']' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1263:1: ( ']' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1264:1: ']'
            {
             before(grammarAccess.getRestrictionListAccess().getRightSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__RestrictionList__Group__3__Impl2533); 
             after(grammarAccess.getRestrictionListAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__RestrictionList__Group__3__Impl"


    // $ANTLR start "rule__RestrictionList__Group_2__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1285:1: rule__RestrictionList__Group_2__0 : rule__RestrictionList__Group_2__0__Impl rule__RestrictionList__Group_2__1 ;
    public final void rule__RestrictionList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1289:1: ( rule__RestrictionList__Group_2__0__Impl rule__RestrictionList__Group_2__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1290:2: rule__RestrictionList__Group_2__0__Impl rule__RestrictionList__Group_2__1
            {
            pushFollow(FOLLOW_rule__RestrictionList__Group_2__0__Impl_in_rule__RestrictionList__Group_2__02572);
            rule__RestrictionList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestrictionList__Group_2__1_in_rule__RestrictionList__Group_2__02575);
            rule__RestrictionList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictionList__Group_2__0"


    // $ANTLR start "rule__RestrictionList__Group_2__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1297:1: rule__RestrictionList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RestrictionList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1301:1: ( ( ',' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1302:1: ( ',' )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1302:1: ( ',' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1303:1: ','
            {
             before(grammarAccess.getRestrictionListAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__RestrictionList__Group_2__0__Impl2603); 
             after(grammarAccess.getRestrictionListAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__RestrictionList__Group_2__0__Impl"


    // $ANTLR start "rule__RestrictionList__Group_2__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1316:1: rule__RestrictionList__Group_2__1 : rule__RestrictionList__Group_2__1__Impl ;
    public final void rule__RestrictionList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1320:1: ( rule__RestrictionList__Group_2__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1321:2: rule__RestrictionList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RestrictionList__Group_2__1__Impl_in_rule__RestrictionList__Group_2__12634);
            rule__RestrictionList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictionList__Group_2__1"


    // $ANTLR start "rule__RestrictionList__Group_2__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1327:1: rule__RestrictionList__Group_2__1__Impl : ( ( rule__RestrictionList__RestrictionsAssignment_2_1 ) ) ;
    public final void rule__RestrictionList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1331:1: ( ( ( rule__RestrictionList__RestrictionsAssignment_2_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1332:1: ( ( rule__RestrictionList__RestrictionsAssignment_2_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1332:1: ( ( rule__RestrictionList__RestrictionsAssignment_2_1 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1333:1: ( rule__RestrictionList__RestrictionsAssignment_2_1 )
            {
             before(grammarAccess.getRestrictionListAccess().getRestrictionsAssignment_2_1()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1334:1: ( rule__RestrictionList__RestrictionsAssignment_2_1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1334:2: rule__RestrictionList__RestrictionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RestrictionList__RestrictionsAssignment_2_1_in_rule__RestrictionList__Group_2__1__Impl2661);
            rule__RestrictionList__RestrictionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionListAccess().getRestrictionsAssignment_2_1()); 

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
    // $ANTLR end "rule__RestrictionList__Group_2__1__Impl"


    // $ANTLR start "rule__TypeRestriction__Group__0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1348:1: rule__TypeRestriction__Group__0 : rule__TypeRestriction__Group__0__Impl rule__TypeRestriction__Group__1 ;
    public final void rule__TypeRestriction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1352:1: ( rule__TypeRestriction__Group__0__Impl rule__TypeRestriction__Group__1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1353:2: rule__TypeRestriction__Group__0__Impl rule__TypeRestriction__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRestriction__Group__0__Impl_in_rule__TypeRestriction__Group__02695);
            rule__TypeRestriction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRestriction__Group__1_in_rule__TypeRestriction__Group__02698);
            rule__TypeRestriction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRestriction__Group__0"


    // $ANTLR start "rule__TypeRestriction__Group__0__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1360:1: rule__TypeRestriction__Group__0__Impl : ( ( rule__TypeRestriction__ForbiddenAssignment_0 )? ) ;
    public final void rule__TypeRestriction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1364:1: ( ( ( rule__TypeRestriction__ForbiddenAssignment_0 )? ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1365:1: ( ( rule__TypeRestriction__ForbiddenAssignment_0 )? )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1365:1: ( ( rule__TypeRestriction__ForbiddenAssignment_0 )? )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1366:1: ( rule__TypeRestriction__ForbiddenAssignment_0 )?
            {
             before(grammarAccess.getTypeRestrictionAccess().getForbiddenAssignment_0()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1367:1: ( rule__TypeRestriction__ForbiddenAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1367:2: rule__TypeRestriction__ForbiddenAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeRestriction__ForbiddenAssignment_0_in_rule__TypeRestriction__Group__0__Impl2725);
                    rule__TypeRestriction__ForbiddenAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRestrictionAccess().getForbiddenAssignment_0()); 

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
    // $ANTLR end "rule__TypeRestriction__Group__0__Impl"


    // $ANTLR start "rule__TypeRestriction__Group__1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1377:1: rule__TypeRestriction__Group__1 : rule__TypeRestriction__Group__1__Impl ;
    public final void rule__TypeRestriction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1381:1: ( rule__TypeRestriction__Group__1__Impl )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1382:2: rule__TypeRestriction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeRestriction__Group__1__Impl_in_rule__TypeRestriction__Group__12756);
            rule__TypeRestriction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRestriction__Group__1"


    // $ANTLR start "rule__TypeRestriction__Group__1__Impl"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1388:1: rule__TypeRestriction__Group__1__Impl : ( ( rule__TypeRestriction__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeRestriction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1392:1: ( ( ( rule__TypeRestriction__TypeNameAssignment_1 ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1393:1: ( ( rule__TypeRestriction__TypeNameAssignment_1 ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1393:1: ( ( rule__TypeRestriction__TypeNameAssignment_1 ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1394:1: ( rule__TypeRestriction__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeRestrictionAccess().getTypeNameAssignment_1()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1395:1: ( rule__TypeRestriction__TypeNameAssignment_1 )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1395:2: rule__TypeRestriction__TypeNameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeRestriction__TypeNameAssignment_1_in_rule__TypeRestriction__Group__1__Impl2783);
            rule__TypeRestriction__TypeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeRestrictionAccess().getTypeNameAssignment_1()); 

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
    // $ANTLR end "rule__TypeRestriction__Group__1__Impl"


    // $ANTLR start "rule__PathExpression__PathAlternativesAssignment_0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1410:1: rule__PathExpression__PathAlternativesAssignment_0 : ( rulePath ) ;
    public final void rule__PathExpression__PathAlternativesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1414:1: ( ( rulePath ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1415:1: ( rulePath )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1415:1: ( rulePath )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1416:1: rulePath
            {
             before(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePath_in_rule__PathExpression__PathAlternativesAssignment_02822);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PathExpression__PathAlternativesAssignment_0"


    // $ANTLR start "rule__PathExpression__PathAlternativesAssignment_1_1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1425:1: rule__PathExpression__PathAlternativesAssignment_1_1 : ( rulePath ) ;
    public final void rule__PathExpression__PathAlternativesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1429:1: ( ( rulePath ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1430:1: ( rulePath )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1430:1: ( rulePath )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1431:1: rulePath
            {
             before(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePath_in_rule__PathExpression__PathAlternativesAssignment_1_12853);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PathExpression__PathAlternativesAssignment_1_1"


    // $ANTLR start "rule__PathExpression__PathAlternativesAssignment_1_3_2"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1440:1: rule__PathExpression__PathAlternativesAssignment_1_3_2 : ( rulePath ) ;
    public final void rule__PathExpression__PathAlternativesAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1444:1: ( ( rulePath ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1445:1: ( rulePath )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1445:1: ( rulePath )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1446:1: rulePath
            {
             before(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_rulePath_in_rule__PathExpression__PathAlternativesAssignment_1_3_22884);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_3_2_0()); 

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
    // $ANTLR end "rule__PathExpression__PathAlternativesAssignment_1_3_2"


    // $ANTLR start "rule__Path__SegmentsAssignment_0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1455:1: rule__Path__SegmentsAssignment_0 : ( rulePathSegment ) ;
    public final void rule__Path__SegmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1459:1: ( ( rulePathSegment ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1460:1: ( rulePathSegment )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1460:1: ( rulePathSegment )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1461:1: rulePathSegment
            {
             before(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePathSegment_in_rule__Path__SegmentsAssignment_02915);
            rulePathSegment();

            state._fsp--;

             after(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Path__SegmentsAssignment_0"


    // $ANTLR start "rule__Path__SegmentsAssignment_1_1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1470:1: rule__Path__SegmentsAssignment_1_1 : ( rulePathSegment ) ;
    public final void rule__Path__SegmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1474:1: ( ( rulePathSegment ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1475:1: ( rulePathSegment )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1475:1: ( rulePathSegment )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1476:1: rulePathSegment
            {
             before(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePathSegment_in_rule__Path__SegmentsAssignment_1_12946);
            rulePathSegment();

            state._fsp--;

             after(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Path__SegmentsAssignment_1_1"


    // $ANTLR start "rule__PathSegment__AlternativesAssignment_0_0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1485:1: rule__PathSegment__AlternativesAssignment_0_0 : ( rulePathSegmentDescription ) ;
    public final void rule__PathSegment__AlternativesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1489:1: ( ( rulePathSegmentDescription ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1490:1: ( rulePathSegmentDescription )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1490:1: ( rulePathSegmentDescription )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1491:1: rulePathSegmentDescription
            {
             before(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_rulePathSegmentDescription_in_rule__PathSegment__AlternativesAssignment_0_02977);
            rulePathSegmentDescription();

            state._fsp--;

             after(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__PathSegment__AlternativesAssignment_0_0"


    // $ANTLR start "rule__PathSegment__AlternativesAssignment_0_1_1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1500:1: rule__PathSegment__AlternativesAssignment_0_1_1 : ( rulePathSegmentDescription ) ;
    public final void rule__PathSegment__AlternativesAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1504:1: ( ( rulePathSegmentDescription ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1505:1: ( rulePathSegmentDescription )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1505:1: ( rulePathSegmentDescription )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1506:1: rulePathSegmentDescription
            {
             before(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_rulePathSegmentDescription_in_rule__PathSegment__AlternativesAssignment_0_1_13008);
            rulePathSegmentDescription();

            state._fsp--;

             after(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__PathSegment__AlternativesAssignment_0_1_1"


    // $ANTLR start "rule__PathSegment__AlternativesAssignment_0_1_2_1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1515:1: rule__PathSegment__AlternativesAssignment_0_1_2_1 : ( rulePathSegmentDescription ) ;
    public final void rule__PathSegment__AlternativesAssignment_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1519:1: ( ( rulePathSegmentDescription ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1520:1: ( rulePathSegmentDescription )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1520:1: ( rulePathSegmentDescription )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1521:1: rulePathSegmentDescription
            {
             before(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_2_1_0()); 
            pushFollow(FOLLOW_rulePathSegmentDescription_in_rule__PathSegment__AlternativesAssignment_0_1_2_13039);
            rulePathSegmentDescription();

            state._fsp--;

             after(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_2_1_0()); 

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
    // $ANTLR end "rule__PathSegment__AlternativesAssignment_0_1_2_1"


    // $ANTLR start "rule__PathSegment__RepeatOperatorAssignment_1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1530:1: rule__PathSegment__RepeatOperatorAssignment_1 : ( ruleRepeatOperator ) ;
    public final void rule__PathSegment__RepeatOperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1534:1: ( ( ruleRepeatOperator ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1535:1: ( ruleRepeatOperator )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1535:1: ( ruleRepeatOperator )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1536:1: ruleRepeatOperator
            {
             before(grammarAccess.getPathSegmentAccess().getRepeatOperatorRepeatOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRepeatOperator_in_rule__PathSegment__RepeatOperatorAssignment_13070);
            ruleRepeatOperator();

            state._fsp--;

             after(grammarAccess.getPathSegmentAccess().getRepeatOperatorRepeatOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__PathSegment__RepeatOperatorAssignment_1"


    // $ANTLR start "rule__PathSegmentDescription__RestrictionListAssignment_1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1545:1: rule__PathSegmentDescription__RestrictionListAssignment_1 : ( ruleRestrictionList ) ;
    public final void rule__PathSegmentDescription__RestrictionListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1549:1: ( ( ruleRestrictionList ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1550:1: ( ruleRestrictionList )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1550:1: ( ruleRestrictionList )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1551:1: ruleRestrictionList
            {
             before(grammarAccess.getPathSegmentDescriptionAccess().getRestrictionListRestrictionListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRestrictionList_in_rule__PathSegmentDescription__RestrictionListAssignment_13101);
            ruleRestrictionList();

            state._fsp--;

             after(grammarAccess.getPathSegmentDescriptionAccess().getRestrictionListRestrictionListParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PathSegmentDescription__RestrictionListAssignment_1"


    // $ANTLR start "rule__RestrictionList__RestrictionsAssignment_1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1560:1: rule__RestrictionList__RestrictionsAssignment_1 : ( ruleTypeRestriction ) ;
    public final void rule__RestrictionList__RestrictionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1564:1: ( ( ruleTypeRestriction ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1565:1: ( ruleTypeRestriction )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1565:1: ( ruleTypeRestriction )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1566:1: ruleTypeRestriction
            {
             before(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRestriction_in_rule__RestrictionList__RestrictionsAssignment_13132);
            ruleTypeRestriction();

            state._fsp--;

             after(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RestrictionList__RestrictionsAssignment_1"


    // $ANTLR start "rule__RestrictionList__RestrictionsAssignment_2_1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1575:1: rule__RestrictionList__RestrictionsAssignment_2_1 : ( ruleTypeRestriction ) ;
    public final void rule__RestrictionList__RestrictionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1579:1: ( ( ruleTypeRestriction ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1580:1: ( ruleTypeRestriction )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1580:1: ( ruleTypeRestriction )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1581:1: ruleTypeRestriction
            {
             before(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleTypeRestriction_in_rule__RestrictionList__RestrictionsAssignment_2_13163);
            ruleTypeRestriction();

            state._fsp--;

             after(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__RestrictionList__RestrictionsAssignment_2_1"


    // $ANTLR start "rule__ImplicitPathDescription__KindAssignment"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1590:1: rule__ImplicitPathDescription__KindAssignment : ( ruleImplicitPathKind ) ;
    public final void rule__ImplicitPathDescription__KindAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1594:1: ( ( ruleImplicitPathKind ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1595:1: ( ruleImplicitPathKind )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1595:1: ( ruleImplicitPathKind )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1596:1: ruleImplicitPathKind
            {
             before(grammarAccess.getImplicitPathDescriptionAccess().getKindImplicitPathKindEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleImplicitPathKind_in_rule__ImplicitPathDescription__KindAssignment3194);
            ruleImplicitPathKind();

            state._fsp--;

             after(grammarAccess.getImplicitPathDescriptionAccess().getKindImplicitPathKindEnumRuleCall_0()); 

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
    // $ANTLR end "rule__ImplicitPathDescription__KindAssignment"


    // $ANTLR start "rule__ExplicitPathDescription__AssociationNameAssignment"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1605:1: rule__ExplicitPathDescription__AssociationNameAssignment : ( RULE_ID ) ;
    public final void rule__ExplicitPathDescription__AssociationNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1609:1: ( ( RULE_ID ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1610:1: ( RULE_ID )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1610:1: ( RULE_ID )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1611:1: RULE_ID
            {
             before(grammarAccess.getExplicitPathDescriptionAccess().getAssociationNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExplicitPathDescription__AssociationNameAssignment3225); 
             after(grammarAccess.getExplicitPathDescriptionAccess().getAssociationNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ExplicitPathDescription__AssociationNameAssignment"


    // $ANTLR start "rule__TypeRestriction__ForbiddenAssignment_0"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1620:1: rule__TypeRestriction__ForbiddenAssignment_0 : ( ( '!' ) ) ;
    public final void rule__TypeRestriction__ForbiddenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1624:1: ( ( ( '!' ) ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1625:1: ( ( '!' ) )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1625:1: ( ( '!' ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1626:1: ( '!' )
            {
             before(grammarAccess.getTypeRestrictionAccess().getForbiddenExclamationMarkKeyword_0_0()); 
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1627:1: ( '!' )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1628:1: '!'
            {
             before(grammarAccess.getTypeRestrictionAccess().getForbiddenExclamationMarkKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__TypeRestriction__ForbiddenAssignment_03261); 
             after(grammarAccess.getTypeRestrictionAccess().getForbiddenExclamationMarkKeyword_0_0()); 

            }

             after(grammarAccess.getTypeRestrictionAccess().getForbiddenExclamationMarkKeyword_0_0()); 

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
    // $ANTLR end "rule__TypeRestriction__ForbiddenAssignment_0"


    // $ANTLR start "rule__TypeRestriction__TypeNameAssignment_1"
    // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1643:1: rule__TypeRestriction__TypeNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeRestriction__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1647:1: ( ( RULE_ID ) )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1648:1: ( RULE_ID )
            {
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1648:1: ( RULE_ID )
            // ../org.storydriven.storydiagrams.expressions.ui/src-gen/org/storydriven/modeling/expressions/ui/contentassist/antlr/internal/InternalPathExpressions.g:1649:1: RULE_ID
            {
             before(grammarAccess.getTypeRestrictionAccess().getTypeNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeRestriction__TypeNameAssignment_13300); 
             after(grammarAccess.getTypeRestrictionAccess().getTypeNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TypeRestriction__TypeNameAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\17\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\4\4\13\1\uffff\2\4\1\26\1\4\1\13\1\4\1\26";
    static final String DFA1_maxS =
        "\1\21\1\uffff\1\21\4\25\1\uffff\1\30\1\4\1\27\1\30\1\24\1\4\1\27";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\7\uffff";
    static final String DFA1_specialS =
        "\17\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\11\uffff\3\1\1\2",
            "",
            "\1\6\11\uffff\1\3\1\4\1\5\1\7",
            "\3\7\4\uffff\1\7\1\1\1\7\1\10",
            "\3\7\4\uffff\1\7\1\1\1\7\1\10",
            "\3\7\4\uffff\1\7\1\1\1\7\1\10",
            "\3\7\4\uffff\1\7\1\1\1\7\1\10",
            "",
            "\1\12\23\uffff\1\11",
            "\1\12",
            "\1\14\1\13",
            "\1\16\23\uffff\1\15",
            "\3\7\4\uffff\1\7\1\1\1\7",
            "\1\16",
            "\1\14\1\13"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "322:1: rule__PathExpression__Alternatives : ( ( ( rule__PathExpression__PathAlternativesAssignment_0 ) ) | ( ( rule__PathExpression__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulePathExpression_in_entryRulePathExpression61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpression68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__Alternatives_in_rulePathExpression94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0_in_rulePath154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_entryRulePathSegment181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathSegment188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group__0_in_rulePathSegment214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegmentDescription_in_entryRulePathSegmentDescription241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathSegmentDescription248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegmentDescription__Group__0_in_rulePathSegmentDescription274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionList_in_entryRuleRestrictionList301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionList308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group__0_in_ruleRestrictionList334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitPathDescription_in_entryRuleImplicitPathDescription361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitPathDescription368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImplicitPathDescription__KindAssignment_in_ruleImplicitPathDescription394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitPathDescription_in_entryRuleExplicitPathDescription421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitPathDescription428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitPathDescription__AssociationNameAssignment_in_ruleExplicitPathDescription454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRestriction_in_entryRuleTypeRestriction481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRestriction488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRestriction__Group__0_in_ruleTypeRestriction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepeatOperator__Alternatives_in_ruleRepeatOperator551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImplicitPathKind__Alternatives_in_ruleImplicitPathKind587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__PathAlternativesAssignment_0_in_rule__PathExpression__Alternatives622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1__0_in_rule__PathExpression__Alternatives640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__AlternativesAssignment_0_0_in_rule__PathSegment__Alternatives_0673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1__0_in_rule__PathSegment__Alternatives_0691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitPathDescription_in_rule__PathSegmentDescription__Alternatives_0724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitPathDescription_in_rule__PathSegmentDescription__Alternatives_0741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RepeatOperator__Alternatives774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RepeatOperator__Alternatives795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RepeatOperator__Alternatives816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ImplicitPathKind__Alternatives852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ImplicitPathKind__Alternatives873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ImplicitPathKind__Alternatives894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1__0__Impl_in_rule__PathExpression__Group_1__0927 = new BitSet(new long[]{0x000000000003C010L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1__1_in_rule__PathExpression__Group_1__0930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PathExpression__Group_1__0__Impl958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1__1__Impl_in_rule__PathExpression__Group_1__1989 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1__2_in_rule__PathExpression__Group_1__1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__PathAlternativesAssignment_1_1_in_rule__PathExpression__Group_1__1__Impl1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1__2__Impl_in_rule__PathExpression__Group_1__21049 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1__3_in_rule__PathExpression__Group_1__21052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PathExpression__Group_1__2__Impl1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1__3__Impl_in_rule__PathExpression__Group_1__31111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1_3__0_in_rule__PathExpression__Group_1__3__Impl1140 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1_3__0_in_rule__PathExpression__Group_1__3__Impl1152 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1_3__0__Impl_in_rule__PathExpression__Group_1_3__01193 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1_3__1_in_rule__PathExpression__Group_1_3__01196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PathExpression__Group_1_3__0__Impl1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1_3__1__Impl_in_rule__PathExpression__Group_1_3__11255 = new BitSet(new long[]{0x000000000003C010L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1_3__2_in_rule__PathExpression__Group_1_3__11258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PathExpression__Group_1_3__1__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1_3__2__Impl_in_rule__PathExpression__Group_1_3__21317 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1_3__3_in_rule__PathExpression__Group_1_3__21320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__PathAlternativesAssignment_1_3_2_in_rule__PathExpression__Group_1_3__2__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpression__Group_1_3__3__Impl_in_rule__PathExpression__Group_1_3__31377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PathExpression__Group_1_3__3__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__01444 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__01447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__SegmentsAssignment_0_in_rule__Path__Group__0__Impl1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__1__Impl1531 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__0__Impl_in_rule__Path__Group_1__01566 = new BitSet(new long[]{0x000000000003C010L});
    public static final BitSet FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__01569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Path__Group_1__0__Impl1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__1__Impl_in_rule__Path__Group_1__11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__SegmentsAssignment_1_1_in_rule__Path__Group_1__1__Impl1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group__0__Impl_in_rule__PathSegment__Group__01689 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__PathSegment__Group__1_in_rule__PathSegment__Group__01692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Alternatives_0_in_rule__PathSegment__Group__0__Impl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group__1__Impl_in_rule__PathSegment__Group__11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__RepeatOperatorAssignment_1_in_rule__PathSegment__Group__1__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1__0__Impl_in_rule__PathSegment__Group_0_1__01811 = new BitSet(new long[]{0x000000000001C010L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1__1_in_rule__PathSegment__Group_0_1__01814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PathSegment__Group_0_1__0__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1__1__Impl_in_rule__PathSegment__Group_0_1__11873 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1__2_in_rule__PathSegment__Group_0_1__11876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__AlternativesAssignment_0_1_1_in_rule__PathSegment__Group_0_1__1__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1__2__Impl_in_rule__PathSegment__Group_0_1__21933 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1__3_in_rule__PathSegment__Group_0_1__21936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1_2__0_in_rule__PathSegment__Group_0_1__2__Impl1965 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1_2__0_in_rule__PathSegment__Group_0_1__2__Impl1977 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1__3__Impl_in_rule__PathSegment__Group_0_1__32010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PathSegment__Group_0_1__3__Impl2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1_2__0__Impl_in_rule__PathSegment__Group_0_1_2__02077 = new BitSet(new long[]{0x000000000001C010L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1_2__1_in_rule__PathSegment__Group_0_1_2__02080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PathSegment__Group_0_1_2__0__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Group_0_1_2__1__Impl_in_rule__PathSegment__Group_0_1_2__12139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__AlternativesAssignment_0_1_2_1_in_rule__PathSegment__Group_0_1_2__1__Impl2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegmentDescription__Group__0__Impl_in_rule__PathSegmentDescription__Group__02200 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PathSegmentDescription__Group__1_in_rule__PathSegmentDescription__Group__02203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegmentDescription__Alternatives_0_in_rule__PathSegmentDescription__Group__0__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegmentDescription__Group__1__Impl_in_rule__PathSegmentDescription__Group__12260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegmentDescription__RestrictionListAssignment_1_in_rule__PathSegmentDescription__Group__1__Impl2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group__0__Impl_in_rule__RestrictionList__Group__02322 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group__1_in_rule__RestrictionList__Group__02325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RestrictionList__Group__0__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group__1__Impl_in_rule__RestrictionList__Group__12384 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group__2_in_rule__RestrictionList__Group__12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionList__RestrictionsAssignment_1_in_rule__RestrictionList__Group__1__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group__2__Impl_in_rule__RestrictionList__Group__22444 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group__3_in_rule__RestrictionList__Group__22447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group_2__0_in_rule__RestrictionList__Group__2__Impl2474 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group__3__Impl_in_rule__RestrictionList__Group__32505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RestrictionList__Group__3__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group_2__0__Impl_in_rule__RestrictionList__Group_2__02572 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group_2__1_in_rule__RestrictionList__Group_2__02575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RestrictionList__Group_2__0__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionList__Group_2__1__Impl_in_rule__RestrictionList__Group_2__12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionList__RestrictionsAssignment_2_1_in_rule__RestrictionList__Group_2__1__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRestriction__Group__0__Impl_in_rule__TypeRestriction__Group__02695 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__TypeRestriction__Group__1_in_rule__TypeRestriction__Group__02698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRestriction__ForbiddenAssignment_0_in_rule__TypeRestriction__Group__0__Impl2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRestriction__Group__1__Impl_in_rule__TypeRestriction__Group__12756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRestriction__TypeNameAssignment_1_in_rule__TypeRestriction__Group__1__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rule__PathExpression__PathAlternativesAssignment_02822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rule__PathExpression__PathAlternativesAssignment_1_12853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rule__PathExpression__PathAlternativesAssignment_1_3_22884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_rule__Path__SegmentsAssignment_02915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_rule__Path__SegmentsAssignment_1_12946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegmentDescription_in_rule__PathSegment__AlternativesAssignment_0_02977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegmentDescription_in_rule__PathSegment__AlternativesAssignment_0_1_13008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegmentDescription_in_rule__PathSegment__AlternativesAssignment_0_1_2_13039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeatOperator_in_rule__PathSegment__RepeatOperatorAssignment_13070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionList_in_rule__PathSegmentDescription__RestrictionListAssignment_13101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRestriction_in_rule__RestrictionList__RestrictionsAssignment_13132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRestriction_in_rule__RestrictionList__RestrictionsAssignment_2_13163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitPathKind_in_rule__ImplicitPathDescription__KindAssignment3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExplicitPathDescription__AssociationNameAssignment3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypeRestriction__ForbiddenAssignment_03261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeRestriction__TypeNameAssignment_13300 = new BitSet(new long[]{0x0000000000000002L});

}