package com.example.app2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewStub stub = (ViewStub) findViewById(R.id.viewstub_demo_text);
        stub.inflate();
        TextView text = (TextView) findViewById(R.id.viewstub_demo_textview);
        text.setText("The tree of liberty must be refreshed from time to time" +
                " with the blood of patroits and tyrants! Freedom is nothing but " +
                "a chance to be better!");

        ViewStub stub1 = (ViewStub) findViewById(R.id.viewstub_demo_image);
        stub1.inflate();
        ImageView image = (ImageView) findViewById(R.id.viewstub_demo_imageview);
        image.setImageResource(R.drawable.ic_launcher_background);
    }
}
