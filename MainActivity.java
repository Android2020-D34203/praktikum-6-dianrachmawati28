package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView helloWorls;
    Button buttonPindah;
    EditText editText;

    private String input;
    private String tulis="";
    private View helloWorld;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorld = findViewById(R.id.editNama);
        buttonPindah = findViewById(R.id.buttonPindah);
        editText = findViewById(R.id.editNama);
        buttonPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    BreakIterator editTeks = null;
                    input = editTeks.getText().toString();
                    if (input != null && input != "") {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                        intent.putExtra(tulis, input);
                        startActivity(intent);
                    } else {
                        Log.i("Error", "Aplikasi Error");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.i("Error", "Aplikasi Error");
                }
            }
        });
    }

    public void Ganti(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
