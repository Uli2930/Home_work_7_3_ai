package com.geeks.home_work_7_3_ai

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.home_work_7_3_ai.databinding.ItemSecondPlaylistBinding

class PlaylistAdapter(private val playlist: ArrayList<Playlist>) :
    RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        return PlaylistViewHolder(
            ItemSecondPlaylistBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = playlist.size

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.bind(playlist[position])

        holder.itemView.setOnClickListener{
            val musicName = playlist[position].name // black space
            val intent = Intent(holder.itemView.context, SecondActivity::class.java)
            intent.putExtra("Key", musicName)
            holder.itemView.context.startActivity(intent)
        }
    }

    inner class PlaylistViewHolder(private var binding: ItemSecondPlaylistBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: Playlist) {

            binding.tvName.text = model.name
            binding.tvArtist.text = model.artist

        }
    }
}