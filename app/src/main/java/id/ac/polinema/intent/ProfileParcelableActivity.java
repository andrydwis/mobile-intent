package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);


        // TODO: bind here
        TextView userText = findViewById(R.id.text_username);
        TextView nameText = findViewById(R.id.text_name);
        TextView ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            User userRecieved = extras.getParcelable("USER_KEY");


            // TODO: display value here
            userText.setText(userRecieved.getUsername());
            nameText.setText(userRecieved.getName());
            ageText.setText(Integer.toString(userRecieved.getAge()));

        }
    }
}
