package com.example.applicationtwo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.applicationtwo.databinding.FragmentDictionaryBinding;


public class DictionaryFragment extends Fragment {
    private static final String TAG = "DictionaryFragment - kyu";
    //구식
    /*private static final DictionaryFragment newInstance(){
        return new DictionaryFragment();
    }*/
    FragmentDictionaryBinding dictionaryBinding = null;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentDictionaryBinding mBinding = FragmentDictionaryBinding.inflate(inflater,container,false);
        dictionaryBinding = mBinding;
        return dictionaryBinding.getRoot();
    }

    @Override
    public void onDestroyView() {
        dictionaryBinding = null;
        super.onDestroyView();
    }
}