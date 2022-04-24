package com.example.privatebank.ui.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.privatebank.R
import com.example.privatebank.ui.base.BaseFragment
import com.example.privatebank.ui.start.adapter.BeznalAdapter


class StartFragment : BaseFragment() {


//    private lateinit var recyclerView: RecyclerView
//    private lateinit var stAdapter: BeznalAdapter
    private var recyclerView:RecyclerView? = null
    private var stAdapter = BeznalAdapter()
    private lateinit var viewModel: StartViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        recyclerView = view.findViewById(R.id.recyclerView)
//        stAdapter = BeznalAdapter()
//        recyclerView.adapter = stAdapter
        recyclerView = view.findViewById<RecyclerView?>(R.id.recyclerView).apply {
            adapter = stAdapter
        }
        viewModel.getMoney()
        viewModel.liveData.observe(viewLifecycleOwner, Observer { list ->
            list.body()?.let { stAdapter.update(it) }

        })

    }

}