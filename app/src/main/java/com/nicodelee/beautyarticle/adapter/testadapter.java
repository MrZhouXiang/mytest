package com.nicodelee.beautyarticle.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daimajia.numberprogressbar.NumberProgressBar;
import com.nicodelee.beautyarticle.R;

/**
 * 1212212
 */
public class testadapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_main, parent, false);
        return null;
    }

    public class ViewHolder {
        public final ImageView mainic;
        public final TextView maintitle;
        public final TextView maindesc;
        public final RelativeLayout rlmsg;
        public final NumberProgressBar numberprogressbar;
        public final RelativeLayout rlloading;
        public final View root;

        public ViewHolder(View root) {
            mainic = (ImageView) root.findViewById(R.id.main_ic);
            maintitle = (TextView) root.findViewById(R.id.main_title);
            maindesc = (TextView) root.findViewById(R.id.main_desc);
            rlmsg = (RelativeLayout) root.findViewById(R.id.rl_msg);
            numberprogressbar = (NumberProgressBar) root.findViewById(R.id.number_progress_bar);
            rlloading = (RelativeLayout) root.findViewById(R.id.rl_loading);
            this.root = root;
        }
    }
}
