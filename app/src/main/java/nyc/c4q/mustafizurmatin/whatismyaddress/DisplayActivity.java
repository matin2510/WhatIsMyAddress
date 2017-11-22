package nyc.c4q.mustafizurmatin.whatismyaddress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView textView01;
    TextView textView02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        textView01= findViewById(R.id.text_view_01);
        textView02=findViewById(R.id.text_view_02);


    }
}
