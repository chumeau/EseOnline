/**
 * Created by EseOnline on 17/10/2016.
 *
 */

package faralhumeau.eseoneline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import faralhumeau.eseoneline.account.AccountActivity;
import faralhumeau.eseoneline.calendar.CalendarActivity;
import faralhumeau.eseoneline.eseo.EseoActivity;
import faralhumeau.eseoneline.map.MapsActivity;
import faralhumeau.eseoneline.news.NewsActivity;
import faralhumeau.eseoneline.plan.PlanEseoActivity;
import faralhumeau.eseoneline.service.EseoCovoitActivity;
import faralhumeau.eseoneline.service.EseoLogementActivity;
import faralhumeau.eseoneline.service.EseoMiamActivity;
import faralhumeau.eseoneline.weather.WeatherActivity;

public class MainActivity extends AppCompatActivity {
    private ImageButton _map;
    private ImageButton _news;
    private ImageButton _eseo;
    private ImageButton _account;
    private ImageButton _weather;
    private ImageButton _calendar;
    private ImageButton _miam;
    private ImageButton _accommodation;
    private ImageButton _carpool;
    private ImageButton _france;
    private ImageButton _uk;
    private ImageButton _facebook;
    private ImageButton _twitter;
    private ImageButton _youtube;
    private Intent _intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _intent = getIntent();
        _news = (ImageButton)findViewById(R.id.imageButtonNews);
        _eseo = (ImageButton)findViewById(R.id.imageButtonEseo);
        _map = (ImageButton)findViewById(R.id.imageButtonMap);
        _account = (ImageButton)findViewById(R.id.imageButtonUser);
        _weather = (ImageButton)findViewById(R.id.imageButtonWeather);
        _calendar = (ImageButton)findViewById(R.id.imageButtonCalendar);
        _miam = (ImageButton)findViewById(R.id.imageButtonEseoMiam);
        _accommodation = (ImageButton)findViewById(R.id.imageButtonAccomodation);
        _carpool = (ImageButton)findViewById(R.id.imageButtonCovoit);
        _france = (ImageButton)findViewById(R.id.imageButtonFrancais);
        _uk = (ImageButton)findViewById(R.id.imageButtonEnglish);
        _facebook = (ImageButton)findViewById(R.id.imageButtonFacebook);
        _twitter = (ImageButton)findViewById(R.id.imageButtonTwitter);
        _youtube = (ImageButton)findViewById(R.id.imageButtonYoutube);
    }

    public void newsListener(View v) {
        final Intent intentNews = new Intent(MainActivity.this, NewsActivity.class);
        startActivity(intentNews);
    }

    public void eseoListener(View v) {
        final Intent intentEseo = new Intent(MainActivity.this, EseoActivity.class);
        startActivity(intentEseo);
    }

    public void mapListener(View v) {
        final Intent intentMap = new Intent(MainActivity.this, PlanEseoActivity.class);
        startActivity(intentMap);
    }

    public void accountListener(View v) {
        final Intent intentAccount = new Intent(MainActivity.this, AccountActivity.class);
        startActivity(intentAccount);
    }

    public void weatherListener(View v) {
        final Intent intentWeather = new Intent(MainActivity.this, WeatherActivity.class);
        startActivity(intentWeather);
    }

    public void calendarListener(View v) {
        final Intent intentCalendar = new Intent(MainActivity.this, CalendarActivity.class);
        startActivity(intentCalendar);
    }

    public void eseoMiamListener(View v) {
        final Intent intentEseoMiam = new Intent(MainActivity.this, EseoMiamActivity.class);
        startActivity(intentEseoMiam);
    }

    public void eseoLogementListener(View v) {
        final Intent intentEseoLogement = new Intent(MainActivity.this, EseoLogementActivity.class);
        startActivity(intentEseoLogement);
    }

    public void eseoCovoitListener(View v) {
        final Intent intentEseoCovoit = new Intent(MainActivity.this, EseoCovoitActivity.class);
        startActivity(intentEseoCovoit);
    }
}
