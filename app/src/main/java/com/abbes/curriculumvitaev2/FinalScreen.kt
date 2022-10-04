package com.abbes.curriculumvitaev2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.abbes.curriculumvitaev3.R

class FinalScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.final_screen)
        var fullName = intent.getStringExtra("fullname");
        var email = intent.getStringExtra("email");
        var age = intent.getStringExtra("age");
        var flutter = intent.getStringExtra("flutter");
        var ios = intent.getStringExtra("ios");
        var android = intent.getStringExtra("android");
        var arabic = intent.getStringExtra("arabic");
        var french = intent.getStringExtra("french");
        var english = intent.getStringExtra("english");
        var music = intent.getStringExtra("music");
        var sport = intent.getStringExtra("sport");
        var games = intent.getStringExtra("games");
        var gender = intent.getStringExtra("gender");

        var text1 = findViewById(R.id.fullName1) as TextView;
        var text2 = findViewById(R.id.email1) as TextView;
        var text3 = findViewById(R.id.age1) as TextView;
        var text4 = findViewById(R.id.android1) as TextView;
        var text5 = findViewById(R.id.ios1) as TextView;
        var text6 = findViewById(R.id.flutter1) as TextView;
        var text7 = findViewById(R.id.languages) as TextView;
        var text8 = findViewById(R.id.hobbies) as TextView;
        var text9 = findViewById(R.id.gender1) as TextView;

        text1.setText(fullName);
        text2.setText(email);
        text3.setText(age);
        text4.setText(android);
        text5.setText(ios);
        text6.setText(flutter);
        text7.setText(arabic + french + english);
        text8.setText(music + games + sport);
        text9.setText(gender);


    }
}