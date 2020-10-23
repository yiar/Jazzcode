package piano.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.nfinderc.R

class Recordingsandlyrics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recordings_and_lyrics_fake_app)

        val changePw = findViewById<ImageButton>(R.id.changePwBtn2)
        changePw.setOnClickListener { // debugging purposes
            // Handler code here.
            val intent = Intent(this, SetNewPwActivity::class.java)
            startActivity(intent);
        }
    }
}