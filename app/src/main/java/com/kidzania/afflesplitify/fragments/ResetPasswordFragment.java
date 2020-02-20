package com.kidzania.afflesplitify.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.kidzania.afflesplitify.R;

public class ResetPasswordFragment extends Fragment {

    View selectedTab;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.forgetpassword_fragment, container, false);
        selectedTab=  root.findViewById(R.id.tabEmail);
        selectedTab.setSelected(true);

        selectedTab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d("Hello","onclick");
                switch (v.getId())
                {
                    case R.id.tabEmail:
                        v.setSelected(true);

                        break;

                    case R.id.tabphone:
                        v.setSelected(true);
                        break;

                }
                if(selectedTab!=null&&selectedTab!=v)
                    selectedTab.setSelected(false);
                selectedTab=v;
            }
        });
        return  root;
    }

}
