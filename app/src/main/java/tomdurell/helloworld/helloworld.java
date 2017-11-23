package tomdurell.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// added for helloworld
import android.view.View;
import android.widget.*;

import android.content.Intent;

public class helloworld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //interface layout file
        setContentView(R.layout.activity_helloworld);
    }
    /** Called when the user touches the button */
    /* Called when user touches the CLICK ME! button */
    public void textChangeButton(View view)
    {

        // create an intent to start the activity called TestActivity
        Intent intent = new Intent(this, Map_activity.class);

        // find the textView control to change first
        TextView tv1 = (TextView)findViewById(R.id.changeText);

        // set visibility to visible
        tv1.setVisibility(View.VISIBLE);

        // edit textView control value
        tv1.setText("Hello TestActivity!");

        // get the new string value of the textView control
        String message = tv1.getText().toString();

        // pass string value of textView to new TestActivity
        intent.putExtra("testParameter", message);

        // start TestActivity!
        startActivity(intent);
    }
    public void addPermissions(View view)
    {

        // create an intent to start the activity called userPermissions
        Intent intent = new Intent(this, userPermissions.class);
        // run Permissions activity
        startActivity(intent);
    }
}
