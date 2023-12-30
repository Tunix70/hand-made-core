package com.tunix.handmadecore.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("t_post")
@Data
@NoArgsConstructor
@AllArgsConstructor
class Post {
    @Id
    var id: Int? = null
    var title: String? = null
    var description: String? = null
}