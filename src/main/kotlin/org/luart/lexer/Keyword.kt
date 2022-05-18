package org.luart.lexer

enum class Keyword(val value: String) {
    FOR("for"),
    WHILE("while"),
    LOCAL("local"),
    FUNCTION("function"),
    AND("and"),
    BREAK("break"),
    DO("do"),
    ELSE("else"),
    ELSEIF("elseif"),
    END("end"),
    IF("if"),
    IN("in"),
    NIL("nil"),
    NOT("not"),
    OR("or"),
    REPEAT("repeat"),
    RETURN("return"),
    THEN("then"),
    UNTIL("until")
}