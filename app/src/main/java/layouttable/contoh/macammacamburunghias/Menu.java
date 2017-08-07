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

        Button js = (Button) findViewById(R.id.jalaksuren);
        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Jalaksuren.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ch = (Button) findViewById(R.id.cucakhijau);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Cucakhijau.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button pc = (Button) findViewById(R.id.pancawarna);
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Pancawarna.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button tl = (Button) findViewById(R.id.tledekan);
        tl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Tledekan.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button an = (Button) findViewById(R.id.aniskembang);
        an.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Aniskembang.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button am = (Button) findViewById(R.id.anismerah);
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Anismerah.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button mb = (Button) findViewById(R.id.muraibatu);
        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Muraibatu.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button pt = (Button) findViewById(R.id.pentet);
        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Pentet.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button gl = (Button) findViewById(R.id.gelatik);
        gl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Gelatik.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button kl = (Button) findViewById(R.id.kolibri);
        kl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Kolibri.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button cp = (Button) findViewById(R.id.cipoh);
        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Cipoh.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button lb = (Button) findViewById(R.id.lovebird);
        lb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Lovebird.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button tc = (Button) findViewById(R.id.trucukan);
        tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Trucukan.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button cj = (Button) findViewById(R.id.cucakjenggot);
        cj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Cucakjenggot.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button pl = (Button) findViewById(R.id.platuk);
        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Platuk.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }

}
