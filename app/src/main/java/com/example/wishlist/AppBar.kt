package com.example.wishlist

import android.content.res.Resources
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import kotlin.math.max

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    title:String,
    onBackClicked: ()-> Unit
           ){
TopAppBar(
    title = { Text(title, color = colorResource(id = R.color.white),
        modifier = Modifier
            .padding(4.dp)
            .heightIn(max = 24.dp))},
    navigationIcon = {},
    elevation = 3.dp,
    backgroundColor = colorResource(id = R.color.purple_200),
    modifier = Modifier.padding(top = 8 .dp)
    )
}