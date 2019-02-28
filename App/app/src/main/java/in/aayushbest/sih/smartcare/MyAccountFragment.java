package in.aayushbest.sih.smartcare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import in.aayushbest.sih.smartcare.helper.AlertDialogCreator;

public class MyAccountFragment extends Fragment {
    private Button mModifyDetailsButton;
    private Button mProfilePhoto;
    private Button mUPIDetails;
    private Button mPasswordDetails;
    private ImageView mProfilePicture;
    private TextView mNameTextView;
    private TextView mEmailTextVIew;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_account,container,false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mModifyDetailsButton=getActivity().findViewById(R.id.button_modify_details);
        mProfilePhoto=getActivity().findViewById(R.id.button_profile_picture);
        mProfilePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialogCreator dialogCreator=new AlertDialogCreator(getContext(),"Hello World","This is an Alert Dialog");
                dialogCreator.showDialog();
            }
        });
    }
}
