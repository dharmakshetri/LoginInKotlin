package co.prandroid.logininkotlin.view

/**
 * Created by dharmakshetri on 6/27/17.
 */
interface LoginView {
    fun  getUserName(): String
    fun  showUserNameError(resId: Int)
    fun  getPassword(): String
    fun  showPasswordError(resId: Int)
    fun startActivity()
    fun  showLoginError(resId: Int)


}