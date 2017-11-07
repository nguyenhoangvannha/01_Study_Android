package com.example.android.bai097gridview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nhvn on 11/7/17.
 */

public class ContactAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<ContactModel> arrContact;
    public ContactAdapter(Context context, ArrayList<ContactModel> arrContact)
    {
        this.context = context;
        this.arrContact = arrContact;
    }
    @Override
    public int getCount() {
        return arrContact.size();
    }

    @Override
    public Object getItem(int i) {
        return arrContact.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView;
        if(view == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            rowView = inflater.inflate(R.layout.item_view, viewGroup, false);
            ViewHolder holder = new ViewHolder();
            holder.imgAvatar = rowView.findViewById(R.id.imgAvatar);
            holder.txtName = rowView.findViewById(R.id.txtName);
            rowView.setTag(holder);

        } else {
            rowView = view;
        }

        ViewHolder holder = (ViewHolder) rowView.getTag();
        ContactModel model = arrContact.get(i);
        holder.imgAvatar.setImageResource(R.drawable.avatar);
        holder.txtName.setText(getFirstName(model.getName()));

        return rowView;
    }

    class ViewHolder{
        ImageView imgAvatar;
        TextView txtName;
    }

    private String getFirstName(String fullName){
        int i = 0;
        i = fullName.lastIndexOf(" ");
        String firstName = fullName.substring(i + 1);
        return firstName;
    }
}
