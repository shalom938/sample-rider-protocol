package org.rider.plugins.sampleriderplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.jetbrains.rider.projectView.solution
import org.rider.plugins.sample.model.sampleModel

class CheckResultDialogAction : AnAction(){


    override fun actionPerformed(event: AnActionEvent) {
        val currentProject: Project? = event.project
        var dialogMsg = currentProject?.solution?.sampleModel?.methodInfo?.valueOrNull
        Messages.showMessageDialog(currentProject, dialogMsg ?: "value is null", "CheckResultDialogAction", Messages.getInformationIcon())
    }

    override fun update(e: AnActionEvent) {
        // Set the availability based on whether a project is open
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }
}