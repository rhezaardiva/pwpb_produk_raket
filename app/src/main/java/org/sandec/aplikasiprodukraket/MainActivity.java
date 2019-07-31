package org.sandec.aplikasiprodukraket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnpenjualA = findViewById(R.id.profile);
        btnpenjualA.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.profile:
                Intent data = new Intent(MainActivity.this, DeskripsiPenjual.class);
                startActivity(data);
        }
    }
}
