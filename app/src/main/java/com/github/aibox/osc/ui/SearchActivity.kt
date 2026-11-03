package com.github.aibox.osc.ui

import androidx.activity.compose.setContent
import com.github.aibox.osc.R
import com.github.aibox.osc.ui.base.BaseActivity
import com.github.aibox.osc.ui.components.SheetHostScaffold
import com.github.aibox.osc.ui.theme.AVBoxTheme
import com.github.aibox.osc.ui.theme.enableTransparentEdgeToEdge

class SearchActivity : BaseActivity() {

    override fun shouldRefreshAutoSize(): Boolean = true

    override fun hideSysBar() {
    }

    override fun init() {
        enableTransparentEdgeToEdge()
        findViewById<androidx.compose.ui.platform.ComposeView>(R.id.compose_view).setContent {
            AVBoxTheme {
                SheetHostScaffold {
                    SearchScreen()
                }
            }
        }
    }
}
