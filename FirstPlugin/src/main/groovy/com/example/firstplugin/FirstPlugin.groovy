package com.example.firstplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class FirstPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.task("TestTask") {
            println(" Hello world")
        }
    }
}