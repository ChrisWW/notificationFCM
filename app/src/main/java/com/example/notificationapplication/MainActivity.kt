package com.example.notificationapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.fragment.NavHostFragment
import com.example.notificationapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    Log.d("notificationa", "${intent.extras}")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

//        val extras = intent!!.extras
//        if (extras != null) {
////            val value = extras.getString("notification")
////            val navHostFragment = supportFragmentManager.findFragmentById(R.id.) as NavHostFragment
////            val navController = navHostFragment.navController
////            if (value != null){
////                val action = NavMainGraphDirections.actionGlobalFirstFragment(value)
////                navController.navigate(action)
////            }
//        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("notificationa", "${intent!!.extras}")
//        val extras = intent!!.extras
//        if (extras != null) {
//            val value = extras.getString("notification")
//            val navHostFragment = supportFragmentManager.findFragmentById(R.id.FirstFragment) as NavHostFragment
//            val navController = navHostFragment.navController
//            if (value != null){
//                val action = NavMainGraphDirections.actionGlobalFirstFragment(value)
//                navController.navigate(action)
//            }
//        }
    }
}