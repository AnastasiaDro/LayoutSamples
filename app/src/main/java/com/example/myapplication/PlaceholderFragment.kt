package com.example.myapplication

import android.os.Bundle
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Placeholder
import androidx.fragment.app.Fragment

class PlaceholderFragment : Fragment() {

    private lateinit var placeholder: Placeholder
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var layout: ConstraintLayout
    private lateinit var onClickListener: View.OnClickListener

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return (inflater.inflate(R.layout.fragment_placeholder, container, false) as ViewGroup)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        with(view) {
            super.onViewCreated(view, savedInstanceState)

            layout = findViewById(R.id.constraint_with_placeholder)
            placeholder = findViewById(R.id.placeholder)
            button2 = findViewById(R.id.button2)
            button3 = findViewById(R.id.button3)

            onClickListener = View.OnClickListener {
                TransitionManager.beginDelayedTransition(layout)
                placeholder.setContentId(it.id) }

            button2.setOnClickListener(onClickListener)
            button3.setOnClickListener(onClickListener)
        }

    }



}