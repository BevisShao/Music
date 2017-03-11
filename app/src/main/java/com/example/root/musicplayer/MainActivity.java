package com.example.root.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_pre ;
    private ImageView iv_play;
    private ImageView iv_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setView();
    }

    private void setView(){
        iv_pre= (ImageView) findViewById(R.id.iv_pre);
        iv_play= (ImageView) findViewById(R.id.iv_play);
        iv_next= (ImageView) findViewById(R.id.iv_next);
        /*iv_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
            }
        });*/
    }
    public void doClick(View view){
        switch(view.getId()){
            case R.id.iv_pre:
                pre();
                break;
            case R.id.iv_play:
                play();
                break;
            case R.id.iv_next:
                next();

        }
    }
    private void  pre(){
        //// TODO: 17-2-15
    }
    private void play(){
        // TODO: 17-2-15
        Toast.makeText(this,"play()",Toast.LENGTH_SHORT).show();
    }
    private void next(){
        // TODO: 17-2-15
    }


}
