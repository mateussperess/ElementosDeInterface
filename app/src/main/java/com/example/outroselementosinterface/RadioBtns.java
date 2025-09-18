package com.example.outroselementosinterface;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadioBtns extends AppCompatActivity {
    public TextView txtRadio;
    public Button btnRadio;
    public RadioGroup rdGroup;
    public Button btnCheckBox;
    public Button btnImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_radio_btns);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtRadio = findViewById(R.id.txtRadio);
        btnRadio = findViewById(R.id.btnRadio);
        rdGroup = findViewById(R.id.radioGroup);

        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TESTE", String.valueOf(rdGroup.getCheckedRadioButtonId()));
                if (rdGroup.getCheckedRadioButtonId() == R.id.rdBtn1) {
                    txtRadio.setText("Radio 1");
                }
                if (rdGroup.getCheckedRadioButtonId() == R.id.rdBtn2) {
                    txtRadio.setText("Radio 2");
                }
                if (rdGroup.getCheckedRadioButtonId() == R.id.rdBtn3) {
                    txtRadio.setText("Radio 3");
                }
                if (rdGroup.getCheckedRadioButtonId() == R.id.rdBtn4) {
                    txtRadio.setText("Radio 4");
                }
            }
        });

        btnCheckBox = findViewById(R.id.btnCheckBox);
        btnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itChkBox = new Intent(RadioBtns.this, MainActivity.class);
                startActivity(itChkBox);
            }
        });

        btnImageView = findViewById(R.id.btnImageView);
        btnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itImgView = new Intent(RadioBtns.this, ImgViewTeste.class);
                startActivity(itImgView);
            }
        });
    }
}