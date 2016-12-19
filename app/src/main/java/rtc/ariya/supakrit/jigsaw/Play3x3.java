package rtc.ariya.supakrit.jigsaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Play3x3 extends AppCompatActivity {

    //Explicit
    private int indexAnInt, imageAnInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play3x3);

        indexAnInt = getIntent().getIntExtra("Index", 0);
        imageAnInt = getIntent().getIntExtra("Image", R.drawable.a1);
        Log.d("19decV3", "index ==>" + indexAnInt);
        Log.d("19decV3", "Image ==>  " + imageAnInt);


    }   // Main Method

}   // Main Class
