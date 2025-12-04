package com.nabil.android_restfulapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nabil.android_restfulapi.databinding.ItemBookBinding

class BookAdapter(private var list: List<Book>, private val onItemClick: (Book) -> Unit):
    RecyclerView.Adapter<BookAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemBookBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(val binding: ItemBookBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(book: Book) {
            Glide.with(binding.imgCover.context)
                .load(book.cover)
                .into(binding.imgCover)

            binding.txtTitle.text = book.title
            binding.txtReleaseDate.text = book.releaseDate

            binding.root.setOnClickListener {
                onItemClick(book)
            }
        }
    }
}