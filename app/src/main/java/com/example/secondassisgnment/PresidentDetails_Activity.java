package com.example.secondassisgnment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PresidentDetails_Activity extends AppCompatActivity {
    private TextView tvname, tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_details);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        tvname=(TextView) findViewById(R.id.txtname);
        tvdescription=(TextView) findViewById(R.id.txtdesc);
        img=(ImageView) findViewById(R.id.presidenthumbnail);

        Intent intent =getIntent();
        String Name= intent.getExtras().getString("Name");
        String Description= intent.getExtras().getString("Description");
        int image= intent.getExtras().getInt("Thumbnail");

        tvname.setText(Name);
        tvdescription.setText(Description);
        img.setImageResource(image);


    }
}
