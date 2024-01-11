package com.tunix.handmadecore.facade

import com.tunix.handmadecore.dto.CreatePostDto
import com.tunix.handmadecore.dto.PostDto
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

    fun getPostById(id: Int): PostDto {
        return postMapper.toDto(postService.getPostById(id))
    }

    fun createPost(postDto: CreatePostDto): PostDto {
        val post = postMapper.mapCreatePostDtoToPost(postDto)
        val savedPost = postService.createPost(post)
        return postMapper.toDto(savedPost)
    }

    fun updatePost(postDto: PostDto): PostDto {
        val post = postMapper.toEntity(postDto)
        return postMapper.toDto(post)
    }

    fun deletePost(id:Int) = postService.deletePost(id)
}