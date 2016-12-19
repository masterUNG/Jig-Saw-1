package rtc.ariya.supakrit.jigsaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChooseStructor extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private ImageView hub1ImageView, hub2ImageView, hub3ImageView;
    private TextView hub1TextView, hub2TextView, hub3TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_structor);

        //Bind Widget
        hub1ImageView = (ImageView) findViewById(R.id.imageView2);
        hub2ImageView = (ImageView) findViewById(R.id.imageView3);
        hub3ImageView = (ImageView) findViewById(R.id.imageView4);
        hub1TextView = (TextView) findViewById(R.id.textView4);
        hub2TextView = (TextView) findViewById(R.id.textView5);
        hub3TextView = (TextView) findViewById(R.id.textView6);

        //Image Controller
        hub1ImageView.setOnClickListener(this);
        hub2ImageView.setOnClickListener(this);
        hub3ImageView.setOnClickListener(this);
        hub1TextView.setOnClickListener(this);
        hub2TextView.setOnClickListener(this);
        hub3TextView.setOnClickListener(this);


    }   // Main Method

    @Override
    public void onClick(View v) {

        int index = 0;

        switch (v.getId()) {

            case R.id.imageView2:
                index = 0;
                break;
            case R.id.imageView3:
                index = 1;
                break;
            case R.id.imageView4:
                index = 2;
                break;
            case R.id.textView4:
                index = 0;
                break;
            case R.id.textView5:
                index = 1;
                break;
            case R.id.textView6:
                index = 2;
                break;

        }   // switch

        Log.d("19decV1", "index ==> " + index);

        Intent intent = new Intent(ChooseStructor.this, Chooselmage.class);
        intent.putExtra("Index", index);
        startActivity(intent);



    }   //onClick

}   // Main Class
