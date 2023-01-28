package satinder.kaur.n01421666;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    Button submit;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit=findViewById(R.id.submit);
        name=findViewById(R.id.name);

        String myname=(String) name.getText();
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Satinder Kaur", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), StringActivity.class);
                intent.putExtra("key", "Satinder Kaur");
                startActivity(intent);
            }


        });

    }
}