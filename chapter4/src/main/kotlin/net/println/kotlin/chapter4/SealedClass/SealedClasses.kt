package net.println.kotlin.chapter4.SealedClass


sealed class PlayerCmd {
    class Play(val url: String, val position: Long = 0): PlayerCmd()

    class Seek(val position: Long): PlayerCmd()

    object Pause: PlayerCmd()

    object Resume: PlayerCmd()

    object Stop: PlayerCmd()
}

enum class PlayerState{
    IDLE, PAUSE, PLAYING
}


