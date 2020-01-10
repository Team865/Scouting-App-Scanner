package ca.warp7.desktop.qrscanner

import javafx.application.Platform

fun main() {
    Platform.startup {
        ScannerScreen().show()
    }
}