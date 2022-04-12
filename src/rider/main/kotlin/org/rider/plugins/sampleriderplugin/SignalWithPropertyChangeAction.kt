package org.rider.plugins.sampleriderplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.jetbrains.rider.projectView.solution
import org.rider.plugins.sample.model.sampleModel

class SignalWithPropertyChangeAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        val currentProject: Project? = event.project
        currentProject?.solution?.sampleModel?.someProp?.set("test")
    }


    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }

}