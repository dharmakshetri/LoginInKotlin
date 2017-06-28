package co.prandroid.logininkotlin.presenter

import co.prandroid.logininkotlin.R
import co.prandroid.logininkotlin.service.LoginService
import co.prandroid.logininkotlin.view.LoginView
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.runners.MockitoJUnitRunner

import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify

/**
 * Created by dharmakshetri on 6/27/17.
 */
/*@RunWith(KotlinTestRunner::class)
@OpenedPackages("co.prandroid.logininkotlin")*/

@RunWith(MockitoJUnitRunner::class)
class LoginPresenterTest{

    @Mock
    lateinit var view:LoginView

    @Mock
    lateinit var service: LoginService

    lateinit var  presenter: LoginPresenter


    @Before
    fun setUp()
    {
        presenter=LoginPresenter(view, service)
    }

    @Test
    fun addtionTest(){

    }
    @Test
     fun showErrorMessageWhenUsernameFieldEmpty(){

        `when`(view!!.getUserName()).thenReturn("")
         presenter!!.onLoginButtonClick()

         verify(view!!).showUserNameError(R.string.username_error)

    }

    @Test
    fun showErrorMessageWhenPasswordFieldEmpty(){
        `when`(view!!.getPassword()).thenReturn("")
        presenter.onLoginButtonClick()

        verify(view!!).showPasswordError(R.string.password_error)
    }


    @Test
    fun bothUsernameAndPasswordCorrect(){
        `when`(view!!.getUserName()).thenReturn("dharma")
        `when`(view!!.getPassword()).thenReturn("kotlin")
        `when`(service!!.loginStart("dharma","kotlin")).thenReturn(true)

        presenter.onLoginButtonClick()

        verify(view!!).startActivity()
    }

}