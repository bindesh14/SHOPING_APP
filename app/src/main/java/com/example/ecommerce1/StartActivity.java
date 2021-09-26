package com.example.ecommerce1;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StartActivity extends AppCompatActivity  {

    //Button Logout;
    public TextView welcome;
    private FirebaseAuth auth;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // Logout = (Button)findViewById(R.id.logout);
        welcome =(TextView)findViewById(R.id.logo);
        //Logout.setOnClickListener(this);

        auth =FirebaseAuth.getInstance();
        //Register.setLinksClickable(true);


    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        if(auth.getCurrentUser() !=null)
        {
            FirebaseUser currentUser = auth.getCurrentUser();
            updateUI(currentUser);
        }
        else
        {
            startActivity(new Intent(StartActivity.this,MainActivity.class));
        }
    }

    private void updateUI(FirebaseUser user) {
        if (user != null) {
            Toast.makeText(StartActivity.this,"Welcome",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.Furniture:
                startActivity(new Intent(StartActivity.this,FurnitureActivity.class));
                break;
            case R.id.info_id:
                startActivity(new Intent(StartActivity.this,AppVersion.class));
                break;
//            case R.id.help_id:
//                startActivity(new Intent(StartActivity.this,HelpActivity.class));
//                break;
            case R.id.log_out:
                auth.signOut();
                startActivity(new Intent(StartActivity.this,MainActivity.class));
                Toast toast = Toast.makeText(StartActivity.this,"LogOut Successfully",Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.exit_btn:
                moveTaskToBack(true);
                break;

            default: return super.onOptionsItemSelected(item);
        }

        return true;
    }

    @Override
    public void onResume()
    {
        super.onResume();
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }

    /*@Override
    public void onClick(View v) {
        if(v.getId() == R.id.logout)
        {
            logoutUser();
        }
    }*/

    /*private void logoutUser() {
        auth.signOut();
        startActivity(new Intent(StartActivity.this,MainActivity.class));
        Toast toast = Toast.makeText(StartActivity.this,"LogOut Successfully",Toast.LENGTH_LONG);
        toast.show();
    }*/

}
