package com.wstxda.gsl.shortcuts

import android.content.ComponentName
import android.content.Intent
import com.wstxda.gsl.R
import com.wstxda.gsl.activity.ShortcutsActivity
import com.wstxda.gsl.logic.launchShortcuts

class QuickShareShortcut : ShortcutsActivity() {
    override fun onCreateInternal() {
        launchShortcuts(listOf(createQuickShareIntent()), R.string.play_services_not_found)
    }

    private fun createQuickShareIntent() = Intent().apply {
        component = ComponentName(
            "com.google.android.gms", "com.google.android.gms.nearby.sharing.send.SendActivity"
        )
    }
}