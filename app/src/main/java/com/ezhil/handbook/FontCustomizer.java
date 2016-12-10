package com.ezhil.handbook;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

/**
 * This file is part of Ezhil-Handbook app
 * (C) 2016 Ezhil Language Foundation
 */

public class FontCustomizer {
    static void update(Context ctx, TextView widget) {
        Typeface typeface = Typeface.createFromAsset(ctx.getAssets(),"Catamaran_Regular.ttf");
        widget.setTypeface(typeface);
    }
}
