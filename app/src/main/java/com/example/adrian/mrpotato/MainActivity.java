package com.example.adrian.mrpotato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements ToggleButton.OnCheckedChangeListener {

    ToggleButton sombrero;
    Switch gafas;
    ImageView potato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sombrero=(ToggleButton)findViewById(R.id.toggleButton);
        gafas=(Switch)findViewById(R.id.switch1);
        potato=(ImageView)findViewById(R.id.imageView);
        sombrero.setOnCheckedChangeListener(this);
        gafas.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(sombrero.isChecked()&gafas.isChecked()){
            sombrero.setText(R.string.activado);
            potato.setImageResource(R.drawable.potatogs);
        } else if(sombrero.isChecked()&!gafas.isChecked()){
            sombrero.setText(R.string.activado);
            potato.setImageResource(R.drawable.potatos);
        } else if(!sombrero.isChecked()&gafas.isChecked()){
            sombrero.setText(R.string.desactivado);
            potato.setImageResource(R.drawable.potatog);
        } else{
            sombrero.setText(R.string.desactivado);
            potato.setImageResource(R.drawable.potato);
        }
    }
}
