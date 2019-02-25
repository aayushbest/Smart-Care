package in.aayushbest.sih.smartcare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ProfilePictureFragment extends Fragment {

    private Button mUploadButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile_picture,container,false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
               super.onCreate(savedInstanceState);

    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mUploadButton=getActivity().findViewById(R.id.profile_uploadButton);
        mUploadButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Available Soon",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
