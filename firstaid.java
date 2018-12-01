package com.example.android.emergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class firstaid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstaid);
    }
    public void newIntentOfFirstAidOne(View view) {
        Intent i = new Intent(this, firstActivityUnderFirstAid.class);
        startActivity(i);
    }
    public void newIntentOfFirstAidTwo(View view) {
        Intent i = new Intent(this, activitySecondUnderFirstAid.class);
        startActivity(i);
    }
    public void newIntentOfFirstAidThree(View view) {
        Intent i = new Intent(this, activityThreeUnderFirstAid.class);
        startActivity(i);
    }
    public void newIntentOfFirstAidFour(View view) {
        Intent i = new Intent(this, activityFourUnderFirstAid.class);
        startActivity(i);
    }
    public void newIntentOfFirstAidFive(View view) {
        Intent i = new Intent(this, activityFiveUnderFirstAid.class);
        startActivity(i);
    }
    public void newIntentOfFirstAidSix(View view) {
        Intent i = new Intent(this, activitySixUnderFirstAid.class);
        startActivity(i);
    }
    public void newIntentOfFirstAidSeven(View view) {
        Intent i = new Intent(this, activitySevenUnderFirstAid.class);
        startActivity(i);
    }
}
