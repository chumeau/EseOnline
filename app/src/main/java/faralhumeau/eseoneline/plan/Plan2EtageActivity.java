package faralhumeau.eseoneline.plan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import faralhumeau.eseoneline.R;
import faralhumeau.eseoneline.news.NewsActivity;

public class Plan2EtageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_2etage);
    }

    public void newsListener(View v) {
        final Intent intentNews = new Intent(Plan2EtageActivity.this, NewsActivity.class);
        startActivity(intentNews);
    }
}
