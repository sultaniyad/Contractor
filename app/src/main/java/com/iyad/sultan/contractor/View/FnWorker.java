package com.iyad.sultan.contractor.View;


import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iyad.sultan.contractor.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FnWorker extends Fragment {


    public FnWorker() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fn_worker, container, false);
    }


}
