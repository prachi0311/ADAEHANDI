package com.example.prachi.adaehaandis;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by prachi on 23/11/17.
 */

public class imageadapter extends RecyclerView.Adapter<imageadapter.ViewHolder> {
    Context mcontext;
    ArrayList<String> mlinks;

    public imageadapter(ArrayList<String> link,Context context){
        mcontext=context;
        mlinks=link;
    }

    @Override


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerimagelistitem, parent, false);

        imageadapter.ViewHolder vh=new imageadapter.ViewHolder(view);
        return vh;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Picasso.with(mcontext).load( mlinks.get(position) ).into(holder.gallerypic);
      //  holder.gallerypic.setImageDrawable();
        Log.i("link",mlinks.get(position));
    }

    @Override
    public int getItemCount() {
        return mlinks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gallerypic;
        TextView test;
        public ViewHolder(View itemView) {
            super(itemView);
            gallerypic=(ImageView)itemView.findViewById(R.id.recylceritemimageview);

        }
    }
}
