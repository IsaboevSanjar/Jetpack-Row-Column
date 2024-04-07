package sanjar.uz.myapplication

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource

@Composable
fun Password() {
    Surface {
        var password by rememberSaveable {
            mutableStateOf("")
        }
        var passwordVisibility by remember { mutableStateOf(false) }
        val icon =
            if (passwordVisibility) painterResource(id = R.drawable.visible_on) else painterResource(
                id = R.drawable.visible_off
            )

        OutlinedTextField(
            value = password,
            onValueChange = { value -> password = value },
            placeholder = {
                Text(
                    text = "Type here..."
                )
            },
            label = { Text(text = "Password") },
            trailingIcon = {
                IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                    Icon(
                        painter = painterResource(id = R.drawable.google_icon),
                        contentDescription = "visibility"
                    )
                }
            }
        )
    }
}

@Composable
fun PasswordPreview() {

}