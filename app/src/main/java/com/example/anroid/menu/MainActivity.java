package com.example.anroid.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView log1=(TextView)findViewById(R.id.menu_item_1);
        Log.v("Govind",log1.getText().toString());


        // Find second menu item TextView and print the text to the logs
        TextView log2=(TextView)findViewById(R.id.menu_item_2);
        Log.v("Govind",log2.getText().toString());

        // Find third menu item TextView and print the text to the logs
        TextView log3=(TextView)findViewById(R.id.menu_item_3);
        Log.v("Govind",log3.getText().toString());
    }
}
