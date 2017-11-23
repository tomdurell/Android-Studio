package tomdurell.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.*;
import android.content.Intent;

// add below imports for location purposes
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import java.util.Locale;
import android.net.Uri;

public class Map_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //create the TestActivity activity
        super.onCreate(savedInstanceState);

        // create a new TextView widget programmatically
        TextView tv1 = new TextView(this);
        tv1.setTextSize(40);
        setContentView(tv1);

        // get location code
        // you should probably handle checking if permissions are granted!

        // acquire a reference to the system Location Manager
        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        // Use GPS provider to get last known location
        String locationProvider = LocationManager.GPS_PROVIDER;
        Location lastKnownLocation = locationManager.getLastKnownLocation(locationProvider);

        // create a few new variable to get and store the lat/long coordinates of last known location
        double lat;
        double longi;

// check if a last known location exists
        if (lastKnownLocation == null)
        {
            // if no last location is available set lat/long to zero
            lat = 0;  // lat of Lincoln is 53.228029;
            longi = 0; // longi of Lincoln is -0.546055;
        }
        else
        {
            // if last location exists then get/set the lat/long
            lat = lastKnownLocation.getLatitude();
            longi = lastKnownLocation.getLongitude();
        }

        // bind the lat long coordinates to the programmatically created TextView for displaying
        tv1.setText("Location:\n" + lat +"\n" + longi);

        // Intent for Google Maps, if another map app handles the geo tag it may show more than one app option
        String coordinates = String.format(Locale.ENGLISH, "geo:%f,%f", lat, longi);
        Intent intent_map = new Intent(Intent.ACTION_VIEW, Uri.parse(coordinates));
        startActivity(intent_map);

    }
}
