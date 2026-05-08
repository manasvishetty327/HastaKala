package com.hastakala.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// ─── Brand Colors ─────────────────────────────────────────────────────────────
val ArtisanOlive   = Color(0xFF5A5A40)
val ArtisanClay    = Color(0xFFA67C52)
val ArtisanCream   = Color(0xFFF5F0E8)
val ArtisanInk     = Color(0xFF2D2D20)
val ArtisanSand    = Color(0xFFD9B99B)
val ArtisanLight   = Color(0xFFBFA694)

val ColorSuccess   = Color(0xFF22C55E)
val ColorWarning   = Color(0xFFF97316)
val ColorDanger    = Color(0xFFEF4444)

val White          = Color(0xFFFFFFFF)
val BackgroundGray = Color(0xFFF8F8F5)

// ─── Color Scheme ─────────────────────────────────────────────────────────────
private val LightColorScheme = lightColorScheme(
    primary         = ArtisanOlive,
    onPrimary       = White,
    primaryContainer = ArtisanCream,
    onPrimaryContainer = ArtisanInk,
    secondary       = ArtisanClay,
    onSecondary     = White,
    background      = ArtisanCream,
    onBackground    = ArtisanInk,
    surface         = White,
    onSurface       = ArtisanInk,
    surfaceVariant  = Color(0xFFF0EBE0),
    error           = ColorDanger,
)

// ─── Typography ───────────────────────────────────────────────────────────────
val HastaKalaTypography = Typography(
    displayLarge  = TextStyle(fontSize = 40.sp, fontWeight = FontWeight.Light,   letterSpacing = (-0.5).sp),
    displayMedium = TextStyle(fontSize = 32.sp, fontWeight = FontWeight.Light),
    headlineLarge = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Normal),
    headlineMedium= TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Normal),
    titleLarge    = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.SemiBold),
    titleMedium   = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.SemiBold, letterSpacing = 0.1.sp),
    bodyLarge     = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal),
    bodyMedium    = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Normal),
    bodySmall     = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Normal),
    labelLarge    = TextStyle(fontSize = 11.sp, fontWeight = FontWeight.Bold,    letterSpacing = 1.sp),
    labelMedium   = TextStyle(fontSize = 10.sp, fontWeight = FontWeight.Bold,    letterSpacing = 1.5.sp),
    labelSmall    = TextStyle(fontSize = 9.sp,  fontWeight = FontWeight.Bold,    letterSpacing = 2.sp),
)

// ─── Theme ────────────────────────────────────────────────────────────────────
@Composable
fun HastaKalaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography  = HastaKalaTypography,
        content     = content
    )
}
