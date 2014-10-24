package devfest.hack.day.materialdemo;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

import devfest.hack.day.materialdemo.fragments.RecycleViewFragment;


public class MainActivity extends ActionBarActivity {
    private ImageButton fab;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(toolbar);

        getSupportFragmentManager().beginTransaction().replace(R.id.content, new RecycleViewFragment()).commit();

//        int size = getResources().getDimensionPixelSize(R.dimen.item_height);
//        Outline outline = new Outline();
//        outline.setOval(0, 0, size, size);
        fab = (ImageButton)findViewById(R.id.fab);
//        fab.setOutline(outline);
//        fab.setOutline(mOutlineCircle);
        fab.setClipToOutline(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_favorite) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
