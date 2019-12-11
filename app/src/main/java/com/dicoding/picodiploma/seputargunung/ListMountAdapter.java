package com.dicoding.picodiploma.seputargunung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMountAdapter extends RecyclerView.Adapter<ListMountAdapter.ListViewHolder> {

    private ArrayList<Mount> listMount;
    public ListMountAdapter(ArrayList<Mount> list){
        this.listMount = list;
    }

    private OnItemClickCallBack onItemClickCallBack;
    public  void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_mount, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Mount mount = listMount.get(position);
        Glide.with(holder.itemView.getContext())
                .load(mount.getPhoto())

                .into(holder.imgPhoto);
        holder.tvName.setText(mount.getName());
        holder.tvDetail.setText(mount.getDetail());
        holder.tvTrack.setText(mount.getTrack());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallBack.onItemClicked(listMount.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listMount.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvTrack;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvTrack = itemView.findViewById(R.id.tv_item_track);
        }
    }

    public interface OnItemClickCallBack{
        void onItemClicked(Mount data);
    }
}
