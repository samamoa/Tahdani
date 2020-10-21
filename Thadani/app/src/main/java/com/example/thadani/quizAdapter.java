
package com.example.thadani;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;

public class quizAdapter extends RecyclerView.Adapter {
      ArrayList<quiz> pArray;
    Context context;

    public quizAdapter(ArrayList<quiz> pArray, Context context) {
        this.pArray = pArray;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.quiz_list_item,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(pArray.get(position).getImage());
        ((ViewHolder)holder).imgTwo.setImageResource(pArray.get(position).getImageTwo());
        ((ViewHolder)holder).lv.setText(pArray.get(position).getLevel());
        ((ViewHolder)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                if (pArray.get(position).getLevel() == "level water") {
                    i = new Intent(context, MainActivity5.class);
                    context.startActivity(i);
                } else if (pArray.get(position).getLevel() == "level half" ) {

                    i = new Intent(context, MainActivity6.class);
                    context.startActivity(i);
                } else if (pArray.get(position).getLevel() == "level fire" ) {
                    i = new Intent(context, MainActivity7.class);
                    context.startActivity(i);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return pArray.size();

    }
public static class ViewHolder extends RecyclerView.ViewHolder{
    public ImageView img;
    public ImageView imgTwo;
    public View v;
    public TextView lv;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
      v=itemView ;
        img=itemView.findViewById(R.id.photo);
        imgTwo=itemView.findViewById(R.id.word);
        lv=itemView.findViewById(R.id.textView2);

    }
}
}
