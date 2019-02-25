package in.aayushbest.sih.smartcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterFreelancerActivity extends AppCompatActivity {

    private TextView mRoleText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_freelancer);
        mRoleText=(TextView)findViewById(R.id.input_role);
        Intent intent=getIntent();
        String role=intent.getStringExtra(MainActivity.EXTRA_TAG);
        mRoleText.setText(role);
    }

    public void loginService(View view) {
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
