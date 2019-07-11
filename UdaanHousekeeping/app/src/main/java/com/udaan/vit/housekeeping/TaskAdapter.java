package com.udaan.vit.housekeeping;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.udaan.vit.housekeeping.Modal.Allocatedtask;

import java.util.List;

public class TaskAdapter extends ArrayAdapter<Allocatedtask> {
    public TaskAdapter(Context context, int resource, List<Allocatedtask> objects) {
        super(context, resource, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.tasks_list_row, parent, false);
        }

        TextView allassname = convertView.findViewById(R.id.allassent);
        TextView alltaskname = convertView.findViewById(R.id.alltask);
        TextView allworker = convertView.findViewById(R.id.allworker);
        TextView allcurdate = convertView.findViewById(R.id.allcurdate);
        TextView allfinish = convertView.findViewById(R.id.alldata);


        Allocatedtask allocatedtask = getItem(position);

        allassname.setText(allocatedtask.getAsset());
        alltaskname.setText(allocatedtask.getTask());
        allworker.setText(allocatedtask.getWorker());
        allcurdate.setText(allocatedtask.getCurrent_date());
        allfinish.setText(allocatedtask.getFinish_date ());


        return convertView;
    }
}
