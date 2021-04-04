package com.example.mdc_snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button mSnackbarBtn;
    private FloatingActionButton mFabBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSnackbarBtn = findViewById(R.id.snackBar_btn);
        mFabBtn = findViewById(R.id.fab_btn);
        mSnackbarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar=  Snackbar.make(v,"You pressed the snackbar",Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAnchorView(mFabBtn);
                snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
                snackbar.setAction("Okay", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                   startActivity(new Intent(getApplicationContext(),NewActivity.class));

                    }
                });
                snackbar.show();

            }
        });
    }
}