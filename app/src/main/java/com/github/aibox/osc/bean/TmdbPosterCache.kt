package com.github.aibox.osc.bean

interface TmdbPosterCache {

    fun tmdbCachedPoster(name: String?, year: Int, altName: String?): String?
}
