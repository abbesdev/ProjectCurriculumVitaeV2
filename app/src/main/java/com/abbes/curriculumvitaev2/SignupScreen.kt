package com.abbes.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.abbes.curriculumvitaev3.R

class SignupScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_screen)
        var buttonN = findViewById(R.id.buttonSubmit) as Button;

        buttonN.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {

                var fullName = findViewById(R.id.fullName) as EditText;
                var email = findViewById(R.id.email) as EditText;
                var age = findViewById(R.id.age) as EditText;
                var gender = findViewById(R.id.radioG) as RadioGroup;

                var fullN = fullName.getText().toString();
                var emailN = email.getText().toString();
                var ageN = age.getText().toString();
                if(fullN == ""){
              fullName.setError("Full name is empty");
                }
                if(emailN == ""){
                    email.setError("Email is empty");
                }
                if(ageN == ""){
                    age.setError("Age is empty");
                }

                if(fullName.error == null && email.error == null && age.error == null){

                    var idRadio = gender.checkedRadioButtonId;
                    var radiobC = findViewById(idRadio) as RadioButton;
                    val intent = Intent(this@SignupScreen, SkillsScreen::class.java)
                    intent.putExtra("fullname",fullN)
                    intent.putExtra("email",emailN)
                    intent.putExtra("age",ageN)

                        intent.putExtra("gender", radiobC.getText().toString() )

                    startActivity(intent)
                }

            }

        })

    }
}