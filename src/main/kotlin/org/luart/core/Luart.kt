package org.luart.core

import org.luart.domain.LuaContext
import org.luart.lexer.LuaLexer
import java.io.File

class Luart(sourcePath: String, val targetPath: String) {
    val sources: String
    lateinit var context: LuaContext

    init {
        this.sources = File(sourcePath).readText().trim().replace("\\s+", " ")
    }

    fun obfuscate() {
        context = LuaLexer(sources).initLuaContext();
    }
}