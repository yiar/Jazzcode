package piano.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.nfinderc.R
import piano.classes.DiffList

// listOf<String>("C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" )


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ha en logik, om inte inloggad, visa login activity
        // hur ska man koppla knapparna till ett värde?

        var handler = DiffList()
       // handler.arrayList

        val logBtn = findViewById<Button>(R.id.loggain)
        logBtn.setOnClickListener { // debugging purposes
            // Handler code here.
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent);
        }
        // btn 1 buttonNoteC2s
        val C2Btn = findViewById<Button>(R.id.buttonNoteC2)
        C2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
           // ge knappen ett value,
            println(handler.arrayList)
            handler.userList.add("C")
            println(handler.userList)

            if(handler.userList == handler.tempList){
                val intent = Intent(this, Recordingsandlyrics::class.java)
                startActivity(intent)
            }

           // arrayList.add("C")
          /*  handler.userList.add("C#")
            handler.userList.add("D")
            handler.userList.add("D#")
            handler.userList.add("E")
            handler.userList.add("F")
            handler.userList.add("F#")
            handler.userList.add("G")
            handler.userList.add("G#")
            handler.userList.add("A#")
            handler.userList.add("B")
            */ // debug kod
            //handler.pwMatches(handler.userList)
         /*   if(handler.authenticate){ // this part doesnt work idk why?
                val intent = Intent(this, Recordingsandlyrics::class.java)
                startActivity(intent);
            }*/


        }
        val D2Btn = findViewById<Button>(R.id.buttonNoteD2)
        D2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("C#")
            handler.pwMatches(handler.userList)

        }
        val E2Btn = findViewById<Button>(R.id.buttonNoteE2)
        E2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("D")
            handler.pwMatches(handler.userList)

        }
        val F2Btn = findViewById<Button>(R.id.buttonNoteF2)
        F2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("D#")
            handler.pwMatches(handler.userList)

        }
        val G2Btn = findViewById<Button>(R.id.buttonNoteG2)
        G2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("E")
            handler.pwMatches(handler.userList)
        }
        val A2Btn = findViewById<Button>(R.id.buttonNoteA2)
        A2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("F")
            handler.pwMatches(handler.userList)
        }
        val B2Btn = findViewById<Button>(R.id.buttonNoteB2)
        B2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("F#")
            handler.pwMatches(handler.userList)
        }
        val Cs2Btn = findViewById<Button>(R.id.buttonNoteCs2)
        Cs2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("G")
            handler.pwMatches(handler.userList)
        }
        val Gs2Btn = findViewById<Button>(R.id.buttonNoteGs2)
        Gs2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("G#")
            handler.pwMatches(handler.userList)
        }
        val Ds2Btn = findViewById<Button>(R.id.buttonNoteDs2)
        Ds2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("A")
            handler.pwMatches(handler.userList)
        }
        val Fs2Btn = findViewById<Button>(R.id.buttonNoteFs2)
        Fs2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("A#")
            handler.pwMatches(handler.userList)
        }
        val As2Btn = findViewById<Button>(R.id.buttonNoteAs2)
        As2Btn.setOnClickListener()
        {
            // Handler code here.
            //do stuff
            // ge knappen ett value,
            handler.userList.add("B")
            handler.pwMatches(handler.userList)
        }

    }
}


// Piano Keys
// Confirm password button (under piano)
// Clear input (to right)
// Visually show how many keys you've pressed compared to full length of password/melody (maybe)
/* <View
android:id="@+id/group_55"
android:layout_width="116dp"
android:layout_height="46dp"
android:layout_alignParentLeft="true"
android:layout_marginLeft="122dp"
android:layout_alignParentTop="true"
android:layout_marginTop="207dp"
android:background="#00000000"
/>
 */




// Show which key is the startNote. Color the note, or just write enum as text above piano.