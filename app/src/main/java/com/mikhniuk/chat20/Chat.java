package com.mikhniuk.chat20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Chat extends AppCompatActivity {

    private static EditText message;
    private static TextView users;
    private static String users_string = "Users: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);
        message = (EditText) findViewById(R.id.mail);
        users = (TextView) findViewById(R.id.users);
        users.setText(users_string + 1);
    }

    public void Close(View v){
        finish();
    }
}
