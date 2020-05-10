package dicoding.com.smkcodingc2.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dicoding.com.smkcodingc2.R
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tv_btnLogin.setOnClickListener { validasiLogin() }
        tv_signup.setOnClickListener { gotoRegister() }

    }

    private fun validasiLogin() {
        val intent = Intent(this, MainActivity :: class.java)
        startActivity(intent)
        finish()
    }

    private fun gotoRegister() {
        val intent = Intent(this,Register :: class.java )
        startActivity(intent)
    }
}