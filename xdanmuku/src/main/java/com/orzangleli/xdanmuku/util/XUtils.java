package com.orzangleli.xdanmuku.util;

import android.graphics.Rect;

/**
 * <p>description：
 * <p>===============================
 * <p>creator：lixiancheng
 * <p>create time：2018/7/23 下午1:53
 * <p>===============================
 * <p>reasons for modification：
 * <p>Modifier：
 * <p>Modify time：
 * <p>@version
 */

public class XUtils {
    public static Rect getTextBoundsApproximately(float paintSize, int textLength) {
        Rect rect = new Rect();
        rect.top = 0;
        rect.bottom = (int) paintSize;
        rect.left = 0;
        rect.right = (int) ((paintSize + 4) * textLength);
        return rect;
    }


    public static int measureTextApproximately(float paintSize, int textLength) {
        return (int) ((paintSize + 4) * textLength);
    }




}
