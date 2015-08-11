package com.luisdiaz.printbotandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


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

        btnSend = (Button) findViewById(R.id.BtnSend);

        userInput = (EditText) findViewById(R.id.UserInput);
        consoleText = (TextView)findViewById(R.id.ConsoleText);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consoleText.setText(userInput.getText().toString() + "\n>_");
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
        
    }
}
