package com.example.aruuke_rakhmanova_hw8_3m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.aruuke_rakhmanova_hw8_3m.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = arguments?.getSerializable("character") as Character
        binding.apply {
            tvNameDetail.text = data.name
            tvStatusDetail.text = data.status
            Glide.with(imgCharacterDetail).load(data.imageId).into(imgCharacterDetail)
        }
    }
}