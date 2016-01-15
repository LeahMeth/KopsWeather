package kops.weather;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class WeatherPagerAdapter extends PagerAdapter {

    ForecastWeather forecastWeather;

    public WeatherPagerAdapter(ForecastWeather forecastWeather) {
        this.forecastWeather = forecastWeather;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = (View) inflater.inflate(R.layout.weather_pager_item, null);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return 16;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);

    }
}
