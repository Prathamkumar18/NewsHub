package com.example.nav

import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewController : WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView?, url:String): Boolean {
        if (view != null) {
            view.loadUrl(url)
        }
        return true
    }
}