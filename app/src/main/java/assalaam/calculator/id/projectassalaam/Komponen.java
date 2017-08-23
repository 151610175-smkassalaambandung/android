package assalaam.calculator.id.projectassalaam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Komponen extends AppCompatActivity {

    ImageButton img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen);

        img1 = (ImageButton) findViewById(R.id.img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),BlokSilinder.class);
                startActivityForResult(myIntent,0);
            }
        });

        img2 = (ImageButton) findViewById(R.id.img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),Piston.class);
                startActivityForResult(myIntent,0);
            }
        });

        img3 = (ImageButton) findViewById(R.id.img3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),RingPiston.class);
                startActivityForResult(myIntent,0);
            }
        });

        img4 = (ImageButton) findViewById(R.id.img4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),ConnectingRod.class);
                startActivityForResult(myIntent,0);
            }
        });

        img5 = (ImageButton) findViewById(R.id.img5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),Crankshaft.class);
                startActivityForResult(myIntent,0);
            }
        });

        img6 = (ImageButton) findViewById(R.id.img6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),Bearing.class);
                startActivityForResult(myIntent,0);
            }
        });

        img7 = (ImageButton) findViewById(R.id.img7);
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),Flywheel.class);
                startActivityForResult(myIntent,0);
            }
        });

        img8 = (ImageButton) findViewById(R.id.img8);
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),RockerArm.class);
                startActivityForResult(myIntent,0);
            }
        });

        img9 = (ImageButton) findViewById(R.id.img9);
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),Camshadt.class);
                startActivityForResult(myIntent,0);
            }
        });

        img10 = (ImageButton) findViewById(R.id.img10);
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),OilPan.class);
                startActivityForResult(myIntent,0);
            }
        });

        img11 = (ImageButton) findViewById(R.id.img11);
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),PistonPin.class);
                startActivityForResult(myIntent,0);
            }
        });

        img12 = (ImageButton) findViewById(R.id.img12);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),TimingBelt.class);
                startActivityForResult(myIntent,0);
            }
        });

        img13 = (ImageButton) findViewById(R.id.img13);
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),CylinderHead.class);
                startActivityForResult(myIntent,0);
            }
        });


    }
}
