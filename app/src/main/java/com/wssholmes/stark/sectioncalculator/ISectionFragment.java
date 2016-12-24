package com.wssholmes.stark.sectioncalculator;


import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ISectionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ISectionFragment extends Fragment {

    private static final String LOG_TAG = ISectionFragment.class.getSimpleName();

    private NestedScrollView mScrollView;
    private CoordinatorLayout mLayout;

    public ISectionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ISectionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ISectionFragment newInstance(String param1, String param2) {
        ISectionFragment fragment = new ISectionFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_isection, container, false);

        mScrollView = (NestedScrollView) rootView.findViewById(R.id.i_section_scroll_view);
        mLayout = (CoordinatorLayout) rootView.findViewById(R.id.i_section_layout);

        return rootView;
    }

}
