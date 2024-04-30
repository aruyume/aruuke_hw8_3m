package com.example.aruuke_rakhmanova_hw8_3m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.aruuke_rakhmanova_hw8_3m.databinding.ItemCharacterBinding

class CharacterAdapter(val characterList: List<Character>) : RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return characterList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(characterList[position])
    }

    class ViewHolder(val binding: ItemCharacterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(character: Character) {
            binding.apply {
                tvName.text = character.name
                tvStatus.text = character.status
                Glide.with(binding.imgCharacter).load(character.imageId).into(binding.imgCharacter);
            }
        }
    }
}
