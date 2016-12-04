package rtc.ariya.supakrit.jigsaw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class PlayActivity extends Activity {
    DrawView dv;
    LinearLayout scene;

    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        scene = (LinearLayout)findViewById(R.id.scene);
        dv = new DrawView(PlayActivity.this, getWindowManager().getDefaultDisplay());
        draw();

        Button buttonReset = (Button)findViewById(R.id.buttonReset);
        buttonReset.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                dv.reset();
            }
        });
    }

    public void draw() {
        try {
            scene.removeView(dv);
        } catch (Exception e) { }
        scene.addView(dv);
    }

    public void removeView() {
        try {
            scene.removeView(dv);
        } catch (Exception e) { }
    }



}
