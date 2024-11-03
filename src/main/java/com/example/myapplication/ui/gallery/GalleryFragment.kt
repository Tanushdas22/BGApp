package com.example.myapplication.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Update existing TextView
        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        // Optionally, add any setup logic for the new UI elements
        val bloodPressureTitle: TextView = binding.tvBloodPressureTitle
        val bloodPressureGraph: ImageView = binding.imgBloodPressureGraph
        val heartRateTitle: TextView = binding.tvHeartRateTitle
        val heartRateGraph: ImageView = binding.imgHeartRateGraph

        // Additional setup if needed for the new UI components

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}