package in.aayushbest.sih.smartcare;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomerDashboard extends AppCompatActivity {

    private static final String TAG =CustomerDashboard.class.getSimpleName() ;
    private DrawerLayout mDrawerLayout;
    private BottomNavigationView mBottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_dashboard);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar action=getSupportActionBar();
        action.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
        action.setDisplayHomeAsUpEnabled(true);
        mBottomNavigationView=findViewById(R.id.bottom_nav);
        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    item.setChecked(false);
                    mDrawerLayout.closeDrawers();
                mBottomNavigationView.setVisibility(View.VISIBLE);
                if(!item.isChecked())
                    mBottomNavigationView.setVisibility(View.VISIBLE);
                //TODO:more code here later
                return true;
            }
        });
        Fragment profileFragment=new ProfilePictureFragment();
        Fragment serviceFragment=new ServicesFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fm.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,profileFragment);
        fragmentTransaction.add(R.id.second_fragment_container,serviceFragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                mBottomNavigationView.setVisibility(View.INVISIBLE);
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    public void signOutCustomer(MenuItem item) {
        Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);

    }
}
