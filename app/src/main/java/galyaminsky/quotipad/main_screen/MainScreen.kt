package galyaminsky.quotipad.main_screen

import android.annotation.SuppressLint
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import galyaminsky.quotipad.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Scaffold(bottomBar = {

    }, floatingActionButton = {
        FloatingActionButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.icon_add),
                contentDescription = "add",
                tint = Color.White
            )
        }
    }, floatingActionButtonPosition = FabPosition.Center
    ) {

    }
}