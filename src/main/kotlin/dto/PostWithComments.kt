package org.example.dto

data class PostWithComments(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor>,
)

data class CommentWithAuthor(
    val post: Comment,
    val author: Author,
)