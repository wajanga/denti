package android.cvl.udsm.com.denti.fragments;



import android.cvl.udsm.com.denti.adapters.NectaResultCellAdapter;
import android.cvl.udsm.com.denti.model.NectaResult;
import android.cvl.udsm.com.denti.model.SampleData;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class NectaStudentResultFragment extends Fragment {

    private NectaResult result;

    public NectaStudentResultFragment() {
        // Required empty public constructor
    }

    public static NectaStudentResultFragment newInstance(NectaResult nectaResult) {
        NectaStudentResultFragment nectaResultFragment = new NectaStudentResultFragment();
        Bundle args = new Bundle();
        args.putParcelable("necta_result", nectaResult);
        nectaResultFragment.setArguments(args);
        return nectaResultFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get back arguments
        result = (NectaResult) getArguments().getParcelable("necta_result");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_necta_student_result, container, false);

        if (result == null) {
            RelativeLayout container1 = (RelativeLayout) view.findViewById(R.id.container1);
            container1.setVisibility(View.GONE);

            LinearLayout container2 = (LinearLayout) view.findViewById(R.id.container2);
            container2.setVisibility(View.GONE);

            TextView emptyTextView = (TextView) view.findViewById(R.id.tvEmpty);
            emptyTextView.setVisibility(View.VISIBLE);
        }
        else {
            TextView divisionTextView = (TextView) view.findViewById(R.id.tvDivisionResult);
            divisionTextView.setText(result.getDivision());

            TextView pointsTextView = (TextView) view.findViewById(R.id.tvPointsResult);
            pointsTextView.setText(result.getPoints());

            NectaResultCellAdapter adapter = new NectaResultCellAdapter(getActivity());
            adapter.updateResultList(result.getResults());

            GridView gridview = (GridView) view.findViewById(R.id.gridview);
            gridview.setAdapter(adapter);
        }

        return view;
    }

}
