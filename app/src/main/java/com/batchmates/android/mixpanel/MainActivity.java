package com.batchmates.android.mixpanel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mixpanel.android.mpmetrics.MixpanelAPI;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
private MixpanelAPI mixpanel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        //8786ff279c569447550ae55979c6c528

        String projectToken = "8786ff279c569447550ae55979c6c528"; // e.g.: "1ef7e30d2a58d27f4b90c42e31d6d7ad"
        mixpanel = MixpanelAPI.getInstance(this, projectToken);

        try {
            JSONObject props = new JSONObject();
            props.put("Gender", "Female");
            props.put("Logged in", false);
            mixpanel.track("MainActivity - onCreate called", props);
        } catch (JSONException e) {
            Log.e("MYAPP", "Unable to add properties to JSONObject", e);
        }
    }

    @Override
    protected void onDestroy() {
        mixpanel.flush();
        super.onDestroy();
    }

    public void buttOne(View view) {

        try {
            JSONObject props = new JSONObject();
            props.put("Activity", "1");
            props.put("Logged in", false);
            mixpanel.track("MainActivity - buttOne called", props);
        } catch (JSONException e) {
            Log.e("MYAPP", "Unable to add properties to JSONObject", e);
        }
    }

    public void buttTwo(View view) {

        try {
            JSONObject props = new JSONObject();
            props.put("Activity", "2");
            props.put("Logged in", false);
            mixpanel.track("MainActivity - buttTwo called", props);
        } catch (JSONException e) {
            Log.e("MYAPP", "Unable to add properties to JSONObject", e);
        }
    }

    public void buttThree(View view) {

        try {
            JSONObject props = new JSONObject();
            props.put("Activity", "3");
            props.put("Logged in", false);
            mixpanel.track("MainActivity - buttThree called", props);
        } catch (JSONException e) {
            Log.e("MYAPP", "Unable to add properties to JSONObject", e);
        }
    }

    public void buttFour(View view) {

        try {
            JSONObject props = new JSONObject();
            props.put("Activity", "4");
            props.put("Logged in", false);
            mixpanel.track("MainActivity - buttFour called", props);
        } catch (JSONException e) {
            Log.e("MYAPP", "Unable to add properties to JSONObject", e);
        }
    }
}