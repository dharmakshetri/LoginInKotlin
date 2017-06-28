package co.prandroid.logininkotlin.service

/**
 * Created by dharmakshetri on 6/27/17.
 */
open class LoginService {

    companion object{
         val USERNAME="username"
         val PASSWORD="password"
    }
   open fun  loginStart(username: String, password: String): Boolean {
        return "dharma".equals(username) && "kotlin".equals(password)
    }


}