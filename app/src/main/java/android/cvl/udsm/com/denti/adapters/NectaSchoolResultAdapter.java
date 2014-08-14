package android.cvl.udsm.com.denti.adapters;

import android.content.Context;
import android.cvl.udsm.com.denti.R;
import android.cvl.udsm.com.denti.model.School;
import android.cvl.udsm.com.denti.model.SubjectResult;
import android.cvl.udsm.com.denti.utils.ThreadPreconditions;
import android.cvl.udsm.com.denti.utils.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by aronkondoro on 8/7/14.
 */
public class NectaSchoolResultAdapter extends BaseAdapter {

    private Context context;
    private List<School> schools = Collections.emptyList();

    public NectaSchoolResultAdapter(Context context) {
        this.context = context;
    }

    public void updateSchools(List<School> schools) {
        ThreadPreconditions.checkOnMainThread();
        this.schools = schools;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return schools.size();
    }

    @Override
    public School getItem(int i) {
        return schools.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_necta_school_result, parent, false);
        }

        TextView schoolNameView = ViewHolder.get(convertView, R.id.tvSchoolName);
        TextView schoolPassRateView = ViewHolder.get(convertView, R.id.tvSchoolPassRate);
        TextView schoolNumberView  = ViewHolder.get(convertView, R.id.tvSchoolNumber);
        TextView schoolRankView  = ViewHolder.get(convertView, R.id.tvSchoolRank);

        School school = getItem(position);
        schoolNameView.setText(school.getSchoolName());
        schoolPassRateView.setText(school.getSchoolResult().getPassRate());
        schoolNumberView.setText("Centre code: " + school.getSchoolNumber());
        schoolRankView.setText("Rank: " + school.getSchoolResult().getRank());

        return convertView;
    }

}
