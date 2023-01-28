package satinder.kaur.n01421666;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StringActivity extends AppCompatActivity {
     TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
        name=findViewById(R.id.myname);
        String myname=getIntent().getStringExtra("key");
        name.setText(myname);
    }
}