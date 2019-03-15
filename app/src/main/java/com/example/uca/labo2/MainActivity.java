package com.example.uca.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;
    int imgg1, imgg2, imgg3,imgg4,imgg5,imgg6,imgg7,imgg8,imgg9;
    int array[] = {R.drawable.deku, R.drawable.fox, R.drawable.kirby, R.drawable.luna, R.drawable.marsh, R.drawable.para, R.drawable.samus, R.drawable.shoto, R.drawable.yume};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img1.setOnClickListener(this);
        imgg1 = 0;

        img2 = findViewById(R.id.img2);
        img2.setOnClickListener(this);
        imgg2 = 1;

        img3 = findViewById(R.id.img3);
        img3.setOnClickListener(this);
        imgg3 = 2;

        img4 = findViewById(R.id.img4);
        img4.setOnClickListener(this);
        imgg4 = 3;

        img5 = findViewById(R.id.img5);
        img5.setOnClickListener(this);
        imgg5 = 4;

        img6 = findViewById(R.id.img6);
        img6.setOnClickListener(this);
        imgg6 = 5;

        img7 = findViewById(R.id.img7);
        img7.setOnClickListener(this);
        imgg7 = 6;

        img8 = findViewById(R.id.img8);
        img8.setOnClickListener(this);
        imgg8 = 7;

        img9 = findViewById(R.id.img9);
        img9.setOnClickListener(this);
        imgg9 = 8;


    }
//casos para cada imagen
    @Override
    public void onClick(View v) {
     int viewId = v.getId();
     switch (viewId){
         case R.id.img1:
             imgg1 = contar(imgg1);
             img1.setImageResource(array[imgg1]);
          break;
         case R.id.img2:
             imgg2 = contar(imgg2);
             img2.setImageResource(array[imgg2]);
             break;
         case R.id.img3:
             imgg3 = contar(imgg3);
             img3.setImageResource(array[imgg3]);
             break;
         case R.id.img4:
             imgg4 = contar(imgg4);
             img4.setImageResource(array[imgg4]);
             break;
         case R.id.img5:
             imgg5 = contar(imgg5);
             img5.setImageResource(array[imgg5]);
             break;
         case R.id.img6:
             imgg6 = contar(imgg6);
             img6.setImageResource(array[imgg6]);
             break;
         case R.id.img7:
             imgg7 = contar(imgg7);
             img7.setImageResource(array[imgg7]);
             break;
         case R.id.img8:
             imgg8 = contar(imgg8);
             img8.setImageResource(array[imgg8]);
             break;
         case R.id.img9:
             imgg9 = contar(imgg9);
             img9.setImageResource(array[imgg9]);
             break;
     }
    }
    public  int contar(int i){
        if(i < 8){
            return i+1;
        }else{
            return 0;
        }

    }

}
