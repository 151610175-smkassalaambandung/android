package assalaam.calculator.id.projectassalaam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.DialogInterface;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    ImageButton assalaam,info;
    Button komponen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        komponen = (Button) findViewById(R.id.komponen);
        komponen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),Komponen.class);
                startActivityForResult(myIntent,0);
            }
        });

        info = (ImageButton) findViewById(R.id.logoinfo);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),info.class);
                startActivityForResult(myIntent,0);
            }
        });

        assalaam = (ImageButton) findViewById(R.id.logoass);
        assalaam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(),WebSmk.class);
                startActivityForResult(myIntent,0);
            }
        });
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apa Anda Yakin Ingin keluar ?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }
}
