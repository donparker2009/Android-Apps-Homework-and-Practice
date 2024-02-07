package com.zybooks.favoritefoodfragments;

import static android.view.View.INVISIBLE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //  Don Parker
    //  ISYS 221 - VL1
    //  Assignment #4 - Favorite Foods Application
    //  Due: 10/22/2023

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            // Begin a new FragmentTransaction for adding a FavoritePlacesFragment
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();

            // Add the FavoritePlacesFragment to the fragment container
            fragmentTransaction.setReorderingAllowed(true)
                    .add(R.id.places_fragment_container_view, FavoritePlacesFragment.class, null)
                    .commit();

            Button elBurritoButton = findViewById(R.id.button_elBurrito);
            Button chinaOneBuffetButton = findViewById(R.id.button_chinaOneBuffet);
            Button cheesecakeFactoryButton = findViewById(R.id.button_cheesecakeFactory);
            Button ginzaButton = findViewById(R.id.button_Ginza);
            Button favoriteFoods = findViewById(R.id.button_favoriteFoods);
        }
    }
    public void onFavoriteFoodsButtonClick (View view){
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.foods_fragment_container_view);
        if (fragment == null){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

            // Add the FavoriteFoodsFragment to the fragment container
            fragmentTransaction.setReorderingAllowed(true)
                    .add(R.id.foods_fragment_container_view, FavoriteFoodsFragment.class, null)
                    .commit();

        }
        else {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

            // Add the FavoriteFoodsFragment to the fragment container
            fragmentTransaction.setReorderingAllowed(true)
                    .remove(fragment)
                    .commit();

        }
    }
    public void onButtonElBurritoClick (View view){
        Uri webpage = Uri.parse("https://get2elburritoloco.weebly.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
    public void onChinaOneBuffetClick (View view){
        Uri webpage = Uri.parse("https://chinaonebuffetbr.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
    public void onButtonCheesecakeFactoryClick (View view){
        Uri webpage = Uri.parse("https://locations.thecheesecakefactory.com/mi/kentwood-212.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
    public void onButtonGinzaClick (View view){
        Uri webpage = Uri.parse("https://ginzasushiramen.com/index.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}