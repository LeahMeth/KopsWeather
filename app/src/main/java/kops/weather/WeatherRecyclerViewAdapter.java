package kops.weather;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WeatherRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private CurrentWeather currentWeather;
    private ForecastWeather forecastWeather;
    private String zipcode;


    public WeatherRecyclerViewAdapter(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        } else {
            return position;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.weather_pager_item, parent, false);
            view.setMinimumHeight(parent.getMinimumHeight());
            return new CurrentWeatherViewHolder(view, viewType);
        } else {
            View view = LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.forecast_list_item, parent, false);
            return new ForecastWeatherViewHolder(view, viewType);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            CurrentWeatherViewHolder currHolder = (CurrentWeatherViewHolder) holder;
            currHolder.bind(currHolder);
        } else {
            ForecastWeatherViewHolder forecastHolder = (ForecastWeatherViewHolder) holder;
            forecastHolder.bind(new ForecastWeather().getList()[position]);
        }
    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
