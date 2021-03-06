package android.cvl.udsm.com.denti.fragments;



import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.interfaces.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.Highlight;
import com.github.mikephil.charting.utils.Legend;
import com.github.mikephil.charting.utils.MarkerView;
import com.github.mikephil.charting.utils.XLabels;
import com.github.mikephil.charting.utils.YLabels;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class HeslbResultFragment extends Fragment implements OnChartValueSelectedListener {

    private PieChart mChart;
    private ArrayList<String> q = new ArrayList<String>();

    public HeslbResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_heslb_result, container, false);

        mChart = (PieChart) v.findViewById(R.id.chartLoan);

        // apply styling
        Typeface mTf = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Regular.ttf");
        mChart.setValueTypeface(mTf);
        mChart.setDescription("");
        mChart.setHoleRadius(60f);
        mChart.setTransparentCircleRadius(65f);
        mChart.setCenterText("Loan\nDistribution");
        mChart.setCenterTextTypeface(mTf);
        mChart.setCenterTextSize(16f);
        mChart.setDrawXValues(false);
        mChart.setUsePercentValues(true);
        mChart.setCenterText("Total\n2,000,000 Tsh");

        // add a selection listener
        mChart.setOnChartValueSelectedListener(this);

        // set data
        mChart.setData(generateDataPie(4));

        Legend l = mChart.getLegend();
        l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);

        // do not forget to refresh the chart
        mChart.invalidate();

        return v;
    }

    private ChartData generateDataPie(int cnt) {

        ArrayList<Entry> entries = new ArrayList<Entry>();

        /*for (int i = 0; i < 4; i++) {
            entries.add(new Entry((int) (Math.random() * 70) + 30, i));
        }*/
        entries.add(new Entry(1100000, 0));
        entries.add(new Entry(300000, 1));
        entries.add(new Entry(300000, 2));
        entries.add(new Entry(300000, 3));

        PieDataSet d = new PieDataSet(entries, "");

        // space between slices
        d.setSliceSpace(5f);
        d.setColors(ColorTemplate.COLORFUL_COLORS, getActivity());

        PieData cd = new PieData(getCategories(), d);
        return cd;
    }

    private ArrayList<String> getCategories() {

        //ArrayList<String> q = new ArrayList<String>();
        q.add("Tuition fee");
        q.add("Accommodation");
        q.add("Stipend");
        q.add("Others");

        return q;
    }


    @Override
    public void onValuesSelected(Entry[] values, Highlight[] highlights) {
        mChart.setCenterText(q.get(highlights[0].getXIndex()) + "\n" + values[0].getVal() + " Tshs");
    }

    @Override
    public void onNothingSelected() {
        //Log.i("PieChart", "nothing selected");
        mChart.setCenterText("Total\n2,000,000 Tshs");
    }
}
