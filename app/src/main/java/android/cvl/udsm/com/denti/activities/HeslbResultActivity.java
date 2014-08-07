package android.cvl.udsm.com.denti.activities;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.cvl.udsm.com.denti.fragments.HeslbFragment;
import android.cvl.udsm.com.denti.fragments.HeslbResultFragment;
import android.cvl.udsm.com.denti.fragments.HeslbResultFragment2;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.cvl.udsm.com.denti.R;

public class HeslbResultActivity extends SingleFragmentActivity {

    private HeslbResultFragment fragmentApplicant = new HeslbResultFragment();
    private HeslbResultFragment2 fragmentPayer = new HeslbResultFragment2();

    @Override
    protected Fragment createFragment() {
        return fragmentApplicant;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.heslb_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_applicants:
                // Show applicants fragment
                showApplicantFragment();
                return true;
            case R.id.action_payers:
                // Show payers fragment
                showPayerFragment();
                return true;
            case R.id.action_settings:
                // Show settings screen
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showApplicantFragment() {
        //FragmentTransaction ft = getFragmentManager().beginTransaction();
        //ft.replace(R.id.fragmentContainer, new HeslbResultFragment()).commit();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        if (fragmentApplicant.isAdded()) { // if the fragment is already in container
            ft.show(fragmentApplicant);
        } else { // fragment needs to be added to frame container
            ft.add(R.id.fragmentContainer, fragmentApplicant);
        }
        // Hide fragment other fragment
        if (fragmentPayer.isAdded()) { ft.hide(fragmentPayer); }
        // Commit changes
        ft.commit();
    }

    private void showPayerFragment() {
        //FragmentTransaction ft = getFragmentManager().beginTransaction();
        //ft.replace(R.id.fragmentContainer, new HeslbResultFragment2()).commit();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        if (fragmentPayer.isAdded()) { // if the fragment is already in container
            ft.show(fragmentPayer);
        } else { // fragment needs to be added to frame container
            ft.add(R.id.fragmentContainer, fragmentPayer);
        }
        // Hide fragment other fragment
        if (fragmentApplicant.isAdded()) { ft.hide(fragmentApplicant); }
        // Commit changes
        ft.commit();
    }
}
