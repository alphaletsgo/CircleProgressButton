package cn.isif.widget;

import android.content.res.Resources;

/**
 * db/px helper
 *
 * Created by dell on 2016/4/18.
 */
public class Utils {
    public static float dp2px(Resources resources, float dp) {
        final float scale = resources.getDisplayMetrics().density;
        return  dp * scale + 0.5f;
    }

    public static float sp2px(Resources resources, float sp){
        final float scale = resources.getDisplayMetrics().scaledDensity;
        return sp * scale;
    }
}
