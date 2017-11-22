package nyc.c4q.mustafizurmatin.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String SHARED_PREF_FILE ="address_shared_preferences";
    EditText editText;
    Button Save;
    Button switchToRecyclerView;
    SharedPreferences sharedPreferences;
    String emailAddress = "emailKey";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_email_address);
        Save= findViewById(R.id.button_01);
        switchToRecyclerView = findViewById(R.id.button_02);

        sharedPreferences = getSharedPreferences(SHARED_PREF_FILE,MODE_PRIVATE);
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailData = editText.getText().toString();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(emailAddress,emailData);
                editor.commit();

                editText.setText("");

                
            }
        });
        switchToRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RecyclerActivity.class);
                 i.putExtra("sharedpref",editText.getText().toString());
                startActivity(i);
            }
        });
        

    }
}
