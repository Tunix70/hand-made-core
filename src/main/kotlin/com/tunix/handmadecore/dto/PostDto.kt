package com.tunix.handmadecore.dto

import lombok.Value

@Value
open class PostDto {
    var id: Int? = null
    var title: String? = null
    var description: String? = null
}