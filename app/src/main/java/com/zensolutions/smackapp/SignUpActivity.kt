package com.zensolutions.smackapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sign_up.*
import java.util.*

class SignUpActivity : AppCompatActivity() {

    var userProfilePic= "profileDefault"
    var userProfilePicColor= "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }


    fun SignUpSubmitClicked(view: View){

    }

    fun ChangeProfilePicture(view: View){
        val random= Random()
        val color = random.nextInt(2)
        val avatar= random.nextInt(28)

        if(color == 0){
            userProfilePic= "light$avatar"
        }
        else {
            userProfilePic = "dark$avatar"
        }
        val resourceID= resources.getIdentifier(userProfilePic, "drawable", packageName)
        signUpProfilePicture.setImageResource(resourceID)
    }

    fun SignUpChangePictureBackground(view: View){
        val random= Random()
        val r = random.nextInt(255)
        val g= random.nextInt(255)
        val b= random.nextInt(255)

        signUpProfilePicture.setBackgroundColor(Color.rgb(r,g,b))

        val savedR = r.toDouble() / 255
        val savedG= r.toDouble() /255
        val savedB= r.toDouble() /255

        userProfilePicColor= "[$savedR, $savedG, $savedB, 1]"
    }
}
