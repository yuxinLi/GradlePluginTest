
package com.lyx
import org.gradle.api.Plugin
import org.gradle.api.Project

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.println

class FirstPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {

        project.extensions.add("First" , FirstExtention)

        project.task("TestTask") {
            println( project.First.message)
        }
    }
}