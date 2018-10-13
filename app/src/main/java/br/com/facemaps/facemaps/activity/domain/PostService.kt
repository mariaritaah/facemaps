package br.com.facemaps.facemaps.activity.domain

import br.com.facemaps.facemaps.activity.domain.retrofit.IPostREST

object PostService {

    private var service: IPostREST

    init {
        service = RetrofitService.getPostService()
    }

    fun getPosts(): List<Post>? {
        return service.getAll().execute().body()
    }

    fun savePost(post: Post): Boolean {
        return service.save(post).execute().isSuccessful
    }

    fun deletePost(id: Long): Boolean {
        return service.delete(id).execute().isSuccessful
    }

}