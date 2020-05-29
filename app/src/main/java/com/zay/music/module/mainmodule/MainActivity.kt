package com.zay.music.module.mainmodule
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import com.zay.music.R
import kotlinx.android.synthetic.main.activity_main.*
import com.zay.music.module.adapter.MyPagerAdapter
import com.google.android.material.tabs.TabLayout
import android.widget.TextView
import android.view.View
import androidx.core.view.GravityCompat
import androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import com.qmuiteam.qmui.util.QMUIStatusBarHelper


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        QMUIStatusBarHelper.translucent(this)
        QMUIStatusBarHelper.setStatusBarLightMode(this)
        initTabItem()
        initOpenDrawer()
    }
    //初始化tabItem
    fun initTabItem(){
        val tabList= mutableListOf("我的","发现","云村","视频")
        for (x in 0..3) {
            val tab = tab_layout.newTab()
            val inflate = View.inflate(this, R.layout.layout_tab, null)
            val textView = inflate.findViewById<TextView>(R.id.tab_item_textview)
            textView.setText(tabList.get(x))
            tab.setCustomView(inflate)
            tab_layout.addTab(tab)
        }
        //自定义的Adapter继承自FragmentPagerAdapter
        val adapter = MyPagerAdapter(supportFragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        //ViewPager设置Adapter
        mViewPager.setAdapter(adapter);
        //为ViewPager添加页面改变监听
        mViewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
        val view0 = tab_layout.getTabAt(0)!!.customView
        val view1 = tab_layout.getTabAt(1)!!.customView
        val view2 = tab_layout.getTabAt(2)!!.customView
        val view3 = tab_layout.getTabAt(3)!!.customView
        val textView0 = view0!!.findViewById<TextView>(R.id.tab_item_textview);
        val textView1 = view1!!.findViewById<TextView>(R.id.tab_item_textview);
        val textView2 = view2!!.findViewById<TextView>(R.id.tab_item_textview);
        val textView3 = view3!!.findViewById<TextView>(R.id.tab_item_textview);

        //为TabLayout添加Tab选择监听
        tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                mViewPager.setCurrentItem(tab.getPosition(),true);
                val view = tab.getCustomView();
                if (null == view) {
                    tab.setCustomView(R.layout.layout_tab);
                }
                val textView = view!!.findViewById<TextView>(R.id.tab_item_textview);
                textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18f);
                textView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                if(tab.getPosition()==0){
                    openDrawer.setImageResource(R.mipmap.z30)
                    search.setImageResource(R.mipmap.z31)
                    textView0.setTextColor(resources.getColor(R.color.White))
                    textView1.setTextColor(resources.getColor(R.color.White))
                    textView2.setTextColor(resources.getColor(R.color.White))
                    textView3.setTextColor(resources.getColor(R.color.White))
                }else{
                    openDrawer.setImageResource(R.mipmap.z01)
                    search.setImageResource(R.mipmap.z02)
                    textView0.setTextColor(resources.getColor(R.color.Black))
                    textView1.setTextColor(resources.getColor(R.color.Black))
                    textView2.setTextColor(resources.getColor(R.color.Black))
                    textView3.setTextColor(resources.getColor(R.color.Black))
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                val view = tab.getCustomView();
                if (null == view) {
                    tab.setCustomView(R.layout.layout_tab);
                }
                val textView = view!!.findViewById<TextView>(R.id.tab_item_textview);
                textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 15f);
                textView.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                if(tab.getPosition()==0){
                    openDrawer.setImageResource(R.mipmap.z01)
                    search.setImageResource(R.mipmap.z02)
                    textView0.setTextColor(resources.getColor(R.color.White))
                    textView1.setTextColor(resources.getColor(R.color.White))
                    textView2.setTextColor(resources.getColor(R.color.White))
                    textView3.setTextColor(resources.getColor(R.color.White))
                }else{
                    textView0.setTextColor(resources.getColor(R.color.Black))
                    textView1.setTextColor(resources.getColor(R.color.Black))
                    textView2.setTextColor(resources.getColor(R.color.Black))
                    textView3.setTextColor(resources.getColor(R.color.Black))
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

        //设置ViewPager预加载的View数目
        mViewPager.setOffscreenPageLimit(2)
        //默认
        tab_layout.getTabAt(1)!!.select()
    }

    fun initOpenDrawer(){
        openDrawer.setOnClickListener {
           if(!drawerLayout.isDrawerOpen(GravityCompat.START)){
               drawerLayout.openDrawer(GravityCompat.START)
           }
        }
    }

}
