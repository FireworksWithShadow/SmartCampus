package com.example.len.smart_campus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private GridView mMenuGrid;

    private OnFragmentInteractionListener mListener;

    int[] mainInterfaceImageIDs= {
            R.mipmap.ic_home_image_demo,
            R.mipmap.ic_home_image_demo,
            R.mipmap.ic_home_image_demo,
            R.mipmap.ic_home_image_demo,
            R.mipmap.ic_home_image_demo,
            R.mipmap.ic_home_image_demo,
            R.mipmap.ic_home_image_demo,
            R.mipmap.ic_home_image_demo,
            R.mipmap.ic_home_image_demo,
            R.mipmap.ic_home_image_demo,
    };
    String[] mainInterfaceStr= {
            "textdemo",
            "textdemo",
            "textdemo",
            "textdemo",
            "textdemo",
            "textdemo",
            "textdemo",
            "textdemo",
            "textdemo",
            "textdemo",
    };




    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mMenuGrid = (GridView)view.findViewById(R.id.menu_grid);
        //home菜单生成动态数组，传入数据
        ArrayList<HashMap<String, Object>> lstItems = new ArrayList<HashMap<String,Object>> ();
        for( int i = 0;i <mainInterfaceImageIDs.length;i++){
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put( "menu_image", mainInterfaceImageIDs[i]);
            map.put( "menu_text", mainInterfaceStr[i]);
            lstItems.add(map);
        }

        SimpleAdapter imageItems = new SimpleAdapter( getActivity(), lstItems, R.layout.fragment_home_grid_items ,
                new String[]{ "menu_image", "menu_text"}, new int[]{R.id. menu_image,R.id. menu_text});
        mMenuGrid.setAdapter(imageItems);
        //home点击事件
        mMenuGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                switch (position){
                    case 0 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                    case 1 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                    case 2 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                    case 3 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                    case 4 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                    case 5 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                    case 6 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                    case 7 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                    case 8 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                    case 9 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                    case 10 :
                        intent.setClassName("com.example.len.smart_campus","com.example.len.smart_campus.AfterLoginActivity");
                        startActivity(intent);
                        break;
                }
            }
        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
