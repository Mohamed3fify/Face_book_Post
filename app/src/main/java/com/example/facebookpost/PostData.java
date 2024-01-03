package com.example.facebookpost;

public class PostData { // data class
    int pageImg;
    int worldWide;
    int postImg;
    int likeCountIcon;
    int shareCountImg;
    int likeIcon;
    int commentIcon;
    int shareIcon;

    String postTime;
    String pageName;
    String detailsBtn;
    String post;
    String likeCount;
    String shareCount;
    String likeBtn;
    String commentBtn;
    String shareBtn;

 public PostData(int pageImg, int worldWide, int postImg, int likeCountIcon, int shareCountImg,
                 int likeIcon, int commentIcon, int shareIcon, String postTime, String pageName,
                 String detailsBtn, String post, String likeCount, String shareCount, String likeBtn,
                 String commentBtn, String shareBtn) {
  this.pageImg = pageImg;
  this.worldWide = worldWide;
  this.postImg = postImg;
  this.likeCountIcon = likeCountIcon;
  this.shareCountImg = shareCountImg;
  this.likeIcon = likeIcon;
  this.commentIcon = commentIcon;
  this.shareIcon = shareIcon;
  this.postTime = postTime;
  this.pageName = pageName;
  this.detailsBtn = detailsBtn;
  this.post = post;
  this.likeCount = likeCount;
  this.shareCount = shareCount;
  this.likeBtn = likeBtn;
  this.commentBtn = commentBtn;
  this.shareBtn = shareBtn;
 }
}
