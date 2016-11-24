package rtc.ariya.supakrit.jigsaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Chooselmage extends AppCompatActivity {

    //Explicit
    private int anInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooselmage);

        //Get Value From Intent
        anInt = getIntent().getIntExtra("Index", 0);
        Log.d("tonV1", "Index ==> " + anInt);

    }   // Main Method
}   // Main Class
