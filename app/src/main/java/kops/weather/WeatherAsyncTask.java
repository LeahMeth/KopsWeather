package kops.weather;


import android.os.AsyncTask;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAsyncTask extends AsyncTask {

    private ViewPager viewPager;
    private ForecastWeather forecastWeather;

    public WeatherAsyncTask(ViewPager viewPager) {
        this.viewPager = viewPager;
    }

    @Override
    protected ForecastWeather doInBackground(Object[] params) {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?zip=11367" +
                    "&appid=4da4cafcdfe73ceae119f0c619ab0dfa&units=imperial&cnt=16");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream in = connection.getInputStream();
            forecastWeather = gson.fromJson(new InputStreamReader(in), ForecastWeather.class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return forecastWeather;
    }

    // @Override
    protected void onPostExecute(ForecastWeather forecastWeather) {
        super.onPostExecute(forecastWeather);
        WeatherPagerAdapter weatherPagerAdapter = new WeatherPagerAdapter(forecastWeather);
        viewPager.setAdapter(weatherPagerAdapter);
    }
}
