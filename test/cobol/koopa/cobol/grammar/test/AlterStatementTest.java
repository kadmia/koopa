package koopa.cobol.grammar.test;

import junit.framework.TestCase;
import koopa.core.parsers.Parser;
import koopa.core.data.Token;
import koopa.core.sources.Source;
import koopa.core.sources.test.TestTokenizer;

import org.junit.Test;

/** This code was generated from AlterStatement.stage. */
public class AlterStatementTest extends TestCase {

  private static koopa.cobol.grammar.CobolGrammar grammar = new koopa.cobol.grammar.CobolGrammar();

  private Source<Token> getTokenizer(String input) {
    return koopa.cobol.sources.test.CobolTestSource.forSample(input);
  }

    @Test
    public void testAlterStatement_1() {
      Parser parser = grammar.alterStatement();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer(getTokenizer(" ALTER PARA-59 TO PROCEED TO PARA-59C "));
      assertTrue(parser.accepts(tokenizer));
      assertTrue(tokenizer.isWhereExpected());
    }

    @Test
    public void testAlterStatement_2() {
      Parser parser = grammar.alterStatement();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer(getTokenizer(" ALTER ALTER-A TO PROCEED TO ALTER-C\n         ALTER-D TO PROCEED TO ALTER-F\n         ALTER-F TO PROCEED TO ALTER-H "));
      assertTrue(parser.accepts(tokenizer));
      assertTrue(tokenizer.isWhereExpected());
    }

    @Test
    public void testAlterStatement_3() {
      Parser parser = grammar.alterStatement();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer(getTokenizer(" ALTER ALTER-A-2 TO PROCEED TO ALTER-B-2\n         ALTER-TESTT-2 TO PROCEED TO ALTER-TESTT-2\n         ALTER-D-2 TO PROCEED TO ALTER-E-2 "));
      assertTrue(parser.accepts(tokenizer));
      assertTrue(tokenizer.isWhereExpected());
    }

    @Test
    public void testAlterStatement_4() {
      Parser parser = grammar.alterStatement();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer(getTokenizer(" ALTER PARA-5A IN QUAL-SECTION-1 TO PROCEED TO PARA-5C OF QUAL-SECTION-2 "));
      assertTrue(parser.accepts(tokenizer));
      assertTrue(tokenizer.isWhereExpected());
    }
}