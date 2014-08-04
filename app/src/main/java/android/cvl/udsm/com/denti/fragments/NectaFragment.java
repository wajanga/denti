package android.cvl.udsm.com.denti.fragments;

import android.app.Activity;
import android.content.Intent;
import android.cvl.udsm.com.denti.activities.NectaResultActivity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;
import android.widget.Button;
import android.widget.EditText;

import com.andreabaccega.widget.FormEditText;

public class NectaFragment extends Fragment {

    Button mShowButton;
    FormEditText mStudentNumberEdittext;

    public NectaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_necta, container, false);

        mStudentNumberEdittext = (FormEditText) v.findViewById(R.id.etStudentNumber);

        mShowButton = (Button) v.findViewById(R.id.button);
        mShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (mStudentNumberEdittext.testValidity()) {
                    String mStudentNumber = mStudentNumberEdittext.getText().toString();
                    Intent intent = new Intent(getActivity(), NectaResultActivity.class);
                    intent.putExtra("studentNumber", mStudentNumber);
                    startActivity(intent);
                }
            }
        });

        return v;
    }

}
