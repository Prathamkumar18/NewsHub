package com.example.nav.ui.CNN

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.nav.R
import com.example.nav.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

private var _binding: FragmentGalleryBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

    _binding = FragmentGalleryBinding.inflate(inflater, container, false)
    val root: View = binding.root
      val wv=root.findViewById<WebView>(R.id.wvcnn)
      wv.loadUrl("https://edition.cnn.com/")
      wv.webViewClient= WebViewClient()
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}