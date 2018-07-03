package com.example.androidgridview;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyStringHeadingsAdapter extends BaseAdapter {
    private Activity activity;
    private List stringPairList;
    

    public MyStringHeadingsAdapter(Activity activity, List stringPairList) {
        super();
        this.activity = activity;
        this.stringPairList = stringPairList;
    }

    @Override
    public int getCount() {
        return stringPairList.size();
    }

    @Override
    public Object getItem(int position) {
        return stringPairList.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.column_row, null);
        }
        TextView col1 = (TextView) convertView.findViewById(R.id.TextFirst);
        TextView col2 = (TextView) convertView.findViewById(R.id.TextSecond);
        
        col1.setText(stringPairList.get(position).toString());
        col2.setText(stringPairList.get(position).toString());
        
        return convertView;
    }

	
	
}