package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

public class ParcelableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
    }

    public void handleSubmit(View view) {
        EditText userText = findViewById(R.id.input_username);
        EditText nameText = findViewById(R.id.input_name);
        EditText ageText = findViewById(R.id.input_age);

        String username = userText.getText().toString();
        String name = nameText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());

        User user = new User(username, name, age);

        Intent intent = new Intent(ParcelableActivity.this, ProfileParcelableActivity.class);
        intent.putExtra("USER_KEY", user);
        startActivity(intent);
    }
}
