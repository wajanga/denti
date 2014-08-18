package android.cvl.udsm.com.denti.fragments;

import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.cvl.udsm.com.denti.R;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.XLabels;
import com.github.mikephil.charting.utils.YLabels;

import java.util.ArrayList;

public class NectaSchoolResultFragment extends Fragment {

    private LineChart mChart;
    private ColorTemplate mCt;
    private Typeface mTf;

    public NectaSchoolResultFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v  = inflater.inflate(R.layout.fragment_necta_school_result, container, false);

        mChart = (LineChart) v.findViewById(R.id.chartResultHistory);

        // apply styling
        mTf = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Regular.ttf");
        mChart.setValueTypeface(mTf);
        mChart.setDescription("");
        mChart.setDrawVerticalGrid(false);
        mChart.setDrawGridBackground(false);

        XLabels xl = mChart.getXLabels();
        xl.setCenterXLabelText(true);
        xl.setPosition(XLabels.XLabelPosition.BOTTOM);
        xl.setTypeface(mTf);

        YLabels yl = mChart.getYLabels();
        yl.setTypeface(mTf);
        yl.setLabelCount(5);

        // set data
        mChart.setData(generateDataLine(4));

        // do not forget to refresh the chart
        mChart.invalidate();

        return v;
    }

    private ChartData generateDataLine(int cnt) {

        ArrayList<Entry> e1 = new ArrayList<Entry>();

        for (int i = 0; i < 4; i++) {
            e1.add(new Entry((int) (Math.random() * 65) + 40, i));
        }

        LineDataSet d = new LineDataSet(e1, "School Rank (Past 4 years)");

        d.setLineWidth(3f);
        d.setCircleSize(5f);
        d.setColor(getResources().getColor(R.color.denti_theme));
        d.setCircleColor(getResources().getColor(R.color.denti_theme));

        ArrayList<LineDataSet> sets = new ArrayList<LineDataSet>();
        sets.add(d);

        LineData cd = new LineData(getPreviousRanks(), sets);
        return cd;
    }

    private ArrayList<String> getPreviousRanks() {

        ArrayList<String> m = new ArrayList<String>();
        m.add("2011");
        m.add("2012");
        m.add("2013");
        m.add("2014");

        return m;
    }

}
