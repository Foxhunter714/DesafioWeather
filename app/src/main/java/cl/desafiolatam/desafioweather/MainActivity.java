package cl.desafiolatam.desafioweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;

import cl.desafiolatam.desafioweather.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        DailyWeather dailyWeather = new DailyWeather("Santiago","3 de Abril","","16 °", "C", "1°","17");
        viewDataBinding.setDaily(dailyWeather);
    }
}
