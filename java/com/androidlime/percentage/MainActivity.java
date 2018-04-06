package com.androidlime.percentage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView totalText;
    TextView resultText;
    EditText persentageEditText;
    EditText numberEditText;
    Button calculateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalText= (TextView) findViewById(R.id.totat_text_ID);
        persentageEditText= (EditText) findViewById(R.id.persentage_ID);
        numberEditText=(EditText)findViewById(R.id.numberID);
        calculateButton= (Button) findViewById(R.id.calculate_ID);
        resultText=(TextView) findViewById(R.id.final_totalText_ID);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float persentage=Float.parseFloat(persentageEditText.getText().toString());
                float dec =persentage/100;
                float number=Float.parseFloat(numberEditText.getText().toString());
                float total=dec*number;
                float inTotal=(number- total);
                resultText.setText("Result : "+Float.toString(inTotal));

                totalText .setText(Float.toString(total));
            }
        });
    }
}
