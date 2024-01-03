package com.example.facebookpost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.facebookpost.databinding.ActivityPostBinding;

import java.util.ArrayList;
import java.util.List;

public class Post extends AppCompatActivity {

    ActivityPostBinding binding;
    RecyclerView recyclerViewPost;
    PostsRecycleAdapter adapter;
    List<PostData> postList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPostBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        recyclerViewPost = binding.recyclePost;
        createContactList();
        adapter =new PostsRecycleAdapter(postList);
       recyclerViewPost.setAdapter(adapter);
    }

    private void createContactList() {
        postList = new ArrayList<>(200);
        for (int i=0; i<200; i++){
            postList.add(new PostData(R.drawable.splash_screen , R.drawable.worldwide ,R.drawable.android_studio,
                   R.drawable.like_icon2,R.drawable.splash_screen,R.drawable.like1 ,R.drawable.comment,R.drawable.share,
                    "2 hrs" , "Route" , "..." , "Check this link for android course details\n" +
                    "https://www.linkedin.com/company/routeacademy/" , "12",
                    "1 Share" , "Like", "Comment","Share"));
        }
    }
}