package com.github.aibox.osc.player.host

interface TextureRenderHost {

    fun setOnSurfaceReadyListener(listener: Runnable?)

    fun setOutputSize(width: Int, height: Int)
}
