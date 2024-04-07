package sanjar.uz.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import sanjar.uz.myapplication.ui.theme.MyApplicationTheme
import sanjar.uz.myapplication.ui.theme.blue1
import sanjar.uz.myapplication.ui.theme.blue2
import sanjar.uz.myapplication.ui.theme.blue3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = Color.White,
                    modifier = Modifier
                        .padding(10.dp)
                ) {

                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        GradientButton(
                            text = "Click",
                            textColor = Color.White,
                            gradient = Brush.horizontalGradient(
                                colors = listOf(
                                    blue1,
                                    blue2,
                                    blue3,
                                )
                            )
                        ) {

                        }
                    }
                }
            }
        }
    }
}





