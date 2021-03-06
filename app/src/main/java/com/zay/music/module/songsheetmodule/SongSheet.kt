package com.zay.music.module.songsheetmodule

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.qmuiteam.qmui.util.QMUIDisplayHelper
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import com.qmuiteam.qmui.widget.tab.QMUITabIndicator
import com.zay.music.R
import com.zay.music.databinding.SongsheetBinding

import com.zay.music.module.adapter.SongSheetPagerAdapter
import kotlinx.android.synthetic.main.songsheet.*
import kotlinx.android.synthetic.main.songsheet.pager
import kotlinx.android.synthetic.main.songsheet.tabs
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.videofragment_layout.*


class SongSheet : AppCompatActivity() {
    lateinit var mViewModel: SongSheetViewModel
    var pagerAdapter: SongSheetPagerAdapter? = null
    lateinit var binding: SongsheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.songsheet)
        QMUIStatusBarHelper.translucent(this)
        QMUIStatusBarHelper.setStatusBarLightMode(this)
        binding.lifecycleOwner = this
        mViewModel = ViewModelProvider(this).get(SongSheetViewModel::class.java)
        initToolBar()
    }

    fun initToolBar() {
        toolbar.setOnClickListener {
            finish()
        }
        titleName.text = "歌单广场"
    }

    override fun onResume() {
        super.onResume()
            initTabs()
    }

    fun initTabs() {
        mViewModel.getHotSongSheetTag()
        mViewModel.TagLiveData.observe(this, Observer {
            val tabBuilder = tabs.tabBuilder()
            if(pagerAdapter==null){
                pagerAdapter = SongSheetPagerAdapter(
                    supportFragmentManager,
                    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, it.sub
                )
                pager.setAdapter(pagerAdapter)
                pager.setCurrentItem(0, true);
            }
            tabBuilder.setColorAttr(
                com.qmuiteam.qmui.R.attr.qmui_config_color_black,
                com.qmuiteam.qmui.R.attr.qmui_config_color_red
            )
            tabBuilder.setTypeface(Typeface.DEFAULT, Typeface.DEFAULT_BOLD)
            tabs.reset()
            for (i in 0 until it.sub.size) {
                tabs.addTab(tabBuilder.setText(it.sub.get(i).name).build(this@SongSheet))
            }
            tabs.notifyDataChanged();
            val space = QMUIDisplayHelper.dp2px(this@SongSheet, 20)
            tabs.setIndicator(
                QMUITabIndicator(
                    QMUIDisplayHelper.dp2px(this@SongSheet, 2), false, true
                )
            )
            tabs.setupWithViewPager(pager, false, true)
            tabs.setItemSpaceInScrollMode(space)
            tabs.setPadding(space, 0, space, 0)
        })
    }

    override fun onDestroy() {
        super.onDestroy()

    }
}