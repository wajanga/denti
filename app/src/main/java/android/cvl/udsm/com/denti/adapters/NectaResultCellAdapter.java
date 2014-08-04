package android.cvl.udsm.com.denti.adapters;

import android.content.Context;
import android.cvl.udsm.com.denti.R;
import android.cvl.udsm.com.denti.model.SubjectResult;
import android.cvl.udsm.com.denti.utils.ThreadPreconditions;
import android.cvl.udsm.com.denti.utils.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by aronkondoro on 8/4/14.
 */
public class NectaResultCellAdapter extends BaseAdapter {

    private Context context;
    private List<SubjectResult> resultList = Collections.emptyList();

    public NectaResultCellAdapter(Context context) {
        this.context = context;
    }

    public void updateResultList(List<SubjectResult> resultList) {
        ThreadPreconditions.checkOnMainThread();
        this.resultList = resultList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return resultList.size();
    }

    @Override
    public SubjectResult getItem(int i) {
        return resultList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.cell_necta_result, parent, false);
        }

        TextView subjectView = ViewHolder.get(convertView, R.id.tvSubject);
        TextView gradeView = ViewHolder.get(convertView, R.id.tvGrade);

        SubjectResult subjectResult = getItem(position);
        subjectView.setText(subjectResult.getSubject());
        gradeView.setText(subjectResult.getGrade());

        return convertView;
    }
}
