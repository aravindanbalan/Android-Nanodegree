package com.android.nanodegreeproject0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppPortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);

        Button popular_movies_button = (Button) findViewById(R.id.popular_movies);
        Button stock_hawk_button = (Button) findViewById(R.id.stock_hawk);
        Button build_bigger_button = (Button) findViewById(R.id.build_bigger);
        Button material_app_button = (Button) findViewById(R.id.material_app);
        Button ubiquitous_app_button = (Button) findViewById(R.id.go_ubiquitous);
        Button capstone_button = (Button) findViewById(R.id.capstone);

        MyOnclickListener listener = new MyOnclickListener();
        if (popular_movies_button != null) {
            popular_movies_button.setOnClickListener(listener);
        }
        if (stock_hawk_button != null) {
            stock_hawk_button.setOnClickListener(listener);
        }
        if (build_bigger_button != null) {
            build_bigger_button.setOnClickListener(listener);
        }
        if (material_app_button != null) {
            material_app_button.setOnClickListener(listener);
        }
        if (ubiquitous_app_button != null) {
            ubiquitous_app_button.setOnClickListener(listener);
        }
        if (capstone_button != null) {
            capstone_button.setOnClickListener(listener);
        }
    }

    private class MyOnclickListener implements View.OnClickListener {
        String toast_message = "";
        int duration = Toast.LENGTH_SHORT;

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.popular_movies:
                    toast_message = getString(R.string.toast_message, getString(R.string.button_popular_movies_text));
                    Toast.makeText(getApplicationContext(), toast_message, duration).show();
                    break;
                case R.id.stock_hawk:
                    toast_message = getString(R.string.toast_message, getString(R.string.button_stock_hawk_text));
                    Toast.makeText(getApplicationContext(), toast_message, duration).show();
                    break;
                case R.id.build_bigger:
                    toast_message = getString(R.string.toast_message, getString(R.string.button_bigger_text));
                    Toast.makeText(getApplicationContext(), toast_message, duration).show();
                    break;
                case R.id.material_app:
                    toast_message = getString(R.string.toast_message, getString(R.string.button_material_app_text));
                    Toast.makeText(getApplicationContext(), toast_message, duration).show();
                    break;
                case R.id.go_ubiquitous:
                    toast_message = getString(R.string.toast_message, getString(R.string.button_ubiquitous_app_text));
                    Toast.makeText(getApplicationContext(), toast_message, duration).show();
                    break;
                case R.id.capstone:
                    toast_message = getString(R.string.toast_message, getString(R.string.button_capstone_app_text));
                    Toast.makeText(getApplicationContext(), toast_message, duration).show();
                    break;
            }
        }
    }
}

