package rtc.ariya.supakrit.jigsaw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Chooselmage extends AppCompatActivity {

    //Explicit
    private int anInt;
    private int[] imageInt = new int[]{R.drawable.a1, R.drawable.a2,
            R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6,
            R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10};
    private String[] titleStrings = new String[]{"3 x3 ","4 x 4","5 x 5"};
    private int[] iconInts = new int[]{R.drawable.e1,R.drawable.e2,R.drawable.e3};
    private ImageView imageView;
    private TextView textView;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooselmage);

        //Bind Widget
        imageView = (ImageView) findViewById(R.id.imageView5);
        textView = (TextView) findViewById(R.id.textView7);
        listView = (ListView) findViewById(R.id.livimage);


        //Get Value From Intent
        anInt = getIntent().getIntExtra("Index", 0);
        Log.d("tonV1", "Index ==> " + anInt);

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

                        Intent intent = new Intent(Chooselmage.this, PlayActivity.class);
                        intent.putExtra("Image", imageInt[position]);
                        startActivity(intent);


                        break;
                    case 1: // for 4x4

                        Intent intent1 = new Intent(Chooselmage.this, Play4Activity.class);
                        intent1.putExtra("Image", imageInt[position]);
                        startActivity(intent1);
                        break;
                    case 2: // for 5x5
                        Intent intent2 = new Intent(Chooselmage.this, Play5Activity.class);
                        intent2.putExtra("Image", imageInt[position]);
                        startActivity(intent2);
                        break;


                } // switch

            }   //onItem
        });



    }   // Main Method
}   // Main Class
