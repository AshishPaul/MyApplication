package com.example.a40002778.myapplication.ui.components;

import android.view.View;
import com.example.a40002778.myapplication.utils.exception.BaseException;


public class EmptyViewHolder extends BaseViewHolder {

    private final BaseException errorToShow;
    private final EmptyViewClickListener listener;

    public EmptyViewHolder(View itemView, BaseException errorToShow, EmptyViewClickListener listener) {
        super(itemView);
        this.errorToShow = errorToShow;
        this.listener = listener;
    }


    @Override
    public void onBind(int position) {

    }
}

