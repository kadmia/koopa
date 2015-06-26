// $ANTLR 3.5.2 src/core/koopa/core/grammars/generator/KG.g

  package koopa.core.grammars.generator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class KGParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACT", "ANY", "ARROW", "AS", "ASSIGN", 
		"BANG", "BODY", "BY", "CASE", "CHOICE", "CLOSE_BRACKET", "CLOSE_PAREN", 
		"COLON", "COMMA", "COMMENT", "DECLARATION", "DIGIT", "DISPATCHED", "DOLLAR", 
		"DOT", "EQUALS", "EXTENDING", "GRAMMAR", "IDENTIFIER", "LETTER", "LIMIT", 
		"LITERAL", "LOCALS", "LOWERCASE", "META", "NAMED", "NATIVE_CODE", "NEWLINE", 
		"NOSKIP", "NOT", "NUMBER", "OPEN_BRACKET", "OPEN_PAREN", "OPTIONAL", "PERMUTED", 
		"PIPE", "PLUS", "PRIVATE", "PUBLIC", "RETURNS", "RULE", "SEQUENCE", "SKIP_TO", 
		"STAR", "TAG", "TOKEN", "TREE", "UPPERCASE", "WHITESPACE", "WITH", "'def'", 
		"'end'", "'extends'", "'grammar'", "'returns'", "'tree'"
	};
	public static final int EOF=-1;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int ACT=4;
	public static final int ANY=5;
	public static final int ARROW=6;
	public static final int AS=7;
	public static final int ASSIGN=8;
	public static final int BANG=9;
	public static final int BODY=10;
	public static final int BY=11;
	public static final int CASE=12;
	public static final int CHOICE=13;
	public static final int CLOSE_BRACKET=14;
	public static final int CLOSE_PAREN=15;
	public static final int COLON=16;
	public static final int COMMA=17;
	public static final int COMMENT=18;
	public static final int DECLARATION=19;
	public static final int DIGIT=20;
	public static final int DISPATCHED=21;
	public static final int DOLLAR=22;
	public static final int DOT=23;
	public static final int EQUALS=24;
	public static final int EXTENDING=25;
	public static final int GRAMMAR=26;
	public static final int IDENTIFIER=27;
	public static final int LETTER=28;
	public static final int LIMIT=29;
	public static final int LITERAL=30;
	public static final int LOCALS=31;
	public static final int LOWERCASE=32;
	public static final int META=33;
	public static final int NAMED=34;
	public static final int NATIVE_CODE=35;
	public static final int NEWLINE=36;
	public static final int NOSKIP=37;
	public static final int NOT=38;
	public static final int NUMBER=39;
	public static final int OPEN_BRACKET=40;
	public static final int OPEN_PAREN=41;
	public static final int OPTIONAL=42;
	public static final int PERMUTED=43;
	public static final int PIPE=44;
	public static final int PLUS=45;
	public static final int PRIVATE=46;
	public static final int PUBLIC=47;
	public static final int RETURNS=48;
	public static final int RULE=49;
	public static final int SEQUENCE=50;
	public static final int SKIP_TO=51;
	public static final int STAR=52;
	public static final int TAG=53;
	public static final int TOKEN=54;
	public static final int TREE=55;
	public static final int UPPERCASE=56;
	public static final int WHITESPACE=57;
	public static final int WITH=58;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public KGParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public KGParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return KGParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src/core/koopa/core/grammars/generator/KG.g"; }


	  //private boolean verifyNativeCode(Token code) {
	  //  return JavaGrammarUtil.isValidJava(code.getText());
	  //}


	public static class koopa_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "koopa"
	// src/core/koopa/core/grammars/generator/KG.g:43:1: koopa : meta ( rule )* EOF -> ^( GRAMMAR meta ( rule )* ) ;
	public final KGParser.koopa_return koopa() throws RecognitionException {
		KGParser.koopa_return retval = new KGParser.koopa_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope meta1 =null;
		ParserRuleReturnScope rule2 =null;

		CommonTree EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_meta=new RewriteRuleSubtreeStream(adaptor,"rule meta");
		RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:44:3: ( meta ( rule )* EOF -> ^( GRAMMAR meta ( rule )* ) )
			// src/core/koopa/core/grammars/generator/KG.g:44:5: meta ( rule )* EOF
			{
			pushFollow(FOLLOW_meta_in_koopa146);
			meta1=meta();
			state._fsp--;

			stream_meta.add(meta1.getTree());
			// src/core/koopa/core/grammars/generator/KG.g:46:5: ( rule )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= PRIVATE && LA1_0 <= PUBLIC)||LA1_0==59) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:46:5: rule
					{
					pushFollow(FOLLOW_rule_in_koopa155);
					rule2=rule();
					state._fsp--;

					stream_rule.add(rule2.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_koopa158);  
			stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: meta, rule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 48:5: -> ^( GRAMMAR meta ( rule )* )
			{
				// src/core/koopa/core/grammars/generator/KG.g:48:8: ^( GRAMMAR meta ( rule )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GRAMMAR, "GRAMMAR"), root_1);
				adaptor.addChild(root_1, stream_meta.nextTree());
				// src/core/koopa/core/grammars/generator/KG.g:48:23: ( rule )*
				while ( stream_rule.hasNext() ) {
					adaptor.addChild(root_1, stream_rule.nextTree());
				}
				stream_rule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "koopa"


	public static class meta_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "meta"
	// src/core/koopa/core/grammars/generator/KG.g:51:1: meta : (t= 'tree' )? 'grammar' n= name ( 'extends' s= name )? DOT -> { t == null && s == null }? ^( META ^( NAMED $n) ) -> { t == null && s != null }? ^( META ^( NAMED $n) ^( EXTENDING $s) ) -> { t != null && s == null }? ^( META TREE ^( NAMED $n) ) -> ^( META TREE ^( NAMED $n) ^( EXTENDING $s) ) ;
	public final KGParser.meta_return meta() throws RecognitionException {
		KGParser.meta_return retval = new KGParser.meta_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token t=null;
		Token string_literal4=null;
		Token string_literal5=null;
		Token DOT6=null;
		ParserRuleReturnScope n =null;
		ParserRuleReturnScope s =null;

		CommonTree t_tree=null;
		CommonTree string_literal4_tree=null;
		CommonTree string_literal5_tree=null;
		CommonTree DOT6_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:52:3: ( (t= 'tree' )? 'grammar' n= name ( 'extends' s= name )? DOT -> { t == null && s == null }? ^( META ^( NAMED $n) ) -> { t == null && s != null }? ^( META ^( NAMED $n) ^( EXTENDING $s) ) -> { t != null && s == null }? ^( META TREE ^( NAMED $n) ) -> ^( META TREE ^( NAMED $n) ^( EXTENDING $s) ) )
			// src/core/koopa/core/grammars/generator/KG.g:52:5: (t= 'tree' )? 'grammar' n= name ( 'extends' s= name )? DOT
			{
			// src/core/koopa/core/grammars/generator/KG.g:52:5: (t= 'tree' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==64) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:52:6: t= 'tree'
					{
					t=(Token)match(input,64,FOLLOW_64_in_meta192);  
					stream_64.add(t);

					}
					break;

			}

			string_literal4=(Token)match(input,62,FOLLOW_62_in_meta196);  
			stream_62.add(string_literal4);

			pushFollow(FOLLOW_name_in_meta200);
			n=name();
			state._fsp--;

			stream_name.add(n.getTree());
			// src/core/koopa/core/grammars/generator/KG.g:53:5: ( 'extends' s= name )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==61) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:53:6: 'extends' s= name
					{
					string_literal5=(Token)match(input,61,FOLLOW_61_in_meta207);  
					stream_61.add(string_literal5);

					pushFollow(FOLLOW_name_in_meta211);
					s=name();
					state._fsp--;

					stream_name.add(s.getTree());
					}
					break;

			}

			DOT6=(Token)match(input,DOT,FOLLOW_DOT_in_meta219);  
			stream_DOT.add(DOT6);

			// AST REWRITE
			// elements: n, n, n, s, n, s
			// token labels: 
			// rule labels: s, n, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
			RewriteRuleSubtreeStream stream_n=new RewriteRuleSubtreeStream(adaptor,"rule n",n!=null?n.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 56:5: -> { t == null && s == null }? ^( META ^( NAMED $n) )
			if ( t == null && s == null ) {
				// src/core/koopa/core/grammars/generator/KG.g:56:36: ^( META ^( NAMED $n) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(META, "META"), root_1);
				// src/core/koopa/core/grammars/generator/KG.g:56:48: ^( NAMED $n)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMED, "NAMED"), root_2);
				adaptor.addChild(root_2, stream_n.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 57:5: -> { t == null && s != null }? ^( META ^( NAMED $n) ^( EXTENDING $s) )
			if ( t == null && s != null ) {
				// src/core/koopa/core/grammars/generator/KG.g:57:36: ^( META ^( NAMED $n) ^( EXTENDING $s) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(META, "META"), root_1);
				// src/core/koopa/core/grammars/generator/KG.g:57:48: ^( NAMED $n)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMED, "NAMED"), root_2);
				adaptor.addChild(root_2, stream_n.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// src/core/koopa/core/grammars/generator/KG.g:57:60: ^( EXTENDING $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENDING, "EXTENDING"), root_2);
				adaptor.addChild(root_2, stream_s.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 58:5: -> { t != null && s == null }? ^( META TREE ^( NAMED $n) )
			if ( t != null && s == null ) {
				// src/core/koopa/core/grammars/generator/KG.g:58:36: ^( META TREE ^( NAMED $n) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(META, "META"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(TREE, "TREE"));
				// src/core/koopa/core/grammars/generator/KG.g:58:48: ^( NAMED $n)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMED, "NAMED"), root_2);
				adaptor.addChild(root_2, stream_n.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 59:5: -> ^( META TREE ^( NAMED $n) ^( EXTENDING $s) )
			{
				// src/core/koopa/core/grammars/generator/KG.g:59:36: ^( META TREE ^( NAMED $n) ^( EXTENDING $s) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(META, "META"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(TREE, "TREE"));
				// src/core/koopa/core/grammars/generator/KG.g:59:48: ^( NAMED $n)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMED, "NAMED"), root_2);
				adaptor.addChild(root_2, stream_n.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// src/core/koopa/core/grammars/generator/KG.g:59:60: ^( EXTENDING $s)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENDING, "EXTENDING"), root_2);
				adaptor.addChild(root_2, stream_s.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "meta"


	public static class name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "name"
	// src/core/koopa/core/grammars/generator/KG.g:62:1: name : ( IDENTIFIER -> IDENTIFIER | TOKEN -> TOKEN );
	public final KGParser.name_return name() throws RecognitionException {
		KGParser.name_return retval = new KGParser.name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENTIFIER7=null;
		Token TOKEN8=null;

		CommonTree IDENTIFIER7_tree=null;
		CommonTree TOKEN8_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_TOKEN=new RewriteRuleTokenStream(adaptor,"token TOKEN");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:63:3: ( IDENTIFIER -> IDENTIFIER | TOKEN -> TOKEN )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IDENTIFIER) ) {
				alt4=1;
			}
			else if ( (LA4_0==TOKEN) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:63:5: IDENTIFIER
					{
					IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_name399);  
					stream_IDENTIFIER.add(IDENTIFIER7);

					// AST REWRITE
					// elements: IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 63:16: -> IDENTIFIER
					{
						adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// src/core/koopa/core/grammars/generator/KG.g:64:5: TOKEN
					{
					TOKEN8=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_name409);  
					stream_TOKEN.add(TOKEN8);

					// AST REWRITE
					// elements: TOKEN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 64:16: -> TOKEN
					{
						adaptor.addChild(root_0, stream_TOKEN.nextNode());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "name"


	public static class modifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// src/core/koopa/core/grammars/generator/KG.g:67:1: modifier : ( PUBLIC -> PUBLIC | PRIVATE -> PRIVATE );
	public final KGParser.modifier_return modifier() throws RecognitionException {
		KGParser.modifier_return retval = new KGParser.modifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PUBLIC9=null;
		Token PRIVATE10=null;

		CommonTree PUBLIC9_tree=null;
		CommonTree PRIVATE10_tree=null;
		RewriteRuleTokenStream stream_PUBLIC=new RewriteRuleTokenStream(adaptor,"token PUBLIC");
		RewriteRuleTokenStream stream_PRIVATE=new RewriteRuleTokenStream(adaptor,"token PRIVATE");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:68:3: ( PUBLIC -> PUBLIC | PRIVATE -> PRIVATE )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==PUBLIC) ) {
				alt5=1;
			}
			else if ( (LA5_0==PRIVATE) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:68:5: PUBLIC
					{
					PUBLIC9=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier431);  
					stream_PUBLIC.add(PUBLIC9);

					// AST REWRITE
					// elements: PUBLIC
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 68:16: -> PUBLIC
					{
						adaptor.addChild(root_0, stream_PUBLIC.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// src/core/koopa/core/grammars/generator/KG.g:69:5: PRIVATE
					{
					PRIVATE10=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier445);  
					stream_PRIVATE.add(PRIVATE10);

					// AST REWRITE
					// elements: PRIVATE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 69:16: -> PRIVATE
					{
						adaptor.addChild(root_0, stream_PRIVATE.nextNode());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifier"


	public static class rule_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rule"
	// src/core/koopa/core/grammars/generator/KG.g:72:1: rule : (v= modifier )? 'def' i= IDENTIFIER ( OPEN_PAREN l= locals CLOSE_PAREN )? ( 'returns' r= IDENTIFIER )? EQUALS sequence 'end' -> { v != null && l != null && r != null }? ^( RULE $v $i locals ^( RETURNS $r) sequence ) -> { v != null && l != null && r == null }? ^( RULE $v $i locals sequence ) -> { v != null && l == null && r != null }? ^( RULE $v $i ^( RETURNS $r) sequence ) -> { v != null && l == null && r == null }? ^( RULE $v $i sequence ) -> { v == null && l != null && r != null }? ^( RULE PUBLIC $i locals ^( RETURNS $r) sequence ) -> { v == null && l != null && r == null }? ^( RULE PUBLIC $i locals sequence ) -> { v == null && l == null && r != null }? ^( RULE PUBLIC $i ^( RETURNS $r) sequence ) -> ^( RULE PUBLIC $i sequence ) ;
	public final KGParser.rule_return rule() throws RecognitionException {
		KGParser.rule_return retval = new KGParser.rule_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token i=null;
		Token r=null;
		Token string_literal11=null;
		Token OPEN_PAREN12=null;
		Token CLOSE_PAREN13=null;
		Token string_literal14=null;
		Token EQUALS15=null;
		Token string_literal17=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope sequence16 =null;

		CommonTree i_tree=null;
		CommonTree r_tree=null;
		CommonTree string_literal11_tree=null;
		CommonTree OPEN_PAREN12_tree=null;
		CommonTree CLOSE_PAREN13_tree=null;
		CommonTree string_literal14_tree=null;
		CommonTree EQUALS15_tree=null;
		CommonTree string_literal17_tree=null;
		RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
		RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
		RewriteRuleSubtreeStream stream_locals=new RewriteRuleSubtreeStream(adaptor,"rule locals");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:73:3: ( (v= modifier )? 'def' i= IDENTIFIER ( OPEN_PAREN l= locals CLOSE_PAREN )? ( 'returns' r= IDENTIFIER )? EQUALS sequence 'end' -> { v != null && l != null && r != null }? ^( RULE $v $i locals ^( RETURNS $r) sequence ) -> { v != null && l != null && r == null }? ^( RULE $v $i locals sequence ) -> { v != null && l == null && r != null }? ^( RULE $v $i ^( RETURNS $r) sequence ) -> { v != null && l == null && r == null }? ^( RULE $v $i sequence ) -> { v == null && l != null && r != null }? ^( RULE PUBLIC $i locals ^( RETURNS $r) sequence ) -> { v == null && l != null && r == null }? ^( RULE PUBLIC $i locals sequence ) -> { v == null && l == null && r != null }? ^( RULE PUBLIC $i ^( RETURNS $r) sequence ) -> ^( RULE PUBLIC $i sequence ) )
			// src/core/koopa/core/grammars/generator/KG.g:73:5: (v= modifier )? 'def' i= IDENTIFIER ( OPEN_PAREN l= locals CLOSE_PAREN )? ( 'returns' r= IDENTIFIER )? EQUALS sequence 'end'
			{
			// src/core/koopa/core/grammars/generator/KG.g:73:5: (v= modifier )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= PRIVATE && LA6_0 <= PUBLIC)) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:73:6: v= modifier
					{
					pushFollow(FOLLOW_modifier_in_rule468);
					v=modifier();
					state._fsp--;

					stream_modifier.add(v.getTree());
					}
					break;

			}

			string_literal11=(Token)match(input,59,FOLLOW_59_in_rule472);  
			stream_59.add(string_literal11);

			i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule476);  
			stream_IDENTIFIER.add(i);

			// src/core/koopa/core/grammars/generator/KG.g:74:7: ( OPEN_PAREN l= locals CLOSE_PAREN )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==OPEN_PAREN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:74:8: OPEN_PAREN l= locals CLOSE_PAREN
					{
					OPEN_PAREN12=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_rule485);  
					stream_OPEN_PAREN.add(OPEN_PAREN12);

					pushFollow(FOLLOW_locals_in_rule489);
					l=locals();
					state._fsp--;

					stream_locals.add(l.getTree());
					CLOSE_PAREN13=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_rule491);  
					stream_CLOSE_PAREN.add(CLOSE_PAREN13);

					}
					break;

			}

			// src/core/koopa/core/grammars/generator/KG.g:75:7: ( 'returns' r= IDENTIFIER )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==63) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:75:8: 'returns' r= IDENTIFIER
					{
					string_literal14=(Token)match(input,63,FOLLOW_63_in_rule502);  
					stream_63.add(string_literal14);

					r=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule506);  
					stream_IDENTIFIER.add(r);

					}
					break;

			}

			EQUALS15=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_rule510);  
			stream_EQUALS.add(EQUALS15);

			pushFollow(FOLLOW_sequence_in_rule521);
			sequence16=sequence();
			state._fsp--;

			stream_sequence.add(sequence16.getTree());
			string_literal17=(Token)match(input,60,FOLLOW_60_in_rule530);  
			stream_60.add(string_literal17);

			// AST REWRITE
			// elements: v, r, i, locals, sequence, sequence, sequence, i, i, sequence, i, r, locals, locals, i, sequence, sequence, r, i, i, locals, i, sequence, r, v, v, sequence, v
			// token labels: r, i
			// rule labels: v, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_r=new RewriteRuleTokenStream(adaptor,"token r",r);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 81:5: -> { v != null && l != null && r != null }? ^( RULE $v $i locals ^( RETURNS $r) sequence )
			if ( v != null && l != null && r != null ) {
				// src/core/koopa/core/grammars/generator/KG.g:81:49: ^( RULE $v $i locals ^( RETURNS $r) sequence )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_1, stream_i.nextNode());
				adaptor.addChild(root_1, stream_locals.nextTree());
				// src/core/koopa/core/grammars/generator/KG.g:81:69: ^( RETURNS $r)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURNS, "RETURNS"), root_2);
				adaptor.addChild(root_2, stream_r.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 82:5: -> { v != null && l != null && r == null }? ^( RULE $v $i locals sequence )
			if ( v != null && l != null && r == null ) {
				// src/core/koopa/core/grammars/generator/KG.g:82:49: ^( RULE $v $i locals sequence )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_1, stream_i.nextNode());
				adaptor.addChild(root_1, stream_locals.nextTree());
				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 84:5: -> { v != null && l == null && r != null }? ^( RULE $v $i ^( RETURNS $r) sequence )
			if ( v != null && l == null && r != null ) {
				// src/core/koopa/core/grammars/generator/KG.g:84:49: ^( RULE $v $i ^( RETURNS $r) sequence )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_1, stream_i.nextNode());
				// src/core/koopa/core/grammars/generator/KG.g:84:62: ^( RETURNS $r)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURNS, "RETURNS"), root_2);
				adaptor.addChild(root_2, stream_r.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 85:5: -> { v != null && l == null && r == null }? ^( RULE $v $i sequence )
			if ( v != null && l == null && r == null ) {
				// src/core/koopa/core/grammars/generator/KG.g:85:49: ^( RULE $v $i sequence )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_1, stream_i.nextNode());
				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 87:5: -> { v == null && l != null && r != null }? ^( RULE PUBLIC $i locals ^( RETURNS $r) sequence )
			if ( v == null && l != null && r != null ) {
				// src/core/koopa/core/grammars/generator/KG.g:87:49: ^( RULE PUBLIC $i locals ^( RETURNS $r) sequence )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(PUBLIC, "PUBLIC"));
				adaptor.addChild(root_1, stream_i.nextNode());
				adaptor.addChild(root_1, stream_locals.nextTree());
				// src/core/koopa/core/grammars/generator/KG.g:87:73: ^( RETURNS $r)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURNS, "RETURNS"), root_2);
				adaptor.addChild(root_2, stream_r.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 88:5: -> { v == null && l != null && r == null }? ^( RULE PUBLIC $i locals sequence )
			if ( v == null && l != null && r == null ) {
				// src/core/koopa/core/grammars/generator/KG.g:88:49: ^( RULE PUBLIC $i locals sequence )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(PUBLIC, "PUBLIC"));
				adaptor.addChild(root_1, stream_i.nextNode());
				adaptor.addChild(root_1, stream_locals.nextTree());
				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 90:5: -> { v == null && l == null && r != null }? ^( RULE PUBLIC $i ^( RETURNS $r) sequence )
			if ( v == null && l == null && r != null ) {
				// src/core/koopa/core/grammars/generator/KG.g:90:49: ^( RULE PUBLIC $i ^( RETURNS $r) sequence )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(PUBLIC, "PUBLIC"));
				adaptor.addChild(root_1, stream_i.nextNode());
				// src/core/koopa/core/grammars/generator/KG.g:90:66: ^( RETURNS $r)
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURNS, "RETURNS"), root_2);
				adaptor.addChild(root_2, stream_r.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 91:5: -> ^( RULE PUBLIC $i sequence )
			{
				// src/core/koopa/core/grammars/generator/KG.g:91:49: ^( RULE PUBLIC $i sequence )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(PUBLIC, "PUBLIC"));
				adaptor.addChild(root_1, stream_i.nextNode());
				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rule"


	public static class locals_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "locals"
	// src/core/koopa/core/grammars/generator/KG.g:94:1: locals : declaration ( COMMA declaration )* -> ^( LOCALS ( declaration )+ ) ;
	public final KGParser.locals_return locals() throws RecognitionException {
		KGParser.locals_return retval = new KGParser.locals_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA19=null;
		ParserRuleReturnScope declaration18 =null;
		ParserRuleReturnScope declaration20 =null;

		CommonTree COMMA19_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:95:3: ( declaration ( COMMA declaration )* -> ^( LOCALS ( declaration )+ ) )
			// src/core/koopa/core/grammars/generator/KG.g:95:5: declaration ( COMMA declaration )*
			{
			pushFollow(FOLLOW_declaration_in_locals790);
			declaration18=declaration();
			state._fsp--;

			stream_declaration.add(declaration18.getTree());
			// src/core/koopa/core/grammars/generator/KG.g:95:17: ( COMMA declaration )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:95:18: COMMA declaration
					{
					COMMA19=(Token)match(input,COMMA,FOLLOW_COMMA_in_locals793);  
					stream_COMMA.add(COMMA19);

					pushFollow(FOLLOW_declaration_in_locals795);
					declaration20=declaration();
					state._fsp--;

					stream_declaration.add(declaration20.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// AST REWRITE
			// elements: declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 97:5: -> ^( LOCALS ( declaration )+ )
			{
				// src/core/koopa/core/grammars/generator/KG.g:97:8: ^( LOCALS ( declaration )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOCALS, "LOCALS"), root_1);
				if ( !(stream_declaration.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "locals"


	public static class declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// src/core/koopa/core/grammars/generator/KG.g:100:1: declaration : type= name n= name -> ^( DECLARATION $type $n) ;
	public final KGParser.declaration_return declaration() throws RecognitionException {
		KGParser.declaration_return retval = new KGParser.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope type =null;
		ParserRuleReturnScope n =null;

		RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:101:3: (type= name n= name -> ^( DECLARATION $type $n) )
			// src/core/koopa/core/grammars/generator/KG.g:101:5: type= name n= name
			{
			pushFollow(FOLLOW_name_in_declaration826);
			type=name();
			state._fsp--;

			stream_name.add(type.getTree());
			pushFollow(FOLLOW_name_in_declaration830);
			n=name();
			state._fsp--;

			stream_name.add(n.getTree());
			// AST REWRITE
			// elements: n, type
			// token labels: 
			// rule labels: type, n, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type",type!=null?type.getTree():null);
			RewriteRuleSubtreeStream stream_n=new RewriteRuleSubtreeStream(adaptor,"rule n",n!=null?n.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 103:5: -> ^( DECLARATION $type $n)
			{
				// src/core/koopa/core/grammars/generator/KG.g:103:8: ^( DECLARATION $type $n)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATION, "DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_n.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class sequence_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sequence"
	// src/core/koopa/core/grammars/generator/KG.g:106:1: sequence : (i= IDENTIFIER COLON )? (p+= part )+ -> { i != null && $p.size() > 1 }? ^( AS $i ^( SEQUENCE ( part )+ ) ) -> { i != null && $p.size() == 1 }? ^( AS $i ( part )+ ) -> { i == null && $p.size() > 1 }? ^( SEQUENCE ( part )+ ) -> ( part )+ ;
	public final KGParser.sequence_return sequence() throws RecognitionException {
		KGParser.sequence_return retval = new KGParser.sequence_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token i=null;
		Token COLON21=null;
		List<Object> list_p=null;
		RuleReturnScope p = null;
		CommonTree i_tree=null;
		CommonTree COLON21_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_part=new RewriteRuleSubtreeStream(adaptor,"rule part");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:107:3: ( (i= IDENTIFIER COLON )? (p+= part )+ -> { i != null && $p.size() > 1 }? ^( AS $i ^( SEQUENCE ( part )+ ) ) -> { i != null && $p.size() == 1 }? ^( AS $i ( part )+ ) -> { i == null && $p.size() > 1 }? ^( SEQUENCE ( part )+ ) -> ( part )+ )
			// src/core/koopa/core/grammars/generator/KG.g:107:5: (i= IDENTIFIER COLON )? (p+= part )+
			{
			// src/core/koopa/core/grammars/generator/KG.g:107:5: (i= IDENTIFIER COLON )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==IDENTIFIER) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==COLON) ) {
					alt10=1;
				}
			}
			switch (alt10) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:107:6: i= IDENTIFIER COLON
					{
					i=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_sequence863);  
					stream_IDENTIFIER.add(i);

					COLON21=(Token)match(input,COLON,FOLLOW_COLON_in_sequence865);  
					stream_COLON.add(COLON21);

					}
					break;

			}

			// src/core/koopa/core/grammars/generator/KG.g:107:28: (p+= part )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==ANY||LA11_0==BANG||(LA11_0 >= DOLLAR && LA11_0 <= DOT)||LA11_0==IDENTIFIER||(LA11_0 >= LIMIT && LA11_0 <= LITERAL)||LA11_0==NATIVE_CODE||(LA11_0 >= NOSKIP && LA11_0 <= OPEN_PAREN)||LA11_0==SKIP_TO||(LA11_0 >= TAG && LA11_0 <= TOKEN)||LA11_0==WITH) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:107:28: p+= part
					{
					pushFollow(FOLLOW_part_in_sequence871);
					p=part();
					state._fsp--;

					stream_part.add(p.getTree());
					if (list_p==null) list_p=new ArrayList<Object>();
					list_p.add(p.getTree());
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			// AST REWRITE
			// elements: i, part, part, part, i, part
			// token labels: i
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 109:5: -> { i != null && $p.size() > 1 }? ^( AS $i ^( SEQUENCE ( part )+ ) )
			if ( i != null && list_p.size() > 1  ) {
				// src/core/koopa/core/grammars/generator/KG.g:109:41: ^( AS $i ^( SEQUENCE ( part )+ ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AS, "AS"), root_1);
				adaptor.addChild(root_1, stream_i.nextNode());
				// src/core/koopa/core/grammars/generator/KG.g:109:49: ^( SEQUENCE ( part )+ )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_2);
				if ( !(stream_part.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_part.hasNext() ) {
					adaptor.addChild(root_2, stream_part.nextTree());
				}
				stream_part.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 110:5: -> { i != null && $p.size() == 1 }? ^( AS $i ( part )+ )
			if ( i != null && list_p.size() == 1 ) {
				// src/core/koopa/core/grammars/generator/KG.g:110:41: ^( AS $i ( part )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(AS, "AS"), root_1);
				adaptor.addChild(root_1, stream_i.nextNode());
				if ( !(stream_part.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_part.hasNext() ) {
					adaptor.addChild(root_1, stream_part.nextTree());
				}
				stream_part.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 111:5: -> { i == null && $p.size() > 1 }? ^( SEQUENCE ( part )+ )
			if ( i == null && list_p.size() > 1  ) {
				// src/core/koopa/core/grammars/generator/KG.g:111:49: ^( SEQUENCE ( part )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);
				if ( !(stream_part.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_part.hasNext() ) {
					adaptor.addChild(root_1, stream_part.nextTree());
				}
				stream_part.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 112:5: -> ( part )+
			{
				if ( !(stream_part.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_part.hasNext() ) {
					adaptor.addChild(root_0, stream_part.nextTree());
				}
				stream_part.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sequence"


	public static class part_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "part"
	// src/core/koopa/core/grammars/generator/KG.g:115:1: part : (code= NATIVE_CODE -> ^( ACT NATIVE_CODE ) | TAG | ANY | LITERAL | NUMBER |a= IDENTIFIER (e= EQUALS (b= IDENTIFIER |b= TOKEN |b= NUMBER |b= DOT |b= ANY ) )? -> { e != null }? ^( ASSIGN $a $b) -> IDENTIFIER | TOKEN | DOT | OPEN_PAREN sequence (m+= more )* CLOSE_PAREN (r= STAR |r= PLUS )? -> { r != null && m != null }? ^( $r ^( CHOICE sequence ( more )* ) ) -> { r != null && m == null }? ^( $r sequence ) -> { r == null && m != null }? ^( CHOICE sequence ( more )* ) -> sequence | OPEN_BRACKET sequence (m+= more )* CLOSE_BRACKET (r= STAR |r= PLUS )? -> { r != null && m != null }? ^( $r ^( OPTIONAL ^( CHOICE sequence ( more )* ) ) ) -> { r != null && m == null }? ^( $r ^( OPTIONAL ^( CHOICE sequence ) ) ) -> { r == null && m != null }? ^( OPTIONAL ^( CHOICE sequence ( more )* ) ) -> ^( OPTIONAL sequence ) | SKIP_TO part -> ^( SKIP_TO part ) | BANG OPEN_BRACKET sequence (m+= more )* CLOSE_BRACKET -> { m == null }? ^( OPTIONAL sequence ) -> ^( OPTIONAL ^( PERMUTED sequence ( more )* ) ) | BANG OPEN_PAREN sequence (m+= more )* CLOSE_PAREN -> { m == null }? sequence -> ^( PERMUTED sequence ( more )* ) | DOLLAR OPEN_PAREN dispatch (m+= more_dispatch )* CLOSE_PAREN -> { m == null }? ^( DISPATCHED dispatch ) -> ^( DISPATCHED dispatch ( more_dispatch )* ) | NOT part -> ^( NOT part ) | NOSKIP part -> ^( NOSKIP part ) | LIMIT part BY part -> ^( LIMIT part part ) | WITH p= part SKIP_TO q= part -> ^( SEQUENCE ^( LIMIT $p $q) ^( SKIP_TO $q) ) );
	public final KGParser.part_return part() throws RecognitionException {
		KGParser.part_return retval = new KGParser.part_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token code=null;
		Token a=null;
		Token e=null;
		Token b=null;
		Token r=null;
		Token TAG22=null;
		Token ANY23=null;
		Token LITERAL24=null;
		Token NUMBER25=null;
		Token TOKEN26=null;
		Token DOT27=null;
		Token OPEN_PAREN28=null;
		Token CLOSE_PAREN30=null;
		Token OPEN_BRACKET31=null;
		Token CLOSE_BRACKET33=null;
		Token SKIP_TO34=null;
		Token BANG36=null;
		Token OPEN_BRACKET37=null;
		Token CLOSE_BRACKET39=null;
		Token BANG40=null;
		Token OPEN_PAREN41=null;
		Token CLOSE_PAREN43=null;
		Token DOLLAR44=null;
		Token OPEN_PAREN45=null;
		Token CLOSE_PAREN47=null;
		Token NOT48=null;
		Token NOSKIP50=null;
		Token LIMIT52=null;
		Token BY54=null;
		Token WITH56=null;
		Token SKIP_TO57=null;
		List<Object> list_m=null;
		ParserRuleReturnScope p =null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope sequence29 =null;
		ParserRuleReturnScope sequence32 =null;
		ParserRuleReturnScope part35 =null;
		ParserRuleReturnScope sequence38 =null;
		ParserRuleReturnScope sequence42 =null;
		ParserRuleReturnScope dispatch46 =null;
		ParserRuleReturnScope part49 =null;
		ParserRuleReturnScope part51 =null;
		ParserRuleReturnScope part53 =null;
		ParserRuleReturnScope part55 =null;
		RuleReturnScope m = null;
		CommonTree code_tree=null;
		CommonTree a_tree=null;
		CommonTree e_tree=null;
		CommonTree b_tree=null;
		CommonTree r_tree=null;
		CommonTree TAG22_tree=null;
		CommonTree ANY23_tree=null;
		CommonTree LITERAL24_tree=null;
		CommonTree NUMBER25_tree=null;
		CommonTree TOKEN26_tree=null;
		CommonTree DOT27_tree=null;
		CommonTree OPEN_PAREN28_tree=null;
		CommonTree CLOSE_PAREN30_tree=null;
		CommonTree OPEN_BRACKET31_tree=null;
		CommonTree CLOSE_BRACKET33_tree=null;
		CommonTree SKIP_TO34_tree=null;
		CommonTree BANG36_tree=null;
		CommonTree OPEN_BRACKET37_tree=null;
		CommonTree CLOSE_BRACKET39_tree=null;
		CommonTree BANG40_tree=null;
		CommonTree OPEN_PAREN41_tree=null;
		CommonTree CLOSE_PAREN43_tree=null;
		CommonTree DOLLAR44_tree=null;
		CommonTree OPEN_PAREN45_tree=null;
		CommonTree CLOSE_PAREN47_tree=null;
		CommonTree NOT48_tree=null;
		CommonTree NOSKIP50_tree=null;
		CommonTree LIMIT52_tree=null;
		CommonTree BY54_tree=null;
		CommonTree WITH56_tree=null;
		CommonTree SKIP_TO57_tree=null;
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_OPEN_BRACKET=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACKET");
		RewriteRuleTokenStream stream_CLOSE_BRACKET=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACKET");
		RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
		RewriteRuleTokenStream stream_ANY=new RewriteRuleTokenStream(adaptor,"token ANY");
		RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
		RewriteRuleTokenStream stream_SKIP_TO=new RewriteRuleTokenStream(adaptor,"token SKIP_TO");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleTokenStream stream_NATIVE_CODE=new RewriteRuleTokenStream(adaptor,"token NATIVE_CODE");
		RewriteRuleTokenStream stream_DOLLAR=new RewriteRuleTokenStream(adaptor,"token DOLLAR");
		RewriteRuleTokenStream stream_NOSKIP=new RewriteRuleTokenStream(adaptor,"token NOSKIP");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
		RewriteRuleTokenStream stream_TOKEN=new RewriteRuleTokenStream(adaptor,"token TOKEN");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
		RewriteRuleSubtreeStream stream_dispatch=new RewriteRuleSubtreeStream(adaptor,"rule dispatch");
		RewriteRuleSubtreeStream stream_more_dispatch=new RewriteRuleSubtreeStream(adaptor,"rule more_dispatch");
		RewriteRuleSubtreeStream stream_more=new RewriteRuleSubtreeStream(adaptor,"rule more");
		RewriteRuleSubtreeStream stream_part=new RewriteRuleSubtreeStream(adaptor,"rule part");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:116:3: (code= NATIVE_CODE -> ^( ACT NATIVE_CODE ) | TAG | ANY | LITERAL | NUMBER |a= IDENTIFIER (e= EQUALS (b= IDENTIFIER |b= TOKEN |b= NUMBER |b= DOT |b= ANY ) )? -> { e != null }? ^( ASSIGN $a $b) -> IDENTIFIER | TOKEN | DOT | OPEN_PAREN sequence (m+= more )* CLOSE_PAREN (r= STAR |r= PLUS )? -> { r != null && m != null }? ^( $r ^( CHOICE sequence ( more )* ) ) -> { r != null && m == null }? ^( $r sequence ) -> { r == null && m != null }? ^( CHOICE sequence ( more )* ) -> sequence | OPEN_BRACKET sequence (m+= more )* CLOSE_BRACKET (r= STAR |r= PLUS )? -> { r != null && m != null }? ^( $r ^( OPTIONAL ^( CHOICE sequence ( more )* ) ) ) -> { r != null && m == null }? ^( $r ^( OPTIONAL ^( CHOICE sequence ) ) ) -> { r == null && m != null }? ^( OPTIONAL ^( CHOICE sequence ( more )* ) ) -> ^( OPTIONAL sequence ) | SKIP_TO part -> ^( SKIP_TO part ) | BANG OPEN_BRACKET sequence (m+= more )* CLOSE_BRACKET -> { m == null }? ^( OPTIONAL sequence ) -> ^( OPTIONAL ^( PERMUTED sequence ( more )* ) ) | BANG OPEN_PAREN sequence (m+= more )* CLOSE_PAREN -> { m == null }? sequence -> ^( PERMUTED sequence ( more )* ) | DOLLAR OPEN_PAREN dispatch (m+= more_dispatch )* CLOSE_PAREN -> { m == null }? ^( DISPATCHED dispatch ) -> ^( DISPATCHED dispatch ( more_dispatch )* ) | NOT part -> ^( NOT part ) | NOSKIP part -> ^( NOSKIP part ) | LIMIT part BY part -> ^( LIMIT part part ) | WITH p= part SKIP_TO q= part -> ^( SEQUENCE ^( LIMIT $p $q) ^( SKIP_TO $q) ) )
			int alt21=18;
			switch ( input.LA(1) ) {
			case NATIVE_CODE:
				{
				alt21=1;
				}
				break;
			case TAG:
				{
				alt21=2;
				}
				break;
			case ANY:
				{
				alt21=3;
				}
				break;
			case LITERAL:
				{
				alt21=4;
				}
				break;
			case NUMBER:
				{
				alt21=5;
				}
				break;
			case IDENTIFIER:
				{
				alt21=6;
				}
				break;
			case TOKEN:
				{
				alt21=7;
				}
				break;
			case DOT:
				{
				alt21=8;
				}
				break;
			case OPEN_PAREN:
				{
				alt21=9;
				}
				break;
			case OPEN_BRACKET:
				{
				alt21=10;
				}
				break;
			case SKIP_TO:
				{
				alt21=11;
				}
				break;
			case BANG:
				{
				int LA21_12 = input.LA(2);
				if ( (LA21_12==OPEN_BRACKET) ) {
					alt21=12;
				}
				else if ( (LA21_12==OPEN_PAREN) ) {
					alt21=13;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOLLAR:
				{
				alt21=14;
				}
				break;
			case NOT:
				{
				alt21=15;
				}
				break;
			case NOSKIP:
				{
				alt21=16;
				}
				break;
			case LIMIT:
				{
				alt21=17;
				}
				break;
			case WITH:
				{
				alt21=18;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// src/core/koopa/core/grammars/generator/KG.g:116:5: code= NATIVE_CODE
					{
					code=(Token)match(input,NATIVE_CODE,FOLLOW_NATIVE_CODE_in_part1026);  
					stream_NATIVE_CODE.add(code);

					 // if (!verifyNativeCode(code)) {
					      //	throw new RecognitionException("Not a valid java block.", code.getFilename(), code.getLine(), code.getColumn());
					      // }
					    
					// AST REWRITE
					// elements: NATIVE_CODE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 121:5: -> ^( ACT NATIVE_CODE )
					{
						// src/core/koopa/core/grammars/generator/KG.g:121:8: ^( ACT NATIVE_CODE )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACT, "ACT"), root_1);
						adaptor.addChild(root_1, stream_NATIVE_CODE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// src/core/koopa/core/grammars/generator/KG.g:123:5: TAG
					{
					root_0 = (CommonTree)adaptor.nil();


					TAG22=(Token)match(input,TAG,FOLLOW_TAG_in_part1051); 
					TAG22_tree = (CommonTree)adaptor.create(TAG22);
					adaptor.addChild(root_0, TAG22_tree);

					}
					break;
				case 3 :
					// src/core/koopa/core/grammars/generator/KG.g:125:5: ANY
					{
					root_0 = (CommonTree)adaptor.nil();


					ANY23=(Token)match(input,ANY,FOLLOW_ANY_in_part1058); 
					ANY23_tree = (CommonTree)adaptor.create(ANY23);
					adaptor.addChild(root_0, ANY23_tree);

					}
					break;
				case 4 :
					// src/core/koopa/core/grammars/generator/KG.g:127:5: LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LITERAL24=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_part1065); 
					LITERAL24_tree = (CommonTree)adaptor.create(LITERAL24);
					adaptor.addChild(root_0, LITERAL24_tree);

					}
					break;
				case 5 :
					// src/core/koopa/core/grammars/generator/KG.g:129:5: NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					NUMBER25=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_part1072); 
					NUMBER25_tree = (CommonTree)adaptor.create(NUMBER25);
					adaptor.addChild(root_0, NUMBER25_tree);

					}
					break;
				case 6 :
					// src/core/koopa/core/grammars/generator/KG.g:131:5: a= IDENTIFIER (e= EQUALS (b= IDENTIFIER |b= TOKEN |b= NUMBER |b= DOT |b= ANY ) )?
					{
					a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_part1083);  
					stream_IDENTIFIER.add(a);

					// src/core/koopa/core/grammars/generator/KG.g:132:5: (e= EQUALS (b= IDENTIFIER |b= TOKEN |b= NUMBER |b= DOT |b= ANY ) )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==EQUALS) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// src/core/koopa/core/grammars/generator/KG.g:132:6: e= EQUALS (b= IDENTIFIER |b= TOKEN |b= NUMBER |b= DOT |b= ANY )
							{
							e=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_part1093);  
							stream_EQUALS.add(e);

							// src/core/koopa/core/grammars/generator/KG.g:132:15: (b= IDENTIFIER |b= TOKEN |b= NUMBER |b= DOT |b= ANY )
							int alt12=5;
							switch ( input.LA(1) ) {
							case IDENTIFIER:
								{
								alt12=1;
								}
								break;
							case TOKEN:
								{
								alt12=2;
								}
								break;
							case NUMBER:
								{
								alt12=3;
								}
								break;
							case DOT:
								{
								alt12=4;
								}
								break;
							case ANY:
								{
								alt12=5;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 12, 0, input);
								throw nvae;
							}
							switch (alt12) {
								case 1 :
									// src/core/koopa/core/grammars/generator/KG.g:132:16: b= IDENTIFIER
									{
									b=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_part1098);  
									stream_IDENTIFIER.add(b);

									}
									break;
								case 2 :
									// src/core/koopa/core/grammars/generator/KG.g:132:31: b= TOKEN
									{
									b=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_part1104);  
									stream_TOKEN.add(b);

									}
									break;
								case 3 :
									// src/core/koopa/core/grammars/generator/KG.g:132:41: b= NUMBER
									{
									b=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_part1110);  
									stream_NUMBER.add(b);

									}
									break;
								case 4 :
									// src/core/koopa/core/grammars/generator/KG.g:132:52: b= DOT
									{
									b=(Token)match(input,DOT,FOLLOW_DOT_in_part1116);  
									stream_DOT.add(b);

									}
									break;
								case 5 :
									// src/core/koopa/core/grammars/generator/KG.g:132:60: b= ANY
									{
									b=(Token)match(input,ANY,FOLLOW_ANY_in_part1122);  
									stream_ANY.add(b);

									}
									break;

							}

							}
							break;

					}

					// AST REWRITE
					// elements: a, b, IDENTIFIER
					// token labels: a, b
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
					RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 134:5: -> { e != null }? ^( ASSIGN $a $b)
					if ( e != null ) {
						// src/core/koopa/core/grammars/generator/KG.g:134:23: ^( ASSIGN $a $b)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						adaptor.addChild(root_1, stream_a.nextNode());
						adaptor.addChild(root_1, stream_b.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 135:5: -> IDENTIFIER
					{
						adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// src/core/koopa/core/grammars/generator/KG.g:137:5: TOKEN
					{
					root_0 = (CommonTree)adaptor.nil();


					TOKEN26=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_part1165); 
					TOKEN26_tree = (CommonTree)adaptor.create(TOKEN26);
					adaptor.addChild(root_0, TOKEN26_tree);

					}
					break;
				case 8 :
					// src/core/koopa/core/grammars/generator/KG.g:139:5: DOT
					{
					root_0 = (CommonTree)adaptor.nil();


					DOT27=(Token)match(input,DOT,FOLLOW_DOT_in_part1172); 
					DOT27_tree = (CommonTree)adaptor.create(DOT27);
					adaptor.addChild(root_0, DOT27_tree);

					}
					break;
				case 9 :
					// src/core/koopa/core/grammars/generator/KG.g:141:5: OPEN_PAREN sequence (m+= more )* CLOSE_PAREN (r= STAR |r= PLUS )?
					{
					OPEN_PAREN28=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_part1179);  
					stream_OPEN_PAREN.add(OPEN_PAREN28);

					pushFollow(FOLLOW_sequence_in_part1181);
					sequence29=sequence();
					state._fsp--;

					stream_sequence.add(sequence29.getTree());
					// src/core/koopa/core/grammars/generator/KG.g:141:26: (m+= more )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==PIPE) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// src/core/koopa/core/grammars/generator/KG.g:141:26: m+= more
							{
							pushFollow(FOLLOW_more_in_part1185);
							m=more();
							state._fsp--;

							stream_more.add(m.getTree());
							if (list_m==null) list_m=new ArrayList<Object>();
							list_m.add(m.getTree());
							}
							break;

						default :
							break loop14;
						}
					}

					CLOSE_PAREN30=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_part1188);  
					stream_CLOSE_PAREN.add(CLOSE_PAREN30);

					// src/core/koopa/core/grammars/generator/KG.g:141:46: (r= STAR |r= PLUS )?
					int alt15=3;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==STAR) ) {
						alt15=1;
					}
					else if ( (LA15_0==PLUS) ) {
						alt15=2;
					}
					switch (alt15) {
						case 1 :
							// src/core/koopa/core/grammars/generator/KG.g:141:47: r= STAR
							{
							r=(Token)match(input,STAR,FOLLOW_STAR_in_part1193);  
							stream_STAR.add(r);

							}
							break;
						case 2 :
							// src/core/koopa/core/grammars/generator/KG.g:141:56: r= PLUS
							{
							r=(Token)match(input,PLUS,FOLLOW_PLUS_in_part1199);  
							stream_PLUS.add(r);

							}
							break;

					}

					// AST REWRITE
					// elements: r, sequence, sequence, more, r, sequence, sequence, more
					// token labels: r
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_r=new RewriteRuleTokenStream(adaptor,"token r",r);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 143:5: -> { r != null && m != null }? ^( $r ^( CHOICE sequence ( more )* ) )
					if ( r != null && m != null ) {
						// src/core/koopa/core/grammars/generator/KG.g:143:36: ^( $r ^( CHOICE sequence ( more )* ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_r.nextNode(), root_1);
						// src/core/koopa/core/grammars/generator/KG.g:143:41: ^( CHOICE sequence ( more )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHOICE, "CHOICE"), root_2);
						adaptor.addChild(root_2, stream_sequence.nextTree());
						// src/core/koopa/core/grammars/generator/KG.g:143:59: ( more )*
						while ( stream_more.hasNext() ) {
							adaptor.addChild(root_2, stream_more.nextTree());
						}
						stream_more.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}

					else // 144:5: -> { r != null && m == null }? ^( $r sequence )
					if ( r != null && m == null ) {
						// src/core/koopa/core/grammars/generator/KG.g:144:36: ^( $r sequence )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_r.nextNode(), root_1);
						adaptor.addChild(root_1, stream_sequence.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 145:5: -> { r == null && m != null }? ^( CHOICE sequence ( more )* )
					if ( r == null && m != null ) {
						// src/core/koopa/core/grammars/generator/KG.g:145:41: ^( CHOICE sequence ( more )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHOICE, "CHOICE"), root_1);
						adaptor.addChild(root_1, stream_sequence.nextTree());
						// src/core/koopa/core/grammars/generator/KG.g:145:59: ( more )*
						while ( stream_more.hasNext() ) {
							adaptor.addChild(root_1, stream_more.nextTree());
						}
						stream_more.reset();

						adaptor.addChild(root_0, root_1);
						}

					}

					else // 146:5: -> sequence
					{
						adaptor.addChild(root_0, stream_sequence.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					// src/core/koopa/core/grammars/generator/KG.g:148:5: OPEN_BRACKET sequence (m+= more )* CLOSE_BRACKET (r= STAR |r= PLUS )?
					{
					OPEN_BRACKET31=(Token)match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_part1334);  
					stream_OPEN_BRACKET.add(OPEN_BRACKET31);

					pushFollow(FOLLOW_sequence_in_part1336);
					sequence32=sequence();
					state._fsp--;

					stream_sequence.add(sequence32.getTree());
					// src/core/koopa/core/grammars/generator/KG.g:148:28: (m+= more )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==PIPE) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// src/core/koopa/core/grammars/generator/KG.g:148:28: m+= more
							{
							pushFollow(FOLLOW_more_in_part1340);
							m=more();
							state._fsp--;

							stream_more.add(m.getTree());
							if (list_m==null) list_m=new ArrayList<Object>();
							list_m.add(m.getTree());
							}
							break;

						default :
							break loop16;
						}
					}

					CLOSE_BRACKET33=(Token)match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_part1343);  
					stream_CLOSE_BRACKET.add(CLOSE_BRACKET33);

					// src/core/koopa/core/grammars/generator/KG.g:148:50: (r= STAR |r= PLUS )?
					int alt17=3;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==STAR) ) {
						alt17=1;
					}
					else if ( (LA17_0==PLUS) ) {
						alt17=2;
					}
					switch (alt17) {
						case 1 :
							// src/core/koopa/core/grammars/generator/KG.g:148:51: r= STAR
							{
							r=(Token)match(input,STAR,FOLLOW_STAR_in_part1348);  
							stream_STAR.add(r);

							}
							break;
						case 2 :
							// src/core/koopa/core/grammars/generator/KG.g:148:60: r= PLUS
							{
							r=(Token)match(input,PLUS,FOLLOW_PLUS_in_part1354);  
							stream_PLUS.add(r);

							}
							break;

					}

					// AST REWRITE
					// elements: r, r, more, more, sequence, sequence, sequence, sequence
					// token labels: r
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_r=new RewriteRuleTokenStream(adaptor,"token r",r);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 150:5: -> { r != null && m != null }? ^( $r ^( OPTIONAL ^( CHOICE sequence ( more )* ) ) )
					if ( r != null && m != null ) {
						// src/core/koopa/core/grammars/generator/KG.g:150:36: ^( $r ^( OPTIONAL ^( CHOICE sequence ( more )* ) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_r.nextNode(), root_1);
						// src/core/koopa/core/grammars/generator/KG.g:150:41: ^( OPTIONAL ^( CHOICE sequence ( more )* ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONAL, "OPTIONAL"), root_2);
						// src/core/koopa/core/grammars/generator/KG.g:150:52: ^( CHOICE sequence ( more )* )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHOICE, "CHOICE"), root_3);
						adaptor.addChild(root_3, stream_sequence.nextTree());
						// src/core/koopa/core/grammars/generator/KG.g:150:70: ( more )*
						while ( stream_more.hasNext() ) {
							adaptor.addChild(root_3, stream_more.nextTree());
						}
						stream_more.reset();

						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}

					else // 151:5: -> { r != null && m == null }? ^( $r ^( OPTIONAL ^( CHOICE sequence ) ) )
					if ( r != null && m == null ) {
						// src/core/koopa/core/grammars/generator/KG.g:151:36: ^( $r ^( OPTIONAL ^( CHOICE sequence ) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_r.nextNode(), root_1);
						// src/core/koopa/core/grammars/generator/KG.g:151:41: ^( OPTIONAL ^( CHOICE sequence ) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONAL, "OPTIONAL"), root_2);
						// src/core/koopa/core/grammars/generator/KG.g:151:52: ^( CHOICE sequence )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHOICE, "CHOICE"), root_3);
						adaptor.addChild(root_3, stream_sequence.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}

					else // 152:5: -> { r == null && m != null }? ^( OPTIONAL ^( CHOICE sequence ( more )* ) )
					if ( r == null && m != null ) {
						// src/core/koopa/core/grammars/generator/KG.g:152:41: ^( OPTIONAL ^( CHOICE sequence ( more )* ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONAL, "OPTIONAL"), root_1);
						// src/core/koopa/core/grammars/generator/KG.g:152:52: ^( CHOICE sequence ( more )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHOICE, "CHOICE"), root_2);
						adaptor.addChild(root_2, stream_sequence.nextTree());
						// src/core/koopa/core/grammars/generator/KG.g:152:70: ( more )*
						while ( stream_more.hasNext() ) {
							adaptor.addChild(root_2, stream_more.nextTree());
						}
						stream_more.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}

					else // 153:5: -> ^( OPTIONAL sequence )
					{
						// src/core/koopa/core/grammars/generator/KG.g:153:41: ^( OPTIONAL sequence )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONAL, "OPTIONAL"), root_1);
						adaptor.addChild(root_1, stream_sequence.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// src/core/koopa/core/grammars/generator/KG.g:155:5: SKIP_TO part
					{
					SKIP_TO34=(Token)match(input,SKIP_TO,FOLLOW_SKIP_TO_in_part1506);  
					stream_SKIP_TO.add(SKIP_TO34);

					pushFollow(FOLLOW_part_in_part1508);
					part35=part();
					state._fsp--;

					stream_part.add(part35.getTree());
					// AST REWRITE
					// elements: part, SKIP_TO
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 157:5: -> ^( SKIP_TO part )
					{
						// src/core/koopa/core/grammars/generator/KG.g:157:8: ^( SKIP_TO part )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_SKIP_TO.nextNode(), root_1);
						adaptor.addChild(root_1, stream_part.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 12 :
					// src/core/koopa/core/grammars/generator/KG.g:159:5: BANG OPEN_BRACKET sequence (m+= more )* CLOSE_BRACKET
					{
					BANG36=(Token)match(input,BANG,FOLLOW_BANG_in_part1532);  
					stream_BANG.add(BANG36);

					OPEN_BRACKET37=(Token)match(input,OPEN_BRACKET,FOLLOW_OPEN_BRACKET_in_part1534);  
					stream_OPEN_BRACKET.add(OPEN_BRACKET37);

					pushFollow(FOLLOW_sequence_in_part1536);
					sequence38=sequence();
					state._fsp--;

					stream_sequence.add(sequence38.getTree());
					// src/core/koopa/core/grammars/generator/KG.g:159:33: (m+= more )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==PIPE) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// src/core/koopa/core/grammars/generator/KG.g:159:33: m+= more
							{
							pushFollow(FOLLOW_more_in_part1540);
							m=more();
							state._fsp--;

							stream_more.add(m.getTree());
							if (list_m==null) list_m=new ArrayList<Object>();
							list_m.add(m.getTree());
							}
							break;

						default :
							break loop18;
						}
					}

					CLOSE_BRACKET39=(Token)match(input,CLOSE_BRACKET,FOLLOW_CLOSE_BRACKET_in_part1543);  
					stream_CLOSE_BRACKET.add(CLOSE_BRACKET39);

					// AST REWRITE
					// elements: sequence, more, sequence
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 161:5: -> { m == null }? ^( OPTIONAL sequence )
					if ( m == null ) {
						// src/core/koopa/core/grammars/generator/KG.g:161:23: ^( OPTIONAL sequence )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONAL, "OPTIONAL"), root_1);
						adaptor.addChild(root_1, stream_sequence.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 162:5: -> ^( OPTIONAL ^( PERMUTED sequence ( more )* ) )
					{
						// src/core/koopa/core/grammars/generator/KG.g:162:8: ^( OPTIONAL ^( PERMUTED sequence ( more )* ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONAL, "OPTIONAL"), root_1);
						// src/core/koopa/core/grammars/generator/KG.g:162:19: ^( PERMUTED sequence ( more )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PERMUTED, "PERMUTED"), root_2);
						adaptor.addChild(root_2, stream_sequence.nextTree());
						// src/core/koopa/core/grammars/generator/KG.g:162:39: ( more )*
						while ( stream_more.hasNext() ) {
							adaptor.addChild(root_2, stream_more.nextTree());
						}
						stream_more.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 13 :
					// src/core/koopa/core/grammars/generator/KG.g:164:5: BANG OPEN_PAREN sequence (m+= more )* CLOSE_PAREN
					{
					BANG40=(Token)match(input,BANG,FOLLOW_BANG_in_part1590);  
					stream_BANG.add(BANG40);

					OPEN_PAREN41=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_part1592);  
					stream_OPEN_PAREN.add(OPEN_PAREN41);

					pushFollow(FOLLOW_sequence_in_part1594);
					sequence42=sequence();
					state._fsp--;

					stream_sequence.add(sequence42.getTree());
					// src/core/koopa/core/grammars/generator/KG.g:164:31: (m+= more )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==PIPE) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// src/core/koopa/core/grammars/generator/KG.g:164:31: m+= more
							{
							pushFollow(FOLLOW_more_in_part1598);
							m=more();
							state._fsp--;

							stream_more.add(m.getTree());
							if (list_m==null) list_m=new ArrayList<Object>();
							list_m.add(m.getTree());
							}
							break;

						default :
							break loop19;
						}
					}

					CLOSE_PAREN43=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_part1601);  
					stream_CLOSE_PAREN.add(CLOSE_PAREN43);

					// AST REWRITE
					// elements: sequence, more, sequence
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 166:5: -> { m == null }? sequence
					if ( m == null ) {
						adaptor.addChild(root_0, stream_sequence.nextTree());
					}

					else // 167:5: -> ^( PERMUTED sequence ( more )* )
					{
						// src/core/koopa/core/grammars/generator/KG.g:167:8: ^( PERMUTED sequence ( more )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PERMUTED, "PERMUTED"), root_1);
						adaptor.addChild(root_1, stream_sequence.nextTree());
						// src/core/koopa/core/grammars/generator/KG.g:167:28: ( more )*
						while ( stream_more.hasNext() ) {
							adaptor.addChild(root_1, stream_more.nextTree());
						}
						stream_more.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 14 :
					// src/core/koopa/core/grammars/generator/KG.g:169:5: DOLLAR OPEN_PAREN dispatch (m+= more_dispatch )* CLOSE_PAREN
					{
					DOLLAR44=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_part1640);  
					stream_DOLLAR.add(DOLLAR44);

					OPEN_PAREN45=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_part1642);  
					stream_OPEN_PAREN.add(OPEN_PAREN45);

					pushFollow(FOLLOW_dispatch_in_part1644);
					dispatch46=dispatch();
					state._fsp--;

					stream_dispatch.add(dispatch46.getTree());
					// src/core/koopa/core/grammars/generator/KG.g:169:33: (m+= more_dispatch )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==PIPE) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// src/core/koopa/core/grammars/generator/KG.g:169:33: m+= more_dispatch
							{
							pushFollow(FOLLOW_more_dispatch_in_part1648);
							m=more_dispatch();
							state._fsp--;

							stream_more_dispatch.add(m.getTree());
							if (list_m==null) list_m=new ArrayList<Object>();
							list_m.add(m.getTree());
							}
							break;

						default :
							break loop20;
						}
					}

					CLOSE_PAREN47=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_part1651);  
					stream_CLOSE_PAREN.add(CLOSE_PAREN47);

					// AST REWRITE
					// elements: more_dispatch, dispatch, dispatch
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 171:5: -> { m == null }? ^( DISPATCHED dispatch )
					if ( m == null ) {
						// src/core/koopa/core/grammars/generator/KG.g:171:23: ^( DISPATCHED dispatch )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISPATCHED, "DISPATCHED"), root_1);
						adaptor.addChild(root_1, stream_dispatch.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 172:5: -> ^( DISPATCHED dispatch ( more_dispatch )* )
					{
						// src/core/koopa/core/grammars/generator/KG.g:172:8: ^( DISPATCHED dispatch ( more_dispatch )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISPATCHED, "DISPATCHED"), root_1);
						adaptor.addChild(root_1, stream_dispatch.nextTree());
						// src/core/koopa/core/grammars/generator/KG.g:172:30: ( more_dispatch )*
						while ( stream_more_dispatch.hasNext() ) {
							adaptor.addChild(root_1, stream_more_dispatch.nextTree());
						}
						stream_more_dispatch.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 15 :
					// src/core/koopa/core/grammars/generator/KG.g:174:5: NOT part
					{
					NOT48=(Token)match(input,NOT,FOLLOW_NOT_in_part1694);  
					stream_NOT.add(NOT48);

					pushFollow(FOLLOW_part_in_part1696);
					part49=part();
					state._fsp--;

					stream_part.add(part49.getTree());
					// AST REWRITE
					// elements: part, NOT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 175:5: -> ^( NOT part )
					{
						// src/core/koopa/core/grammars/generator/KG.g:175:8: ^( NOT part )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_part.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 16 :
					// src/core/koopa/core/grammars/generator/KG.g:177:5: NOSKIP part
					{
					NOSKIP50=(Token)match(input,NOSKIP,FOLLOW_NOSKIP_in_part1715);  
					stream_NOSKIP.add(NOSKIP50);

					pushFollow(FOLLOW_part_in_part1717);
					part51=part();
					state._fsp--;

					stream_part.add(part51.getTree());
					// AST REWRITE
					// elements: NOSKIP, part
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 178:3: -> ^( NOSKIP part )
					{
						// src/core/koopa/core/grammars/generator/KG.g:178:6: ^( NOSKIP part )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_NOSKIP.nextNode(), root_1);
						adaptor.addChild(root_1, stream_part.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 17 :
					// src/core/koopa/core/grammars/generator/KG.g:180:5: LIMIT part BY part
					{
					LIMIT52=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_part1734);  
					stream_LIMIT.add(LIMIT52);

					pushFollow(FOLLOW_part_in_part1736);
					part53=part();
					state._fsp--;

					stream_part.add(part53.getTree());
					BY54=(Token)match(input,BY,FOLLOW_BY_in_part1738);  
					stream_BY.add(BY54);

					pushFollow(FOLLOW_part_in_part1740);
					part55=part();
					state._fsp--;

					stream_part.add(part55.getTree());
					// AST REWRITE
					// elements: part, part, LIMIT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 181:3: -> ^( LIMIT part part )
					{
						// src/core/koopa/core/grammars/generator/KG.g:181:6: ^( LIMIT part part )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_part.nextTree());
						adaptor.addChild(root_1, stream_part.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 18 :
					// src/core/koopa/core/grammars/generator/KG.g:183:5: WITH p= part SKIP_TO q= part
					{
					WITH56=(Token)match(input,WITH,FOLLOW_WITH_in_part1759);  
					stream_WITH.add(WITH56);

					pushFollow(FOLLOW_part_in_part1763);
					p=part();
					state._fsp--;

					stream_part.add(p.getTree());
					SKIP_TO57=(Token)match(input,SKIP_TO,FOLLOW_SKIP_TO_in_part1765);  
					stream_SKIP_TO.add(SKIP_TO57);

					pushFollow(FOLLOW_part_in_part1769);
					q=part();
					state._fsp--;

					stream_part.add(q.getTree());
					// AST REWRITE
					// elements: q, q, SKIP_TO, p
					// token labels: 
					// rule labels: p, q, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.getTree():null);
					RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 184:3: -> ^( SEQUENCE ^( LIMIT $p $q) ^( SKIP_TO $q) )
					{
						// src/core/koopa/core/grammars/generator/KG.g:184:6: ^( SEQUENCE ^( LIMIT $p $q) ^( SKIP_TO $q) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);
						// src/core/koopa/core/grammars/generator/KG.g:185:8: ^( LIMIT $p $q)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIMIT, "LIMIT"), root_2);
						adaptor.addChild(root_2, stream_p.nextTree());
						adaptor.addChild(root_2, stream_q.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// src/core/koopa/core/grammars/generator/KG.g:186:8: ^( SKIP_TO $q)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_SKIP_TO.nextNode(), root_2);
						adaptor.addChild(root_2, stream_q.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "part"


	public static class more_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "more"
	// src/core/koopa/core/grammars/generator/KG.g:189:1: more : PIPE sequence -> sequence ;
	public final KGParser.more_return more() throws RecognitionException {
		KGParser.more_return retval = new KGParser.more_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PIPE58=null;
		ParserRuleReturnScope sequence59 =null;

		CommonTree PIPE58_tree=null;
		RewriteRuleTokenStream stream_PIPE=new RewriteRuleTokenStream(adaptor,"token PIPE");
		RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:190:3: ( PIPE sequence -> sequence )
			// src/core/koopa/core/grammars/generator/KG.g:190:5: PIPE sequence
			{
			PIPE58=(Token)match(input,PIPE,FOLLOW_PIPE_in_more1821);  
			stream_PIPE.add(PIPE58);

			pushFollow(FOLLOW_sequence_in_more1823);
			sequence59=sequence();
			state._fsp--;

			stream_sequence.add(sequence59.getTree());
			// AST REWRITE
			// elements: sequence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 192:5: -> sequence
			{
				adaptor.addChild(root_0, stream_sequence.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "more"


	public static class dispatch_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dispatch"
	// src/core/koopa/core/grammars/generator/KG.g:195:1: dispatch : TOKEN ARROW sequence -> ^( CASE TOKEN sequence ) ;
	public final KGParser.dispatch_return dispatch() throws RecognitionException {
		KGParser.dispatch_return retval = new KGParser.dispatch_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TOKEN60=null;
		Token ARROW61=null;
		ParserRuleReturnScope sequence62 =null;

		CommonTree TOKEN60_tree=null;
		CommonTree ARROW61_tree=null;
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleTokenStream stream_TOKEN=new RewriteRuleTokenStream(adaptor,"token TOKEN");
		RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:196:3: ( TOKEN ARROW sequence -> ^( CASE TOKEN sequence ) )
			// src/core/koopa/core/grammars/generator/KG.g:196:5: TOKEN ARROW sequence
			{
			TOKEN60=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_dispatch1849);  
			stream_TOKEN.add(TOKEN60);

			ARROW61=(Token)match(input,ARROW,FOLLOW_ARROW_in_dispatch1851);  
			stream_ARROW.add(ARROW61);

			pushFollow(FOLLOW_sequence_in_dispatch1853);
			sequence62=sequence();
			state._fsp--;

			stream_sequence.add(sequence62.getTree());
			// AST REWRITE
			// elements: sequence, TOKEN
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 198:5: -> ^( CASE TOKEN sequence )
			{
				// src/core/koopa/core/grammars/generator/KG.g:198:8: ^( CASE TOKEN sequence )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASE, "CASE"), root_1);
				adaptor.addChild(root_1, stream_TOKEN.nextNode());
				adaptor.addChild(root_1, stream_sequence.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatch"


	public static class more_dispatch_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "more_dispatch"
	// src/core/koopa/core/grammars/generator/KG.g:201:1: more_dispatch : PIPE dispatch -> dispatch ;
	public final KGParser.more_dispatch_return more_dispatch() throws RecognitionException {
		KGParser.more_dispatch_return retval = new KGParser.more_dispatch_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PIPE63=null;
		ParserRuleReturnScope dispatch64 =null;

		CommonTree PIPE63_tree=null;
		RewriteRuleTokenStream stream_PIPE=new RewriteRuleTokenStream(adaptor,"token PIPE");
		RewriteRuleSubtreeStream stream_dispatch=new RewriteRuleSubtreeStream(adaptor,"rule dispatch");

		try {
			// src/core/koopa/core/grammars/generator/KG.g:202:3: ( PIPE dispatch -> dispatch )
			// src/core/koopa/core/grammars/generator/KG.g:202:5: PIPE dispatch
			{
			PIPE63=(Token)match(input,PIPE,FOLLOW_PIPE_in_more_dispatch1885);  
			stream_PIPE.add(PIPE63);

			pushFollow(FOLLOW_dispatch_in_more_dispatch1887);
			dispatch64=dispatch();
			state._fsp--;

			stream_dispatch.add(dispatch64.getTree());
			// AST REWRITE
			// elements: dispatch
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 204:5: -> dispatch
			{
				adaptor.addChild(root_0, stream_dispatch.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "more_dispatch"

	// Delegated rules



	public static final BitSet FOLLOW_meta_in_koopa146 = new BitSet(new long[]{0x0800C00000000000L});
	public static final BitSet FOLLOW_rule_in_koopa155 = new BitSet(new long[]{0x0800C00000000000L});
	public static final BitSet FOLLOW_EOF_in_koopa158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_meta192 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_meta196 = new BitSet(new long[]{0x0040000008000000L});
	public static final BitSet FOLLOW_name_in_meta200 = new BitSet(new long[]{0x2000000000800000L});
	public static final BitSet FOLLOW_61_in_meta207 = new BitSet(new long[]{0x0040000008000000L});
	public static final BitSet FOLLOW_name_in_meta211 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_DOT_in_meta219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_name399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_name409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_modifier431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIVATE_in_modifier445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_rule468 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_rule472 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_rule476 = new BitSet(new long[]{0x8000020001000000L});
	public static final BitSet FOLLOW_OPEN_PAREN_in_rule485 = new BitSet(new long[]{0x0040000008000000L});
	public static final BitSet FOLLOW_locals_in_rule489 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CLOSE_PAREN_in_rule491 = new BitSet(new long[]{0x8000000001000000L});
	public static final BitSet FOLLOW_63_in_rule502 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_rule506 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_EQUALS_in_rule510 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_sequence_in_rule521 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_rule530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_locals790 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_COMMA_in_locals793 = new BitSet(new long[]{0x0040000008000000L});
	public static final BitSet FOLLOW_declaration_in_locals795 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_name_in_declaration826 = new BitSet(new long[]{0x0040000008000000L});
	public static final BitSet FOLLOW_name_in_declaration830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_sequence863 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COLON_in_sequence865 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_part_in_sequence871 = new BitSet(new long[]{0x046803E868C00222L});
	public static final BitSet FOLLOW_NATIVE_CODE_in_part1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_in_part1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANY_in_part1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_part1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_part1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_part1083 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_EQUALS_in_part1093 = new BitSet(new long[]{0x0040008008800020L});
	public static final BitSet FOLLOW_IDENTIFIER_in_part1098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_part1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_part1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_part1116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANY_in_part1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_part1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_part1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_PAREN_in_part1179 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_sequence_in_part1181 = new BitSet(new long[]{0x0000100000008000L});
	public static final BitSet FOLLOW_more_in_part1185 = new BitSet(new long[]{0x0000100000008000L});
	public static final BitSet FOLLOW_CLOSE_PAREN_in_part1188 = new BitSet(new long[]{0x0010200000000002L});
	public static final BitSet FOLLOW_STAR_in_part1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_part1199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACKET_in_part1334 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_sequence_in_part1336 = new BitSet(new long[]{0x0000100000004000L});
	public static final BitSet FOLLOW_more_in_part1340 = new BitSet(new long[]{0x0000100000004000L});
	public static final BitSet FOLLOW_CLOSE_BRACKET_in_part1343 = new BitSet(new long[]{0x0010200000000002L});
	public static final BitSet FOLLOW_STAR_in_part1348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_part1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SKIP_TO_in_part1506 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_part_in_part1508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BANG_in_part1532 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_OPEN_BRACKET_in_part1534 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_sequence_in_part1536 = new BitSet(new long[]{0x0000100000004000L});
	public static final BitSet FOLLOW_more_in_part1540 = new BitSet(new long[]{0x0000100000004000L});
	public static final BitSet FOLLOW_CLOSE_BRACKET_in_part1543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BANG_in_part1590 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_OPEN_PAREN_in_part1592 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_sequence_in_part1594 = new BitSet(new long[]{0x0000100000008000L});
	public static final BitSet FOLLOW_more_in_part1598 = new BitSet(new long[]{0x0000100000008000L});
	public static final BitSet FOLLOW_CLOSE_PAREN_in_part1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOLLAR_in_part1640 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_OPEN_PAREN_in_part1642 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_dispatch_in_part1644 = new BitSet(new long[]{0x0000100000008000L});
	public static final BitSet FOLLOW_more_dispatch_in_part1648 = new BitSet(new long[]{0x0000100000008000L});
	public static final BitSet FOLLOW_CLOSE_PAREN_in_part1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_part1694 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_part_in_part1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOSKIP_in_part1715 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_part_in_part1717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIMIT_in_part1734 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_part_in_part1736 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_part1738 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_part_in_part1740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_part1759 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_part_in_part1763 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_SKIP_TO_in_part1765 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_part_in_part1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PIPE_in_more1821 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_sequence_in_more1823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_in_dispatch1849 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ARROW_in_dispatch1851 = new BitSet(new long[]{0x046803E868C00220L});
	public static final BitSet FOLLOW_sequence_in_dispatch1853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PIPE_in_more_dispatch1885 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_dispatch_in_more_dispatch1887 = new BitSet(new long[]{0x0000000000000002L});
}
