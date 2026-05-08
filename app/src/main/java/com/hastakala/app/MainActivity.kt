package com.hastakala.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.hastakala.app.data.*
import com.hastakala.app.ui.components.BottomNavBar
import com.hastakala.app.ui.screens.*
import com.hastakala.app.ui.theme.HastaKalaTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    private val viewModel: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HastaKalaTheme {
                HastaKalaApp(viewModel)
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun HastaKalaApp(viewModel: AppViewModel) {
    val products by viewModel.products.collectAsStateWithLifecycle()
    val sales    by viewModel.sales.collectAsStateWithLifecycle()
    val lang     by viewModel.language.collectAsStateWithLifecycle()

    var activeTab  by remember { mutableStateOf("home") }
    var showSplash by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        delay(2500)
        showSplash = false
    }

    if (showSplash) {
        SplashScreen(lang = lang)
        return
    }

    Scaffold(
        bottomBar = {
            BottomNavBar(
                activeTab   = activeTab,
                onTabSelect = { activeTab = it },
                lang        = lang
            )
        }
    ) { innerPadding ->
        AnimatedContent(
            targetState = activeTab,
            transitionSpec = {
                (fadeIn(animationSpec = tween(220)) +
                        slideInHorizontally(animationSpec = tween(220)) { it / 10 })
                    .togetherWith(
                        fadeOut(animationSpec = tween(220)) +
                                slideOutHorizontally(animationSpec = tween(220)) { -it / 10 }
                    )
            },
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            label = "screen"
        ) { tab ->
            when (tab) {
                "home" -> HomeScreen(
                    sales           = sales,
                    products        = products,
                    lang            = lang,
                    onNavigate      = { activeTab = it },
                    onUpdateProduct = viewModel::updateProduct
                )
                "add" -> AddSaleScreen(
                    products        = products,
                    lang            = lang,
                    onSave          = { sale -> viewModel.saveSale(sale); activeTab = "home" },
                    onAddProduct    = viewModel::saveProduct,
                    onDeleteProduct = viewModel::deleteProduct,
                    onUpdateProduct = viewModel::updateProduct
                )
                "analytics" -> AnalyticsScreen(
                    sales    = sales,
                    products = products,
                    lang     = lang
                )
                "income" -> IncomeScreen(
                    sales     = sales,
                    products  = products,
                    lang      = lang,
                    onDelete  = viewModel::deleteSale
                )
                "settings" -> SettingsScreen(
                    currentLang      = lang,
                    onLanguageChange = viewModel::setLanguage
                )
                else -> HomeScreen(
                    sales           = sales,
                    products        = products,
                    lang            = lang,
                    onNavigate      = { activeTab = it },
                    onUpdateProduct = viewModel::updateProduct
                )
            }
        }
    }
}
