package com.diva.registerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_filled_forms.*

class FilledForms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filled_forms)

        val intentTerima = intent
        val outputName = intentTerima.getStringExtra("insertName")
        val outputEmail = intentTerima.getStringExtra("insertEmail")
        val outputPassword = intentTerima.getStringExtra("insertPassword")

        txtName.text = outputName
        txtEmail.text = outputEmail
        txtPassword.text = outputPassword
    }
}