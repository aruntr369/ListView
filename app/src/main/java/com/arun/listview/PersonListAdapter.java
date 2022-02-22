package com.arun.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PersonListAdapter extends ArrayAdapter<Person> {
    private static final String TAG = "PersonListAdapter";
    private Context mContext;
    int mResource;

    /**
     * Default constructor for the PersonListAdapter
     * @param context
     * @param resource
     * @param objects
     */

    public PersonListAdapter(Context context, int resource,ArrayList<Person> objects) {
        super(context, resource, objects);
        this.mContext = context;
        mResource =resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    //get the persons info
    String name = getItem(position).getName();
    String birthday = getItem(position).getBirthdate();
    String sex = getItem(position).getSex();

    //create the person with the info
        Person person = new Person(name,birthday,sex);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);
        TextView tvName =(TextView) convertView.findViewById(R.id.textview1);
        TextView tvBirthday =(TextView) convertView.findViewById(R.id.textview2);
        TextView tvSex =(TextView) convertView.findViewById(R.id.textview3);

        tvName.setText(name);
        tvBirthday.setText(birthday);
        tvSex.setText(sex);

        return convertView;
    }
}
