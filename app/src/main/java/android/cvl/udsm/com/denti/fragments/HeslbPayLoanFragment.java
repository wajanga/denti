package android.cvl.udsm.com.denti.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class HeslbPayLoanFragment extends Fragment {

    private RadioGroup rgPayOptions;
    //private RadioButton rbPayChoice;
    private TextView tvPayDetails;

    public HeslbPayLoanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_heslb_pay_loan, container, false);

        rgPayOptions = (RadioGroup) v.findViewById(R.id.radioGroup);
        rgPayOptions.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                updatePaymentDescription(i);
            }
        });

        tvPayDetails = (TextView) v.findViewById(R.id.tvPaymentDetails);
        tvPayDetails.setText("M-Pesa Instructions");

        return v;
    }

    private void updatePaymentDescription(int viewId) {
        switch (viewId) {
            case R.id.radioMpesa:
                tvPayDetails.setText("M-Pesa Instructions");
                break;
            case R.id.radioNmb:
                tvPayDetails.setText("NMB Instructions");
                break;
            default:
                break;
        }
        //rbPayChoice = (RadioButton) getActivity().findViewById(viewId);
    }

}
