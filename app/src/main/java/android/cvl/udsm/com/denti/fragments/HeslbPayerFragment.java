package android.cvl.udsm.com.denti.fragments;



import android.content.Intent;
import android.cvl.udsm.com.denti.activities.HeslbApplicantResultActivity;
import android.cvl.udsm.com.denti.activities.HeslbPayerResultActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class HeslbPayerFragment extends Fragment {

    Button mShowButton;

    public HeslbPayerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_heslb_payer, container, false);

        mShowButton = (Button) v.findViewById(R.id.button);
        mShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(getActivity(), HeslbPayerResultActivity.class));
            }
        });

        return v;
    }


}
