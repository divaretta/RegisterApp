package com.diva.registerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegister.setOnClickListener(this)
            }

    override fun onClick(p0: View?) {
        val inputName = edName.text.toString().trim()
        val inputEmail = edEmail.text.toString().trim()
        val inputPassword = edPassword.text.toString().trim()
        var isEmptyField = false
        when {
            inputName.isEmpty() -> {
                isEmptyField = true
                edName.error = getString(R.string.txt_error)
            }
            inputEmail.isEmpty() -> {
                isEmptyField = true
                edEmail.error = getString(R.string.txt_error)
            }
            inputPassword.isEmpty() -> {
                isEmptyField = true
                edPassword.error = getString(R.string.txt_error)
            }
        }
        if (!isEmptyField){
            val intentData = Intent(this, FilledForms::class.java)
            intentData.putExtra("insertName",inputName)
            intentData.putExtra("insertEmail",inputEmail)
            intentData.putExtra("insertPassword",inputPassword)
            startActivity(intentData)
        }

    }

}

