package org.luart.core

import org.luart.domain.LuaContext
import org.luart.lexer.LuaLexer
import org.luart.lexer.Operator
import java.io.File

class Luart {
    val targetPath: String
    val sources: String
    lateinit var context: LuaContext

    companion object {
        @JvmStatic val REGEX_WHITESPACES = Regex("\\s+")
        @JvmStatic val REGEX_COMMENT_UNIT = Regex("--.*")
        @JvmStatic val REGEX_COMMENT_MULT = Regex("--\\[\\[[^]]+--]]")
    }

    constructor(sourceFile: File, targetPath: String): this(sourceFile.readText(), targetPath)

    constructor(input: String, targetPath: String) {
        this.targetPath = targetPath

        /* remove all comments & sanitize whitespaces */
        this.sources = input
            .replace(REGEX_COMMENT_MULT, "")
            .replace(REGEX_COMMENT_UNIT, "")
            .replace(REGEX_WHITESPACES, Operator.SPACE.value)
    }

    fun obfuscate() {
        context = LuaLexer(sources).initLuaContext();
    }
}