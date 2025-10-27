package com.kidzie.pdfer

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.link.DefaultLinkHandler

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val  pdfView = findViewById<PDFView>(R.id.pdfView)
        pdfView.fromAsset("sample.pdf")
            .password("secret456")
            .enableAnnotationRendering(true) // shows links, comments, etc.
            .linkHandler(DefaultLinkHandler(pdfView)) // enables clickable links
            .load()
    }
}