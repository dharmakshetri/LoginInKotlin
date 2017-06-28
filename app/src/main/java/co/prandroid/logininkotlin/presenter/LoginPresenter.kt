package co.prandroid.logininkotlin.presenter

import co.prandroid.logininkotlin.R
import co.prandroid.logininkotlin.service.LoginService
import co.prandroid.logininkotlin.view.LoginView

/**
 * Created by dharmakshetri on 6/27/17.
 */
 open class LoginPresenter(private val view: LoginView?, private  val service: LoginService?) {

    /*private var view: LoginView?
    private var service: LoginService?

    constructor(view: LoginView?, service: LoginService?){
        this.view=view
        this.service=service
    }*/



    fun onLoginButtonClick() {

        var username= view!!.getUserName()
        var password = view!!.getPassword()
        if (username.isEmpty()){
            view!!.showUserNameError(R.string.username_error)
            return
        }
        if(password.isEmpty()){
            view!!.showPasswordError(R.string.password_error)
            return
        }

        val success:Boolean = service!!.loginStart(username,password)

        if(success){
            view!!.startActivity()
            return
        }
        view.showLoginError(R.string.login_error)
    }

}


