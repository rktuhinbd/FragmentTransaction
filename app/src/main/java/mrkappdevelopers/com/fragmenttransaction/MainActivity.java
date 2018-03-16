package mrkappdevelopers.com.fragmenttransaction;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeFragment(View view){

        Fragment fragment;

        if(view == findViewById(R.id.btFragment2)){
            fragment = new Two();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment1,fragment);
            fragmentTransaction.commit();
        }
        else if(view == findViewById(R.id.btFragment3)){
            fragment = new Three();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment1,fragment);
            fragmentTransaction.commit();
        }

    }
}
