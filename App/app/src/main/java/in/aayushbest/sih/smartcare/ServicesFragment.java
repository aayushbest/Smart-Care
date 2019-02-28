package in.aayushbest.sih.smartcare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import in.aayushbest.sih.smartcare.helper.AlertDialogCreator;


public class ServicesFragment extends Fragment {

    private Button mWashingMachineButton;
    private Button mComputerButton;
    private Button mAirConditionButton;
    public ServicesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_services, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mWashingMachineButton=getActivity().findViewById(R.id.service_washing_machine);
        mWashingMachineButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialogCreator dialogCreator=new AlertDialogCreator(getContext(),"Service Message",R.string.message_role_selection);
                dialogCreator.showDialog();
            }
        });

    }
}