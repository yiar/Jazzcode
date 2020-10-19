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

        val logBtn = findViewById<Button>(R.id.forgotten_pw)
        logBtn.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, SetNewPwActivity::class.java)
            startActivity(intent);
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
