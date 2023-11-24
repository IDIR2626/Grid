package com.example.grid

import android.widget.GridLayout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun GridLayout(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(5.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        repeat(10){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                repeat(2){
                    GridCell()
                }
            }
        }
    }
}



@Composable
fun GridCell(){
    Card(
        ///modifier = Modifier.padding(12.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(8.dp)

    ) {
        Box(
            modifier = Modifier
                .requiredSize(180.dp, 180.dp)
                .padding(8.dp)

        ){
            Image(
                painter = painterResource(id = R.drawable.greeksalad),
                contentDescription ="Greek Salad"
            )

            Text(
                text = "Greek Salad",
                modifier = Modifier
                    .background(Color.White)
                    .padding(2.dp)
                    .align(Alignment.TopStart),
                fontSize = 18.sp
            )

            Text(
                text = "12.99$",
                modifier = Modifier
                    .background(Color.White)
                    .padding(2.dp)
                    .align(Alignment.BottomEnd),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        }
    }
}