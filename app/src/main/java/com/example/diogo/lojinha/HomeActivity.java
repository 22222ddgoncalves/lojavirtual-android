package com.example.diogo.lojinha;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements ProfileFragment.OnFragmentInteractionListener,ShopFragment.OnFragmentInteractionListener,ShoppingListFragment.OnFragmentInteractionListener {
    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    String fragment_activo ="";
    ProfileFragment profileFragment;
    ShopFragment shopFragment;
    ShoppingListFragment shoppingListFragment;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        fragmentManager = getSupportFragmentManager();
        shopFragment = new ShopFragment();
        fragmentManager.beginTransaction().add(R.id.wrapper_fragment,shopFragment,"soueu").commit();
        fragment_activo="soueu";

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_meny,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){

            case R.id.profile:
                 if(!fragment_activo.contentEquals("profile")){
                     profileFragment = new ProfileFragment();
                     fragmentManager.beginTransaction().replace(R.id.wrapper_fragment,profileFragment,"profile").commit();
                     fragment_activo="profile";
                 }
                break;

            case R.id.shopping_list:
                if(!fragment_activo.contentEquals("shopp")){
                    shoppingListFragment = new ShoppingListFragment();
                    fragmentManager.beginTransaction().replace(R.id.wrapper_fragment,shoppingListFragment,"shopp").commit();
                    fragment_activo="shopp";
                }
                break;
            case R.id.logout:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
