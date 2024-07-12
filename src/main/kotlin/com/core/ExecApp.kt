package com.core

import com.core.util.ViewMapper
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage
import javafx.stage.StageStyle

class ExecApp : Application() {

    val view : ViewMapper = ViewMapper();

    override fun start(mainStage: Stage) {
        val root : Parent = FXMLLoader(view.loadView("Main")).load<AnchorPane>()
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