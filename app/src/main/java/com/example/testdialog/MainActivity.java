package com.example.testdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final HintDialog dialog = new HintDialog(this);
        ((Button) findViewById(R.id.show_dialog)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.showDialog();
            }
        });
    }
}
