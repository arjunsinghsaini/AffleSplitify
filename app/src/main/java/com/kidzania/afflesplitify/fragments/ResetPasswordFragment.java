package com.kidzania.afflesplitify.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.kidzania.afflesplitify.R;

public class ResetPasswordFragment extends Fragment implements  View.OnClickListener{

    View selectedTab, tabPhone,tabEmail;
    EditText emailView, phoneView ;
    Button resetButton ;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.forgetpassword_fragment, container, false);
        tabEmail=  root.findViewById(R.id.tabEmail);
        tabPhone=  root.findViewById(R.id.tabphone);
        emailView = root.findViewById(R.id.emailView);
        phoneView = root.findViewById(R.id.phoneView);
        resetButton  = root.findViewById(R.id.resetbutton);
        resetButton.setText("Reset Button");
        tabPhone.setOnClickListener(this);
        tabEmail.setOnClickListener(this);

        phoneView.setVisibility(View.GONE);
        tabEmail.setSelected(true);
        return  root;
    }


    private void hide()
    {
        phoneView.setVisibility(View.GONE);
        emailView.setVisibility(View.GONE);
    }
    public void onClick(View v)
    {
        Log.d("Hello","onclick");
        hide();
        switch (v.getId())
        {
            case R.id.tabEmail:
                v.setSelected(true);
                emailView.setVisibility(View.VISIBLE);
                break;

            case R.id.tabphone:
                v.setSelected(true);
                phoneView.setVisibility(View.VISIBLE);
                break;

        }
        if(selectedTab!=null&&selectedTab!=v)
            selectedTab.setSelected(false);
        selectedTab=v;
    }
}
