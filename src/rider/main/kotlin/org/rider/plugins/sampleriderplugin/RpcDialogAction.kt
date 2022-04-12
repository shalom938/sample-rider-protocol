package org.rider.plugins.sampleriderplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.jetbrains.rdclient.util.idea.callSynchronously
import com.jetbrains.rider.projectView.solution
import org.rider.plugins.sample.model.sampleModel

class RpcDialogAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        val currentProject: Project? = event.project
        var sampleModel = currentProject?.solution?.sampleModel
        var result = sampleModel?.hasMethod?.callSynchronously(Unit, sampleModel.protocol)
        Messages.showMessageDialog(currentProject, "Result from RPC $result", "RpcDialogAction", Messages.getInformationIcon())
    }


    override fun update(e: AnActionEvent) {
        val project = e.project
        e.presentation.isEnabledAndVisible = project != null
    }

}