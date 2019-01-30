package com.example.howtofragment.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.howtofragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SatuFragment extends Fragment {

    public SatuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View v = inflater.inflate(R.layout.fragment_satu, container, false);
            Button btn1 = v.findViewById(R.id.btn1);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(),"ini toast 1",Toast.LENGTH_SHORT).show();
                }
            });
            return v;
        }
    }
