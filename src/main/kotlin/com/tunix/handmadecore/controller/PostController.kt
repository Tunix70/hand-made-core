package com.tunix.handmadecore.controller

import com.tunix.handmadecore.dto.PostDto
import com.tunix.handmadecore.facade.PostFacade
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/posts")
@RequiredArgsConstructor
class PostController(private val postFacade: PostFacade) {
    @GetMapping
    fun getPostsDto(): List<PostDto> {
        return postFacade.getPostDtos()
    }

    @PostMapping
    fun createPost(): PostDto {
        return postFacade.createPost();
    }
}