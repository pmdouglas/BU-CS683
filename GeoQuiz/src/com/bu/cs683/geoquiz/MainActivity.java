package com.bu.cs683.geoquiz;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button mTrueButton = (Button)this.findViewById(R.id.true_button);
        Button mFalseButton = (Button)this.findViewById(R.id.false_button);
        
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Toast toast = Toast.makeText(getBaseContext(), "Correct!", 10);
            	toast.show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
