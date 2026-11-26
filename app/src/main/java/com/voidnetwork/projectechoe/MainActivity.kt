
package com.voidnetwork.projectechoe

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.BLACK
        window.navigationBarColor = Color.BLACK

        webView = WebView(this).apply {
            setBackgroundColor(Color.BLACK)

            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.allowFileAccess = false
            settings.allowContentAccess = false

            webViewClient = WebViewClient()
            webChromeClient = WebChromeClient()
        }

        setContentView(webView)

        if (savedInstanceState == null) {
            webView.loadUrl("https://cdn.jsdelivr.net/gh/VoidNetworkOnTop/pecho@main/loader.html")
        } else {
            webView.restoreState(savedInstanceState)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        webView.saveState(outState)
        super.onSaveInstanceState(outState)
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (::webView.isInitialized && webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
