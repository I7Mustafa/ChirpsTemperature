package com.example.mosta.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button calculate_temperature;
    private TextView result ;
    private EditText numberOf ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate_temperature = findViewById(R.id.btnct);
        result = findViewById(R.id.tvRsult);
        numberOf = findViewById(R.id.numberOF);

        calculate_temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number = Integer.parseInt(numberOf.getText().toString());

                int chirps = ((number / 3 + 4));

                result.setText("The Approximate Temperature Ouside Is " +  chirps + " Degrees Celcius.");

            }
        });
    }
}
