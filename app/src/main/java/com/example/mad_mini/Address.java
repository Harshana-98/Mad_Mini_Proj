package com.example.mad_mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mad_mini.R;

public class Address extends AppCompatActivity {

    private EditText nameEdiText, phoneEditText,addressEditText,districtEditText,zipcodeEditText;
    private Button confirmOrderBtn;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.address);

        confirmOrderBtn = (Button) findViewById(R.id.confirmbtn);
        nameEdiText = (EditText) findViewById(R.id.contact);
        phoneEditText = (EditText) findViewById(R.id.mobile);
        addressEditText = (EditText) findViewById(R.id.address);
        districtEditText = (EditText) findViewById(R.id.district);
        zipcodeEditText = (EditText) findViewById(R.id.postalcode);


        confirmOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Check();
            }
        });
    }

        private void Check() {

            if (TextUtils.isEmpty(nameEdiText.getText().toString()))
            {
                Toast.makeText(this, "Please provide you full name", Toast.LENGTH_SHORT).show();
            }
            else if (TextUtils.isEmpty(phoneEditText.getText().toString()))
            {
                Toast.makeText(this, "Please provide your phone number", Toast.LENGTH_SHORT).show();
            }
            else if (TextUtils.isEmpty(addressEditText.getText().toString()))
            {
                Toast.makeText(this, "Please provide your address", Toast.LENGTH_SHORT).show();
            }
            else if(TextUtils.isEmpty(districtEditText.getText().toString()))
            {
                Toast.makeText(this, "Please provide your district", Toast.LENGTH_SHORT).show();
            }
            else if (TextUtils.isEmpty(zipcodeEditText.getText().toString()))
            {
                Toast.makeText(this, "Please provide your zip code", Toast.LENGTH_SHORT).show();
            }
            else {
                ConfirmOrder();
            }

        }

        private void ConfirmOrder()
        {

}
}