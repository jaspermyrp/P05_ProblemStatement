package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModule1, tvModule2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.textView1);
        tvModule2 = findViewById(R.id.textView2);

        intent = new Intent(MainActivity.this, ModuleDetailActivity.class);

        tvModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("ModuleCode","C346");
                startActivity(intent);
            }
        });

        tvModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("ModuleCode","C349");
                startActivity(intent);
            }
        });
    }
}
