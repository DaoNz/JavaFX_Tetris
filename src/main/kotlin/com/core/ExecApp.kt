package com.core

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage
import javafx.stage.StageStyle

class ExecApp : Application() {

    override fun start(mainStage: Stage) {
        val root = FXMLLoader(ExecApp::class.java.getResource("/view/common/MAIN.fxml")).load<AnchorPane>()
        val mainScene = Scene(root, 1200.0, 900.0)

        // mainStage 설정
        mainStage.initStyle(StageStyle.UNDECORATED)
        mainStage.centerOnScreen()

        mainStage.width     = 1200.0
        mainStage.height    = 930.0
        mainStage.scene     = mainScene

        mainStage.show()
    }
}

fun main() {
    Application.launch(ExecApp::class.java)
}