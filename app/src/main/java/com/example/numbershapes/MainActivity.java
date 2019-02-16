package com.example.numbershapes;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Number;
    Button submitButton;
    Button aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void showWebPage(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com"));
            startActivity(intent);
        }


    class boom {
    int number;
    public boolean isSquare() {
        double squareRoot = Math.sqrt(number);
        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isTriangular() {
        int x = 1;
        int triangularNumber = 1;
        while (triangularNumber < number) {
            x++;
            triangularNumber = triangularNumber + x;
        }
        if (triangularNumber == number) {
            return true;
        } else {
            return false;
        }
    }}}}