package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {

    EditText etNumber,etName,etLoc,etWeb;
    ImageView imgSmile,imgFace,imgSad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        init();
        imgSmile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name2=etName.getText().toString().trim();
                String number2=etNumber.getText().toString().trim();
                String web2=etWeb.getText().toString().trim();
                String location2=etLoc.getText().toString().trim();

                if (name2.isEmpty())
                {
                    etName.setError("Invalid input");

                }
                if (number2.isEmpty())
                {
                    etNumber.setError("Invalid input");

                }
                if(web2.isEmpty())
                {

                    etWeb.setError("Invalid input");
                }
                if (location2.isEmpty())
                {

                    etLoc.setError("Invalid input");

                }
                else {

                    Intent i=new Intent();
                    i.putExtra("emjCode",1);
                    i.putExtra("name",name2);
                    i.putExtra("number",number2);
                    i.putExtra("web",web2);
                    i.putExtra("location",location2);
                    setResult(RESULT_OK,i);
                    finish();

                }

            }
        });

        imgFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name2=etName.getText().toString().trim();
                String number2=etNumber.getText().toString().trim();
                String web2=etWeb.getText().toString().trim();
                String location2=etLoc.getText().toString().trim();

                if (name2.isEmpty())
                {
                    etName.setError("Invalid input");

                }
                if (number2.isEmpty())
                {
                    etNumber.setError("Invalid input");

                }
                if(web2.isEmpty())
                {

                    etWeb.setError("Invalid input");
                }
                if (location2.isEmpty())
                {

                    etLoc.setError("Invalid input");

                }
                else {

                    Intent i=new Intent();
                    i.putExtra("emjCode",2);
                    i.putExtra("name",name2);
                    i.putExtra("number",number2);
                    i.putExtra("web",web2);
                    i.putExtra("location",location2);
                    setResult(RESULT_OK,i);
                    finish();

                }

            }
        });
        // 3
        imgSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name2=etName.getText().toString().trim();
                String number2=etNumber.getText().toString().trim();
                String web2=etWeb.getText().toString().trim();
                String location2=etLoc.getText().toString().trim();

                if (name2.isEmpty())
                {
                    etName.setError("Invalid input");

                }
                if (number2.isEmpty())
                {
                    etNumber.setError("Invalid input");

                }
                if(web2.isEmpty())
                {

                    etWeb.setError("Invalid input");
                }
                if (location2.isEmpty())
                {

                    etLoc.setError("Invalid input");

                }
                else {

                    Intent i=new Intent();
                    i.putExtra("emjCode",3);
                    i.putExtra("name",name2);
                    i.putExtra("number",number2);
                    i.putExtra("web",web2);
                    i.putExtra("location",location2);
                    setResult(RESULT_OK,i);
                    finish();

                }

            }
        });




    }
    private void init()
    {
        etNumber=findViewById(R.id.etNumber);
        etName=findViewById(R.id.etName);
        etLoc=findViewById(R.id.etLoc);
        etWeb=findViewById(R.id.etWeb);
        imgSmile=findViewById(R.id.imgSmile);
        imgFace=findViewById(R.id.imgFace);
        imgSad=findViewById(R.id.imgSad);


    }

}