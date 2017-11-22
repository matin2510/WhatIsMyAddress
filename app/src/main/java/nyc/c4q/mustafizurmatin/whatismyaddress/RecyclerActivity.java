package nyc.c4q.mustafizurmatin.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Map;

public class RecyclerActivity extends AppCompatActivity {
    String[] arrayToStoreStrings;
    SharedPreferences sharedPreferences;
    String dataRecieved;
    ArrayList<String> listOfEntries;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        Intent i = getIntent();
        //i.getStringExtra("sharedpref");
        //dataRecieved= i.getStringExtra("sharedpref",);



        Intent intent = new Intent(RecyclerActivity.this, DisplayActivity.class);



        Map<String,?> keys = sharedPreferences.getAll();

        for(Map.Entry<String,?> entry : keys.entrySet()){
            Log.d("map values",entry.getKey() + ": " +
                    entry.getValue().toString());
            listOfEntries.add(entry.getValue().toString());
        }



    }
}
