package android.cvl.udsm.com.denti.fragments;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.cvl.udsm.com.denti.adapters.NectaSchoolResultAdapter;
import android.cvl.udsm.com.denti.model.SampleSchools;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SearchView;
import android.widget.TextView;
import android.cvl.udsm.com.denti.R;

public class NectaSchoolFragment extends Fragment implements AbsListView.OnItemClickListener {


    private OnFragmentInteractionListener mListener;
    private AbsListView mListView;
    private NectaSchoolResultAdapter mAdapter;
    private TextView mFilterTexview;
    private LinearLayout filterLayout;
    private RadioGroup rgLevel, rgYear;
    private RadioButton rbLevel, rbYear;

    public NectaSchoolFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new NectaSchoolResultAdapter(getActivity());
        mAdapter.updateSchools(SampleSchools.SCHOOLS);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_school, container, false);

        mListView = (AbsListView) view.findViewById(android.R.id.list);
        ((AdapterView<ListAdapter>) mListView).setAdapter(mAdapter);

        // Set OnItemClickListener so we can be notified on item clicks
        mListView.setOnItemClickListener(this);

        filterLayout = (LinearLayout) view.findViewById(R.id.filterLayout);

        rgLevel = (RadioGroup) view.findViewById(R.id.rgLevel);

        rgYear = (RadioGroup) view.findViewById(R.id.rgYear);
        rgYear.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                updateFilterTextview(i);
            }
        });

        mFilterTexview = (TextView) view.findViewById(R.id.tvFilter);
        mFilterTexview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateFilterTextview();
                toggleFilterLayout();
            }
        });

        getActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        return view;
    }

    private void updateFilterTextview() {
        if (filterLayout.getVisibility() == View.VISIBLE) {
            int selectedLevelId = rgLevel.getCheckedRadioButtonId();
            rbLevel = (RadioButton) getActivity().findViewById(selectedLevelId);

            int selectedYearId = rgYear.getCheckedRadioButtonId();
            rbYear = (RadioButton) getActivity().findViewById(selectedYearId);

            mFilterTexview.setText(rbLevel.getText() + " - " + rbYear.getText());
        }
    }

    private void updateFilterTextview(int viewId) {
            int selectedLevelId = rgLevel.getCheckedRadioButtonId();
            rbLevel = (RadioButton) getActivity().findViewById(selectedLevelId);

            rbYear = (RadioButton) getActivity().findViewById(viewId);

            mFilterTexview.setText(rbLevel.getText() + " - " + rbYear.getText());
    }

    private void toggleFilterLayout() {
        if (filterLayout.getVisibility() == View.VISIBLE) {
            filterLayout.setVisibility(View.GONE);
        }
        else {
            filterLayout.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (null != mListener) {
            mListener.onFragmentInteraction(SampleSchools.SCHOOLS.get(position).getSchoolNumber());
        }
    }

    /**
     * The default content for this Fragment has a TextView that is shown when
     * the list is empty. If you would like to change the text, call this method
     * to supply the text it should use.
     */
    public void setEmptyText(CharSequence emptyText) {
        View emptyView = mListView.getEmptyView();

        if (emptyText instanceof TextView) {
            ((TextView) emptyView).setText(emptyText);
        }
    }

    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(String id);
    }

}
