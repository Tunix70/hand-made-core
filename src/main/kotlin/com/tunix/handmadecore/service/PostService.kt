package com.tunix.handmadecore.service

import com.tunix.handmadecore.entity.Post

interface PostService {
    fun getPosts(): List<Post>
    fun createPost(post: Post): Post
    fun updatePost(post: Post): Post
    fun deletePost(postId: Int)
}