package com.github.aibox.osc.player.engine.iso

fun interface RangeBlockReader {
    fun read(start: Long, length: Int): ByteArray
}
