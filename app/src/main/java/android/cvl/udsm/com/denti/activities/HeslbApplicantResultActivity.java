package android.cvl.udsm.com.denti.activities;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.cvl.udsm.com.denti.fragments.HeslbResultFragment;
import android.cvl.udsm.com.denti.fragments.HeslbResultFragment2;
import android.view.Menu;
import android.view.MenuItem;
import android.cvl.udsm.com.denti.R;

public class HeslbApplicantResultActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new HeslbResultFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.heslb_applicant_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                // Show settings screen
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
