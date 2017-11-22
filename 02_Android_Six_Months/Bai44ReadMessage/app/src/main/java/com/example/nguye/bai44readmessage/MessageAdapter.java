package com.example.nguye.bai44readmessage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by nguye on 22-Nov-17.
 */

public class MessageAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<MessageModel> messages;

    public MessageAdapter(Context context, ArrayList<MessageModel> messages) {
        this.context = context;
        this.messages = messages;
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int i) {
        return messages.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView;
        if(view == null){
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            rowView = inflater.inflate(R.layout.message_item, viewGroup, false);
            ViewHolder holder = new ViewHolder();
            holder.txtAddress = rowView.findViewById(R.id.txt_message_address);
            holder.txtBody = rowView.findViewById(R.id.txt_message_body);
            holder.txtDate = rowView.findViewById(R.id.txt_message_date);
            rowView.setTag(holder);
        } else {
            rowView = view;
        }
        ViewHolder holder = (ViewHolder) rowView.getTag();
        holder.txtAddress.setText(messages.get(i).getPhone());
        holder.txtBody.setText(messages.get(i).getBody());
        holder.txtDate.setText(messages.get(i).getDateString());
        return rowView;
    }
    class ViewHolder{
        TextView txtAddress;
        TextView txtBody;
        TextView txtDate;
    }
}
