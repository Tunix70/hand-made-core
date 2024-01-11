package com.tunix.handmadecore.controller

import com.tunix.handmadecore.dto.CreatePostDto
import com.tunix.handmadecore.dto.PostDto
import com.tunix.handmadecore.facade.PostFacade
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/posts")
@RequiredArgsConstructor
class PostController(private val postFacade: PostFacade) {
    @GetMapping
    fun getPosts(): List<PostDto> = postFacade.getPostDtos()

    @GetMapping("/{id}")
    fun getPostById(@PathVariable id: Int): PostDto = postFacade.getPostById(id)

    @PostMapping
    fun createPost(@RequestBody createPostDto: CreatePostDto): PostDto = postFacade.createPost(createPostDto)

    @PutMapping
    fun updatePost(@RequestBody postDto: PostDto): PostDto = postFacade.updatePost(postDto)

    @DeleteMapping
    fun deletePost(id: Int) = postFacade.deletePost(id)
}