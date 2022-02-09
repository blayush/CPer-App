package com.example.cper;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

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
        return new myViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        RecyclerViewDatum recyclerViewDatum=data[position];

        // Set Contest Name
        holder.contest_name.setText(recyclerViewDatum.getName());

       // Set StartTime and EndTime
        String startTime=recyclerViewDatum.getStartTime(),endTime=recyclerViewDatum.getEndTime();
        Log.d("StartTime , EndTime : ",startTime+" , "+endTime);
        Instant s = Instant.parse(startTime);
        ZoneId.of("Asia/Kolkata");
        LocalDateTime l = LocalDateTime.ofInstant(s, ZoneId.of("Asia/Kolkata"));
        Log.d("date and time",l.toString());
        String finalStartTime=l.toString().substring(11)+ " , " +l.toString().substring(0,10);
        holder.start_time.setText(finalStartTime);
        Instant s2 = Instant.parse(endTime);
        ZoneId.of("Asia/Kolkata");
        LocalDateTime l2 = LocalDateTime.ofInstant(s, ZoneId.of("Asia/Kolkata"));
        Log.d("date and time",l2.toString());
        String finalEndTime=l2.toString().substring(11)+ " , " +l2.toString().substring(0,10);
        holder.end_time.setText(finalEndTime);

        // Set Duration
        long dur=Long.parseLong(recyclerViewDatum.getDuration());
        long min=dur/60;
        long hr=min/60;
        min=min%60;
        String mins="";
        if(min>0)mins= min +" minutes";
        String duration= hr +" hours "+mins;
        holder.duration.setText(duration);
        if(recyclerViewDatum.getStatus().equals("CODING"))holder.contest_status.setText("RUNNING");

        // Set logo icon
        holder.contest_icon.setBackgroundResource(R.drawable.codeforces_logoicon);

        // Set Days to go textView
        LocalDate today = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        LocalDate fDate=l.toLocalDate();
        Log.d("today and fDate",today.toString()+" , "+fDate.toString());
        Period diff=Period.between(today,fDate);
        Log.d("diff =", String.valueOf(diff.getDays()));
        if(String.valueOf(diff.getDays()).equals("0"))holder.daysLeft.setText("Today");
        else if(String.valueOf(diff.getDays()).equals("1"))holder.daysLeft.setText("Tomorrow");
        else holder.daysLeft.setText(diff.getDays() +" days to go");

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{
        TextView contest_name,start_time,end_time,duration,contest_status,daysLeft;
        ImageView contest_icon;
        CardView contest_icon_cardView;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            contest_name=itemView.findViewById(R.id.contest_name_text_view);
            start_time=itemView.findViewById(R.id.start_time_text_view);
            end_time=itemView.findViewById(R.id.end_time_textView);
            duration=itemView.findViewById(R.id.duration_textView);
            contest_icon=itemView.findViewById(R.id.contest_icon_imageView);
            contest_status=itemView.findViewById(R.id.contest_status_textView);
            contest_icon_cardView=itemView.findViewById(R.id.contest_icon_cardView);
            daysLeft=itemView.findViewById(R.id.days_textView);
        }
    }
}
