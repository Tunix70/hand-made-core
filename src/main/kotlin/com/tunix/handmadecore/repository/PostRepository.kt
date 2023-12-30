package com.tunix.handmadecore.repository

import com.tunix.handmadecore.entity.Post
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository: MongoRepository<Post, Int>