package org.luart.test

import org.junit.jupiter.api.Test
import org.luart.core.Luart
import kotlin.test.assertFalse

class SanitizeTest {
    private val sanitizedInput: String

    init {
        val luart = Luart(this::class.java.classLoader.getResource("sample.lua").readText(), "")
        sanitizedInput = luart.sources
    }

    @Test
    fun sanitizeTest() {
        /* no multi comments */
        assertFalse { sanitizedInput.contains("[[--") }
        /* no mono comment */
        assertFalse { sanitizedInput.contains("--") }
        /* no whitespaces */
        assertFalse { sanitizedInput.contains(Regex("\\s\\s+")) }
    }
}