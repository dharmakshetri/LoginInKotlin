package co.prandroid.logininkotlin.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import co.prandroid.logininkotlin.R
import co.prandroid.logininkotlin.service.LoginService
import co.prandroid.logininkotlin.view.LoginView
import co.prandroid.logininkotlin.presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), LoginView {
    private var loginpresenter: LoginPresenter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginpresenter = LoginPresenter(this, LoginService())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
    }


    override fun startActivity() {
        val intent= Intent(this,HomeActivity::class.java)
        intent.putExtra(LoginService.USERNAME,"dharma")
        intent.putExtra(LoginService.PASSWORD,"kotlin")
        startActivity(intent)

    }

    fun loginClick(view: View){
        loginpresenter!!.onLoginButtonClick()

    }

    override fun getUserName(): String {
        return editTextUserName.text.toString()
    }

    override fun showUserNameError(resId: Int) {
        editTextUserName.error = getString(resId)
    }

    override fun getPassword(): String {
        return editTextPassword.text.toString()
    }

    override fun showPasswordError(resId: Int) {
      editTextPassword.error=getString(resId)
    }

    // private var service:LoginService?=null
    override fun showLoginError(resId: Int) {
        Toast.makeText(this,getString(resId),Toast.LENGTH_SHORT).show()
    }
}


