package sanjar.uz.myapplication

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExpandableCard() {
    var expandedState by remember {
        mutableStateOf(false)
    }
    val rotationState by animateFloatAsState(targetValue = if (expandedState) 180f else 0f)
    Card(modifier = Modifier
        .fillMaxWidth()
        .animateContentSize(
            animationSpec = tween(
                durationMillis = 300,
                easing = LinearOutSlowInEasing
            ),
        ),
        shape = ShapeDefaults.Medium,
        onClick = {
            expandedState = !expandedState
        }) {
        Column(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
                .padding(12.dp)
                .fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "My Title",
                    fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(6f)
                )
                IconButton(
                    onClick = { expandedState = !expandedState },
                    modifier = Modifier
                        .alpha(1.0f)
                        .weight(1f)
                        .rotate(rotationState)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Drop-Down Arrow"
                    )
                }
            }
            if (expandedState) {
                Text(
                    text = "Sanjar is learning Jetpack Compose from the start again cos" +
                            " he has not been working with android for about 4 months." +
                            "In this example, ContentAlpha.medium sets the alpha level to medium, " +
                            "making the IconButton slightly transparent. You can adjust the alpha " +
                            "level by using different constants provided by ContentAlpha, such as high," +
                            " medium, or disabled. Alternatively, you can directly specify a float value" +
                            " for the alpha, such as 0.5f, to set a custom transparency level.",
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp,
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
@Preview
fun ExpandedPreview() {
    ExpandableCard()
}