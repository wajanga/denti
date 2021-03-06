package android.cvl.udsm.com.denti.fragments;

import android.content.Intent;
import android.cvl.udsm.com.denti.activities.HeslbActivity;
import android.cvl.udsm.com.denti.activities.HeslbChoiceActivity;
import android.cvl.udsm.com.denti.activities.NectaActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;
import android.widget.ImageButton;


public class HomeFragment extends Fragment {

    ImageButton mNectaImgButton, mHeslbImgButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        mNectaImgButton = (ImageButton) v.findViewById(R.id.imageButton1);
        mNectaImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(getActivity(), NectaActivity.class));
            }
        });

        mHeslbImgButton = (ImageButton) v.findViewById(R.id.imageButton2);
        mHeslbImgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(getActivity(), HeslbChoiceActivity.class));
            }
        });

        return v;
    }

}
