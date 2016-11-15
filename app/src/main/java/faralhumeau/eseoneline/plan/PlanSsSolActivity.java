package faralhumeau.eseoneline.plan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import faralhumeau.eseoneline.R;
import faralhumeau.eseoneline.news.NewsActivity;

public class PlanSsSolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_ss);
    }

    public void newsListener(View v) {
        final Intent intentNews = new Intent(PlanSsSolActivity.this, NewsActivity.class);
        startActivity(intentNews);
    }
}
