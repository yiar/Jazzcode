package piano.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nfinderc.R
import piano.classes.DiffList

class SetNewPwActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resetpw)

        var handler = DiffList()


        val resetBtn = findViewById<Button>(R.id.resetInputID)
        resetBtn.setOnClickListener()
        {
            handler.clearPw(handler.keysList)
        }

        val confirmBtn = findViewById<Button>(R.id.confirmPWId)
        confirmBtn.setOnClickListener()
        {
            if(handler.userList.size in 4..14) {
                handler.confirmPw(handler.userList)
         //       Log.d("Gil", "save pw: " + handler.keysList.toString())
                handler.savePassword(applicationContext, handler.keysList)
                val intent = Intent(this, LogInActivity::class.java)
                startActivity(intent)
            }
            else handler.clearPw(handler.keysList)

        }

        // btn 1 buttonNoteC2s
        val C2sBtn = findViewById<Button>(R.id.buttonNoteC2s)
        C2sBtn.setOnClickListener()
        {
            handler.userList.add("C")
        }
        val D2sBtn = findViewById<Button>(R.id.buttonNoteD2s)
        D2sBtn.setOnClickListener()
        {
            handler.userList.add("C#")

        }
        val E2sBtn = findViewById<Button>(R.id.buttonNoteE2s)
        E2sBtn.setOnClickListener()
        {
            handler.userList.add("D")
        }
        val F2sBtn = findViewById<Button>(R.id.buttonNoteF2s)
        F2sBtn.setOnClickListener()
        {
            handler.userList.add("D#")

        }
        val G2sBtn = findViewById<Button>(R.id.buttonNoteG2s)
        G2sBtn.setOnClickListener()
        {
            handler.userList.add("E")

        }
        val A2sBtn = findViewById<Button>(R.id.buttonNoteA2s)
        A2sBtn.setOnClickListener()
        {
            handler.userList.add("F")

        }
        val B2sBtn = findViewById<Button>(R.id.buttonNoteB2s)
        B2sBtn.setOnClickListener()
        {
            handler.userList.add("F#")

        }
        val Cs2sBtn = findViewById<Button>(R.id.buttonNoteCs2s)
        Cs2sBtn.setOnClickListener()
        {
            handler.userList.add("G")

        }
        val Gs2sBtn = findViewById<Button>(R.id.buttonNoteGs2s)
        Gs2sBtn.setOnClickListener()
        {
            handler.userList.add("G#")

        }
        val Ds2sBtn = findViewById<Button>(R.id.buttonNoteDs2s)
        Ds2sBtn.setOnClickListener()
        {
            handler.userList.add("A")

        }
        val Fs2sBtn = findViewById<Button>(R.id.buttonNoteFs2s)
        Fs2sBtn.setOnClickListener()
        {
            handler.userList.add("A#")

        }
        val As2sBtn = findViewById<Button>(R.id.buttonNoteAs2s)
        As2sBtn.setOnClickListener()
        {
            handler.userList.add("B")

        }
    }
}

