package com.example.applicationtwo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.applicationtwo.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {
    companion object{
        private const val TAG = "SearchFragment - seon"
        //구식
//        fun newinstance() : SearchFragment{
//            return SearchFragment()
//        }
    }
    private var searchBinding : FragmentSearchBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView: searchFragment")
        val mBinding = FragmentSearchBinding.inflate(inflater,container,false)
        searchBinding = mBinding
        return searchBinding?.root
    }

    override fun onDestroyView() {
        searchBinding = null
        super.onDestroyView()
    }
}