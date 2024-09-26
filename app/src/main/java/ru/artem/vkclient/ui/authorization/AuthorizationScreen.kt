package ru.artem.vkclient.ui.authorization

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import ru.artem.vkclient.R
import ru.artem.vkclient.core.ui.VkColor
import ru.artem.vkclient.core.ui.common.Icon
import ru.artem.vkclient.core.ui.common.Image
import ru.artem.vkclient.core.ui.layout.SpacerVertical
import ru.artem.vkclient.core.ui.theme.ThemePreview

@Composable
fun AuthorizationScreen(
    viewModel: AuthorizationViewModel,
) {
    var isPasswordShowed: Boolean by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    0.0f to Color(0xfff9ce34),
                    0.5f to Color(0xffee2a7b),
                    1.0f to Color(0xff6228d7),
                )
            )
            .padding(vertical = 60.dp, horizontal = 30.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = R.drawable.icon_vk,
            modifier = Modifier.size(80.dp),
        )
        SpacerVertical(30.dp)
        TextField(
            value = viewModel.login,
            onValueChange = viewModel::onLoginChange,
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(
                    text = stringResource(id = R.string.login_hint)
                )
            }
        )
        TextField(
            value = viewModel.password,
            onValueChange = viewModel::onPasswordChange,
            modifier = Modifier.fillMaxWidth(),
            visualTransformation =
            if (!isPasswordShowed)
                PasswordVisualTransformation()
            else
                VisualTransformation.None,
            placeholder = {
                Text(
                    text = stringResource(id = R.string.password_hint)
                )
            },
            trailingIcon = {
                Icon(
                    painterResource = R.drawable.eye,
                    modifier = Modifier.clickable {
                        isPasswordShowed = !isPasswordShowed
                    },
                    tint = if (isPasswordShowed) VkColor.Black else VkColor.Gray,
                )
            },
        )
        TextButton(
            onClick = viewModel::launchAuthorization,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(25))
                .background(VkColor.Blue),
        ) {
            Text(
                text = stringResource(id = R.string.log_in),
                color = VkColor.White
            )
        }
    }
}

@ThemePreview
@Composable
private fun AuthorizationScreenPreview() {
    AuthorizationScreen(
        AuthorizationViewModel()
    )
}