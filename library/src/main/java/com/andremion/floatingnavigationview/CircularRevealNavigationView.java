/*
 * Copyright (c) 2019. André Mion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.andremion.floatingnavigationview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressWarnings("JavaDoc")
class CircularRevealNavigationView extends NavigationView implements CircularRevealWidget {

    private final CircularRevealHelper helper;

    public CircularRevealNavigationView(Context context) {
        this(context, null);
    }

    public CircularRevealNavigationView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircularRevealNavigationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        helper = new CircularRevealHelper(this);
    }

    @Override public void buildCircularRevealCache() {
        helper.buildCircularRevealCache();
    }

    @Override public void destroyCircularRevealCache() {
        helper.destroyCircularRevealCache();
    }

    @Nullable @Override public RevealInfo getRevealInfo() {
        return helper.getRevealInfo();
    }

    @Override public void setRevealInfo(@Nullable RevealInfo revealInfo) {
        helper.setRevealInfo(revealInfo);
    }

    @Override public int getCircularRevealScrimColor() {
        return helper.getCircularRevealScrimColor();
    }

    @Override public void setCircularRevealScrimColor(int color) {
        helper.setCircularRevealScrimColor(color);
    }

    @Nullable @Override public Drawable getCircularRevealOverlayDrawable() {
        return helper.getCircularRevealOverlayDrawable();
    }

    @Override public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        helper.setCircularRevealOverlayDrawable(drawable);
    }

    @SuppressLint("MissingSuperCall") @Override public void draw(@NonNull Canvas canvas) {
        helper.draw(canvas);
    }

    @SuppressLint("RestrictedApi") @Override public void actualDraw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override public boolean actualIsOpaque() {
        return isOpaque();
    }
}
