package com.example.admin.listviewdatapassinganotheractivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileActivity extends Activity {

    int pos=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);


        Intent intent = getIntent();
        pos= intent.getExtras().getInt("Position");


        final CustomAdapter adapter= new CustomAdapter(this);
        final ImageView img= (ImageView) findViewById(R.id.imgid);
        final TextView name=(TextView) findViewById(R.id.MobileName);
        final TextView price=(TextView) findViewById(R.id.MobilePrice);


        //set data
        img.setImageResource(adapter.images[pos]);
        name.setText(adapter.names[pos]);
        price.setText(adapter.price[pos]);

        Button btnnext=(Button)findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int position =pos+1;

                img.setImageResource(adapter.images[position]);
                name.setText("Name:"+ adapter.names[position]);
                price.setText("Price:"+ adapter.price[position]);

                if (!(position>= adapter.getCount()-1))
                {
                    pos +=1;

                }else
                {
                    pos= -1;

                }

            }
        });


    }
}
