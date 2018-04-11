package com.example
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class ReleaseVersionTask extends DefaultTask{
    @Input Boolean release
    @OutputFile File destFile

    ReleaseVersionTask(){
        group = 'versioning'
        description = ' aa'
    }

    @TaskAction
    void start(){
        project.version.release = true
        ant.propertyfile(file: destFile){
            entry(key:'release',type:'string',operation:'=',value: 'true')
        }
    }
}