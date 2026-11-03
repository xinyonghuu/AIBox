package com.github.aibox.osc.data

import com.github.aibox.osc.util.KVKeys
import com.github.aibox.osc.util.HistoryHelper
import com.github.aibox.osc.util.KV

internal object CurrentSubscription {

    fun cid(): String {
        val apiUrl = KV.get(KVKeys.API_URL, "")
        val lineSource = KV.get(KVKeys.API_LINE_SOURCE, "")
        if (lineSource != null && lineSource.isNotEmpty() && HistoryHelper.isApiLineUrl(apiUrl)) {
            return lineSource
        }
        return apiUrl
    }
}
