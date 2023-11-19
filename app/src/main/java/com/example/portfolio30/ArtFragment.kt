package com.example.portfolio30
// This Fragment handles the viewing of the different art and design creations.
// in the future i plan on convering it to some sort of ListView aswell to handle more designs.
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ArtFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_art, container, false)
    }

}