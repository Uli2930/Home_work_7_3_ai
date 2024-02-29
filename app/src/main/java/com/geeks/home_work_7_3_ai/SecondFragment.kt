package com.geeks.home_work_7_3_ai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.home_work_7_3_ai.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private val playlist = arrayListOf(
        Playlist("Blank Space", "Taylor Swift"),
        Playlist("Watch Me","Silento"),
        Playlist("Earned It", "The Weekend"),
        Playlist("The Hills", "The Weekend"),
        Playlist("Writing's On The Wall", "Sam Smith")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = PlaylistAdapter(playlist)
        binding.rvPlaylist.adapter = adapter
    }

}