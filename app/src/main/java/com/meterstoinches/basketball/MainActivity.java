package com.meterstoinches.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button onePA,twoPA,threePA,onePB,twoPB,threePB,resultBtn,resetBtn;
    EditText tAedt,tBedt;

    int counterA=0,counterB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onePA=(Button) findViewById(R.id.tAonepoint);
        twoPA=(Button) findViewById(R.id.tAtwopoint);
        threePA=(Button) findViewById(R.id.tAthreepoint);

        onePB=(Button) findViewById(R.id.tBonepoint);
        twoPB=(Button) findViewById(R.id.tBtwopoint);
        threePB=(Button) findViewById(R.id.tBthreepoint);

        resultBtn=(Button) findViewById(R.id.resultID);
        resetBtn=(Button) findViewById(R.id.resetID);

        tAedt=(EditText) findViewById(R.id.TAscoreboard);
        tBedt=(EditText) findViewById(R.id.TBscoreboard);



    }

    public void tA1Pmethod(View view) {
        counterA=counterA+1;
        tAedt.setText(""+counterA);
    }

    public void tA2Pmethod(View view) {
        counterA=counterA+2;
        tAedt.setText(""+counterA);
    }

    public void tA3Pmethod(View view) {
        counterA=counterA+3;
        tAedt.setText(""+counterA);
    }

    public void tB1Pmethod(View view) {
        counterB=counterB+1;
        tBedt.setText(""+counterB);
    }

    public void tB2Pmethod(View view) {
        counterB=counterB+2;
        tBedt.setText(""+counterB);
    }

    public void tB3Pmethod(View view) {
        counterB=counterB+3;
        tBedt.setText(""+counterB);
    }

    public void resetMethod(View view) {
        tAedt.setText("0");
        tBedt.setText("0");
    }

    public void resultMethod(View view) {
        double TApoints =  Double.parseDouble(tAedt.getText().toString());
        double TBpoints =  Double.parseDouble(tBedt.getText().toString());

        if(tAedt.getText().toString().equals(tBedt.getText().toString())){
            Toast.makeText(MainActivity.this,"Match drawn",Toast.LENGTH_LONG).show();
        }else if(TApoints>TBpoints){
            Toast.makeText(MainActivity.this,"Team A won",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this,"Team B won",Toast.LENGTH_LONG).show();
        }

    }

}
