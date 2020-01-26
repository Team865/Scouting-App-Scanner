package ca.warp7.desktop.qrscanner

import ca.warp7.android.scouting.entry.Entry
import javafx.scene.control.TableCell
import kb.core.fx.label

class MatchCell : TableCell<Entry, String>() {
    override fun updateItem(item: String?, empty: Boolean) {
        super.updateItem(item, empty)
        if (item == null || empty) {
            graphic = null
            return
        }
        graphic = label {
            text = item
            style = when (item.last()) {
                '1', '3', '5', '7', '9' -> "-fx-font-weight: bold; -fx-text-fill: #080"
                else -> "-fx-font-weight: bold; -fx-text-fill: #808 "
            }
        }
    }
}