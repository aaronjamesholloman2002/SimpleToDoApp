package com.example.simpletodoapp;

import androidx.annotation.NonNull;

public interface ItemAdapter {
    abstract void onBindViewHolder(@NonNull ItemsAdapter.ViewHolder holder, int position);
}
