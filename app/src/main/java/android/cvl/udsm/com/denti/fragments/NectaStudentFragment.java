package android.cvl.udsm.com.denti.fragments;

import android.content.Intent;
import android.cvl.udsm.com.denti.activities.NectaStudentResultActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;
import android.widget.Button;

import com.andreabaccega.widget.FormEditText;

public class NectaStudentFragment extends Fragment {

    Button mShowButton;
    FormEditText mStudentNumberEdittext;

    public NectaStudentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_necta_student, container, false);

        mStudentNumberEdittext = (FormEditText) v.findViewById(R.id.etStudentNumber);

        mShowButton = (Button) v.findViewById(R.id.button);
        mShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (mStudentNumberEdittext.testValidity()) {
                    String mStudentNumber = mStudentNumberEdittext.getText().toString();
                    Intent intent = new Intent(getActivity(), NectaStudentResultActivity.class);
                    intent.putExtra("studentNumber", mStudentNumber);
                    startActivity(intent);
                }
            }
        });

        return v;
    }

}
