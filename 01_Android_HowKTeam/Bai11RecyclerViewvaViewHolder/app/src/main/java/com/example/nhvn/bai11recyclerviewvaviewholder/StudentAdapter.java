package com.example.nhvn.bai11recyclerviewvaviewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nguye on 27-Nov-17.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    private ArrayList<StudentModel> students;
    private Context context;

    public StudentAdapter(ArrayList<StudentModel> students, Context context) {
        this.students = students;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView;
        if(viewType == 1){
            itemView = inflater.inflate(R.layout.item_sex_male, parent, false);
        } else {
            itemView = inflater.inflate(R.layout.item_sex_female, parent, false);
        }
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_sex.setText(students.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    @Override
    public int getItemViewType(int position) {
        return students.get(position).isMale() ? 1 : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_sex;
        public ViewHolder(View itemView) {
            super(itemView);
            tv_sex = itemView.findViewById(R.id.tv_name);
        }
    }
}
