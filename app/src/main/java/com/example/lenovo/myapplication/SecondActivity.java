package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView score1;
    TextView score2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        score1=(TextView)findViewById(R.id.score1);
        score2=(TextView)findViewById(R.id.score2);
    }
    public void btnAdd1(View view){
        showScore(1,score1);
    }
    public void btnAdd2(View view){
        showScore(2,score1);
    }
    public void btnAdd3(View view){
        showScore(3,score1);
    }
    public void btnAdd4(View view){
        showScore(1,score2);
    }
    public void btnAdd5(View view){
        showScore(2,score2);
    }
    public void btnAdd6(View view){
        showScore(3,score2);
    }

    public void btnReset(View view){
        score1.setText("0");
        score2.setText("0");
    }
    private void showScore(int inc,TextView view){
        Log.i("show","inc="+inc);
        String oldScore=(String) view.getText();
        int newScore=Integer.parseInt(oldScore)+inc;
        view.setText(""+ newScore);
    }
}
