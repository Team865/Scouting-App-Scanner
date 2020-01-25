package ca.warp7.android.scouting.entry

interface MutableEntry : Entry {
    /**
     * Adds a data point to the entry
     */
    fun add(dataPoint: DataPoint)

    /**
     * Performs an undo action on the data stack
     *
     * @return the data constant(metrics) of the datum being undone, or null
     * if nothing can be undone
     */
    fun undo(): DataPoint?

    override var comments: String
    override var timestamp: Int

    fun isFocused(type: Int): Boolean
}