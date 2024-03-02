package com.example.homework.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.utils.DemoAdapter
import com.example.homework.utils.ItemBean
import com.example.homework.R
import com.example.homework.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    //信息流feedlist
    private var feedList: RecyclerView? = null

    private var adapter: DemoAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root



        //        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        //实时更新天气信息
        val weatherDegree = binding.weatherDegree
        weatherDegree.text="18°"

        val weatherinfo = binding.weatherInfo
        //改变weatherinfo的文字为天气信息
        //TODO: 从网络获取天气信息
        weatherinfo.text = "北京 晴"+"\n"+"89 良"

        //feed部分recycleview内容加载
        addRecycleView()


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun addRecycleView() {
        // 从布局中进行获取
        feedList = binding.feedList
        adapter = DemoAdapter(createDemoDate())
        feedList?.adapter = adapter
        feedList?.layoutManager = LinearLayoutManager(this.context)
    }

    private fun createDemoDate(): ArrayList<ItemBean> {

        val list = ArrayList<ItemBean>()

        val firstItem = ItemBean(R.drawable.news1_coverimage, getString(R.string.news1_title), getString(R.string.news1_title),"news1")
        val secondItem = ItemBean(R.drawable.news2_coverimage, getString(R.string.news2_title), getString(R.string.news2_title),"news2")
        val thirdItem = ItemBean(R.drawable.news3_coverimage, getString(R.string.news3_title), getString(R.string.news3_title),"news3")
        for (i in 0 until 10) {
            list.add(firstItem)
            list.add(secondItem)
            list.add(thirdItem)
        }

        return list
    }
}