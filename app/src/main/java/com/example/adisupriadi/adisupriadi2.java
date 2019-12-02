package com.example.adisupriadi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adisupriadi2 extends AppCompatActivity {

    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adisupriadi2);
        button2 = findViewById(R.id.button11);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(adisupriadi2.this, adisupriadi3.class);
                adisupriadi2.this.startActivity(a);
                adisupriadi2.this.finish();

            }
        });
    }
}
