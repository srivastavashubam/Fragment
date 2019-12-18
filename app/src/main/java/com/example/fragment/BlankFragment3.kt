package com.example.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.fragment.databinding.FragmentBlankFragment2Binding
import com.example.fragment.databinding.FragmentBlankFragment3Binding




class BlankFragment3 : Fragment(),View.OnClickListener {

    lateinit var binding: FragmentBlankFragment3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_blank_fragment3,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.click=this
        if(view!=null) {
            }
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.btnFour-> v.findNavController().navigate(R.id.action_blankFragment3_to_blankFragment4)
        }


    }

}
