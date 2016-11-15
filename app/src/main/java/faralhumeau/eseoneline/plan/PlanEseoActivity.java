package faralhumeau.eseoneline.plan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import faralhumeau.eseoneline.R;

public class PlanEseoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_eseo);
    }

    public void rdcListener(View v) {
        final Intent intentNews = new Intent(PlanEseoActivity.this, PlanRdcActivity.class);
        startActivity(intentNews);
    }

    public void ssSolListener(View v) {
        final Intent intentNews = new Intent(PlanEseoActivity.this, PlanSsSolActivity.class);
        startActivity(intentNews);
    }

    public void e1Listener(View v) {
        final Intent intentNews = new Intent(PlanEseoActivity.this, Plan1EtageActivity.class);
        startActivity(intentNews);
    }

    public void e2Listener(View v) {
        final Intent intentNews = new Intent(PlanEseoActivity.this, Plan2EtageActivity.class);
        startActivity(intentNews);
    }

    public void e3Listener(View v) {
        final Intent intentNews = new Intent(PlanEseoActivity.this, Plan3EtageActivity.class);
        startActivity(intentNews);
    }

    public void e4Listener(View v) {
        final Intent intentNews = new Intent(PlanEseoActivity.this, Plan4EtageActivity.class);
        startActivity(intentNews);
    }
}
