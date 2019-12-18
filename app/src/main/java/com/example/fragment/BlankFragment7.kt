package com.example.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.fragment.databinding.FragmentBlankBinding
import com.example.fragment.databinding.FragmentBlankFragment7Binding

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment7 : Fragment(),View.OnClickListener {

    lateinit var binding: FragmentBlankFragment7Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_blank_fragment7,container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.click=this
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.btnFive-> v.findNavController().navigate(R.id.action_blankFragment7_to_blankFragment5)

        }
    }
}
