package devfest.hack.day.materialdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by someone on 24.10.2014.
 */
public class AddActivity extends ActionBarActivity {
    public static final String IMAGE = "image_element_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(toolbar);
    }


}
