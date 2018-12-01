package com.example.android.emergency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class numberInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_input);
    }
     String content;
   public static String[] str =new String[25];
    public void number(View view){
        EditText edit = (EditText)findViewById(R.id.numberInput);
        content = edit.getText().toString(); //gets you the contents of edit text
        content.trim();

        String s="";
        int j;
        int k=0;
        for(int i=0;i<content.length();i++){
            for( j=i;j<content.length();j++){
                if(content.charAt(i)!=' '){
                    s = s +content.charAt(j);
                }

            }
            i=j;
            str[k]=s;
            k++;
        }
        //public void op(View view){
          //  EditText test = (EditText)findViewById(R.id.numberInput);
            //content = edit.getText().toString();


    }

}
