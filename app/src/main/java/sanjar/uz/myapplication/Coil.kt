package sanjar.uz.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun Coil() {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        val painter =
            rememberAsyncImagePainter(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(
                        "https://dfstudio-d420.kxcdn.com/wordpress/wp-content/uploads/2019" +
                                "/06/digital_camera_photo-1080x675.jpg"
                    )
                    .crossfade(300)
                    .build(),
                error = painterResource(id = R.drawable.google_icon),
                )
        Image(painter = painter, contentDescription = "Photo taker")
        if (painter.state is AsyncImagePainter.State.Loading) {
            CircularProgressIndicator()
        }
    }
}

@Preview
@Composable
fun CoilPreview() {

}