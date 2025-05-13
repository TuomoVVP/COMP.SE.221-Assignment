package com.example.assignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set the initial fragment (Map view)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MapFragment())
                .commit()
        }

        // Set up bottom navigation
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigation.setOnItemSelectedListener { item ->
            var selectedFragment: Fragment? = null

            when (item.itemId) {
                R.id.navigation_map -> selectedFragment = MapFragment()
                R.id.navigation_list -> selectedFragment = ListFragment()
                R.id.navigation_favorites -> selectedFragment = FavoritesFragment()
                R.id.navigation_profile -> selectedFragment = ProfileFragment()
            }

            if (selectedFragment != null) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, selectedFragment)
                    .commit()
            }

            true
        }
    }
}