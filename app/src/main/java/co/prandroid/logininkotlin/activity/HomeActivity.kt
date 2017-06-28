package co.prandroid.logininkotlin.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import co.prandroid.logininkotlin.R
import co.prandroid.logininkotlin.presenter.LoginPresenter
import co.prandroid.logininkotlin.service.LoginService
import co.prandroid.logininkotlin.view.LoginView
import kotlinx.android.synthetic.main.home_activity.*

/**
 * Created by dharmakshetri on 6/28/17.
 */
class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        val username= intent.getStringExtra(LoginService.USERNAME)
        val password= intent.getStringExtra(LoginService.PASSWORD)

        textViewUsername.text="UserName: $username"
        textViewPassword.text="Password: $password"



    }
}