package com.martinsrvinicius.nubankclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.martinsrvinicius.nubankclone.databinding.ProductItemBinding
import com.martinsrvinicius.nubankclone.model.Product

class AdapterProduct(private val context: Context, private val productList: MutableList<Product>)
    : RecyclerView.Adapter<AdapterProduct.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemList = ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProductViewHolder(itemList)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.txtInformative.text = productList[position].text
    }

    override fun getItemCount() = productList.size

    inner class ProductViewHolder(binding: ProductItemBinding): RecyclerView.ViewHolder(binding.root) {
        val txtInformative = binding.txtInformative
    }
}