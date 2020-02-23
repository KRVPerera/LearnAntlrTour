/**
    grammer name
 */

 grammar ArrayInit;

@header {
    package com.krv.tour;
}

/** A rule called init that matchers comma-separated values betwen
{...} */
init : '{' value (',' value )* '}' ; // atlease one value

/** A value can be either a nested array/struct 
or a simple integer (INT) */
value : init
      | INT
      ;

// parser rules start with lowercase letters, lexer rules 
// withg uppercase
INT : [0-9]+ ; 
WS : [ \t\r\n]+ -> skip; // toss out whitespace
