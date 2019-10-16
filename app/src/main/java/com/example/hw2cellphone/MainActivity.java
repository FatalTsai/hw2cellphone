package com.example.hw2cellphone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText familyedit;
    EditText firstedit;
    EditText numedit;
    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        familyedit=findViewById(R.id.familyedit);
        firstedit=findViewById(R.id.firstedit);
        numedit=findViewById(R.id.numedit);
        content = (TextView) findViewById(R.id.content);
    }



    public void submit(View v){

        String familyname=familyedit.getText().toString();
        String firstname=firstedit.getText().toString();
        String numname=numedit.getText().toString();

        content.setText(familyname+firstname+"'s phone number is "+numname);

    }
}
