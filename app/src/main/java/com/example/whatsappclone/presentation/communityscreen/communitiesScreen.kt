package com.example.whatsappclone.presentation.communityscreen

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun CommunitiesScreen(){


    var isSearching by remember {

        mutableStateOf(false)
    }

    var search by remember{
        mutableStateOf("")
    }

    var showMenu by remember {
        mutableStateOf(false)
    }
    
    val sampleCommunities = listOf(
        Communities(image = R.drawable.img,
            name = "Tech Enthusiasts",
            member = "256 members"),
        Communities(image = R.drawable.img,
            name = "Photography lover",
            member = "26 members"),
        Communities(image = R.drawable.img,
            name = "Traveller United ",
            member = "256 members")
    )

    Scaffold (
        topBar = {

            Box(modifier = Modifier.fillMaxWidth()){
                Column {
                    Row {
                        if(isSearching){
                            TextField(value = search, onValueChange = {
                                search=it
                            },
                                placeholder = {
                                    Text(text = "Search")
                                },
                                colors = TextFieldDefaults.colors(
                                    unfocusedContainerColor =  Color.Transparent
                                    , focusedContainerColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent
                                ), modifier = Modifier.padding(start = 12.dp) ,
                                singleLine = true)
                        } else {
                            Text(text = "Communities",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 12.dp ,
                                    top = 10.dp))
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        if(isSearching){
                            IconButton(onClick = { isSearching = false
                                search = ""}) {
                                Icon(painter = painterResource(id = R.drawable.cross),
                                    contentDescription = null ,
                                    modifier = Modifier.size(15.dp)
                                )

                            }
                        }else{


                            IconButton(onClick = {isSearching=true }) {
                                Icon(painter = painterResource(id = R.drawable.search),
                                    contentDescription = null ,
                                    modifier= Modifier.size(24.dp) )
                            }

                            IconButton(onClick = {
                                showMenu = true

                            }) {
                                Icon(painter = painterResource(id = R.drawable.more),
                                    contentDescription = null ,
                                    modifier= Modifier.size(24.dp) )

                                DropdownMenu(expanded = showMenu,
                                    onDismissRequest = { showMenu = false
                                    }) {

                                    DropdownMenuItem(text = { Text(text = "Settings") },
                                        onClick = {showMenu=false })
                                }
                            }
                        }
                    }
                    HorizontalDivider()
                }
            }
        },
     bottomBar = {
         bottom_navigation()
     }){

        Column (modifier = Modifier.padding(it)){

            Button(onClick = {}, colors = ButtonDefaults
                .buttonColors(containerColor = colorResource
                    (id = R.color.Light_green)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)) {
                Text(text = "Start a new Community" ,
                    fontSize = 16.sp ,
                    fontWeight = FontWeight.Bold)


            }
            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Your Communities",
                fontWeight = FontWeight.Bold ,
                fontSize = 20.sp , modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            LazyColumn {
                items(sampleCommunities){
                    communityItemDesign(communities = it)
                }
            }


        }
    }
}
