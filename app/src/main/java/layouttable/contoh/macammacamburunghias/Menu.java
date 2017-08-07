package layouttable.contoh.macammacamburunghias;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button kcr = (Button) findViewById(R.id.kacer);
        kcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Kacer.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button knr = (Button) findViewById(R.id.kenari);
        knr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Kenari.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button kc = (Button) findViewById(R.id.kacamata);
        kc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Kacamata.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button br = (Button) findViewById(R.id.branjangan);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Branjangan.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button cr = (Button) findViewById(R.id.cucakrowo);
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Cucakrowo.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button cb = (Button) findViewById(R.id.ciblek);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Ciblek.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }

}
