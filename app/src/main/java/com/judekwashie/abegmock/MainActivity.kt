package com.judekwashie.abegmock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.transition.Scene
import androidx.transition.Transition
import androidx.transition.TransitionInflater
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var scene1: Scene
    private lateinit var scene2: Scene
    private lateinit var transition: Transition

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scene1 = Scene.getSceneForLayout(fragmentContainer, R.layout.scene1, this)
        scene2 = Scene.getSceneForLayout(fragmentContainer, R.layout.scene2, this)

        transition = TransitionInflater.from(this).inflateTransition(R.transition.shared_transition)

        scene1.enter()




    }



    fun onClickLogin1(view: View){
        TransitionManager.go(scene1, transition)
    }

    fun onClickSignUp1(view: View){
        TransitionManager.go(scene2, transition)
    }

    fun onClickLogin2(view: View){
        TransitionManager.go(scene1, transition)
    }

    fun onClickSignUp2(view: View){
        TransitionManager.go(scene2, transition)
    }

}