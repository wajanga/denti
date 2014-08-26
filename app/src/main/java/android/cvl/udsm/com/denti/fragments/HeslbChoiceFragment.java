package android.cvl.udsm.com.denti.fragments;



import android.content.Intent;
import android.cvl.udsm.com.denti.activities.HeslbActivity;
import android.cvl.udsm.com.denti.activities.NectaActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class HeslbChoiceFragment extends Fragment {

    private ImageButton imgBtnApplicant, imgBtnPayer;

    public HeslbChoiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_heslb_choice, container, false);

        imgBtnApplicant = (ImageButton) v.findViewById(R.id.imgBtnApplicant);
        imgBtnApplicant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), HeslbActivity.class);
                intent.putExtra(HeslbActivity.FRAGMENT_TYPE, HeslbActivity.FRAGMENT_APPLICANT);
                startActivity(intent);
            }
        });

        imgBtnPayer = (ImageButton) v.findViewById(R.id.imgBtnPayer);
        imgBtnPayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), HeslbActivity.class);
                intent.putExtra(HeslbActivity.FRAGMENT_TYPE, HeslbActivity.FRAGMENT_PAYER);
                startActivity(intent);
            }
        });

        return v;
    }

}
