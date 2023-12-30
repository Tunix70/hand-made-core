package com.tunix.handmadecore.mapper

interface Mappable<M, D> {
    fun toEntity(d: D): M
    fun toDto(m: M): D
}