package com.example.notificationapplication

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class NavMainGraphDirections private constructor() {
    public companion object {
        public fun actionGlobalFirstFragment(value: String): NavDirections =
            ActionOnlyNavDirections(R.id.action_FirstFragment_to_SecondFragment)
    }
}