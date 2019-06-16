package recognizeyou.gcuenca.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // changes the color of the text to blue
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // Log.i("Grace", "Button clicked");
                ((TextView)findViewById(R.id.textView2)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        // changes the background color to orange
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                findViewById(R.id.activity_main).setBackgroundColor(
                        getResources().getColor(R.color.orange));
            }
        });

        // changes the displayed text to whatever the user inputs
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // grab the text the user inputted
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                // check if the inputted string is empty
                if(TextUtils.isEmpty(newText)){
                    ((TextView)findViewById(R.id.textView2)).setText("Hello from Grace!");
                }else{
                    // set user inputted text as the display text when change text is clicked
                    ((TextView)findViewById(R.id.textView2)).setText(newText);
                }
            }
        });

        // resets changes made by clicking the background
        findViewById(R.id.activity_main).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // reset the text color back to black
                ((TextView)findViewById(R.id.textView2)).setTextColor(
                        getResources().getColor(R.color.black));

                // reset the background color back to colorAccent
                findViewById(R.id.activity_main).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));

                // reset the text string back to "Hello from Grace"
                ((TextView)findViewById(R.id.textView2)).setText("Hello from Grace!");
            }
        });

    }

}
