package com.drus.beautyviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fragments = listOf(
        Fragment(R.layout.fragment_layout),
        Fragment(R.layout.fragment_layout)
    )

    private val adapter by lazy {
        object: FragmentPagerAdapter(supportFragmentManager, POSITION_NONE) {
            override fun getCount() = fragments.size
            override fun getItem(position: Int) = fragments[position]
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)?.text = "Fragment 1"
        tabLayout.getTabAt(1)?.text = "Fragment 2"
    }
}