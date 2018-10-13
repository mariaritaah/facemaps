package br.com.facemaps.facemaps.activity.domain

import br.com.facemaps.facemaps.activity.domain.retrofit.IUsuarioREST

object UsuarioService {

    private var service: IUsuarioREST

    init {
        service = RetrofitService.getUsuarioService()
    }

    fun cadastrar(usuario: Usuario): Usuario? {
        return service.cadastrar(usuario).execute().body()
    }

    fun logar(username: String, password: String): Token? {
        return service.logar(username, password).execute().body()
    }

}