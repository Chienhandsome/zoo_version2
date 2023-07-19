package com.example.zoo_ver2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class HienThiThongTinCaThe extends AppCompatActivity {

    String ttCaThe="";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thong_tin_ca_the);

        textView = findViewById(R.id.tt_ca_the);
        ttCaThe = ThongTinChiTiet.ttCaThe;
        textView.setText(ttCaThe.toString());

    }
}
