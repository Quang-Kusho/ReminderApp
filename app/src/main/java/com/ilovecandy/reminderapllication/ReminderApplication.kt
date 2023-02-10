package com.ilovecandy.reminderapllication

import android.app.Application
import com.ilovecandy.reminderapllication.Graph

class ReminderApplication : Application() {

    Graph.provide(this)
}