package com.arjesh.potfolioapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.arjesh.potfolioapp.ui.theme.Header1
import com.arjesh.potfolioapp.ui.theme.MainBackground
import com.arjesh.potfolioapp.ui.theme.PortfolioAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortfolioAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MainBackground
                ) {
                    Text(
                        "Arjesh\nVadadoriya",
                        Modifier
                            .fillMaxWidth()
                            .padding(vertical = 6.dp),
                        color = Header1,
                        textAlign = TextAlign.Center,
                        style = typography.displayLarge,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }
    }
}