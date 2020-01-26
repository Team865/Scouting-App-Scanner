package ca.warp7.android.scouting.entry

data class DecodedEntry(private val encoded: String) : Entry {
    override fun getEncoded(): String {
        return encoded
    }

    private val split = encoded.split(":")
    override val match = split[0]
    override val team = split[1]
    override val scout = split[2]
    override val board = split[3].toBoard() ?: Board.R1
    override val timestamp = split[4].toInt(16)
    override val comments = split[6]
    override val dataPoints = emptyList<DataPoint>()

    override fun count(type: Int): Int {
        return dataPoints.count { it.type == type }
    }

    override fun lastValue(type: Int): DataPoint? {
        return dataPoints.lastOrNull { it.type == type }
    }

    override fun isFocused(type: Int, time: Double): Boolean {
        return dataPoints.any { it.type == type && it.time == time }
    }
}
