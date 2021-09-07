package com.example.practical5_19012021012


import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    lateinit var music : MediaPlayer
    var flag = false
    // flase = music is paused

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        music = MediaPlayer.create(this, R.raw.abc);

    }

    fun musicPlayPause(v: View?) {

        flag = if (!flag) {
            music.start()

            // change button icon to pause
            var playButton = findViewById<FloatingActionButton>(R.id.faButton10)
            playButton.setImageResource(R.drawable.ic_outline_pause_24)

            true
        } else {
            music.pause()

            // change button icon to play
            var playButton = findViewById<FloatingActionButton>(R.id.faButton10)
            playButton.setImageResource(R.drawable.ic_baseline_play_arrow_24)
            false
        }

    }// fun musicPlayPause




    fun musicStop(v: View?) {
        music.stop()

    }// fun musicPlayPause

}// class MainActivity