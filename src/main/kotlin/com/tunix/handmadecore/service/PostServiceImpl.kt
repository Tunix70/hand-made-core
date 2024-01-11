package com.tunix.handmadecore.service

import com.tunix.handmadecore.entity.Post
import com.tunix.handmadecore.mapper.PostMerger
import com.tunix.handmadecore.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(
    private val postRepository: PostRepository,
    private val postMerger: PostMerger
) : PostService {
    override fun getPosts(): List<Post> {
        return postRepository.findAll()
    }

    override fun getPostById(id: Int): Post {
        return postRepository.findById(id).orElseThrow { RuntimeException("Post with $id was not found") }
    }

    override fun createPost(post: Post): Post {
        return postRepository.insert(post)
    }

    override fun updatePost(post: Post): Post {
        val savedPost = getPostById(post.id!!)
        return postRepository.insert(postMerger.mergePosts(savedPost, post))
    }

    override fun deletePost(postId: Int) {
        val isPostExisted = postRepository.existsById(postId)
        if (isPostExisted) {
            postRepository.deleteById(postId)
        } else {
            throw RuntimeException("Post with $postId was not found")
        }
    }
}