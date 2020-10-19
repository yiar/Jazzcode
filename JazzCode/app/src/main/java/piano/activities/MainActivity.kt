package piano.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.nfinderc.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ha en logik, om inte inloggad, visa login activity
        // hur ska man koppla knapparna till ett värde?

        val logBtn = findViewById<Button>(R.id.loggain)
        logBtn.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent);
        }

        }

}