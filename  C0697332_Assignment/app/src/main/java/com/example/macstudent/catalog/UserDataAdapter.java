package com.example.macstudent.catalog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



import java.util.ArrayList;

/**
 * Created by moxdroid on 2017-07-27.
 */

public class UserDataAdapter extends BaseAdapter {

    ArrayList<User> userArrayList;
    Activity context;
    public UserDataAdapter(Activity context, ArrayList<User> userArrayList)
    {
        this.context = context;
        this.userArrayList = userArrayList;
    }
    @Override
    public int getCount() {
        return userArrayList.size();
    }

    @Override
    public User getItem(int i) {
        return userArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = context.getLayoutInflater();
        View convertView = inflater.inflate(R.layout.item_user, null, true);

        TextView txtUserName = (TextView)convertView.findViewById(R.id.txtUserName);

        User mUser = userArrayList.get(i);
        txtUserName.setText(mUser.getRName());
        return convertView;
    }
}
