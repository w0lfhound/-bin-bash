package com.example.android.emergency;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView txtview;

    public void find_location(View view) {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=nearest + hospitals");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

    public void accident_location(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0.0?q=vehicle + repairs");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

    public static String x;
        public void number(View view) {
                x="";
                EditText mEdit  = (EditText)findViewById(R.id.editable);
                x = mEdit.getText().toString().trim();
    }
    public void newIntent(View view) {
        Intent i = new Intent(this, numberInput.class);
        startActivity(i);
    }



//    public void sendSMS(View view) {
//        Log.i("Send SMS", "");
//        Intent smsIntent = new Intent(Intent.ACTION_VIEW);
//        smsIntent.setData(Uri.parse("smsto:"));
//        smsIntent.setType("vnd.android-dir/mms-sms");
//       // smsIntent.putExtra("address", new String(numberInput.str[0]));
//        smsIntent.putExtra("address"  , new String ("01234"));
//        smsIntent.putExtra("sms_body", "Test ");
//     //  if (smsIntent.resolveActivity(getPackageManager()) != null) {
//            startActivity(smsIntent);
//       // }
//@Override
//public boolean dispatchKeyEvent(KeyEvent event) {
//    if (event.getKeyCode() == KeyEvent.KEYCODE_POWER) {
//        Intent i = new Intent(this, firstActivityUnderFirstAid.class);
//        startActivity(i);
//        return true;
//    }

    //return super.dispatchKeyEvent(event);
//}
//    }
//public void sendSms(){
//    SmsManager sms = SmsManager.getDefault();
//    sms.sendTextMessage("123", null, "y", null, null);
//}
   // @Override
//    public boolean dispatchKeyEvent(KeyEvent event) {
//        if (event.getKeyCode() == KeyEvent.KEYCODE_POWER) {
//            Intent i = new Intent(this, firstActivityUnderFirstAid.class);
//            startActivity(i);
//            return true;
//        }
//
//        return super.dispatchKeyEvent(event);
//    }
    public void fireStation(View view){
        txtview = (TextView) findViewById(R.id.fire);

        txtview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:00"));

                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
    });
}
    public void callPolice(View view){
        txtview = (TextView) findViewById(R.id.police);

        txtview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:00"));

                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });
    }
    public void sms(View view) {
        x="";
        EditText mEdit  = (EditText)findViewById(R.id.editable);
        x = mEdit.getText().toString().trim();
        Button button = (Button)findViewById(R.id.sosbutton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
               // String phoneNumber = "tel:"+x;
                if(x.equals(""))
                    callIntent.setData(Uri.parse("tel: 9611207402"));
                else
                    callIntent.setData(Uri.parse("tel:"+x));
                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });
    }
    public void newIntent_firstAid(View view) {
        Intent i = new Intent(this, firstaid.class);
        startActivity(i);
    }
}
