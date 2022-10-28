package com.example.basicscodelab

import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basicscodelab.ui.ExpandableCard
import com.example.basicscodelab.ui.theme.BasicsCodelabTheme

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.secondary)
                        .padding(24.dp)
                ) {
                    ExpandableCard()
                }
            }
        }
    }
}

@Composable
fun CustomText() {
    SelectionContainer {
        Column {
            Text(
                text = "Dinmuhammed",
                fontSize = 30.sp
            )
            DisableSelection {
                Text(
                    text = "Mamanov",
                    fontSize = 30.sp
                )
            }
            Text(
                text = "Quwatbay uli",
                fontSize = 30.sp
            )
        }
    }
}

@Composable
fun Greeting() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier.background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(45.dp)
                    .background(Color.Green)
            )
            Text(text = "I Love Android", fontSize = 40.sp)
        }
    }
}

@Composable
fun SuperScriptText(
    normalText: String,
    normalTextFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    superText: String,
    superTextFontSize: TextUnit = MaterialTheme.typography.overline.fontSize,
    superTextFontWeight: FontWeight = FontWeight.Normal,
    superTextBaselineShift: BaselineShift = BaselineShift.Subscript
) {
    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = normalTextFontSize
            )
        ) {
            append(normalText)
        }
        withStyle(
            style = SpanStyle(
                fontSize = superTextFontSize,
                fontWeight = superTextFontWeight,
                baselineShift = superTextBaselineShift
            )
        ) {
            append(superText)
        }
    })
}

@Preview(showBackground = true)
@Composable
fun DefaultView() {
    BasicsCodelabTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            SuperScriptText(normalText = "Dima", superText = "Mamanov")
        }
    }
}
