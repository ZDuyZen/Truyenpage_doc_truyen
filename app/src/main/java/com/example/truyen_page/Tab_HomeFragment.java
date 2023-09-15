package com.example.truyen_page;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.truyen_page.Adapter.homeDocTruyenAdapter;
import com.example.truyen_page.Api.Get_Api_homeTruyen;
import com.example.truyen_page.Object.HomeDoctruyen;
import com.example.truyen_page.interface_homeTruyen.interface_homeTruyen;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tab_HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab_HomeFragment extends Fragment implements interface_homeTruyen {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters

    private homeDocTruyenAdapter mAdapterHomeDoctruyen;
    private RecyclerView rcvHomeDocTruyen;

    private List<HomeDoctruyen> mListHomeDoctruyen;

    private View mView;




    public Tab_HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab_HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab_HomeFragment newInstance(String param1, String param2) {
        Tab_HomeFragment fragment = new Tab_HomeFragment();
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



        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_tab__home, container, false);
        initUI();
        loadData();
        return mView;
    }

    private void initUI() {
        rcvHomeDocTruyen = mView.findViewById(R.id.rcv_homeDocTruyen);
    }

    private void loadData() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        rcvHomeDocTruyen.setLayoutManager(linearLayoutManager);
        mAdapterHomeDoctruyen = new homeDocTruyenAdapter(getContext());

//        mAdapterHomeDoctruyen.setData_HomeDoctruyen(getList_HomeDocTruyen());
//        rcvHomeDocTruyen.setAdapter(mAdapterHomeDoctruyen);

        getList_Api_HomeDocTruyen();

    }

    private List<HomeDoctruyen> getList_HomeDocTruyen() {
        List<HomeDoctruyen> list = new ArrayList<HomeDoctruyen>();
        list.add(new HomeDoctruyen("Thế giới hoàn mỹ", "Thần Đông", "Chương 1:", "https://znews-photo.zingcdn.me/w480/Uploaded/ofh_btgazspf/2023_05_04/z4318820101865_8f01bb9b6070d9202b29724630629a8a.jpg"));
        list.add(new HomeDoctruyen("Già Thiên", "Thần Đông", "Chương 1:", ""));
        list.add(new HomeDoctruyen("Thần Mộ", "Thần Đông", "Chương 1:", ""));

        list.add(new HomeDoctruyen("Thế giới hoàn mỹ", "Thần Đông", "Chương 1:", "https://znews-photo.zingcdn.me/w480/Uploaded/ofh_btgazspf/2023_05_04/z4318820101865_8f01bb9b6070d9202b29724630629a8a.jpg"));
        list.add(new HomeDoctruyen("Già Thiên", "Thần Đông", "Chương 1:", ""));
        list.add(new HomeDoctruyen("Thần Mộ", "Thần Đông", "Chương 1:", ""));

        list.add(new HomeDoctruyen("Thế giới hoàn mỹ", "Thần Đông", "Chương 1:", "https://znews-photo.zingcdn.me/w480/Uploaded/ofh_btgazspf/2023_05_04/z4318820101865_8f01bb9b6070d9202b29724630629a8a.jpg"));
        list.add(new HomeDoctruyen("Già Thiên", "Thần Đông", "Chương 1:", ""));
        list.add(new HomeDoctruyen("Thần Mộ", "Thần Đông", "Chương 1:", ""));

        list.add(new HomeDoctruyen("Thế giới hoàn mỹ", "Thần Đông", "Chương 1:", "https://znews-photo.zingcdn.me/w480/Uploaded/ofh_btgazspf/2023_05_04/z4318820101865_8f01bb9b6070d9202b29724630629a8a.jpg"));
        list.add(new HomeDoctruyen("Già Thiên", "Thần Đông", "Chương 1:", ""));
        list.add(new HomeDoctruyen("Thần Mộ", "Thần Đông", "Chương 1:", ""));

        list.add(new HomeDoctruyen("Thế giới hoàn mỹ", "Thần Đông", "Chương 1:", "https://znews-photo.zingcdn.me/w480/Uploaded/ofh_btgazspf/2023_05_04/z4318820101865_8f01bb9b6070d9202b29724630629a8a.jpg"));
        list.add(new HomeDoctruyen("Già Thiên", "Thần Đông", "Chương 1:", ""));
        list.add(new HomeDoctruyen("Thần Mộ", "Thần Đông", "Chương 1:", ""));

        return list;

    }

    private void getList_Api_HomeDocTruyen() {
        new Get_Api_homeTruyen(this).execute();

    }
    @Override
    public void batdau() {

    }

    @Override
    public void ketthuc(String data) {
        List<HomeDoctruyen> list = new ArrayList<HomeDoctruyen>();

        try {
            JSONArray arr = new JSONArray(data);
            for (int i = 0; i < arr.length(); i++) {
                JSONObject o = arr.getJSONObject(i);
                list.add(new HomeDoctruyen(o));
            }
            mAdapterHomeDoctruyen.setData_HomeDoctruyen(list);
            rcvHomeDocTruyen.setAdapter(mAdapterHomeDoctruyen);
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void biLoi() {

    }
}