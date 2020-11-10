package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        View hasil = findViewById(R.id.viewYa);
        Bundle isiText = getIntent().getExtras();
        String tulis = null;
        String input = isiText.getString(tulis);
        hasil.setTextDirection(Integer.parseInt(input));
    }
}
