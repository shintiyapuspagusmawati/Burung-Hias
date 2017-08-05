package layouttable.contoh.macammacamburunghias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button plh = (Button) findViewById(R.id.lihat);
        plh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View lihat) {
                Intent myIntent = new
                        Intent(lihat.getContext(), Menu.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button wb = (Button) findViewById(R.id.web);
        wb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View lihat) {
                Intent myIntent = new
                        Intent(lihat.getContext(), webView.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button in = (Button) findViewById(R.id.info);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View lihat) {
                Intent myIntent = new
                        Intent(lihat.getContext(), Info.class);
                startActivityForResult(myIntent, 0);

            }
        });

    }
}
