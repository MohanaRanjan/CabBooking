package com.cabbooking.rkm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends Activity {

    ImageButton imagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        addListneronImageButton();
    }

    public void addListneronImageButton()
    {
     imagebutton  = (ImageButton)findViewById(R.id.imageButtonAddUser);
     imagebutton.setOnClickListener(new View.OnClickListener()
     {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(HomeActivity.this,AddUserActivity.class);
                startActivity(intent);
            }
        });
    }

}
