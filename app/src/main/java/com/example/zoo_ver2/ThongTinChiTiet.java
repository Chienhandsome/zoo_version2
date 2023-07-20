package com.example.zoo_ver2;

import static com.example.zoo_ver2.R.id.ttLoai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import java.util.ArrayList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zoo_ver2.animal.AdapterListviewCaThe;
import com.example.zoo_ver2.animal.Elephant;
import com.example.zoo_ver2.animal.Lion;
import com.example.zoo_ver2.animal.Snake;
import com.example.zoo_ver2.animal.Tiger;
import com.example.zoo_ver2.animal.Wolf;

public class ThongTinChiTiet extends AppCompatActivity {
    ImageView banDo;
    ImageView dongVat;
    ImageView them;
    ImageView xuat;
    ImageView trangChu;
    String tt = "";
    TextView ttLoai;
    ListView dsCaThe;
    public static String ttCaThe = "";
    public static String anhCaThe = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thong_tin_loai);

        them = findViewById(R.id.them);
        xuat = findViewById(R.id.xuat);
        dongVat = findViewById(R.id.dongVat);
        banDo = findViewById(R.id.banDo);
        trangChu = findViewById(R.id.trangChu);
        ttLoai = findViewById(R.id.ttLoai);
        dsCaThe = findViewById(R.id.dsCaThe);

        ArrayList <Lion> lionclone = DongVat.lion;
        ArrayList <Tiger> tigerclone = DongVat.tiger;
        ArrayList <Wolf> wolfclone = DongVat.wolf;
        ArrayList <Snake> snakeclone = DongVat.snake;
        ArrayList <Elephant> elephantclone = DongVat.elephant;

        trangChu.setOnClickListener(view -> {
            Intent intent = new Intent(this, TrangChu.class);
            startActivity(intent);
        });

        dongVat.setOnClickListener(view -> {
            Intent intent = new Intent(this, DongVat.class);
            startActivity(intent);
        });

        banDo.setOnClickListener(view -> {
            Intent intent = new Intent(this, BanDo.class);
            startActivity(intent);
        });

        them.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThemDongVat.class);
            startActivity(intent);
        });

        xuat.setOnClickListener(view -> {
            Intent intent = new Intent(this, XoaDongVat.class);
            startActivity(intent);
        });



        ttLoai.setText(DongVat.info);
        String loaiCanHienThi = DongVat.loaiCanHienThi;
        AdapterListviewCaThe adapterListviewCaThe = new AdapterListviewCaThe(this, lionclone, elephantclone, tigerclone, wolfclone, snakeclone,loaiCanHienThi,R.layout.ca_the );
        dsCaThe.setAdapter(adapterListviewCaThe);

        dsCaThe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                if (loaiCanHienThi.equals("lion")) {
                    anhCaThe = "lion";
                    ttCaThe = "Tên: " + lionclone.get(pos).getName().toString() + "\nTuổi: " + lionclone.get(pos).getAge() +
                            "\nID: " + lionclone.get(pos).getId() + "\nKhối lượng thức ăn: " + lionclone.get(pos).getMassOfFood() +
                            "\nTình trạng sức khỏe: " + lionclone.get(pos).getHealth() + "\nLoại thức ăn: " + lionclone.get(pos).getTypeOfFood() +
                            "\nNgày nhập: " + lionclone.get(pos).getDayImport();
                }
                else if (loaiCanHienThi.equals("tiger")) {
                    anhCaThe = "tiger";
                    ttCaThe = "Tên: " + tigerclone.get(pos).getName().toString() + "\nTuổi: " + tigerclone.get(pos).getAge() +
                            "\nID: " + tigerclone.get(pos).getId() + "\nKhối lượng thức ăn: " + tigerclone.get(pos).getMassOfFood() +
                            "\nTình trạng sức khỏe: " + tigerclone.get(pos).getHealth() + "\nLoại thức ăn: " + tigerclone.get(pos).getTypeOfFood() +
                            "\nNgày nhập: " + tigerclone.get(pos).getDayImport();
                }
                else if (loaiCanHienThi.equals("elephant")) {
                    anhCaThe = "elephant";
                    ttCaThe = "Tên: " + elephantclone.get(pos).getName().toString() + "\nTuổi: " + elephantclone.get(pos).getAge() +
                            "\nID: " + elephantclone.get(pos).getId() + "\nKhối lượng thức ăn: " + elephantclone.get(pos).getMassOfFood() +
                            "\nTình trạng sức khỏe: " + elephantclone.get(pos).getHealth() + "\nLoại thức ăn: " + elephantclone.get(pos).getTypeOfFood() +
                            "\nNgày nhập: " + elephantclone.get(pos).getDayImport();
                }
                else if (loaiCanHienThi.equals("wolf")) {
                    anhCaThe = "wolf";
                    ttCaThe = "Tên: " + wolfclone.get(pos).getName().toString() + "\nTuổi: " + wolfclone.get(pos).getAge() +
                            "\nID: " + wolfclone.get(pos).getId() + "\nKhối lượng thức ăn: " + wolfclone.get(pos).getMassOfFood() +
                            "\nTình trạng sức khỏe: " + wolfclone.get(pos).getHealth() + "\nLoại thức ăn: " + wolfclone.get(pos).getTypeOfFood() +
                            "\nNgày nhập: " + wolfclone.get(pos).getDayImport();
                }
                else if (loaiCanHienThi.equals("snake")) {
                    anhCaThe = "snake";
                    ttCaThe = "Tên: " + snakeclone.get(pos).getName().toString() + "\nTuổi: " + snakeclone.get(pos).getAge() +
                            "\nID: " + snakeclone.get(pos).getId() + "\nKhối lượng thức ăn: " + snakeclone.get(pos).getMassOfFood() +
                            "\nTình trạng sức khỏe: " + snakeclone.get(pos).getHealth() + "\nLoại thức ăn: " + snakeclone.get(pos).getTypeOfFood() +
                            "\nNgày nhập: " + snakeclone.get(pos).getDayImport();
                }

                Intent intent = new Intent(ThongTinChiTiet.this, HienThiThongTinCaThe.class);
                startActivity(intent);
            }
        });
    }

}

