package com.example.facebookpost;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostsRecycleAdapter extends RecyclerView.Adapter<PostsRecycleAdapter.ViewHolder> {

    List<Posts> item;

    public PostsRecycleAdapter(List<Posts> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.posts,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Posts posts = item.get(position);
        holder.pageImg.setImageResource(posts.pageImg);
        holder.postImg.setImageResource(posts.postImg);
        holder.worldWide.setImageResource(posts.worldWide);
        holder.likeCountIcon.setImageResource(posts.likeCountIcon);
        holder.shareCountImg.setImageResource(posts.shareCountImg);
        holder.likeIcon.setImageResource(posts.likeIcon);
        holder.commentIcon.setImageResource(posts.commentIcon);
        holder.shareIcon.setImageResource(posts.shareIcon);
        //====================
        holder.pageName.setText(posts.pageName);
        holder.postTime.setText(posts.postTime);
        holder.post.setText(posts.post);
        holder.likeCount.setText(posts.likeCount);
        holder.shareCount.setText(posts.shareCount);
        //===================
        holder.detailsBtn.setText(posts.detailsBtn);
        holder.likeBtn.setText(posts.likeBtn);
        holder.commentBtn.setText(posts.commentBtn);
        holder.shareBtn.setText(posts.shareBtn);

    }


    @Override
    public int getItemCount() {
        if (item == null) return 0;
        return item.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView pageImg, worldWide, postImg, likeCountIcon, shareCountImg, likeIcon, commentIcon, shareIcon;
        TextView pageName , postTime, post ,likeCount , shareCount;
        Button detailsBtn , likeBtn , commentBtn ,shareBtn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Img and icons
           pageImg = itemView.findViewById(R.id.page_img);
           worldWide = itemView.findViewById(R.id.world_wide);
           postImg = itemView.findViewById(R.id.post_image);
            likeCountIcon = itemView.findViewById(R.id.like);
            shareCountImg = itemView.findViewById(R.id.share_image);
            likeIcon = itemView.findViewById(R.id.like_icon);
            commentIcon = itemView.findViewById(R.id.comment_icon);
            shareIcon = itemView.findViewById(R.id.share_icon);
            //========================================
            // Text View
            pageName = itemView.findViewById(R.id.page_name);
            postTime = itemView.findViewById(R.id.post_time);
            post = itemView.findViewById(R.id.post);
            likeCount = itemView.findViewById(R.id.like_count);
            shareCount = itemView.findViewById(R.id.sharesCount);
            //======================================
            // Buttons
            detailsBtn = itemView.findViewById(R.id.details_btn);
            likeBtn = itemView.findViewById(R.id.like_btn);
            commentBtn = itemView.findViewById(R.id.comment_btn);
            shareBtn = itemView.findViewById(R.id.share_btn);

        }
    }
}
