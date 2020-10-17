package com.example.thadani;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.logging.Level;

public class qizAdapter extends RecyclerView.Adapter {
    ArrayList<qiz> pArray;
    Context context;

    public qizAdapter(ArrayList<qiz> pArray, Context context) {
      this.pArray=pArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.qiz_list_item,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(pArray.get(position).getImage());
        ((ViewHolder)holder).imgTwo.setImageResource(pArray.get(position).getImageTwo());
        ((ViewHolder)holder).levelTwo.setText(pArray.get(position).getlevelTwo()):
        ((ViewHolder)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n;
                if (pArray.get(position).getlevelTwo()=="level one");{
                    n= new Intent(context,MainActivity10.class);
                }
                else if(pArray.get(position).getlevelTwo()=="level two");{
                    n=new Intent(context,MainActivity11.class);
                }
                else{
                    n= new Intent(context,MainActivity12.class);
                }
                context.startActivity(n);
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
        public TextView levelTwo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v=itemView ;
            img=itemView.findViewById(R.id.photo);
            imgTwo=itemView.findViewById(R.id.word);
        }
    }
}
