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
    }

}
