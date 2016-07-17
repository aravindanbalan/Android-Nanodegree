package com.android.nanodegreeproject0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class AppPortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);
    }

    public void showToastMessage(View view) {
        switch (view.getId()) {
            case R.id.popular_movies:
                renderToast(getString(R.string.button_popular_movies_text));
                break;
            case R.id.stock_hawk:
                renderToast(getString(R.string.button_stock_hawk_text));
                break;
            case R.id.build_bigger:
                renderToast(getString(R.string.button_bigger_text));
                break;
            case R.id.material_app:
                renderToast(getString(R.string.button_material_app_text));
                break;
            case R.id.go_ubiquitous:
                renderToast(getString(R.string.button_ubiquitous_app_text));
                break;
            case R.id.capstone:
                renderToast(getString(R.string.button_capstone_app_text));
                break;
        }
    }

    private void renderToast(String message) {
        String toast_message = "";
        int duration = Toast.LENGTH_SHORT;
        toast_message = getString(R.string.toast_message, message);
        Toast.makeText(getApplicationContext(), toast_message, duration).show();
    }
}

