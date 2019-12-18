package com.example.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

import androidx.navigation.findNavController
import com.example.fragment.databinding.FragmentBlankBinding


class BlankFragment : Fragment(),View.OnClickListener {

lateinit var binding:FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_blank,container,false)
        return binding.root
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.click=this
    }
    override fun onClick(view: View) {
        when(view.id){
            R.id.btnTwo->view.findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)
            R.id.btnSix->view.findNavController().navigate(R.id.action_blankFragment_to_blankFragment6)
        }

    }
}
