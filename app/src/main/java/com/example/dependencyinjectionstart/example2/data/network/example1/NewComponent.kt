package com.example.dependencyinjectionstart.example2.data.network.example1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}
