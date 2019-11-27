package com.example.examcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String LOG_TAG = "Error: ";
    public static TextView text1;
    public static TextView text2;
    public static TextView resultado;
    public static Button add;
    public static Button div;
    public static Button mul;
    public static Button sub;
    public static RadioButton Par;
    public static RadioButton Inpar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (EditText) findViewById(R.id.edit1);
        text1.setRawInputType(InputType.TYPE_CLASS_PHONE);
        text2 = (EditText) findViewById(R.id.edit2);
        text2.setRawInputType(InputType.TYPE_CLASS_PHONE);
        resultado = (TextView) findViewById(R.id.result);
        Par = (RadioButton) findViewById(R.id.par);
        Inpar = (RadioButton) findViewById(R.id.inpar);

        add = (Button) findViewById(R.id.btnAdd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(text1.getText().toString());
                double valor2 = Double.parseDouble(text2.getText().toString());
                double r = valor1+valor2;
                double par ;
                resultado.setText("Resultado "+r);
                par = r/2;
                if(par ==0){
                    Par.isChecked();
                }else{
                    Inpar.isChecked();
                }
            }
        });
        div = (Button) findViewById(R.id.btnDiv);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(text1.getText().toString());
                double valor2 = Double.parseDouble(text2.getText().toString());
                double r = valor1/valor2;
                double par ;
                resultado.setText("Resultado "+r);
                par = r/2;
                if(par ==0){
                    Par.isChecked();
                }else{
                    Inpar.isChecked();
                }
                Log.i(LOG_TAG, "Error:");
            }
        });
        mul = (Button) findViewById(R.id.btnMul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(text1.getText().toString());
                double valor2 = Double.parseDouble(text2.getText().toString());
                double r = valor1*valor2;
                double par ;
                resultado.setText("Resultado "+r);
                par = r/2;
                if(par ==0){
                    Par.isChecked();
                }else{
                    Inpar.isChecked();
                }
            }
        });
        sub = (Button) findViewById(R.id.btnSub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(text1.getText().toString());
                double valor2 = Double.parseDouble(text2.getText().toString());
                double r = valor1-valor2;
                double par ;
                resultado.setText("Resultado "+r);
                par = r/2;
                if(par ==0){
                    Par.isChecked();
                }else{
                    Inpar.isChecked();
                }
            }
        });
    }
}
