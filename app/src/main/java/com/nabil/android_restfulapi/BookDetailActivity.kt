package com.nabil.android_restfulapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.nabil.android_restfulapi.databinding.DetailBookBinding

class BookDetailActivity : AppCompatActivity() {

    private lateinit var binding: DetailBookBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailBookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val book = intent.getParcelableExtra<Book>("BOOK_DATA")
            ?: return

        Glide.with(this)
            .load(book.cover)
            .into(binding.imgCover)

        binding.txtTitle.text = book.title
        binding.txtOriginalTitle.text = book.originalTitle
        binding.txtReleaseDate.text = book.releaseDate
        binding.txtDescription.text = book.description
        binding.txtPagesNumber.text = "Pages: ${book.pages}"
    }
}