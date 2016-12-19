package rtc.ariya.supakrit.jigsaw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Chooselmage extends AppCompatActivity {

    //Explicit
    private int anInt;
    private MyConstanct myConstanct;
    private int[] imageInt;
    private String[] titleStrings = new String[]{"3 x3 ", "4 x 4", "5 x 5"};
    private int[] iconInts = new int[]{R.drawable.e1, R.drawable.e2, R.drawable.e3};
    private ImageView imageView;
    private TextView textView;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooselmage);

        myConstanct = new MyConstanct();
        imageInt = myConstanct.getImageInt();

        //Bind Widget
        imageView = (ImageView) findViewById(R.id.imageView5);
        textView = (TextView) findViewById(R.id.textView7);
        listView = (ListView) findViewById(R.id.livimage);


        //Get Value From Intent
        anInt = getIntent().getIntExtra("Index", 0);
        Log.d("19decV2", "Index ที่รับค่ามา ==> " + anInt);

        //Show View
        imageView.setImageResource(iconInts[anInt]);
        textView.setText(titleStrings[anInt]);

        //Create ListView
        MyAdapter myAdapter = new MyAdapter(Chooselmage.this, imageInt);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (anInt) {

                    case 0: // for 3x3

                        Intent intent = new Intent(Chooselmage.this, Play3x3.class);
                        intent.putExtra("Image", imageInt[position]);
                        intent.putExtra("Index", anInt);
                        startActivity(intent);


                        break;
                    case 1: // for 4x4

                        Intent intent1 = new Intent(Chooselmage.this, Play4Activity.class);
                        intent1.putExtra("Image", imageInt[position]);
                        intent1.putExtra("Index", anInt);
                        startActivity(intent1);
                        break;
                    case 2: // for 5x5
                        Intent intent2 = new Intent(Chooselmage.this, Play5Activity.class);
                        intent2.putExtra("Image", imageInt[position]);
                        intent2.putExtra("Index", anInt);
                        startActivity(intent2);
                        break;


                } // switch

            }   //onItem
        });


    }   // Main Method
}   // Main Class
