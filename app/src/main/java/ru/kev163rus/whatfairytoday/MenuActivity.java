package ru.kev163rus.whatfairytoday;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MenuActivity extends Activity implements View.OnClickListener{

    static int SCREEN_HEIGHT = 0;
    static int SCREEN_WIDTH = 0;
    static int SCREEN_HEIGHT_HALF = 0;
    static int SCREEN_WIDTH_HALF = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setScreenDimention();

        setContentView(R.layout.activity_menu);

        Button myButtom = (Button) findViewById(R.id.buttonStartTest);
        myButtom.setOnClickListener(this);

        startAnimation_FirstActivity();

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.buttonStartTest:
                startAnimation_FirstActivity();
                break;
            default:
                break;
        }
    }

    private void startAnimation_FirstActivity() {


//        Bitmap cBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.firststart_bloom);
        int zeroX = 0;

        ImageView iv_Bloom = (ImageView) findViewById(R.id.imageView_FirstStart_Bloom);
        iv_Bloom.setLayoutParams(new LinearLayout.LayoutParams(SCREEN_WIDTH_HALF, SCREEN_HEIGHT_HALF));
        zeroX = zeroX - SCREEN_WIDTH_HALF;

        new MyAnimation(iv_Bloom,
                zeroX + (int)(SCREEN_WIDTH_HALF * 2.9),
                zeroX + (int)(SCREEN_WIDTH_HALF * 0.95),
                (int)(SCREEN_HEIGHT_HALF * 0.5),
                (int)(SCREEN_HEIGHT_HALF * 0.1),
                0,
                1500);

        ImageView iv_Flora = (ImageView) findViewById(R.id.imageView_FirstStart_Flora);
        iv_Flora.setLayoutParams(new LinearLayout.LayoutParams(SCREEN_WIDTH_HALF, SCREEN_HEIGHT_HALF));
        zeroX = zeroX - SCREEN_WIDTH_HALF;

        new MyAnimation(iv_Flora,
                zeroX,
                zeroX + (int)(SCREEN_WIDTH_HALF * 1.85),
                -SCREEN_HEIGHT_HALF,
                (int)(SCREEN_HEIGHT_HALF * 0.15),
                150,
                1500);

        ImageView iv_Leyla = (ImageView) findViewById(R.id.imageView_FirstStart_Leyla);
        iv_Leyla.setLayoutParams(new LinearLayout.LayoutParams(SCREEN_WIDTH_HALF, SCREEN_HEIGHT_HALF));
        zeroX = zeroX - SCREEN_WIDTH_HALF;

        new MyAnimation(iv_Leyla,
                zeroX + (int)(SCREEN_WIDTH_HALF * 0.8),
                zeroX + (int)(SCREEN_WIDTH_HALF * 1.42),
                (int)(-SCREEN_HEIGHT_HALF * 1.1),
                (int)(SCREEN_HEIGHT_HALF * 0.25),
                300,
                1500);

        ImageView iv_Musa = (ImageView) findViewById(R.id.imageView_FirstStart_Musa);
        iv_Musa.setLayoutParams(new LinearLayout.LayoutParams(SCREEN_WIDTH_HALF, SCREEN_HEIGHT_HALF));
        zeroX = zeroX - SCREEN_WIDTH_HALF;

        new MyAnimation(iv_Musa,
                zeroX + (int)(SCREEN_WIDTH_HALF * 2.5),
                zeroX + (int)(SCREEN_WIDTH_HALF * 0.8),
                -SCREEN_HEIGHT_HALF,
                SCREEN_HEIGHT_HALF / 2 + SCREEN_HEIGHT_HALF / 5,
                450,
                1500);

        ImageView iv_Stella = (ImageView) findViewById(R.id.imageView_FirstStart_Stella);
        iv_Stella.setLayoutParams(new LinearLayout.LayoutParams(SCREEN_WIDTH_HALF, SCREEN_HEIGHT_HALF));
        zeroX = zeroX - SCREEN_WIDTH_HALF;

        new MyAnimation(iv_Stella,
                zeroX + (int)(SCREEN_WIDTH_HALF * 2.1),
                zeroX + (int)(SCREEN_WIDTH_HALF * 1.40),
                (int)(SCREEN_HEIGHT_HALF * 2.5),
                (int)(SCREEN_HEIGHT_HALF * 0.7),
                600,
                1500);

        ImageView iv_Tecna = (ImageView) findViewById(R.id.imageView_FirstStart_Tecna);
        iv_Tecna.setLayoutParams(new LinearLayout.LayoutParams(SCREEN_WIDTH_HALF, SCREEN_HEIGHT_HALF));
        zeroX = zeroX - SCREEN_WIDTH_HALF;

        new MyAnimation(iv_Tecna,
                zeroX + (int)(SCREEN_WIDTH_HALF * 2.8),
                zeroX + (int)(SCREEN_WIDTH_HALF * 1.9),
                (int)(SCREEN_HEIGHT_HALF * 0.2),
                (int)(SCREEN_HEIGHT_HALF * 0.75),
                750,
                1500);


        Toast.makeText(MenuActivity.this, "Start -nimation", Toast.LENGTH_SHORT).show();

    }

    private void setScreenDimention(){

        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics metricsB = new DisplayMetrics();
        display.getMetrics(metricsB);
        SCREEN_HEIGHT = metricsB.heightPixels;
        SCREEN_WIDTH = metricsB.widthPixels;
        SCREEN_HEIGHT_HALF = SCREEN_HEIGHT / 2;
        SCREEN_WIDTH_HALF = SCREEN_WIDTH / 2;
//        System.out.println(SCREEN_HEIGHT + ", " + SCREEN_WIDTH);

    }

}
