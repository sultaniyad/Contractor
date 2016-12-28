package com.iyad.sultan.contractor.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iyad.sultan.contractor.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FnWorkerExpireDate extends Fragment {


    public FnWorkerExpireDate() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_worker_expire_date, container, false);
    }

}
