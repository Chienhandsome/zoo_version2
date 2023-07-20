package com.example.zoo_ver2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HienThiThongTinCaThe extends AppCompatActivity {

    String ttCaThe = "";
    String anhCaThe = "";
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thong_tin_ca_the);

        textView = findViewById(R.id.tt_ca_the);
        imageView = findViewById(R.id.anh_ca_the);

        ttCaThe = ThongTinChiTiet.ttCaThe;
        anhCaThe = ThongTinChiTiet.anhCaThe;
        textView.setText(ttCaThe.toString());
        if (anhCaThe.equals("lion")){
            imageView.setImageResource(R.drawable.lion);
        }
        else if (anhCaThe.equals("tiger")){
            imageView.setImageResource(R.drawable.tiger);
        }
        else if (anhCaThe.equals("wolf")){
            imageView.setImageResource(R.drawable.wolf);
        }
        else if (anhCaThe.equals("snake")){
            imageView.setImageResource(R.drawable.snake);
        }
        else if (anhCaThe.equals("elephant")){
            imageView.setImageResource(R.drawable.elephant);
        }

    }
}
