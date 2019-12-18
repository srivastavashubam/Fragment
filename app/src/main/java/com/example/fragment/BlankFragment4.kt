package com.example.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.fragment.databinding.FragmentBlankFragment2Binding
import com.example.fragment.databinding.FragmentBlankFragment4Binding

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment4 : Fragment(), View.OnClickListener {
    override fun onClick(v: View) {
        when(v.id){
            R.id.btnThird-> v.findNavController().navigate(R.id.action_blankFragment4_to_blankFragment3)
            R.id.btnFive-> v.findNavController().navigate(R.id.action_blankFragment4_to_blankFragment5)
            R.id.btnSeven-> v.findNavController().navigate(R.id.action_blankFragment4_to_blankFragment7)
        }

    }

    lateinit var binding: FragmentBlankFragment4Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_blank_fragment4, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.click = this
    }


}
