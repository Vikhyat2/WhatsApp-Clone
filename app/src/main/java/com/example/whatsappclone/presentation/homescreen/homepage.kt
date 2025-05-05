package com.example.whatsappclone.presentation.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclone.R
import com.example.whatsappclone.presentation.bottomnavigatiion.bottom_navigation

@Composable
@Preview (showSystemUi = true)
fun homepage(){

    val chatData = listOf(ChatListModel(
        R.drawable.salmankhan,
        name = "Salman khan" ,
        time = "10:00 AM" ,
        message = "Hello"),

        ChatListModel(
            R.drawable.sharukhkhan ,
            name = "Sharukh Khan" ,
            time = "9:00 AM",
            message = "Hii"),

        ChatListModel(
            R.drawable.sharadhakapoor ,
            name = "Sharadha Kapoor" ,
            time = "9:00 PM",
            message = "Hii"),

        ChatListModel(
            R.drawable.bhuvan_bam ,
            name = "Bhuvan Bam" ,
            time = "02/02/2023",
            message = "Hii"),

        ChatListModel(
            R.drawable.rashmika ,
            name = "Rashmika" ,
            time = "02/03/2023",
            message = "Hii"),

        ChatListModel(
            R.drawable.rajkummar_rao ,
            name = "Rajkumar Rao" ,
            time = "02/02/2023",
            message = "Hii"),

        ChatListModel(
            R.drawable.boy ,
            name = "Ashish" ,
            time = "02/02/2023",
            message = "Hii"),

        ChatListModel(
            R.drawable.boy1 ,
            name = "Himanshu" ,
            time = "02/02/2023",
            message = "Hii"),

        ChatListModel(
            R.drawable.boy3 ,
            name = "Ashish Bhati" ,
            time = "02/02/2023",
            message = "Hii"),

        ChatListModel(
            R.drawable.ajay_devgn ,
            name = "Ajay Devgn" ,
            time = "02/02/2023",
            message = "Hii"),

        ChatListModel(
            R.drawable.akshay_kumar ,
            name = "Akshay Kumar" ,
            time = "02/02/2023",
            message = "Hii"),
        )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }
                , containerColor =  colorResource(id = R.color.Light_green)
                , modifier = Modifier.size(65.dp)
                , contentColor = Color.White
            ) {
               Icon(painter = painterResource(id = R.drawable.chat_icon),
                   contentDescription = null ,
                   modifier = Modifier.size(28.dp))
            }
        }, bottomBar = {
            bottom_navigation()
        }
    ){

        Column(modifier = Modifier.padding(it)){

            Spacer(modifier = Modifier.height(16.dp))

            Box(modifier = Modifier.fillMaxWidth()){
                Text(text = "WhatsApp",
                    fontSize = 28.sp,
                    color = colorResource(id = R.color.Light_green),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    fontWeight = FontWeight.Bold
                    )
                Row(modifier = Modifier.align(Alignment.CenterEnd)){
                    IconButton(onClick = { /*TODO*/ }) {

                        Icon(painter = painterResource(id = R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp))
                    }

                    IconButton(onClick = { /*TODO*/ }) {

                        Icon(painter = painterResource(id = R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp))
                    }

                    IconButton(onClick = { /*TODO*/ }) {

                        Icon(painter = painterResource(id = R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp))
                    }
                }

            }

            HorizontalDivider()

            LazyColumn {
                items(chatData) {
                    ChatDesign(chatListModel = it)
                }
            }
        }


    }

}