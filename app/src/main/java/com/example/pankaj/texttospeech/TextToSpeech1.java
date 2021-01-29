package com.example.pankaj.texttospeech;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class TextToSpeech1 extends AppCompatActivity implements TextToSpeech.OnInitListener {

    TextToSpeech ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech1);

        ts=new TextToSpeech(this,this);

    }

    public void first(View view) {

        EditText e1=(EditText)findViewById(R.id.t1);
        String toSpeak = e1.getText().toString();
        ts.speak(toSpeak,TextToSpeech.QUEUE_FLUSH,null);

    }

    @Override
    public void onInit(int i) {
        if(i !=TextToSpeech.ERROR){
            ts.setLanguage(Locale.ENGLISH);
        }

    }
}
