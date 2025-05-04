package com.example.whatsappclone.presentation.splash


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclone.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
@Preview(showSystemUi = true)
fun SplashScreen(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.whatsapp_icon),
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.Center)
        )

        Column(modifier = Modifier.align(Alignment.BottomCenter) ,
            horizontalAlignment = Alignment.CenterHorizontally ) {

            Text(text = "From" ,
                fontSize = 18.sp ,
                fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(7.dp))
            Row{
                    Icon(painter = painterResource(id = R.drawable.meta),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp),
                            tint = colorResource(id = R.color.Light_green)


                    )
                Spacer(modifier = Modifier.width(7.dp))

                Text(text = "Meta" ,
                    fontSize = 18.sp,
                    fontWeight =FontWeight.Bold)
            }
        }


    }
}
