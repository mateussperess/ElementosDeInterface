package com.example.outroselementosinterface;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImgViewTeste extends AppCompatActivity {
    public ImageView imgAvatar;
    public Button btnChange;

    public boolean isStormTrooper = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_image_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imgAvatar = findViewById(R.id.imgAvatar);
        btnChange = findViewById(R.id.btnChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isStormTrooper) {
                    imgAvatar.setImageResource(R.drawable.stormtrooper);
                    btnChange.setText("Trocar para o desenho");
                } else {
                    imgAvatar.setImageResource(R.drawable.stormt);
                    btnChange.setText("Trocar para foto real");
                }

                isStormTrooper = !isStormTrooper;
            }
        });
    }
}