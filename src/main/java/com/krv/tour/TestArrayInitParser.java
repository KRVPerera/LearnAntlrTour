package com.krv.tour;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestArrayInitParser {

    public static void runFile(String fileName) {
        try {
            String contents = new String(Files.readAllBytes(Paths.get(fileName)));
            ANTLRInputStream input = new ANTLRInputStream(contents);

            // create a lexer that feeds off of input CharStream
            ArrayInitLexer lexer = new ArrayInitLexer(input);

            // create a buffer of tokens pulled from lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the buffer tokens buffer
            ArrayInitParser parser = new ArrayInitParser(tokens);

            // beging parsing at init rule
            ParseTree tree = parser.init();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(new ShortToUnicodeString(), tree);
            System.out.println();
//            System.out.println(tree.toStringTree(parser));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void runFileExpr(String fileName) {
        try {
            String contents = new String(Files.readAllBytes(Paths.get(fileName)));
            ANTLRInputStream input = new ANTLRInputStream(contents);

            // create a lexer that feeds off of input CharStream
            ExprLexer lexer = new ExprLexer(input);

            // create a buffer of tokens pulled from lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the buffer tokens buffer
            ExprParser parser = new ExprParser(tokens);

            // beging parsing at init rule
            ParseTree tree = parser.prog();

            System.out.println(tree.toStringTree(parser));
//            System.out.println(tree.toStringTree(parser));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
        runFileExpr(args[0]);
    }
}
