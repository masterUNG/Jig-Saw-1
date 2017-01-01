package rtc.ariya.supakrit.jigsaw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Play3x3 extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private int indexAnInt, imageAnInt;
    private MyConstanct myConstanct;
    private ImageView[] imageClickImageViews, imageShowImageViews;
    private int[] statusImageInts = new int[]{R.drawable.cover, R.drawable.cover_forcus};
    private boolean[] imageBooleen;
    private int chooseShowAnInt;
    private  int indexShow = 0, indexPlay = 0;


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

        imageBooleen = new boolean[9];
        for (int i = 0; i < imageBooleen.length; i++) {
            imageBooleen[i] = true;
        }

        createView();

        imageController();


    }   // Main Method

    public void setChooseShowAnInt(int chooseShowAnInt) {
        this.chooseShowAnInt = chooseShowAnInt;
        Log.d("1janV1", "chooseShow ==> " + chooseShowAnInt);
    }

    private void imageController() {

        for (int i = 0; i < imageClickImageViews.length; i++) {
            imageClickImageViews[i].setOnClickListener(this);
            imageShowImageViews[i].setOnClickListener(this);

        }   // for

    }   // imageController

    private void createView() {

        int[] indexRandom = myConstanct.getRan_a1_3x3Ints();
        int[] a1_3x3Ints = myConstanct.getA1_3x3Ints();

        for (int i = 0; i < indexRandom.length; i++) {
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

        imageShowImageViews = new ImageView[9];
        imageShowImageViews[0] = (ImageView) findViewById(R.id.imageView8);
        imageShowImageViews[1] = (ImageView) findViewById(R.id.imageView9);
        imageShowImageViews[2] = (ImageView) findViewById(R.id.imageView10);
        imageShowImageViews[3] = (ImageView) findViewById(R.id.imageView11);
        imageShowImageViews[4] = (ImageView) findViewById(R.id.imageView12);
        imageShowImageViews[5] = (ImageView) findViewById(R.id.imageView13);
        imageShowImageViews[6] = (ImageView) findViewById(R.id.imageView14);
        imageShowImageViews[7] = (ImageView) findViewById(R.id.imageView15);
        imageShowImageViews[8] = (ImageView) findViewById(R.id.imageView16);


    }   // bind Widget

    @Override
    public void onClick(View view) {


        //for Show

        switch (view.getId()) {

            case R.id.imageView8:
                indexShow = 0;
                break;
            case R.id.imageView9:
                indexShow = 1;
                break;
            case R.id.imageView10:
                indexShow = 2;
                break;
            case R.id.imageView11:
                indexShow = 3;
                break;
            case R.id.imageView12:
                indexShow = 4;
                break;
            case R.id.imageView13:
                indexShow = 5;
                break;
            case R.id.imageView14:
                indexShow = 6;
                break;
            case R.id.imageView15:
                indexShow = 7;
                break;
            case R.id.imageView16:
                indexShow = 8;
                break;

            case R.id.imageView17:
                indexPlay = 0;
                break;
            case R.id.imageView18:
                indexPlay = 1;
                break;
            case R.id.imageView19:
                indexPlay = 2;
                break;
            case R.id.imageView20:
                indexPlay = 3;
                break;
            case R.id.imageView21:
                indexPlay = 4;
                break;
            case R.id.imageView22:
                indexPlay = 5;
                break;
            case R.id.imageView23:
                indexPlay = 6;
                break;
            case R.id.imageView24:
                indexPlay = 7;
                break;
            case R.id.imageView25:
                indexPlay = 8;
                break;
        }   // swift


        if (imageBooleen[indexShow]) {
            imageShowImageViews[indexShow].setImageResource(statusImageInts[1]);
            setChooseShowAnInt(indexShow);
        }   //if

        checkImage(indexPlay);


    }   // onClick

    private void checkImage(int indexPlay) {

        Log.d("1janV1", "indexPlay ==> " + indexPlay);

    }   // checkImage


}   // Main Class
