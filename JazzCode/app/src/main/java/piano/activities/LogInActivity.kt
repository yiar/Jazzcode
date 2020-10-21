package piano.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nfinderc.R


class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val newPwBtn = findViewById<Button>(R.id.forgotten_pw)
        newPwBtn.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, SetNewPwActivity::class.java)
            startActivity(intent);
        }
        val logInBtn = findViewById<Button>(R.id.jazzcode_bttn)
        logInBtn.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
        }
    }
}



// Piano Keys
// Confirm password button (under piano)
// Clear input (to right)
// Visually show how many keys you've pressed compared to full length of password/melody (maybe)
/*
 */




// Show which key is the startNote. Color the note, or just write enum as text above piano.
