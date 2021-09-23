package chandan.prasad.androidserviceexample_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


//nothing to see here, move along.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new MainFragment()).commit();
        }
        //Initiated the fragment (MainFragment)
    }

}
