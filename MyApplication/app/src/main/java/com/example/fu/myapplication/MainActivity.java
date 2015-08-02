package com.example.fu.myapplication;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MyClick(View view) {
        if (view.getId() == R.id.btnHolle) {
            Toast.makeText(this, "Holle World", Toast.LENGTH_SHORT).show();
        }
    }
}
