package com.techandsolve.jimmymuchachasoy.test;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;
/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {
    private  MainActivity myActivity;
    @Before
    public void setup(){
        myActivity= Robolectric.buildActivity(MainActivity.class).create().get();
    }
    @Test
    public void message_isCorrect() throws Exception {
        TextView tvHola= (TextView) myActivity.findViewById(R.id.idsaludo);
        assertEquals("Saludos desde Tech",tvHola.getText().toString());
    }
}