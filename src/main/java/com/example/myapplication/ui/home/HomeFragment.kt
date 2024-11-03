package com.example.myapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.tvDoctorName.text = "Dr. Jane Smith"
        binding.tvDoctorSpecialty.text = "Cardiologist"
        binding.tvDoctorAddress.text = "Office: 456 Health Blvd, City, State"
        binding.tvAvgBloodPressure.text = "Average Blood Pressure (Last 14 Days): 120/80 mmHg"
        binding.tvAvgHeartRate.text = "Average Heart Rate (Last 14 Days): 75 bpm"
        binding.tvAvgOxygenSaturation.text = "Average Oxygen Saturation (Last 14 Days): 98%"
        binding.tvAvgCholesterol.text = "Average Cholesterol Level (Last 14 Days): 180 mg/dL"
        binding.tvUpcomingAppointments.text = "Next Appointment: June 15, 2024, at 2:00 PM"
        binding.tvDoctorNotes.text = "Doctor's Notes: Maintain your low-sodium diet and stay hydrated."

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}