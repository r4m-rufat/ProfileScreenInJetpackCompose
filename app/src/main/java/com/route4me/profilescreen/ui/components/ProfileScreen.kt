package com.route4me.profilescreen.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.route4me.profilescreen.R
import com.route4me.profilescreen.profileListOfIcons
import com.route4me.profilescreen.profileListOfItems

@Composable
fun RegisterScreen(modifier: Modifier) {

    Column(modifier = modifier) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {

            Box(modifier = Modifier.size(180.dp), contentAlignment = Alignment.BottomEnd) {

                Image(
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .border(width = 1.dp, color = Color.White),
                    painter = painterResource(id = R.drawable.profile_pic),
                    contentDescription = "ProfileImage"
                )

                Icon(
                    modifier = Modifier
                        .size(50.dp)
                        .background(color = Color.White, shape = CircleShape),
                    painter = rememberVectorPainter(image = Icons.Outlined.AddCircle),
                    contentDescription = "Take Picture",
                    tint = Color.Black
                )

            }

        }

        repeat(7) { position ->

            PrivateUserItem(
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
                itemName = profileListOfItems[position].first,
                itemValue = profileListOfItems[position].second,
                icon = profileListOfIcons[position],
                contentDescription = profileListOfItems[position].first
            )

        }

    }

}

@Composable
fun PrivateUserItem(
    modifier: Modifier,
    itemName: String,
    itemValue: String,
    icon: Any,
    contentDescription: String
) {

    Column(modifier = modifier) {

        Row(
            modifier = Modifier.padding(bottom = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painter = when (icon) {

                    is Int -> {
                        painterResource(id = icon)
                    }
                    else -> {
                        rememberVectorPainter(
                            image = icon as ImageVector
                        )
                    }
                },
                contentDescription = contentDescription,
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(24.dp),
                tint = MaterialTheme.colors.primaryVariant,
            )

            Text(text = itemName, fontSize = 16.sp, color = MaterialTheme.colors.primaryVariant)

        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = itemValue,
                fontSize = 16.sp,
                color = MaterialTheme.colors.primary,
                fontWeight = FontWeight.Bold
            )

            Icon(
                painter = rememberVectorPainter(image = Icons.Filled.Edit),
                contentDescription = contentDescription,
                modifier = Modifier
                    .size(24.dp),
                tint = MaterialTheme.colors.primaryVariant,
            )

        }

    }

}