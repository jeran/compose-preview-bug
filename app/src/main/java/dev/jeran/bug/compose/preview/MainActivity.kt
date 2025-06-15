package dev.jeran.bug.compose.preview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import dev.jeran.bug.compose.preview.ui.theme.ComposepreviewbugTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposepreviewbugTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, locale = "fr")
@Composable
private fun GreetingPreview_fr() {
    ComposepreviewbugTheme {
        Greeting(stringResource(R.string.app_name))
    }
}

@Preview(showBackground = true, locale = "fr-rCA")
@Composable
private fun GreetingPreview_fr_rCA() {
    ComposepreviewbugTheme {
        Greeting(stringResource(R.string.app_name))
    }
}

@Preview(showBackground = true, locale = "pt-rPT")
@Composable
private fun GreetingPreview_pt_rPT() {
    ComposepreviewbugTheme {
        Greeting(stringResource(R.string.app_name))
    }
}