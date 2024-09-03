package ru.artem.vkclient.core.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import ru.artem.vkclient.R
import ru.artem.vkclient.core.ui.theme.ThemePreview
import ru.artem.vkclient.core.ui.theme.forDark

@Composable
fun CircleGradientImage(
    size: Int = 100,
    imageRes: Int,
    haveStory: Boolean = false,
    enableAddStory: Boolean = false,
) {
    Box(
        modifier = Modifier.size(size.dp)
    ) {
        Box(
            modifier = if (haveStory)
                Modifier
                    .size(size.dp)
                    .clip(CircleShape)
                    .border(
                        width = (size / 40f).dp,
                        brush = Brush.linearGradient(
                            0.0f to Color(0xfff9ce34),
                            0.5f to Color(0xffee2a7b),
                            1.0f to Color(0xff6228d7),
                            start = Offset(x = 0f, y = size.toFloat()),
                            end = Offset(x = size.toFloat(), y = 0f),
                        ),
                        shape = CircleShape
                    )
                    .background(Color.White forDark Color.Black)
            else Modifier
                .size(size.dp)
                .clip(CircleShape)
                .background(Color.White forDark Color.Black)
        ) {
            Image(
                painter = painterResource(imageRes),
                contentDescription = stringResource(R.string.image_description_avatar),
                modifier = Modifier
                    .size(size.dp)
                    .padding((size / 22f).dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
        if (enableAddStory) {
            Icon(
                painter = painterResource(R.drawable.plus),
                contentDescription = stringResource(R.string.description_add),
                tint = Color.White forDark Color.Black,
                modifier = Modifier
                    .offset(
                        x = (size / 1.45f).dp,
                        y = (size / 1.35f).dp,
                    )
                    .size((size / 4f).dp)
                    .clip(CircleShape)
                    .background(Color.White forDark Color.Black)
                    .padding((size / 80f).dp)
                    .clip(CircleShape)
                    .background(Color(0xff0094f6))
                    .padding((size / 50f).dp),
            )
        }
    }
}

@Composable
@ThemePreview
fun CircleGradientImagePreview() {
    Row(
        modifier = Modifier.background(Color.White forDark Color.Black)
    ) {
        CircleGradientImage(imageRes = R.drawable.man_face, haveStory = true, enableAddStory = true)
        CircleGradientImage(imageRes = R.drawable.man_face, haveStory = false)
        CircleGradientImage(
            size = 50,
            imageRes = R.drawable.man_face,
            haveStory = true,
            enableAddStory = true
        )
        CircleGradientImage(size = 50, imageRes = R.drawable.man_face, haveStory = false)
    }
}