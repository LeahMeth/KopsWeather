package kops.weather;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class ForecastWeatherViewHolder extends RecyclerView.ViewHolder {

    private TextView max;
    private TextView min;

    private TextView day;



    public ForecastWeatherViewHolder(View itemView) {
        super(itemView);

        this.max = (TextView) itemView.findViewById(R.id.max);
        this.min = (TextView) itemView.findViewById(R.id.min);
        this.day = (TextView) itemView.findViewById(R.id.day);



    }

    public void bind(CurrentWeather currentWeather){

        max.setText(String.valueOf((int) currentWeather.getMax()));
        min.setText(String.valueOf((int) currentWeather.getMin()));

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        day.setText(dateFormat.format(currentWeather.get));

    }
}
