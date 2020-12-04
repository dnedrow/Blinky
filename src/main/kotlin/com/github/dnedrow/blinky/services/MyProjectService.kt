package com.github.dnedrow.blinky.services

import com.intellij.openapi.project.Project
import com.github.dnedrow.blinky.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
