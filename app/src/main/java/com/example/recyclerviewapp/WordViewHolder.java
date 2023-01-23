package com.example.recyclerviewapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    WordListAdapter mAdapter;
    TextView wordItemView;

    public WordViewHolder(View itemView, WordListAdapter adapter) {
        super(itemView);
        wordItemView = (TextView) itemView.findViewById(R.id.word);
        this.mAdapter = adapter;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        wordItemView.setText ("Clicked! "+ wordItemView.getText());
    }
}
