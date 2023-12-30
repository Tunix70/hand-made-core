package com.tunix.handmadecore.mapper

import com.tunix.handmadecore.dto.PostDto
import com.tunix.handmadecore.entity.Post
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface PostMapper: Mappable<Post, PostDto>