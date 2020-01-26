package ca.warp7.desktop.qrscanner

import ca.warp7.android.scouting.entry.Alliance
import ca.warp7.android.scouting.entry.Entry
import javafx.scene.control.TableCell
import kb.core.fx.label

class TeamCell : TableCell<Entry, String>() {
    override fun updateItem(item: String?, empty: Boolean) {
        super.updateItem(item, empty)
        if (item == null || empty) {
            graphic = null
            return
        }
        graphic = label {
            text = item
            val entry = tableRow?.item
            if (entry != null) {
                style = when (entry.board.alliance) {
                    Alliance.Red -> "-fx-font-weight: bold; -fx-text-fill: red"
                    Alliance.Blue -> "-fx-font-weight: bold; -fx-text-fill: blue"
                    else -> null
                }
            }
        }
    }
}