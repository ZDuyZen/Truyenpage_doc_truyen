package com.example.truyen_page.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.truyen_page.Object.HomeDoctruyen;
import com.example.truyen_page.R;

import java.util.List;

public class homeDocTruyenAdapter extends RecyclerView.Adapter<homeDocTruyenAdapter.homeDocTruyenViewHolder> {

    private Context mContext;
    private List<HomeDoctruyen> mListHomeDoctruyen;

    public void setData_HomeDoctruyen(List<HomeDoctruyen> list) {
        this.mListHomeDoctruyen = list;
        notifyDataSetChanged();
    }

    public homeDocTruyenAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public homeDocTruyenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_homedoctruyen, parent, false);
        return new homeDocTruyenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull homeDocTruyenViewHolder holder, int position) {

        HomeDoctruyen home = mListHomeDoctruyen.get(position);

        if (home == null) {
            return;
        }
        holder.tvTenTruyen.setText(home.getTenTruyen());
        holder.tvTenTacGia.setText(home.getTenTacGia());
        holder.tvTenChuong.setText(home.getTenChuong());
        Glide.with(mContext)
                .load(home.getAnhBiaTruyen())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imgAnhBia);


    }

    @Override
    public int getItemCount() {
        if (this.mListHomeDoctruyen != null) {
            return this.mListHomeDoctruyen.size();
        }
        return 0;
    }

    public class homeDocTruyenViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTenTruyen;
        private TextView tvTenTacGia;
        private TextView tvTenChuong;
        private ImageView imgAnhBia;

        public homeDocTruyenViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTenTruyen = itemView.findViewById(R.id.tv_tenTruyen);
            tvTenTacGia = itemView.findViewById(R.id.tv_tenTacGia);
            tvTenChuong = itemView.findViewById(R.id.tv_tenChuong);

            imgAnhBia = (ImageView) itemView.findViewById(R.id.img_anhbia);

        }
    }
}
