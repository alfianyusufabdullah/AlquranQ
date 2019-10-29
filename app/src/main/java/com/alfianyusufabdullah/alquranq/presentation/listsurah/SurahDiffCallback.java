package com.alfianyusufabdullah.alquranq.presentation.listsurah;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.alfianyusufabdullah.alquranq.model.Surah;

public class SurahDiffCallback extends DiffUtil.ItemCallback<Surah> {

    @Override
    public boolean areItemsTheSame(@NonNull Surah oldItem, @NonNull Surah newItem) {
        return oldItem.getSurah().equals(newItem.getSurah());
    }

    @SuppressLint("DiffUtilEquals")
    @Override
    public boolean areContentsTheSame(@NonNull Surah oldItem, @NonNull Surah newItem) {
        return oldItem == newItem;
    }
}
