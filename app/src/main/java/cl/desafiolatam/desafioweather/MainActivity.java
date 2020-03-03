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
        viewDataBinding.textView.setText("Santiago");
        viewDataBinding.textView3.setText("3 de Abril");
        viewDataBinding.textView4.setText("16 °");
        viewDataBinding.textView5.setText("C");
    }
}
