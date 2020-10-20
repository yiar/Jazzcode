package piano.classes

import kotlinx.serialization.Serializable


@Serializable
data class pianoC(val data : String,
                  var serListStat: List<String> = listOf<String>("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B")
                  ) {
   // val availableKeys = listOf<String>("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" )
}


@Serializable
data class userInputPassword(val data : String,
                  var serListStat: List<String> = listOf<String>("")
) {
    // listOf<String>("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" )
    // göra en setter och mata in listan här som användare?

}


// enum note = C, C#, D, D#, E, F, F#, G, G#, A, A#, B