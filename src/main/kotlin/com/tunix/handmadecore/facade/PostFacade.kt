package com.tunix.handmadecore.facade

import com.tunix.handmadecore.dto.PostDto
import com.tunix.handmadecore.entity.Post
import com.tunix.handmadecore.mapper.PostMapper
import com.tunix.handmadecore.service.PostService
import org.springframework.stereotype.Service

@Service
class PostFacade(
    private val postService: PostService,
    private val postMapper: PostMapper
) {
    fun getPostDtos(): List<PostDto> {
        val posts = postService.getPosts()
        return posts.stream()
            .map(postMapper::toDto)
            .toList()
    }

    fun createPost(): PostDto {
        val post = Post()
        post.id = 1
        post.title = "The one"
        post.description = "desc"
        val savedPost = postService.createPost(post)
        return postMapper.toDto(savedPost)
    }
}