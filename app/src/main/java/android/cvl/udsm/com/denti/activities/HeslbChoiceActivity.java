package android.cvl.udsm.com.denti.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.cvl.udsm.com.denti.fragments.HeslbApplicantFragment;
import android.cvl.udsm.com.denti.fragments.HeslbChoiceFragment;
import android.cvl.udsm.com.denti.fragments.HeslbPayerFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.cvl.udsm.com.denti.R;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;

public class HeslbChoiceActivity extends SingleFragmentActivity implements ActionBar.OnNavigationListener {

    private boolean initialRun = true;

    @Override
    protected Fragment createFragment() {
        return new HeslbChoiceFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        SpinnerAdapter mSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.heslb_choice, android.R.layout.simple_spinner_dropdown_item);

        actionBar.setListNavigationCallbacks(mSpinnerAdapter, this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.heslb_choice, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(int position, long id) {
        if (initialRun) {
            initialRun = false;
        } else {
            Intent intent = new Intent(this, HeslbActivity.class);
            switch (position) {
                case 0:
                    intent.putExtra(HeslbActivity.FRAGMENT_TYPE, HeslbActivity.FRAGMENT_APPLICANT);
                    break;
                case 1:
                    intent.putExtra(HeslbActivity.FRAGMENT_TYPE, HeslbActivity.FRAGMENT_PAYER);
                    break;
            }
            startActivity(intent);
        }
        return true;
    }
}
