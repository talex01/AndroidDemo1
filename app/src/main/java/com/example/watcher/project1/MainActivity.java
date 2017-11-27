package com.example.watcher.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnRun).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char chars[] = ((EditText)findViewById(R.id.inputValue)).getText().toString().toCharArray();
                StringBuilder intValue = new StringBuilder();
                StringBuilder hexValue = new StringBuilder();

                for (char c: chars) {
                    intValue.append((int) c).append(" ");
                    hexValue.append(Integer.toHexString((int) c)).append(" ");
                }

                ((EditText)findViewById(R.id.intValue)).setText(intValue);
                ((EditText)findViewById(R.id.hexValue)).setText(hexValue);
            }
        });
    }
}
