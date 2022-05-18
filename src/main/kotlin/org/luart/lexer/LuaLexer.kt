package org.luart.lexer

import org.luart.domain.LuaContext
import java.lang.StringBuilder

class LuaLexer(sources: String) {
    val data: CharArray
    lateinit var context: LuaContext
    var index = 0

    val keywords = mapOf(
        Keyword.FOR.value to Keyword.LOCAL,
        Keyword.WHILE.value to Keyword.WHILE,
        Keyword.LOCAL.value to Keyword.LOCAL,
        Keyword.FUNCTION.value to Keyword.FUNCTION,
        Keyword.AND.value to Keyword.AND,
        Keyword.BREAK.value to Keyword.BREAK,
        Keyword.DO.value to Keyword.DO,
        Keyword.ELSE.value to Keyword.ELSE,
        Keyword.ELSEIF.value to Keyword.ELSEIF,
        Keyword.END.value to Keyword.END,
        Keyword.IF.value to Keyword.IF,
        Keyword.IN.value to Keyword.IN,
        Keyword.NIL.value to Keyword.NIL,
        Keyword.NOT.value to Keyword.NOT,
        Keyword.OR.value to Keyword.OR,
        Keyword.REPEAT.value to Keyword.REPEAT,
        Keyword.RETURN.value to Keyword.RETURN,
        Keyword.THEN.value to Keyword.THEN,
        Keyword.UNTIL.value to Keyword.UNTIL
    )

    init {
        this.data = sources.toCharArray()
    }

    enum class Regexes(val value: Regex) {

    }

    fun initLuaContext(): LuaContext {
        parseTokens()
        return context;
    }

    fun parseTokens() {
        while(index != data.size) {
            val token = readNextToken()


        }
    }

    fun readNextToken(): String {
        val token = StringBuilder()
        while (data[index] != Operator.SPACE.value)
            token.append(data[index++])
        ++index; /* jump next space */
        return token.toString()
    }
}