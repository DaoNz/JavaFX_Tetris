package com.core.controller

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import javafx.scene.paint.Color
import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.shape.Rectangle
import java.net.URL
import java.util.*

class MainCtl : Initializable {

    @FXML private lateinit var pane : AnchorPane
    @FXML private lateinit var rect01 : Rectangle
    @FXML private lateinit var rect02 : Rectangle
    @FXML private lateinit var btnGo : Button

    override fun initialize(loc: URL?, res: ResourceBundle?) {
        pane.minHeight = 600.0
        pane.minWidth = 900.0
        pane.background = Background(BackgroundFill(Color.GREEN, CornerRadii(10.0), Insets(5.0)))

        rect01.isVisible = true
        rect02.isVisible = false

        btnGo.setOnMouseClicked { btn_onClick() }
    }

    fun btn_onClick() {
        println("call new scene")
        //TODO - call new scene
    }
}