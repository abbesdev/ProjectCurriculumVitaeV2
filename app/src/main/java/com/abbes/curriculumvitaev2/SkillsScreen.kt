package com.abbes.curriculumvitaev2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.abbes.curriculumvitaev3.R

class SkillsScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skills_screen)
        
        var fullName = intent.getStringExtra("fullname");
        var email = intent.getStringExtra("email");
        var age = intent.getStringExtra("age");
        var gender = intent.getStringExtra("gender");

        var buttonS = findViewById(R.id.buttonSubmit) as Button;

        buttonS.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                var androidS = findViewById(R.id.androidSeek) as SeekBar;
                var iosS = findViewById(R.id.iosSeek) as SeekBar;
                var flutterS = findViewById(R.id.flutterSeek) as SeekBar;

                var chArabic = findViewById(R.id.checkArab) as CheckBox;
                var chFrench = findViewById(R.id.checkFr) as CheckBox;
                var chEnglish = findViewById(R.id.checkEng) as CheckBox;

                var chMusic = findViewById(R.id.checkMusic) as CheckBox;
                var chSport = findViewById(R.id.checkSport) as CheckBox;
                var chGames = findViewById(R.id.checkGames) as CheckBox;

                val intent = Intent(this@SkillsScreen, FinalScreen::class.java)
                intent.putExtra("fullname",fullName)
                intent.putExtra("email",email)
                intent.putExtra("age",age)
                intent.putExtra("gender",gender)
                intent.putExtra("android",androidS.getProgress().toString())
                intent.putExtra("ios",iosS.getProgress().toString())
                intent.putExtra("flutter",flutterS.getProgress().toString())

                if(chArabic.isChecked) {
                    intent.putExtra("arabic", chArabic.getText().toString());
                }else{
                    intent.putExtra("arabic", "");
                }
                if(chFrench.isChecked) {
                    intent.putExtra("french", chFrench.getText().toString());
                }else{
                    intent.putExtra("french", "");
                }
                if(chEnglish.isChecked) {
                    intent.putExtra("english", chEnglish.getText().toString());
                }else{
                    intent.putExtra("english", "");
                }
                if(chMusic.isChecked) {
                    intent.putExtra("music", chMusic.getText().toString());
                }else{
                    intent.putExtra("music", "");
                }
                if(chSport.isChecked) {
                    intent.putExtra("sport", chSport.getText().toString());
                }else{
                    intent.putExtra("sport", "");
                }
                if(chGames.isChecked) {
                    intent.putExtra("games", chGames.getText().toString());
                }else{
                    intent.putExtra("games", "");
                }

                startActivity(intent)
            }})

    }
}