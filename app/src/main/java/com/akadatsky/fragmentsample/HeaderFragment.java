package com.akadatsky.fragmentsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HeaderFragment extends Fragment {

    public static final String NAME = "name";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_header, container, false);
        Bundle args = getArguments();
        String name = args.getString(NAME);
        TextView textView = view.findViewById(R.id.text);
        textView.setText(name);
        return view;
    }
}
