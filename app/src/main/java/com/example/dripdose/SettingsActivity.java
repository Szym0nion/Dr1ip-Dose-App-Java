package com.example.dripdose;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    ImageButton MainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //Exit Button
        MainActivity = findViewById(R.id.btnSettingsExit);
        MainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_four = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(intent_four);
            }
        });
    }
    //browser Terms
    public void browserTerms(View view){
        Intent browserIntentTerms = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.app-privacy-policy.com/live.php?token=s1mY7Wa7t8lrFHmTPkCTK5hE41F8KlTK"));
        startActivity(browserIntentTerms);
    }
    //browser Privacy
    public void browserPrivacy(View view){
        Intent browserIntentPrivacy = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.privacypolicytemplate.net/live.php?token=trVlB22O0AhEniAsyzcRfxWegPrw8yNe"));
        startActivity(browserIntentPrivacy);
    }
    //browser Feedback
    public void browserFeedback(View view){
        Intent browserIntentFeedback = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto: szymon.chmielewski2908@gmail.com"));
        startActivity(browserIntentFeedback);
    }
    //browser Instagram
    public void browserInstagram(View view){
        Intent browserIntentInstagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/szymon.chmielewski/"));
        startActivity(browserIntentInstagram);
    }
    //browser Review
    public void browserReview(View view){
        Intent browserIntentReview = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntentReview);
    }
}