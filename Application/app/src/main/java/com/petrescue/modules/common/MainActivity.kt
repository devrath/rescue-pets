package com.petrescue.modules.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.petrescue.R
import com.petrescue.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Binding reference
    private lateinit var binding: ActivityMainBinding

    // <-------------------------- NAVIGATION ---------------------------------------------->
    // Bottom navigation controller
    private val navController by lazy { findNavController(R.id.nav_host_fragment) }
    // Configuration(Tabs) for the navigation controller
    private val appBarConfiguration by lazy {
        AppBarConfiguration(topLevelDestinationIds = setOf(R.id.animalsNearYou, R.id.search))
    }
    // <-------------------------- NAVIGATION ---------------------------------------------->

    override fun onCreate(savedInstanceState: Bundle?) {
        // Activity theme
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        // Get the binding reference
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Set action bar
        setupActionBar()
        // Set bottom navigation bar
        setupBottomNav()
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun setupActionBar() {
        setSupportActionBar(binding.toolbar)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    private fun setupBottomNav() {
        binding.bottomNavigation.setupWithNavController(navController)
    }
}