package com.example.android.bai087listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by nhvn on 11/6/17.
 */

public class ContactAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ContactModel> arrayList;
    public ContactAdapter (Context context, ArrayList<ContactModel> contactModels){
        this.context = context;
        this.arrayList = contactModels;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, final ViewGroup viewGroup) { //i la vi tri cua item hien tai, view la view duoc luu lai khi scroll, viewgroup la view cha de chua item

        //View rowView = inflater.inflate(R.layout.item_layout, viewGroup, false); //ton thoi gian xu ly
        View rowView;

        if(view == null){
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            rowView = inflater.inflate(R.layout.item_layout, viewGroup, false);
            ViewHolder holder = new ViewHolder();
            holder.img  = rowView.findViewById(R.id.imgContact);
            holder.txtName = rowView.findViewById(R.id.txtName);
            holder.txtPhone = rowView.findViewById(R.id.txtContact);
            holder.btnCall = rowView.findViewById(R.id.btnCall);

            holder.btnCall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ContactModel model = arrayList.get(i);
                    Toast.makeText(ContactAdapter.this.context, model.getPhone(), Toast.LENGTH_SHORT).show();
                }
            });
            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ContactModel model = arrayList.get(i);
                    Toast.makeText(ContactAdapter.this.context, model.getName(), Toast.LENGTH_SHORT).show();
                }
            });
            rowView.setTag(holder);
        } else{
            rowView = view;
        }
        ContactModel model = arrayList.get(i);
        ViewHolder holder = (ViewHolder) rowView.getTag();
        //holder.img.setImageResource(i);
        holder.txtName.setText(model.getName());
        holder.txtPhone.setText(model.getPhone());

        //TextView txtName = rowView.findViewById(R.id.txtName); //ton thoi gian xu ly
        //TextView txtContact = rowView.findViewById(R.id.txtContact); //ton thoi gian xu ly
        //ImageView imageView = rowView.findViewById(R.id.imgContact);

        //txtName.setText(model.getName());
        //txtContact.setText(model.getPhone());
        //imageView.setImageResource(model.getiImage()); truyen vao mot int lay vi tri cua anh trong danh sach anh da tao
        return rowView;
    }

    class ViewHolder{
        ImageView img;
        TextView txtName;
        TextView txtPhone;
       ImageButton btnCall;
    }
}
