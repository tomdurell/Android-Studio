package tomdurell.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// added for helloworld
import android.view.View;
import android.widget.*;

public class helloworld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //interface layout file
        setContentView(R.layout.activity_helloworld);
    }
    /** Called when the user touches the button */
    public void textChangeButton(View view)
    {
        // find the textview control to change
        TextView TextView1 = (TextView)findViewById(R.id.changeText);
        // set visibility to visible
        TextView1.setVisibility(View.VISIBLE);

    }
}
