package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicitContent(View view) {
        Intent intent =  new Intent(this, ExplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleImplicitContent(View view) {
        Intent intent = new Intent(this, ImplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleBundleContent(View view) {
        Intent intent = new Intent(this, BundleActivity.class);
        startActivity(intent);
    }

    public void handleParcelableContent(View view) {
        Intent intent = new Intent(this, ParcelableActivity.class);
        startActivity(intent);
    }
}
