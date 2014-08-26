package android.cvl.udsm.com.denti.fragments;



import android.content.Intent;
import android.cvl.udsm.com.denti.activities.HeslbPayLoanActivity;
import android.cvl.udsm.com.denti.activities.HeslbPayerResultActivity;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;
import android.widget.Button;
import android.widget.ImageView;

public class HeslbResultFragment2 extends Fragment {

    public HeslbResultFragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_heslb_result2, container, false);

        ImageView imageview = (ImageView) v.findViewById(R.id.pgLoan);
        LayerDrawable layer = (LayerDrawable) imageview.getDrawable();
        ClipDrawable clip = (ClipDrawable) layer.findDrawableByLayerId(R.id.clip_fg);
        clip.setLevel(5000);

        Button btnPay = (Button) v.findViewById(R.id.button);
        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(getActivity(), HeslbPayLoanActivity.class));
            }
        });

        return v;
    }


}
