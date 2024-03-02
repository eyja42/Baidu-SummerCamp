package com.example.homework.ui.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework.R
import com.example.homework.databinding.FragmentVideoBinding
import com.example.homework.utils.ItemBean
import com.example.homework.utils.VideoAdapter

class VideoFragment : Fragment() {

    private var _binding: FragmentVideoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val videoViewModel =
            ViewModelProvider(this).get(VideoViewModel::class.java)

        _binding = FragmentVideoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //video_feed内容填充
        addRecycleView()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun addRecycleView(){
        val videoFeedList = binding.videoFeedList
        val adapter = VideoAdapter(createVideoFeedData())
        videoFeedList.adapter = adapter
        videoFeedList.layoutManager = LinearLayoutManager(this.context)
    }

    private fun createVideoFeedData(): ArrayList<ItemBean>{
        var list = ArrayList<ItemBean>()

        val firstItem = ItemBean(
            R.drawable.video1_cover, getString(R.string.video1_title), getString(
                R.string.video1_subtitle),"video1")

        val secondItem = ItemBean(
            R.drawable.video2_cover, getString(R.string.video2_title), getString(
                R.string.video2_subtitle),"video2")

        val thirdItem = ItemBean(
            R.drawable.video3_cover, getString(R.string.video3_title), getString(
                R.string.video3_subtitle),"video3")

        for(i in 0..9){
            list.add(firstItem)
            list.add(secondItem)
            list.add(thirdItem)
        }

        return list
    }
}