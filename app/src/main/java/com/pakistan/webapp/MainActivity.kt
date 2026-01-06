package com.pakistan.webapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.webViewClient = WebViewClient()

        webView.loadUrl(
            "https://script.google.com/macros/s/AKfycbwgHeIWRShpbBV_Sbmmn9h-RctF0gY5ZzSGIL-ZfBJbYznkoRSJx3MPhjLnOdA4Ey5Jnw/exec"
        )

        setContentView(webView)
    }
}
