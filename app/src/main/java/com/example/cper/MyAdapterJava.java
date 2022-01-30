package com.example.cper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class MyAdapterJava extends RecyclerView.Adapter<MyAdapterJava.myViewHolder>{

    RecyclerViewDatum[]data;
    Context context;

    public MyAdapterJava(RecyclerViewDatum[] data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.single_view_recycler,parent,false);
        return  new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        RecyclerViewDatum recyclerViewDatum=data[position];
        holder.contest_name.setText(recyclerViewDatum.getName());
        holder.start_time.setText(recyclerViewDatum.getStartTime());
        holder.end_time.setText(recyclerViewDatum.getEndTime());
        holder.duration.setText(recyclerViewDatum.getDuration());
        holder.contest_icon.setBackgroundResource(R.drawable.codeforces_logoicon);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        TextView contest_name,start_time,end_time,duration,contest_status;
        ImageView contest_icon;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            contest_name=itemView.findViewById(R.id.contest_name_text_view);
            start_time=itemView.findViewById(R.id.start_time_text_view);
            end_time=itemView.findViewById(R.id.end_time_textView);
            duration=itemView.findViewById(R.id.duration_textView);
            contest_icon=itemView.findViewById(R.id.contest_icon_imageView);
            contest_status=itemView.findViewById(R.id.contest_status_textView);
        }
    }
}
