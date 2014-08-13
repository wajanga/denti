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
import com.github.mikephil.charting.utils.ColorTemplate;

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
        mChart.setDescription("");
        mChart.setOffsets(0,20,20,20);

        // Color template
        mCt = new ColorTemplate();
        mCt.addDataSetColor(R.color.colorful_1, getActivity());
        mChart.setColorTemplate(mCt);

        // Typeface
        mTf = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Bold.ttf");
        mChart.setYLabelTypeface(mTf);
        mChart.setXLabelTypeface(mTf);
        mChart.setValueTypeface(mTf);
        mChart.setAdjustXLabels(true);
        mChart.setXLabelTextSize(20f);
        mChart.setYLabelTextSize(20f);

        // Number of y-values
        mChart.setYLabelCount(5);

        // Chart background
        mChart.setDrawVerticalGrid(false);
        mChart.setDrawGridBackground(false);

        // Line style
        mChart.setLineWidth(3f);
        mChart.setCircleSize(5f);

        // Chart borders
        mChart.setDrawBorder(true);
        mChart.setBorderStyles(new BarLineChartBase.BorderStyle[] { BarLineChartBase.BorderStyle.BOTTOM,
                BarLineChartBase.BorderStyle.LEFT, BarLineChartBase.BorderStyle.RIGHT, BarLineChartBase.BorderStyle.TOP });

        setChartData(5, 100);

        mChart.invalidate();

        return v;
    }

    private void setChartData(int count, float range) {
        ArrayList<String> xVals = new ArrayList<String>();
        xVals.add("2010");
        xVals.add("2011");
        xVals.add("2012");
        xVals.add("2013");
        xVals.add("2014");

        ArrayList<Entry> yVals = new ArrayList<Entry>();

        for (int i = 0; i < count; i++) {
            float mult = (range + 1);
            float val = (float) (Math.random() * mult) + 3;
            yVals.add(new Entry(val, i));
        }

        DataSet set1 = new DataSet(yVals, "School Rank (Past 5 years)");

        ArrayList<DataSet> dataSets = new ArrayList<DataSet>();
        dataSets.add(set1);

        ChartData data = new ChartData(xVals, dataSets);

        mChart.setData(data);
    }

}
