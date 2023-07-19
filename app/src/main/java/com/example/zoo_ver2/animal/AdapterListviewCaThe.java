package com.example.zoo_ver2.animal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.zoo_ver2.R;

import java.util.ArrayList;

public class AdapterListviewCaThe extends BaseAdapter {
    private Context context;
    private ArrayList<Lion> lion;
    private ArrayList<Elephant> elephant;
    private ArrayList<Tiger> tiger;
    private ArrayList<Wolf> wolf;
    private ArrayList<Snake> snake;
    private String loaiHienThi;
    private int layout;
    private ArrayList<String> dsCaTheCanHienThi ;

    public AdapterListviewCaThe(Context context, ArrayList<Lion> lion, ArrayList<Elephant> elephant, ArrayList<Tiger> tiger, ArrayList<Wolf> wolf, ArrayList<Snake> snake, String loaiHienThi, int layout) {
        this.context = context;
        this.lion = lion;
        this.elephant = elephant;
        this.tiger = tiger;
        this.wolf = wolf;
        this.snake = snake;
        this.loaiHienThi = loaiHienThi;
        this.layout = layout;
        dsCaTheCanHienThi = new ArrayList<>();
    }

    @Override
    public int getCount() {
        if (loaiHienThi.equals("lion")) {
            return lion.size();
        } else if (loaiHienThi.equals("elephant")) {
            return elephant.size();
        } else if (loaiHienThi.equals("tiger")) {
            return tiger.size();
        } else if (loaiHienThi.equals("wolf")) {
            return wolf.size();
        } else if (loaiHienThi.equals("snake")) {
            return snake.size();
        }
        return 0; // Nếu không phải loại nào trong số trên, trả về 0.
    }

    @Override
    public Object getItem(int i) {
        if (loaiHienThi.equals("lion")) {
            return lion.get(i);
        } else if (loaiHienThi.equals("elephant")) {
            return elephant.get(i);
        } else if (loaiHienThi.equals("tiger")) {
            return tiger.get(i);
        } else if (loaiHienThi.equals("wolf")) {
            return wolf.get(i);
        } else if (loaiHienThi.equals("snake")) {
            return snake.get(i);
        }
        return null; // Nếu không phải loại nào trong số trên, trả về null.
    }

    @Override
    public long getItemId(int i) {
        return 0; // Nếu không phải loại nào trong số trên, trả về 0.
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.ca_the, viewGroup,false);
        TextView tenCaThe = view.findViewById(R.id.ten_ca_the);

        if (loaiHienThi.equals("lion")){
            for(int j=0;j<lion.size();j++)
            {
                dsCaTheCanHienThi.add(lion.get(j).getName());
            }
            tenCaThe.setText(dsCaTheCanHienThi.get(i).toString());

        } 
        else if (loaiHienThi.equals("tiger")) {
            for(int j=0;j<tiger.size();j++)
            {
                dsCaTheCanHienThi.add(tiger.get(j).getName());
            }
            tenCaThe.setText(dsCaTheCanHienThi.get(i).toString());
        }
        else if (loaiHienThi.equals("snake")) {
            for(int j=0;j<snake.size();j++)
            {
                dsCaTheCanHienThi.add(snake.get(j).getName());
            }
            tenCaThe.setText(dsCaTheCanHienThi.get(i).toString());
        }
        else if (loaiHienThi.equals("elephant")) {
            for(int j=0;j<elephant.size();j++)
            {
                dsCaTheCanHienThi.add(elephant.get(j).getName());
            }
            tenCaThe.setText(dsCaTheCanHienThi.get(i).toString());
        }
        else if (loaiHienThi.equals("wolf")) {
            for(int j=0;j<wolf.size();j++)
            {
                dsCaTheCanHienThi.add(wolf.get(j).getName());
            }
            tenCaThe.setText(dsCaTheCanHienThi.get(i).toString());
        }
        return view;
    }
}
