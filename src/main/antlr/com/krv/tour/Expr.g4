/**
    grammer name
 */

 grammar Expr;
 import CommonLexerRules;

@header {
    package com.krv.tour;
}

/** A rule called init that matchers comma-separated values betwen
{...} */
prog: stat+ ;

stat: expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;

expr: expr ('*'|'/') expr
    | expr ('+'|'-') expr
    | INT
    | ID
    |   '(' expr ')'
    ;

