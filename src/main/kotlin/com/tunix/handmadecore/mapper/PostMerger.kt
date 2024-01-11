package com.tunix.handmadecore.mapper

import com.tunix.handmadecore.entity.Post
import org.mapstruct.Context
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface PostMerger {
    fun mergePosts(savedPost: Post, @Context newPost: Post): Post
}