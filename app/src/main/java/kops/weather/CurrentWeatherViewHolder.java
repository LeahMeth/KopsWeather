package kops.weather;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class CurrentWeatherViewHolder extends RecyclerView.ViewHolder {
    private TextView city;
    private TextView max;
    private TextView min;
    private TextView description;
    private TextView temp;
    private Button addCity;

    //private ImageView icon;


    public CurrentWeatherViewHolder(View itemView) {
        super(itemView);
        this.city = (TextView) itemView.findViewById(R.id.city);
        this.max = (TextView) itemView.findViewById(R.id.max);
        this.min = (TextView) itemView.findViewById(R.id.min);
        this.description = (TextView) itemView.findViewById(R.id.description);
        this.temp = (TextView) itemView.findViewById(R.id.temp);
        this.addCity = (Button) itemView.findViewById(R.id.addLocation);



    }

    public void bind(CurrentWeather currentWeather){
        city.setText(currentWeather.getName());
        max.setText(String.valueOf((int) currentWeather.getMax()));
        min.setText(String.valueOf((int) currentWeather.getMin()));
        description.setText(currentWeather.getDescription());
        temp.setText(String.valueOf((int)currentWeather.getTemp()));
        addCity.setText("Add a City");
        /*addCity.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }); */




    }
}
