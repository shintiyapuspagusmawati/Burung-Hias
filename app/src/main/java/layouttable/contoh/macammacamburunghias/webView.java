package layouttable.contoh.macammacamburunghias;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class webView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView myWebView = (WebView) findViewById(R.id.web);
        myWebView.loadUrl("http://www.smkassalaambandung.sch.id");
    }

}
