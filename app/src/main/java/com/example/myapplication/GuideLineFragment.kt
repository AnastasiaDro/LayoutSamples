package com.example.myapplication

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GuideLineFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GuideLineFragment : Fragment() {

    private lateinit var buttonBorder: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return (inflater.inflate(R.layout.fragment_guide_line, container, false) as ViewGroup)
    }



    companion object {
        fun create() = GuideLineFragment()
    }
}


