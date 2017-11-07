package com.example.android.gamefreakingmathbai081;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtNum01, txtNum02, txtOperator, txtResult;
    private ImageButton btnCorrect, btnInCorrect;
    private TextView txtScore, txtTimer;
    private Timer timer;
    private TimerTask timerTask;
    private RelativeLayout relativeLayout;
    private Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_play);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        btnCorrect.setOnClickListener(this);
        btnInCorrect.setOnClickListener(this);
    }

    private void initComponents() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        txtNum01 = findViewById(R.id.txtFirstNum);
        txtNum02 = findViewById(R.id.txtSecondNum);
        txtOperator = findViewById(R.id.txtOperator);
        txtResult = findViewById(R.id.txtResult);
        txtScore = findViewById(R.id.txtScore);
        txtTimer = findViewById(R.id.txtTimeLeft);
        btnCorrect = findViewById(R.id.imgCorrect);
        btnInCorrect = findViewById(R.id.imgInCorrect);
        relativeLayout = findViewById(R.id.play_layout);
        random = new Random();
        loadNewGame(false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imgCorrect:
                doCorrect();
                break;
            case R.id.imgInCorrect:
                doInCorrect();
                break;
        }
        txtScore.setText(GamePlay.getScore() + "");
    }

    private void doInCorrect() {
        if(GamePlay.getResult()){
            Toast.makeText(this, "Game over!", Toast.LENGTH_SHORT).show();
            loadNewGame(false);
        } else {
            Toast.makeText(this, "Great!", Toast.LENGTH_SHORT).show();
            loadNewGame(true);

        }
    }

    private void doCorrect() {
        if(!GamePlay.getResult()){
            Toast.makeText(this, "Game over!", Toast.LENGTH_SHORT).show();
            loadNewGame(false);
        } else {
            Toast.makeText(this, "Great!", Toast.LENGTH_SHORT).show();
            loadNewGame(true);
        }
    }

    private void loadNewGame(boolean bLasetAnswer){
        GamePlay.makeNewGame(bLasetAnswer);
        relativeLayout.setBackgroundColor(Color.parseColor(generateColor()));
        txtNum01.setText(GamePlay.getNum01() + "");
        txtNum02.setText(GamePlay.getNum02() + "");
        txtOperator.setText(GamePlay.getcOperator() +"");
        txtResult.setText(GamePlay.getNumReturn() + "");
    }

    private String generateColor(){
        StringBuilder str = new StringBuilder("#");
        for(int i = 0; i < 6; i++){
            str.append(random.nextInt(10) + "");
        }
        return str.toString();
    }
}
