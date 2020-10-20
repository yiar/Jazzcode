package piano.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.nfinderc.R

class ChangePw : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_changepw)

        val changePwBtn = findViewById<Button>(R.id.changePwBtnID)
        changePwBtn.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, SetNewPwActivity::class.java)
            startActivity(intent);
        }
    }

}