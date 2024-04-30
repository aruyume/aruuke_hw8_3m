package com.example.aruuke_rakhmanova_hw8_3m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.aruuke_rakhmanova_hw8_3m.databinding.FragmentCharacterBinding

class CharacterFragment : Fragment() {
    private lateinit var binding: FragmentCharacterBinding
    private val characterList = arrayListOf(
        Character("Alive", "Rick Sanchez", R.drawable.rick),
        Character("Alive", "Morty Smith", R.drawable.morty),
        Character("Dead", "Albert Einstein", R.drawable.einstein),
        Character("Alive", "Jerry Smith", R.drawable.jerry)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = CharacterAdapter(characterList, this::onClick)
        binding.rvCharacter.adapter = adapter
    }

    private fun onClick(characterModel: Character) {
        findNavController().navigate(R.id.detailFragment, bundleOf("character" to characterModel))
    }
}