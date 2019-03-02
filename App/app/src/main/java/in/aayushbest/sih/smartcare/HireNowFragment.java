package in.aayushbest.sih.smartcare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import in.aayushbest.sih.smartcare.helper.HireNowListAdapter;
import in.aayushbest.sih.smartcare.helper.HirePerson;

public class HireNowFragment extends Fragment{

    public static final int PERSON_SIZE=12;
    private RecyclerView mHireNowPeople;
    private HireNowListAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hire_now,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<HirePerson> mPersonList = new ArrayList<HirePerson>(PERSON_SIZE);
        String[] posts = getActivity().getResources().getStringArray(R.array.hireNow_array);
        int[] images = new int[]{R.drawable.software_engineer, R.drawable.electrician, R.drawable.physiologist, R.drawable.audiologist, R.drawable.physicaltherapy, R.drawable.information_security_analyst, R.drawable.data_administrator, R.drawable.design_engineer, R.drawable.automation_engineer, R.drawable.finance_planner, R.drawable.project_manager, R.drawable.freelance_consultant};
        for (int i = 0; i <PERSON_SIZE; ++i) {
            mPersonList.add(new HirePerson(posts[i], images[i]));
        }
        mAdapter = new HireNowListAdapter(getActivity().getApplicationContext(), mPersonList);
        mHireNowPeople = getActivity().findViewById(R.id.recycler_hireNow);
        mHireNowPeople.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mHireNowPeople.setAdapter(mAdapter);
    }
}