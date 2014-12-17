package bu.cs683.homework3;

import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText nameText = (EditText) findViewById(R.id.newNameText);
		final TextView oldNameText = (TextView) findViewById(R.id.oldNameText);
		
		SharedPreferences prefs = getSharedPreferences("myName", MODE_PRIVATE); 
		oldNameText.setText(prefs.getString("name", "No Name Found"));
		
		
		Button button = (Button) findViewById(R.id.okButton);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				SharedPreferences.Editor editor = getSharedPreferences("myName", MODE_PRIVATE).edit();
				 editor.putString("name", nameText.getText().toString());
				 editor.commit();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
