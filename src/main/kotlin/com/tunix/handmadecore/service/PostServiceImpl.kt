package com.tunix.handmadecore.service

import com.tunix.handmadecore.entity.Post
import com.tunix.handmadecore.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(private val postRepository: PostRepository): PostService {
    override fun getPosts(): List<Post> {
        return postRepository.findAll()
    }

    override fun createPost(post: Post): Post {
        return postRepository.insert(post)
    }

    override fun updatePost(post: Post): Post {
        return postRepository.insert(post)
    }

    override fun deletePost(postId: Int) {
        postRepository.deleteById(postId)
    }
}