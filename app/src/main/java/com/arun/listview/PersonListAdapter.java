package com.arun.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PersonListAdapter extends ArrayAdapter<Person> {
    private static final String TAG = "PersonListAdapter";
    private Context mContext;
    private int mResource;
    private  int lastpostion=-1;

    static class ViewHolder {
        TextView name;
        TextView birthday;
        TextView sex;
    }

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

        //create the view result for showing the animation
        final View result;

        //viewholder object
        ViewHolder holder = new ViewHolder();

        if(convertView==null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder.name = (TextView) convertView.findViewById(R.id.textview1);
            holder.birthday = (TextView) convertView.findViewById(R.id.textview2);
            holder.sex = (TextView) convertView.findViewById(R.id.textview3);

            result = convertView;

            convertView.setTag(holder);
        }
        else {
            holder=(ViewHolder) convertView.getTag();
            result=convertView;
        }

        Animation animation= AnimationUtils.loadAnimation(mContext,
                (position>lastpostion)? R.anim.slide_down: R.anim.slide_up);
        result.startAnimation(animation);
        lastpostion=position;

        holder.name.setText(person.getName());
        holder.birthday.setText(person.getBirthdate());
        holder.sex.setText(person.getSex());


        return convertView;
    }
}
