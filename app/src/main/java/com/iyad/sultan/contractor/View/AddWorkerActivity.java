package com.iyad.sultan.contractor.View;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.iyad.sultan.contractor.R;

import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by salkhmis on 12/17/2016.
 */

public class AddWorkerActivity extends AppCompatActivity implements View.OnClickListener {

    static int selectedEditText;
    static Date Iqama_Issue_date;
    static Date Iqama_expire_date;
    @BindView(R.id.input_issue_date)
    EditText iqamaIssueDate;
    @BindView(R.id.input_expire_date)
    EditText iqamaExpireDate;
    @BindView(R.id.btn_add_worker)
    Button btnAddWorker;

    //delete old dates
    private void flushDates() {
        Iqama_Issue_date = null;
        Iqama_expire_date = null;
        selectedEditText =  0;
    }

    //set all Listeners
    private void setAllListener() {
        iqamaIssueDate.setOnClickListener(this);
        iqamaIssueDate.setOnClickListener(this);

    }

    //show Date picker
    public void showDatePicker() {
        new DatePickerFragment().show(getFragmentManager(), "datePicker :)");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_worker_layout);
        ButterKnife.bind(this);
        flushDates();
        setAllListener();


    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_add_worker:
                break;
            case R.id.input_issue_date:
                selectedEditText = 1;
                showDatePicker();
                break;
            case R.id.input_expire_date:
                selectedEditText = 2;
                showDatePicker();
                break;
            default:
                Toast.makeText(this, "???", Toast.LENGTH_SHORT).show();

        }
    }


    public static class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar calendar = Calendar.getInstance();
            int yy = calendar.get(Calendar.YEAR);
            int mm = calendar.get(Calendar.MONTH);
            int dd = calendar.get(Calendar.DAY_OF_MONTH);

            return new DatePickerDialog(getActivity(), this, yy, mm, dd);
        }

        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int day) {

            final Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, day,0,0,0);


            if (selectedEditText == 1) {
                Iqama_Issue_date = calendar.getTime();
                updateEditTextIssueDate();
            } else if (selectedEditText == 2){
                Iqama_expire_date = calendar.getTime();
                updateEditTextExpireDate();
            }


        }

        private void updateEditTextExpireDate() {

        }

        private void updateEditTextIssueDate() {

        }


    }


}
