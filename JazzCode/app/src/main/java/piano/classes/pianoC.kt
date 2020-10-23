package piano.classes

import android.content.Context
import android.content.SharedPreferences
import java.lang.StringBuilder

class DiffList{
    var arrayList = ArrayList<String>()//Creating an empty arraylist
    var userList = ArrayList<String>() // användaren som matar in
    var keysList = ArrayList<String>() // pre existing keys


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



    fun clearPw(args: ArrayList<String>) {
        userList.clear()
    }

    fun confirmPw(args: ArrayList<String>){
        keysList = ArrayList(userList)
        userList.clear()
    }

    val KEY_PWD : String = "KEY_PWD_STRING"
    val PREFS_PWD : String = "pwd"
    fun savePassword(context: Context, password: ArrayList<String>) {

        val builder = StringBuilder()
        var prefix = ""
        password.forEach {
            builder.append(prefix)
            prefix = "."
            builder.append(it)
        }

        val prefs: SharedPreferences = context.getSharedPreferences(PREFS_PWD, Context.MODE_PRIVATE)
        prefs.edit().putString(KEY_PWD, builder.toString()).apply()
    }

    fun getPassword(context: Context) : List<String> {
        val defaultValues = ""
        val prefs: SharedPreferences = context.getSharedPreferences(PREFS_PWD, Context.MODE_PRIVATE)

        val pwd: String = prefs.getString(KEY_PWD, defaultValues) as String

        return ArrayList(pwd.split(".", ignoreCase = false, limit = 0))
    }
}



