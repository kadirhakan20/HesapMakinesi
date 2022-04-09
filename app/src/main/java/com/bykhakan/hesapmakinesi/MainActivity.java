package com.bykhakan.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Scanner sc = new Scanner(System.in);


        System.out.println("1.Sayı:");
        int sayi1 = sc.nextInt();

        System.out.println("2.Sayı:");
        int sayi2 = sc.nextInt();


        int sonuc = topla(sayi1, sayi2);

        System.out.println(sonuc);



    }

    public int topla(int s1, int s2){
        return (s1 + s2);
    }

}