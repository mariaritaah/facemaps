package br.com.facemaps.facemaps.activity.domain

import br.com.facemaps.facemaps.activity.domain.retrofit.IPostREST
import br.com.facemaps.facemaps.activity.domain.retrofit.IUsuarioREST
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {

    private val URL = "http://facemasp.in4.com.br"
    private var service: Retrofit

    init {
        service = Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    fun getPostService() = service.create(IPostREST::class.java)

    fun getUsuarioService() = service.create(IUsuarioREST::class.java)

}