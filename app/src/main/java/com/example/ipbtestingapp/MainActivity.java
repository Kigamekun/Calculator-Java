package com.example.ipbtestingapp;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openLinkButton = findViewById(R.id.open_link_button);
        openLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Halo ",Toast.LENGTH_LONG).show();
//                openLink("https://www.example.com");
            }
        });


        Button navigateButton = findViewById(R.id.navigate_button);
        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSecondActivity();
            }
        });


    }

    // Fungsi untuk membuka tautan di browser
    private void openLink(String url) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }

    private void navigateToSecondActivity() {
        Intent myIntent = new Intent(this, SecondActivity.class);
        startActivity(myIntent);
    }

}