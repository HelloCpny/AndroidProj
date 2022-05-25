package com.example.applicationtwo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.applicationtwo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    companion object{
        private const val TAG = "HomeFragment - seon"
        //구식
//        fun newInstance():HomeFragment{
//            return HomeFragment()
//        }
    }
    private var homeBinding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mBinding = FragmentHomeBinding.inflate(inflater,container,false)
        homeBinding = mBinding

        return homeBinding?.root
    }

    override fun onDestroyView() {
        homeBinding = null
        super.onDestroyView()

    }

}