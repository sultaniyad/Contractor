package com.iyad.sultan.contractor.View;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import com.iyad.sultan.contractor.R;

import java.util.Calendar;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FnContracts extends Fragment {

  @BindView(R.id.btn_add_worker)Button btn_add_worker;
    public FnContracts() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contracts, container, false);
    }




}
