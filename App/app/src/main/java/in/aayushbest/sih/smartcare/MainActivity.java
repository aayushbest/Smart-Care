package in.aayushbest.sih.smartcare;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG =MainActivity.class.getSimpleName();
    public static final String EXTRA_TAG="in.aayushbest.smartcare.MainActivity";
    private Button mJoinButton;
    private RadioButton mCustomerRadioButton;
    private RadioButton mFreelancerRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mJoinButton=(Button)findViewById(R.id.join);
        mCustomerRadioButton=(RadioButton)findViewById(R.id.radio_customer);
        mFreelancerRadioButton=(RadioButton)findViewById(R.id.radio_provider);
    }

    public void joinService(View view) {
        String role=null;
        if(mCustomerRadioButton.isChecked()) {
            role=mCustomerRadioButton.getText().toString();
            Intent i = new Intent(getApplicationContext(),RegisterFreelancerActivity.class);
            i.putExtra(EXTRA_TAG,role);
            startActivity(i);
        }else if(mFreelancerRadioButton.isChecked()) {
            role=mFreelancerRadioButton.getText().toString();
            Intent i = new Intent(getApplicationContext(),RegisterFreelancerActivity.class);
            i.putExtra(EXTRA_TAG,role);
            startActivity(i);
        }else {
           Toast.makeText(getApplicationContext(), "Please select a role to join", Toast.LENGTH_SHORT).show();
        }

    }

    public void loginService(View view) {
        Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }
}
