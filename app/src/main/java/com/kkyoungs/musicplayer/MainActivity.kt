package com.kkyoungs.musicplayer

import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.kkyoungs.musicplayer.databinding.ActivityMainBinding
@RequiresApi(Build.VERSION_CODES.O)
class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding
    private var mediaPlayer: MediaPlayer ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pauseButton.setOnClickListener {
            mediaPlayerPause()
        }
        binding.playButton.setOnClickListener {
            mediaPlayerPlay()
        }
        binding.stopButton.setOnClickListener {
            mediaPlayerStop()
        }
    }


    private fun mediaPlayerPlay(){
        val intent = Intent(this, MediaPlayerService::class.java)
            .apply { action = MEDIA_PLAYER_PLAY }
        startService(intent)

    }
    private fun mediaPlayerPause(){
        val intent = Intent(this, MediaPlayerService::class.java)
            .apply { action = MEDIA_PLAYER_PAUSE }
        startService(intent)

    }
    private fun mediaPlayerStop(){
        val intent = Intent(this, MediaPlayerService::class.java)
            .apply { action = MEDIA_PLAYER_STOP }
        startService(intent)

    }

    override fun onDestroy() {
        mediaPlayer?.apply {
            stop()
            release()
        }
        mediaPlayer = null
        super.onDestroy()

    }

}