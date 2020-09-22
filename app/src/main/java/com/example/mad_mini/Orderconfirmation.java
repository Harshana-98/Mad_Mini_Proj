package com.example.mad_mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mad_mini.R;

public class Orderconfirmation extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderconfirmation);

        btn = findViewById(R.id.Change);

    }

    @Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener ()  {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Orderconfirmation.this,Delivery_Address.class);
                startActivity(intent);
            }


        }
        ) ;
    }


}