package ru.artem.vkclient.ui.h2s4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.artem.vkclient.R
import ru.artem.vkclient.core.ui.common.CircleGradientImage
import ru.artem.vkclient.core.ui.layout.SpacerHorizontal
import ru.artem.vkclient.core.ui.theme.ThemePreview
import ru.artem.vkclient.core.ui.theme.forDark

@Composable
fun InstagramProfile(
    viewModel: InstagramProfileViewModel
) {
    val profileUiModel = checkNotNull(viewModel.profileUiModel)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White forDark Color.Black)
            .padding(vertical = 20.dp, horizontal = 15.dp)
    ) {
        NameProfile(nickname = profileUiModel.nickname)
        InstagramHeader(
            posts = profileUiModel.posts,
            followers = profileUiModel.followers,
            following = profileUiModel.following,
        )
        Status(
            name = profileUiModel.name,
            gender = profileUiModel.gender,
            status = profileUiModel.status,
        )
    }
}

@Composable
private fun NameProfile(
    nickname: String,
) {
    Text(
        text = nickname,
        modifier = Modifier.fillMaxWidth(),
        color = Color.Black forDark Color.White,
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        fontWeight = FontWeight.W500,
    )
}

@Composable
private fun InstagramHeader(
    posts: String,
    followers: String,
    following: String,
    imageRes: Int = R.drawable.man_face,
) {
    Row(
        modifier = Modifier
            .height(140.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        CircleGradientImage(
            imageRes = imageRes,
            size = 120,
            haveStory = true,
            enableAddStory = true,
        )
        StatisticAccount(
            posts = posts,
            followers = followers,
            following = following,
        )
    }
}

@Composable
private fun StatisticAccount(
    posts: String,
    followers: String,
    following: String,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(15.dp),
    ) {
        StatisticCell(
            value = posts,
            statisticName = stringResource(R.string.posts)
        )
        StatisticCell(
            value = followers,
            statisticName = stringResource(R.string.followers)
        )
        StatisticCell(
            value = following,
            statisticName = stringResource(R.string.following)
        )
    }
}

@Composable
private fun Status(
    name: String,
    gender: String,
    status: String,
) {
    Row(
        modifier = Modifier.height(20.dp)
    ) {
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            color = Color.Black forDark Color.White,
        )
        SpacerHorizontal(width = 5.dp)
        Text(
            text = gender,
            color = Color.Gray forDark Color.LightGray,
        )
    }
    Text(
        text = status,
        fontSize = 12.sp,
        maxLines = 3,
    )
}

@Composable
private fun StatisticCell(
    value: String,
    statisticName: String,
) {
    Column(
        modifier = Modifier.size(width = 60.dp, height = 44.dp),
        verticalArrangement = Arrangement.spacedBy(3.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = value,
            fontSize = 15.sp,
            color = Color.Black forDark Color.White,
        )
        Text(
            text = statisticName,
            fontSize = 13.sp,
            color = Color.Black forDark Color.White,
        )
    }
}

@ThemePreview
@Composable
private fun InstagramHeaderPreview() {
    InstagramProfile(viewModel = InstagramProfileViewModel())
}