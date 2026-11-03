package com.github.aibox.osc.util

object LocalAddress {
    @JvmStatic
    var provider: (() -> String?)? = null

    @JvmStatic
    fun get(): String = provider?.invoke() ?: ""
}
