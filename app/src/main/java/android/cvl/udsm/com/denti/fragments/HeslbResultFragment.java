package android.cvl.udsm.com.denti.fragments;



import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.Legend;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class HeslbResultFragment extends Fragment {

    private PieChart mChart;

    public HeslbResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_heslb_result, container, false);

        mChart = (PieChart) v.findViewById(R.id.chartLoan);
        mChart.setDescription("");

        // chart colors
        ColorTemplate ct = new ColorTemplate();
        ct.addDataSetColors(ColorTemplate.COLORFUL_COLORS, getActivity());
        mChart.setColorTemplate(ct);
        // chart value colors
        mChart.setValuePaintColor(getResources().getColor(R.color.black));

        // type faces
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Regular.ttf");
        mChart.setValueTypeface(tf);
        mChart.setCenterTextTypeface(Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Light.ttf"));

        // display percentage values
        mChart.setUsePercentValues(true);

        mChart.setCenterText("Loan\nDistribution");

        // radius of the center hole in percent of maximum radius
        mChart.setDrawHoleEnabled(true);

        mChart.setData(generateLessData());

        return v;
    }

    protected ChartData generateLessData() {

        int count = 4;

        ArrayList<Entry> entries1 = new ArrayList<Entry>();
        ArrayList<String> xVals = new ArrayList<String>();

        xVals.add("Tuition fee");
        xVals.add("Accommodation");
        xVals.add("Stipend");
        xVals.add("Others");

        for(int i = 0; i < count; i++) {
            xVals.add("entry" + (i+1));

            entries1.add(new Entry((float) (Math.random() * 100), i));
        }

        DataSet ds1 = new DataSet(entries1, "Categories");

        ChartData d = new ChartData(xVals, ds1);
        return d;
    }


}
