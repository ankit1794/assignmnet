package com.example.anki7.assignment;


import android.content.ClipData;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostVIewHolder> {

    private Context context;
    private Integer items;

    public PostAdapter(Context context, Integer items)
    {
        this.context=context;
        this.items=items;
    }

    @Override
    public PostVIewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.assi_row,parent,false);
          return  new PostVIewHolder(view);

    }


    public void onBindViewHolder(PostVIewHolder holder, int position) {

        ClipData.Item item = items.get(position);
        holder.aText.setText(item.getText());


    }
    public int getItemCount() {
        return items.size();
    }

    public class PostVIewHolder extends RecyclerView.ViewHolder{

        ImageView pImage;
        TextView  aText;

        public PostVIewHolder(View itemView) {
            super(itemView);

            pImage=(ImageView) itemView.findViewById(R.id.pImage);
            aText=(TextView) itemView.findViewById(R.id.aText);
        }
    }
}
