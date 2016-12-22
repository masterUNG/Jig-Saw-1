package rtc.ariya.supakrit.jigsaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

public class Play3x3 extends AppCompatActivity {

    //Explicit
    private int indexAnInt, imageAnInt;
    private MyConstanct myConstanct;
    private ImageView[] imageClickImageViews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play3x3);

        bindWidget();

        //Setting
        myConstanct = new MyConstanct();
        indexAnInt = getIntent().getIntExtra("Index", 0);
        imageAnInt = getIntent().getIntExtra("Image", R.drawable.a1);
        Log.d("19decV3", "index ==>" + indexAnInt);
        Log.d("19decV3", "Image ==>  " + imageAnInt);

        createView();


    }   // Main Method

    private void createView() {

        int[] indexRandom = myConstanct.getRan_a1_3x3Ints();
        int[] a1_3x3Ints = myConstanct.getA1_3x3Ints();

        for (int i=0;i<indexRandom.length;i++) {
            imageClickImageViews[indexRandom[i]].setImageResource(a1_3x3Ints[i]);
        }

    }

    private void bindWidget() {

        imageClickImageViews = new ImageView[9];
        imageClickImageViews[0] = (ImageView) findViewById(R.id.imageView17);
        imageClickImageViews[1] = (ImageView) findViewById(R.id.imageView18);
        imageClickImageViews[2] = (ImageView) findViewById(R.id.imageView19);
        imageClickImageViews[3] = (ImageView) findViewById(R.id.imageView20);
        imageClickImageViews[4] = (ImageView) findViewById(R.id.imageView21);
        imageClickImageViews[5] = (ImageView) findViewById(R.id.imageView22);
        imageClickImageViews[6] = (ImageView) findViewById(R.id.imageView23);
        imageClickImageViews[7] = (ImageView) findViewById(R.id.imageView24);
        imageClickImageViews[8] = (ImageView) findViewById(R.id.imageView25);


    }

}   // Main Class
