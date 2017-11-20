package tomdurell.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class helloworld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //interface layout file
        setContentView(R.layout.activity_helloworld);
    }
}
