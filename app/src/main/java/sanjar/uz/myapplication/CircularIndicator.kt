package sanjar.uz.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun CircularIndicatorCompose() {
    var value by remember {
        mutableStateOf(0)
    }

}