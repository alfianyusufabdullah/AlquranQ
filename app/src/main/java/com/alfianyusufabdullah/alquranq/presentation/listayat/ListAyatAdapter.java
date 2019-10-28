package com.alfianyusufabdullah.alquranq.presentation.listayat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.alfianyusufabdullah.alquranq.R;
import com.alfianyusufabdullah.alquranq.model.Ayat;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;

/**
 * Created by jonesrandom on 2/22/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

class ListAyatAdapter extends ListAdapter<Ayat, ListAyatAdapter.AyatHolder> {

    ListAyatAdapter(@NonNull DiffUtil.ItemCallback<Ayat> diffCallback) {
        super(diffCallback);
    }

    @Override
    public AyatHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_list_ayat, parent, false);
        return new AyatHolder(view);
    }

    @Override
    public void onBindViewHolder(AyatHolder holder, int position) {
        holder.setContent(getItem(position));
    }

    class AyatHolder extends RecyclerView.ViewHolder {

        @BindViews({R.id.rowAyat, R.id.rowArabic, R.id.rowTerjemahan})
        List<TextView> rowAyat;

        AyatHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void setContent(Ayat ayat) {
            rowAyat.get(0).setText(ayat.getAyat());
            rowAyat.get(1).setText(ayat.getArab());
            rowAyat.get(2).setText(ayat.getTerjemahan());
        }
    }
}
