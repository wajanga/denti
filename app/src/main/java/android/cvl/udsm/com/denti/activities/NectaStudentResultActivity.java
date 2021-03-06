package android.cvl.udsm.com.denti.activities;

import android.app.Fragment;
import android.cvl.udsm.com.denti.fragments.NectaStudentResultFragment;
import android.cvl.udsm.com.denti.model.NectaResult;
import android.view.Menu;
import android.view.MenuItem;
import android.cvl.udsm.com.denti.R;

public class NectaStudentResultActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        //return new NectaResultFragment();
        NectaResult nectaResult = getIntent().getParcelableExtra("necta_result");
        return NectaStudentResultFragment.newInstance(nectaResult);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.necta_result, menu);
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
