package org.pyxy.pyxycharm.lang

import com.intellij.lang.Language
import com.jetbrains.python.psi.PyFileElementType

class PyxyFileElementType(language: Language) : PyFileElementType(language) {
    override fun getExternalId() = "pyxy.FILE"
}