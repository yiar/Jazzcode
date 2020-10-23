package piano.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.nfinderc.R
import piano.classes.DiffList


class MainActivity : AppCompatActivity() {

    private val handler = DiffList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val logBtn = findViewById<Button>(R.id.loggain)
        logBtn.setOnClickListener { // debugging purposes
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent);
        }

        val clearBtn = findViewById<Button>(R.id.clearButton_id)
        clearBtn.setOnClickListener()
        {
            handler.clearPw(handler.userList)
        }

        val C2Btn = findViewById<Button>(R.id.buttonNoteC2)
        C2Btn.setOnClickListener()
        {
            handler.userList.add("C")
            isPwMatch()
        }
        val D2Btn = findViewById<Button>(R.id.buttonNoteD2)
        D2Btn.setOnClickListener() {
            handler.userList.add("C#")
            isPwMatch()

        }
        val E2Btn = findViewById<Button>(R.id.buttonNoteE2)
        E2Btn.setOnClickListener() {
            handler.userList.add("D")
            isPwMatch()

        }
        val F2Btn = findViewById<Button>(R.id.buttonNoteF2)
        F2Btn.setOnClickListener() {
            handler.userList.add("D#")
            isPwMatch()

        }
        val G2Btn = findViewById<Button>(R.id.buttonNoteG2)
        G2Btn.setOnClickListener() {
            handler.userList.add("E")
            isPwMatch()
        }
        val A2Btn = findViewById<Button>(R.id.buttonNoteA2)
        A2Btn.setOnClickListener() {
            handler.userList.add("F")
            isPwMatch()
        }
        val B2Btn = findViewById<Button>(R.id.buttonNoteB2)
        B2Btn.setOnClickListener() {
            handler.userList.add("F#")
            isPwMatch()
        }
        val Cs2Btn = findViewById<Button>(R.id.buttonNoteCs2)
        Cs2Btn.setOnClickListener() {
            handler.userList.add("G")
            isPwMatch()
        }
        val Gs2Btn = findViewById<Button>(R.id.buttonNoteGs2)
        Gs2Btn.setOnClickListener() {
            handler.userList.add("G#")
            isPwMatch()
        }
        val Ds2Btn = findViewById<Button>(R.id.buttonNoteDs2)
        Ds2Btn.setOnClickListener() {
            handler.userList.add("A")
            isPwMatch()
        }
        val Fs2Btn = findViewById<Button>(R.id.buttonNoteFs2)
        Fs2Btn.setOnClickListener() {
            handler.userList.add("A#")
            isPwMatch()
        }
        val As2Btn = findViewById<Button>(R.id.buttonNoteAs2)
        As2Btn.setOnClickListener() {
            handler.userList.add("B")
            isPwMatch()
        }

    }

    override fun onResume() {
        super.onResume()
        handler.keysList = handler.getPassword(applicationContext) as ArrayList<String>
        Log.d("Gil", "onResume: List = " + handler.getPassword(applicationContext).toString())
    }

    private fun isPwMatch() {
        Log.d("Gil", "isPwMatch: userList" + handler.userList.toString())
        Log.d("Gil", "isPwMatch: keysList" + handler.keysList.toString())
        if(handler.userList == handler.keysList){
            val intent = Intent(this, Recordingsandlyrics::class.java)
            startActivity(intent)
        }
    }
}

