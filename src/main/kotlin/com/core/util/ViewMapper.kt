package com.core.util

import java.net.URL

class ViewMapper {

    fun loadView(viewName : String) : URL? {
        when (viewName) {
            "Main" -> return ViewMapper::class.java.getResource("/view/common/MAIN.fxml")
        }

        return null //TODO : 404
    }
}