// $ANTLR 3.5.2 src/core/koopa/core/grammars/generator/KG.g

  package koopa.core.grammars.generator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class KGLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int ACT=4;
	public static final int ANY=5;
	public static final int ARROW=6;
	public static final int ASSIGN=7;
	public static final int BANG=8;
	public static final int BODY=9;
	public static final int BY=10;
	public static final int CASE=11;
	public static final int CHOICE=12;
	public static final int CLOSE_BRACKET=13;
	public static final int CLOSE_PAREN=14;
	public static final int COMMA=15;
	public static final int COMMENT=16;
	public static final int DECLARATION=17;
	public static final int DIGIT=18;
	public static final int DISPATCHED=19;
	public static final int DOLLAR=20;
	public static final int DOT=21;
	public static final int EQUALS=22;
	public static final int EXTENDING=23;
	public static final int GRAMMAR=24;
	public static final int IDENTIFIER=25;
	public static final int LETTER=26;
	public static final int LIMIT=27;
	public static final int LITERAL=28;
	public static final int LOCALS=29;
	public static final int META=30;
	public static final int NAMED=31;
	public static final int NATIVE_CODE=32;
	public static final int NEWLINE=33;
	public static final int NOSKIP=34;
	public static final int NOT=35;
	public static final int NUMBER=36;
	public static final int OPEN_BRACKET=37;
	public static final int OPEN_PAREN=38;
	public static final int OPTIONAL=39;
	public static final int PERMUTED=40;
	public static final int PIPE=41;
	public static final int PLUS=42;
	public static final int RETURNS=43;
	public static final int RULE=44;
	public static final int SEQUENCE=45;
	public static final int SKIP_TO=46;
	public static final int STAR=47;
	public static final int TAG=48;
	public static final int TREE=49;
	public static final int WHITESPACE=50;
	public static final int WITH=51;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public KGLexer() {} 
	public KGLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public KGLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "src/core/koopa/core/grammars/generator/KG.g"; }

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:6:7: ( 'def' )
			// src/core/koopa/core/grammars/generator/KG.g:6:9: 'def'
			{
			match("def"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:7:7: ( 'end' )
			// src/core/koopa/core/grammars/generator/KG.g:7:9: 'end'
			{
			match("end"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:8:7: ( 'extends' )
			// src/core/koopa/core/grammars/generator/KG.g:8:9: 'extends'
			{
			match("extends"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:9:7: ( 'grammar' )
			// src/core/koopa/core/grammars/generator/KG.g:9:9: 'grammar'
			{
			match("grammar"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:10:7: ( 'returns' )
			// src/core/koopa/core/grammars/generator/KG.g:10:9: 'returns'
			{
			match("returns"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:11:7: ( 'tree' )
			// src/core/koopa/core/grammars/generator/KG.g:11:9: 'tree'
			{
			match("tree"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:187:9: ( '#' (~ ( '\\n' | '\\r' ) )* )
			// src/core/koopa/core/grammars/generator/KG.g:187:11: '#' (~ ( '\\n' | '\\r' ) )*
			{
			match('#'); if (state.failed) return;
			// src/core/koopa/core/grammars/generator/KG.g:187:15: (~ ( '\\n' | '\\r' ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			if ( state.backtracking==0 ) { _channel = HIDDEN; }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:189:9: ( ( ( '\\r\\n' )=> '\\r\\n' | '\\r' | '\\n' ) )
			// src/core/koopa/core/grammars/generator/KG.g:189:11: ( ( '\\r\\n' )=> '\\r\\n' | '\\r' | '\\n' )
			{
			// src/core/koopa/core/grammars/generator/KG.g:189:11: ( ( '\\r\\n' )=> '\\r\\n' | '\\r' | '\\n' )
			int alt2=3;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\r') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='\n') && (synpred1_KG())) {
					alt2=1;
				}

			}
			else if ( (LA2_0=='\n') ) {
				alt2=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:189:13: ( '\\r\\n' )=> '\\r\\n'
					{
					match("\r\n"); if (state.failed) return;

					}
					break;
				case 2 :
					// src/core/koopa/core/grammars/generator/KG.g:189:34: '\\r'
					{
					match('\r'); if (state.failed) return;
					}
					break;
				case 3 :
					// src/core/koopa/core/grammars/generator/KG.g:189:41: '\\n'
					{
					match('\n'); if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) { _channel = HIDDEN; }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "NOSKIP"
	public final void mNOSKIP() throws RecognitionException {
		try {
			int _type = NOSKIP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:191:8: ( '%noskip' )
			// src/core/koopa/core/grammars/generator/KG.g:191:10: '%noskip'
			{
			match("%noskip"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOSKIP"

	// $ANTLR start "LIMIT"
	public final void mLIMIT() throws RecognitionException {
		try {
			int _type = LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:193:7: ( '%limit' )
			// src/core/koopa/core/grammars/generator/KG.g:193:9: '%limit'
			{
			match("%limit"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIMIT"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:195:4: ( '%by' )
			// src/core/koopa/core/grammars/generator/KG.g:195:6: '%by'
			{
			match("%by"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "ARROW"
	public final void mARROW() throws RecognitionException {
		try {
			int _type = ARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:197:7: ( '=>' )
			// src/core/koopa/core/grammars/generator/KG.g:197:9: '=>'
			{
			match("=>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARROW"

	// $ANTLR start "TAG"
	public final void mTAG() throws RecognitionException {
		try {
			int _type = TAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:199:5: ( '@' LETTER ( LETTER | DIGIT | '-' | '_' )* )
			// src/core/koopa/core/grammars/generator/KG.g:199:7: '@' LETTER ( LETTER | DIGIT | '-' | '_' )*
			{
			match('@'); if (state.failed) return;
			mLETTER(); if (state.failed) return;

			// src/core/koopa/core/grammars/generator/KG.g:199:18: ( LETTER | DIGIT | '-' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='-'||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAG"

	// $ANTLR start "ANY"
	public final void mANY() throws RecognitionException {
		try {
			int _type = ANY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:201:5: ( '_' )
			// src/core/koopa/core/grammars/generator/KG.g:201:7: '_'
			{
			match('_'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANY"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:203:12: ( LETTER ( LETTER | DIGIT | '-' | '_' )* )
			// src/core/koopa/core/grammars/generator/KG.g:203:14: LETTER ( LETTER | DIGIT | '-' | '_' )*
			{
			mLETTER(); if (state.failed) return;

			// src/core/koopa/core/grammars/generator/KG.g:203:21: ( LETTER | DIGIT | '-' | '_' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='-'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "LITERAL"
	public final void mLITERAL() throws RecognitionException {
		try {
			int _type = LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:205:9: ( '\\'' (~ ( '\\'' | '\\n' | '\\r' ) )+ '\\'' )
			// src/core/koopa/core/grammars/generator/KG.g:205:11: '\\'' (~ ( '\\'' | '\\n' | '\\r' ) )+ '\\''
			{
			match('\''); if (state.failed) return;
			// src/core/koopa/core/grammars/generator/KG.g:205:16: (~ ( '\\'' | '\\n' | '\\r' ) )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			match('\''); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LITERAL"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:207:8: ( ( DIGIT )+ )
			// src/core/koopa/core/grammars/generator/KG.g:207:10: ( DIGIT )+
			{
			// src/core/koopa/core/grammars/generator/KG.g:207:10: ( DIGIT )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:209:12: ( ( ' ' | '\\t' )+ )
			// src/core/koopa/core/grammars/generator/KG.g:209:14: ( ' ' | '\\t' )+
			{
			// src/core/koopa/core/grammars/generator/KG.g:209:14: ( ' ' | '\\t' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\t'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			if ( state.backtracking==0 ) { _channel = HIDDEN; }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:211:8: ( '=' )
			// src/core/koopa/core/grammars/generator/KG.g:211:10: '='
			{
			match('='); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "OPEN_PAREN"
	public final void mOPEN_PAREN() throws RecognitionException {
		try {
			int _type = OPEN_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:213:12: ( '(' )
			// src/core/koopa/core/grammars/generator/KG.g:213:14: '('
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_PAREN"

	// $ANTLR start "CLOSE_PAREN"
	public final void mCLOSE_PAREN() throws RecognitionException {
		try {
			int _type = CLOSE_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:215:13: ( ')' )
			// src/core/koopa/core/grammars/generator/KG.g:215:15: ')'
			{
			match(')'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_PAREN"

	// $ANTLR start "OPEN_BRACKET"
	public final void mOPEN_BRACKET() throws RecognitionException {
		try {
			int _type = OPEN_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:217:14: ( '[' )
			// src/core/koopa/core/grammars/generator/KG.g:217:16: '['
			{
			match('['); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_BRACKET"

	// $ANTLR start "CLOSE_BRACKET"
	public final void mCLOSE_BRACKET() throws RecognitionException {
		try {
			int _type = CLOSE_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:219:15: ( ']' )
			// src/core/koopa/core/grammars/generator/KG.g:219:17: ']'
			{
			match(']'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_BRACKET"

	// $ANTLR start "NATIVE_CODE"
	public final void mNATIVE_CODE() throws RecognitionException {
		try {
			int _type = NATIVE_CODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:223:13: ( '{' (~ '}' )* '}' )
			// src/core/koopa/core/grammars/generator/KG.g:223:15: '{' (~ '}' )* '}'
			{
			match('{'); if (state.failed) return;
			// src/core/koopa/core/grammars/generator/KG.g:223:19: (~ '}' )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\u0000' && LA8_0 <= '|')||(LA8_0 >= '~' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '|')||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			match('}'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NATIVE_CODE"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:225:6: ( '*' )
			// src/core/koopa/core/grammars/generator/KG.g:225:8: '*'
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:227:6: ( '+' )
			// src/core/koopa/core/grammars/generator/KG.g:227:8: '+'
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "WITH"
	public final void mWITH() throws RecognitionException {
		try {
			int _type = WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:229:6: ( '---' )
			// src/core/koopa/core/grammars/generator/KG.g:229:8: '---'
			{
			match("---"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITH"

	// $ANTLR start "SKIP_TO"
	public final void mSKIP_TO() throws RecognitionException {
		try {
			int _type = SKIP_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:230:9: ( '-->' )
			// src/core/koopa/core/grammars/generator/KG.g:230:11: '-->'
			{
			match("-->"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SKIP_TO"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:232:5: ( '.' )
			// src/core/koopa/core/grammars/generator/KG.g:232:7: '.'
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "PIPE"
	public final void mPIPE() throws RecognitionException {
		try {
			int _type = PIPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:234:6: ( '|' )
			// src/core/koopa/core/grammars/generator/KG.g:234:8: '|'
			{
			match('|'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PIPE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:236:7: ( ',' )
			// src/core/koopa/core/grammars/generator/KG.g:236:9: ','
			{
			match(','); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "BANG"
	public final void mBANG() throws RecognitionException {
		try {
			int _type = BANG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:238:6: ( '!' )
			// src/core/koopa/core/grammars/generator/KG.g:238:8: '!'
			{
			match('!'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BANG"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:240:8: ( '$' )
			// src/core/koopa/core/grammars/generator/KG.g:240:10: '$'
			{
			match('$'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src/core/koopa/core/grammars/generator/KG.g:242:5: ( '-' )
			// src/core/koopa/core/grammars/generator/KG.g:242:7: '-'
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// src/core/koopa/core/grammars/generator/KG.g:244:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// src/core/koopa/core/grammars/generator/KG.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// src/core/koopa/core/grammars/generator/KG.g:245:16: ( '0' .. '9' )
			// src/core/koopa/core/grammars/generator/KG.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	@Override
	public void mTokens() throws RecognitionException {
		// src/core/koopa/core/grammars/generator/KG.g:1:8: ( T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | COMMENT | NEWLINE | NOSKIP | LIMIT | BY | ARROW | TAG | ANY | IDENTIFIER | LITERAL | NUMBER | WHITESPACE | EQUALS | OPEN_PAREN | CLOSE_PAREN | OPEN_BRACKET | CLOSE_BRACKET | NATIVE_CODE | STAR | PLUS | WITH | SKIP_TO | DOT | PIPE | COMMA | BANG | DOLLAR | NOT )
		int alt9=34;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// src/core/koopa/core/grammars/generator/KG.g:1:10: T__52
				{
				mT__52(); if (state.failed) return;

				}
				break;
			case 2 :
				// src/core/koopa/core/grammars/generator/KG.g:1:16: T__53
				{
				mT__53(); if (state.failed) return;

				}
				break;
			case 3 :
				// src/core/koopa/core/grammars/generator/KG.g:1:22: T__54
				{
				mT__54(); if (state.failed) return;

				}
				break;
			case 4 :
				// src/core/koopa/core/grammars/generator/KG.g:1:28: T__55
				{
				mT__55(); if (state.failed) return;

				}
				break;
			case 5 :
				// src/core/koopa/core/grammars/generator/KG.g:1:34: T__56
				{
				mT__56(); if (state.failed) return;

				}
				break;
			case 6 :
				// src/core/koopa/core/grammars/generator/KG.g:1:40: T__57
				{
				mT__57(); if (state.failed) return;

				}
				break;
			case 7 :
				// src/core/koopa/core/grammars/generator/KG.g:1:46: COMMENT
				{
				mCOMMENT(); if (state.failed) return;

				}
				break;
			case 8 :
				// src/core/koopa/core/grammars/generator/KG.g:1:54: NEWLINE
				{
				mNEWLINE(); if (state.failed) return;

				}
				break;
			case 9 :
				// src/core/koopa/core/grammars/generator/KG.g:1:62: NOSKIP
				{
				mNOSKIP(); if (state.failed) return;

				}
				break;
			case 10 :
				// src/core/koopa/core/grammars/generator/KG.g:1:69: LIMIT
				{
				mLIMIT(); if (state.failed) return;

				}
				break;
			case 11 :
				// src/core/koopa/core/grammars/generator/KG.g:1:75: BY
				{
				mBY(); if (state.failed) return;

				}
				break;
			case 12 :
				// src/core/koopa/core/grammars/generator/KG.g:1:78: ARROW
				{
				mARROW(); if (state.failed) return;

				}
				break;
			case 13 :
				// src/core/koopa/core/grammars/generator/KG.g:1:84: TAG
				{
				mTAG(); if (state.failed) return;

				}
				break;
			case 14 :
				// src/core/koopa/core/grammars/generator/KG.g:1:88: ANY
				{
				mANY(); if (state.failed) return;

				}
				break;
			case 15 :
				// src/core/koopa/core/grammars/generator/KG.g:1:92: IDENTIFIER
				{
				mIDENTIFIER(); if (state.failed) return;

				}
				break;
			case 16 :
				// src/core/koopa/core/grammars/generator/KG.g:1:103: LITERAL
				{
				mLITERAL(); if (state.failed) return;

				}
				break;
			case 17 :
				// src/core/koopa/core/grammars/generator/KG.g:1:111: NUMBER
				{
				mNUMBER(); if (state.failed) return;

				}
				break;
			case 18 :
				// src/core/koopa/core/grammars/generator/KG.g:1:118: WHITESPACE
				{
				mWHITESPACE(); if (state.failed) return;

				}
				break;
			case 19 :
				// src/core/koopa/core/grammars/generator/KG.g:1:129: EQUALS
				{
				mEQUALS(); if (state.failed) return;

				}
				break;
			case 20 :
				// src/core/koopa/core/grammars/generator/KG.g:1:136: OPEN_PAREN
				{
				mOPEN_PAREN(); if (state.failed) return;

				}
				break;
			case 21 :
				// src/core/koopa/core/grammars/generator/KG.g:1:147: CLOSE_PAREN
				{
				mCLOSE_PAREN(); if (state.failed) return;

				}
				break;
			case 22 :
				// src/core/koopa/core/grammars/generator/KG.g:1:159: OPEN_BRACKET
				{
				mOPEN_BRACKET(); if (state.failed) return;

				}
				break;
			case 23 :
				// src/core/koopa/core/grammars/generator/KG.g:1:172: CLOSE_BRACKET
				{
				mCLOSE_BRACKET(); if (state.failed) return;

				}
				break;
			case 24 :
				// src/core/koopa/core/grammars/generator/KG.g:1:186: NATIVE_CODE
				{
				mNATIVE_CODE(); if (state.failed) return;

				}
				break;
			case 25 :
				// src/core/koopa/core/grammars/generator/KG.g:1:198: STAR
				{
				mSTAR(); if (state.failed) return;

				}
				break;
			case 26 :
				// src/core/koopa/core/grammars/generator/KG.g:1:203: PLUS
				{
				mPLUS(); if (state.failed) return;

				}
				break;
			case 27 :
				// src/core/koopa/core/grammars/generator/KG.g:1:208: WITH
				{
				mWITH(); if (state.failed) return;

				}
				break;
			case 28 :
				// src/core/koopa/core/grammars/generator/KG.g:1:213: SKIP_TO
				{
				mSKIP_TO(); if (state.failed) return;

				}
				break;
			case 29 :
				// src/core/koopa/core/grammars/generator/KG.g:1:221: DOT
				{
				mDOT(); if (state.failed) return;

				}
				break;
			case 30 :
				// src/core/koopa/core/grammars/generator/KG.g:1:225: PIPE
				{
				mPIPE(); if (state.failed) return;

				}
				break;
			case 31 :
				// src/core/koopa/core/grammars/generator/KG.g:1:230: COMMA
				{
				mCOMMA(); if (state.failed) return;

				}
				break;
			case 32 :
				// src/core/koopa/core/grammars/generator/KG.g:1:236: BANG
				{
				mBANG(); if (state.failed) return;

				}
				break;
			case 33 :
				// src/core/koopa/core/grammars/generator/KG.g:1:241: DOLLAR
				{
				mDOLLAR(); if (state.failed) return;

				}
				break;
			case 34 :
				// src/core/koopa/core/grammars/generator/KG.g:1:248: NOT
				{
				mNOT(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_KG
	public final void synpred1_KG_fragment() throws RecognitionException {
		// src/core/koopa/core/grammars/generator/KG.g:189:13: ( '\\r\\n' )
		// src/core/koopa/core/grammars/generator/KG.g:189:14: '\\r\\n'
		{
		match("\r\n"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_KG

	public final boolean synpred1_KG() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_KG_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\1\uffff\5\14\3\uffff\1\47\15\uffff\1\51\5\uffff\6\14\7\uffff\1\62\1\63"+
		"\4\14\4\uffff\3\14\1\73\3\14\1\uffff\3\14\1\102\1\103\1\104\3\uffff";
	static final String DFA9_eofS =
		"\105\uffff";
	static final String DFA9_minS =
		"\1\11\1\145\1\156\1\162\1\145\1\162\2\uffff\1\142\1\76\15\uffff\1\55\5"+
		"\uffff\1\146\1\144\1\164\1\141\1\164\1\145\5\uffff\1\55\1\uffff\2\55\1"+
		"\145\1\155\1\165\1\145\4\uffff\1\156\1\155\1\162\1\55\1\144\1\141\1\156"+
		"\1\uffff\1\163\1\162\1\163\3\55\3\uffff";
	static final String DFA9_maxS =
		"\1\174\1\145\1\170\1\162\1\145\1\162\2\uffff\1\156\1\76\15\uffff\1\55"+
		"\5\uffff\1\146\1\144\1\164\1\141\1\164\1\145\5\uffff\1\76\1\uffff\2\172"+
		"\1\145\1\155\1\165\1\145\4\uffff\1\156\1\155\1\162\1\172\1\144\1\141\1"+
		"\156\1\uffff\1\163\1\162\1\163\3\172\3\uffff";
	static final String DFA9_acceptS =
		"\6\uffff\1\7\1\10\2\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\24\1\25\1\26"+
		"\1\27\1\30\1\31\1\32\1\uffff\1\35\1\36\1\37\1\40\1\41\6\uffff\1\11\1\12"+
		"\1\13\1\14\1\23\1\uffff\1\42\6\uffff\1\33\1\34\1\1\1\2\7\uffff\1\6\6\uffff"+
		"\1\3\1\4\1\5";
	static final String DFA9_specialS =
		"\105\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\17\1\7\2\uffff\1\7\22\uffff\1\17\1\33\1\uffff\1\6\1\34\1\10\1\uffff"+
			"\1\15\1\20\1\21\1\25\1\26\1\32\1\27\1\30\1\uffff\12\16\3\uffff\1\11\2"+
			"\uffff\1\12\32\14\1\22\1\uffff\1\23\1\uffff\1\13\1\uffff\3\14\1\1\1\2"+
			"\1\14\1\3\12\14\1\4\1\14\1\5\6\14\1\24\1\31",
			"\1\35",
			"\1\36\11\uffff\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"",
			"",
			"\1\45\11\uffff\1\44\1\uffff\1\43",
			"\1\46",
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
			"\1\50",
			"",
			"",
			"",
			"",
			"",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"",
			"",
			"",
			"",
			"",
			"\1\60\20\uffff\1\61",
			"",
			"\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"",
			"",
			"",
			"",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"\1\74",
			"\1\75",
			"\1\76",
			"",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"\1\14\2\uffff\12\14\7\uffff\32\14\4\uffff\1\14\1\uffff\32\14",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | COMMENT | NEWLINE | NOSKIP | LIMIT | BY | ARROW | TAG | ANY | IDENTIFIER | LITERAL | NUMBER | WHITESPACE | EQUALS | OPEN_PAREN | CLOSE_PAREN | OPEN_BRACKET | CLOSE_BRACKET | NATIVE_CODE | STAR | PLUS | WITH | SKIP_TO | DOT | PIPE | COMMA | BANG | DOLLAR | NOT );";
		}
	}

}
