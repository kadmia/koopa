package koopa.app;

import java.awt.Component;
import java.io.File;

import koopa.cobol.parser.cobol.ParsingCoordinator;
import koopa.core.data.Token;
import koopa.core.util.Tuple;

import org.antlr.runtime.tree.CommonTree;

public interface Application {

	void openFile(File file);

	void openFile(File file, ParsingCoordinator parsingCoordinator);

	void openFile(File file, ParsingCoordinator parsingCoordinator,
			Tuple<Token, String> detail);

	void reloadFile();

	void closeView();

	void scrollTo(int position);

	void resultsWereCleared();

	void walkingAndParsing();

	void doneWalkingAndParsing();

	void addApplicationListener(ApplicationListener listener);

	CommonTree getSyntaxTree();

	// TODO Set up a View type.
	Component getView();

	void closeView(Component component);

	void showGrammarRule(String name);

	void showGrammarRules();

	void quitParsing();
}