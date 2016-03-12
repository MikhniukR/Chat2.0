package com.mikhniuk.chat20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private static EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        name = (EditText) findViewById(R.id.editText);
    }

    public void StartChat(View v){
        Intent intent = new Intent(this, Chat.class);
        intent.putExtra("name", name.getText().toString());
        startActivity(intent);
        finish();
    }
}
