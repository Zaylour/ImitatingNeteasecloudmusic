package com.zay.Music.Module.MainModule
import android.app.Activity
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import com.zay.Music.R
import kotlinx.android.synthetic.main.activity_main.*
import com.zay.Music.Module.MainModule.adapter.MyPagerAdapter
import com.google.android.material.tabs.TabLayout
import android.widget.TextView
import android.view.View
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.zay.Music.R.layout.activity_main)
        QMUIStatusBarHelper.translucent(this)
        QMUIStatusBarHelper.setStatusBarLightMode(this)
        initTabItem()
    }
    //初始化tabItem
    fun initTabItem(){
//        tab_layout.addTab(tab_layout.newTab().setText("我的"))
//
//        tab_layout.addTab(tab_layout.newTab().setText("发现"))
//
//        tab_layout.addTab(tab_layout.newTab().setText("云村"))
//
//        tab_layout.addTab(tab_layout.newTab().setText("视频"))
        val tabList= mutableListOf<String>("我的","发现","云村","视频")
        for (x in 0..3) {
            val tab = tab_layout.newTab()
            val inflate = View.inflate(this, R.layout.layout_tab, null)
            val textView = inflate.findViewById<TextView>(R.id.tab_item_textview)
            textView.setText(tabList.get(x))
            tab.setCustomView(inflate)
            tab_layout.addTab(tab)
        }



        //自定义的Adapter继承自FragmentPagerAdapter
        val adapter = MyPagerAdapter(supportFragmentManager, tab_layout.getTabCount())
        //ViewPager设置Adapter
        mViewPager.setAdapter(adapter);
        //为ViewPager添加页面改变监听
        mViewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
        //为TabLayout添加Tab选择监听
        tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                mViewPager.setCurrentItem(tab.getPosition());
                val view = tab.getCustomView();
                if (null == view) {
                    tab.setCustomView(R.layout.layout_tab);
                }
                val textView = view!!.findViewById<TextView>(R.id.tab_item_textview);
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f);
                textView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
               // textView.setTextAppearance(this@MainActivity, R.style.TabLayoutTextSize1);
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
              //  mViewPager.setCurrentItem(tab.getPosition());
                val view = tab.getCustomView();
                if (null == view) {
                    tab.setCustomView(R.layout.layout_tab);
                }
                val textView = view!!.findViewById<TextView>(R.id.tab_item_textview);
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15f);
                textView.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
               // textView.setTextAppearance(this@MainActivity, R.style.TabLayoutTextSize2);
            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
        //设置ViewPager预加载的View数目
        //mViewPager.setOffscreenPageLimit(1)
        //默认
        tab_layout.getTabAt(1)!!.select()
    }



}
