package android.cvl.udsm.com.denti.activities;

import android.app.Activity;
import android.app.Fragment;
import android.cvl.udsm.com.denti.fragments.HeslbResultFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.cvl.udsm.com.denti.R;

public class HeslbResultActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new HeslbResultFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.heslb_result, menu);
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
}