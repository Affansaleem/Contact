package com.example.contacts;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;
    ImageView emoji,phone,website,maps;
    final int SECOND_ACTIVITY = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,com.example.contacts.Secondactivity.class);
                startActivityForResult(i,SECOND_ACTIVITY);


            }
        });


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==SECOND_ACTIVITY)
        {
            if (resultCode==RESULT_CANCELED)
            {

                Toast.makeText(this, "No data was entered", Toast.LENGTH_SHORT).show();
            }
            else if (resultCode==RESULT_OK)
            {
                assert data != null;
                int code1=data.getIntExtra("emjCode",-1);
                String name1= data.getStringExtra("name");
                String number1=data.getStringExtra("number");
                String web1=data.getStringExtra("web");
                String location1=data.getStringExtra("location");

                //tvExtra.setText("Code get is:"+code1);
                if (name1.isEmpty())
                {
                    Toast.makeText(this, "NO name was entered", Toast.LENGTH_SHORT).show();

                }
                else {

                   if (code1==1)
                   {

                       emoji.setImageResource(R.drawable.reshot_icon_smile_v8na59hru7);
                       emoji.setVisibility(View.VISIBLE);

                   }
                   else if(code1==2)
                   {

                           emoji.setImageResource(R.drawable.reshot_icon_face_unb5tdahxr);
                            emoji.setVisibility(View.VISIBLE);
                   }
                   else if(code1==3)
                   {

                       emoji.setImageResource(R.drawable.reshot_icon_sadness_vm7cty6rk3);
                       emoji.setVisibility(View.VISIBLE);

                   }
                }

                if (number1.isEmpty())
                {
                    Toast.makeText(this, "NO phone# was entered", Toast.LENGTH_SHORT).show();


                }
                else {
                    phone.setVisibility(View.VISIBLE);
                    phone.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri phone=Uri.parse("tel:"+number1);
                            Intent p=new Intent(Intent.ACTION_DIAL,phone);
                            startActivity(p);
                        }
                    });

                }
                if(web1.isEmpty())
                {
                    Toast.makeText(this, "NO web address was entered", Toast.LENGTH_SHORT).show();


                }
                else {

                    website.setVisibility(View.VISIBLE);
                    website.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri user=Uri.parse("https://"+web1);
                            Intent u=new Intent(Intent.ACTION_VIEW,user);
                            startActivity(u);
                        }
                    });
                }
                if(location1.isEmpty())
                {

                    Toast.makeText(this, "NO location was entered", Toast.LENGTH_SHORT).show();

                }
                else{
                    maps.setVisibility(View.VISIBLE);
                    maps.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Uri intentUri = Uri.parse("geo:0,0?q=" + location1);
                            Intent i = new Intent(Intent.ACTION_VIEW, intentUri);
                            startActivity(i);

                        }
                    });

                }

            }

        }

    }

    private void init()
    {
       tv=findViewById(R.id.tv);
       btn=findViewById(R.id.btn);
        emoji=findViewById(R.id.emoji);
        phone=findViewById(R.id.phone);
        website=findViewById(R.id.website);
        maps=findViewById(R.id.maps);


    }
}


