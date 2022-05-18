package org.luart.lexer

enum class Operator {
    PLUS('+'),
    MINUS('-'),
    WILDCARD('*'),
    SLASH('/'),
    PERCENT('%'),
    CHEVRON_OPEN('<'),
    CHEVRON_CLOSE('>'),
    HASHTAG("#"),
    EQUALS("=="),
    NOT_EQUALS("~="),
    SUPERIOR_STRICT('>'),
    INFERIOR_STRICT('<'),
    SUPERIOR(">="),
    INFERIOR("<="),
    ASSIGN_VALUE('='),
    PARENTHESE_OPEN('('),
    PARENTHESE_CLOSE(')'),
    BRACE_OPEN('{'),
    BRACE_CLOSE('}'),
    ARRAY_OPEN('['),
    ARRAY_CLOSE(']'),
    SEMICOLON(';'),
    TWO_POINTS(':'),
    DOT('.'),
    COMMA(','),
    DOUBLE_DOT(".."),
    TRIPLE_DOT("..."),
    SPACE(0x20);

    val value: String

    constructor(byte: Byte) : this(byte.toInt().toChar())
    constructor(char: Char) : this(char.toString())
    constructor(string: String) {
        this.value = string
    }
}