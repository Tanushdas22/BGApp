package com.example.myapplication.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Set the patient information (these can be replaced with dynamic data)
        binding.tvPatientName.text = "Name: Admin"
        binding.tvPatientAge.text = "Age: 45"
        binding.tvMedicalConditions.text = "Medical Conditions: Hypertension, High Cholesterol"
        binding.tvCurrentMedications.text = "Current Medications: Lisinopril, Atorvastatin"
        binding.tvAllergies.text = "Allergies: Penicillin"
        binding.tvRecentBloodPressure.text = "Recent Blood Pressure: 130/85 mmHg"
        binding.tvRecentHeartRate.text = "Recent Heart Rate: 78 bpm"
        binding.tvRecentOxygenSaturation.text = "Recent Oxygen Saturation: 97%"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}