package piano.classes

import piano.interfaces.pianoInterface

class blackKey : pianoInterface {
    override val heigth: Double = 5.5
    override val width: Double = 2.2
    // dummy code for black key
}

class whiteKey : pianoInterface {
    override val heigth: Double = 10.5
    override val width: Double = 4.4
    // dummy code for white key
}