package devfest.hack.day.materialdemo;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import devfest.hack.day.materialdemo.fragments.AddFragment;
import devfest.hack.day.materialdemo.fragments.RecycleViewFragment;

import static devfest.hack.day.materialdemo.AddActivity.IMAGE;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private ImageButton fab;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        ProgressBar progressBar = (ProgressBar) toolbar.findViewById(R.id.toolbar_progress_bar);
        progressBar.setVisibility(View.INVISIBLE);

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_launcher);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportFragmentManager().beginTransaction().replace(R.id.content, new RecycleViewFragment()).commit();

        fab = (ImageButton)findViewById(R.id.fab);
        fab.setClipToOutline(true);
        fab.setOnClickListener(this);
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
            getSupportFragmentManager().beginTransaction().replace(R.id.content, new AddFragment()).addToBackStack("add").commit();
            //startActivity(new Intent(this, AddActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view.equals(fab)) {

//            Intent intent = new Intent();
//            String transitionName = getString(R.string.transition_main_actibity);
//            ActivityOptionsCompat options =
//                    ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,
//                            findViewById(R.id.imageView),   // The view which starts the transition
//                            transitionName    // The transitionName of the view we’re transitioning to
//                    );
//            ActivityCompat.startActivity(MainActivity.this, intent, options.toBundle());
//

            getSupportFragmentManager().beginTransaction().replace(R.id.content, new AddFragment()).addToBackStack("add").commit();
        }
    }
}
