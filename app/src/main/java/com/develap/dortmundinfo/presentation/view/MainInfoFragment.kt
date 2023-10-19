package com.develap.dortmundinfo.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.develap.dortmundinfo.data.db.table.TeamInfoTable
import com.develap.dortmundinfo.databinding.FragmentMainInfoBinding
import com.develap.dortmundinfo.presentation.viewModel.MainInfoFragmentViewModel

class MainInfoFragment : Fragment() {

    private var _binding: FragmentMainInfoBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainInfoFragmentViewModel by lazy {
        ViewModelProvider(this)[MainInfoFragmentViewModel::class.java]
    }

    private var teamIndoDataBase = mutableListOf<TeamInfoTable>()
        set(value) {
            if (field == value) return
            field = value
        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getInfoTeam()
    }

    private fun getInfoTeam() = with(binding) {
        viewModel.teamInfoData.observe(viewLifecycleOwner) {
            println(it.name)

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}