package piano.classes

import kotlinx.serialization.Serializable

/*
@Serializable
data class pianoC(val data : List<String>,
                  var serListStat: List<String> //= listOf<String>("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B")
                  ) {
   // val availableKeys = listOf<String>("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" )
    //constructor(data: String) : this(data, "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B")


}


// behöver inte vara seriazable för de inte behöver sparas
/*data class userInputPassword(val data : List<String>,
                             var inputPwLists: List<String>) //= listOf<String>("")) {
    // listOf<String>("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" )
    // göra en setter och mata in listan här som användare?
}*/

@Serializable
data class userPassword(val data : String,
                             var serUserPW: List<String> = listOf<String>("")) {
 // ska vara de sparade lösenordet

}*/



// enum note = C, C#, D, D#, E, F, F#, G, G#, A, A#, B

class DiffList{
    var arrayList = ArrayList<String>()//Creating an empty arraylist
    var userList = ArrayList<String>() // användaren som matar in
    var keysList = ArrayList<String>() // pre existing keys
    var authenticate: Boolean = false


    init {
        arrayList.add("C")
        arrayList.add("C#")
        arrayList.add("D")
        arrayList.add("D#")
        arrayList.add("E")
        arrayList.add("F")
        arrayList.add("F#")
        arrayList.add("G")
        arrayList.add("G#")
        arrayList.add("A#")
        arrayList.add("B")
    }

    //fun addAllKeys(args: ArrayList<String>){
     //
   // }

    fun pwMatches(args: ArrayList<String>){
        // kolla ifall input på listan är samma som användarens lösenord osv
        if(userList == keysList) run {
            logIn()
        }
        if(userList.size == keysList.size && userList != keysList){
            clearPw(userList)
        }
    }

    fun clearPw(args: ArrayList<String>) {
        userList.clear()
    }

    fun logIn(){
        authenticate = true


    }
}



