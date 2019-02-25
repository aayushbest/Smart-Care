package in.aayushbest.sih.smartcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LoginActivity extends AppCompatActivity {

    private Spinner mRoleSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void loginDashboard(View view) {
        Intent intent=new Intent(this,CustomerDashboard.class);
        startActivity(intent);

    }
}
