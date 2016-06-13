package ru.kev163rus.whatfairytoday;

import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import static ru.kev163rus.whatfairytoday.MenuActivity.SCREEN_WIDTH;

/**
 * Created by Админ on 13.06.2016.
 */

public class MyAnimation {

    public MyAnimation(ImageView givenImage, int startW, int finishW, int startH, int finishH, int givenStartOffset, int givenDuration){

        givenImage.setVisibility(View.VISIBLE);

        TranslateAnimation translateAnimation = new TranslateAnimation (startW, finishW, startH, finishH);
        translateAnimation.setDuration(givenDuration);
        translateAnimation.setStartOffset(givenStartOffset);
        translateAnimation.setFillAfter(true);

        givenImage.startAnimation(translateAnimation);

    }

}
