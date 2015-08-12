package com.luisdiaz.printbotandroid;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button btnConnect;
    private Button btnDisconnect;
    private Button btnLight;
    private Button btnObstacles;
    private Button btnLines;
    private Button btnUp;
    private Button btnDown;
    private Button btnLeft;
    private Button btnCenter;
    private Button btnRight;
    private Button btnSend;
    private EditText userInput;
    private TextView consoleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConnect =(Button) findViewById(R.id.BtnConnect);
        btnDisconnect=(Button) findViewById(R.id.BtnDisconnect);

        btnLight = (Button) findViewById(R.id.BtnLight);
        btnObstacles = (Button) findViewById(R.id.BtnObstacles);
        btnLines = (Button) findViewById(R.id.BtnLines);

        btnUp=(Button) findViewById(R.id.BtnUp);
        btnLeft = (Button) findViewById(R.id.BtnLeft);
        btnCenter = (Button) findViewById(R.id.BtnCenter);
        btnRight = (Button) findViewById(R.id.BtnRight);
        btnDown =(Button) findViewById(R.id.BtnDown);


        btnSend = (Button) findViewById(R.id.BtnSend);

        userInput = (EditText) findViewById(R.id.UserInput);
        consoleText = (TextView)findViewById(R.id.ConsoleText);

        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked on Connect");
            }
        });

        btnDisconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked on Disconnect");
            }
        });

        btnLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked on Light");
            }
        });

        btnObstacles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked on Obstacles");
            }
        });

        btnLines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked on Lines");
            }
        });

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked on Up");
            }
        });

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked on Left");
            }
        });

        btnCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked on Center");
            }
        });

        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked on Right");
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clicked on Down");
            }
        });


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consoleText.setText(userInput.getText().toString() + "\n>_");
                showToast("Clicked on Send");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showToast(String txt){
        Context context = getApplicationContext();
        //CharSequence text = txt;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, txt, duration);
        toast.show();
    }
}
