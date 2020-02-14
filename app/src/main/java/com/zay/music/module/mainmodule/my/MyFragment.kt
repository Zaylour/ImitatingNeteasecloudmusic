package com.zay.music.module.mainmodule.my


import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.qmuiteam.qmui.util.QMUIDisplayHelper.getStatusBarHeight
import com.zay.music.R
import com.zay.music.base.BaseFragmentBinding
import com.zay.music.databinding.FoundfragmentLayoutBinding
import com.zay.music.module.mainmodule.adapter.CollectSongAdapter
import com.zay.music.module.mainmodule.adapter.MyMusicItemAdapter
import com.zay.music.module.mainmodule.bean.MyBean
import com.zay.music.module.mainmodule.bean.MyMusicItemBean
import com.zay.music.module.mainmodule.bean.MyRecentlyItemBean
import kotlinx.android.synthetic.main.myfragment_layout.*

class MyFragment : BaseFragmentBinding<MyViewModel, FoundfragmentLayoutBinding>() {
    var slidingDistance: Int = 0
    var compatPadingTop = 100
    var scrolledY = 0
    var datas= mutableListOf<MyBean>()
    var adapter=CollectSongAdapter()
    override val layoutId: Int
        get() = R.layout.myfragment_layout

    override fun init() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.data.clear()
        initSlidingParams()
        initRecyclerView()
        initMusicItem()
        initRecently()
    }
    /**
     * 初始化滑动参数,k值
     */
    private fun initSlidingParams() {
        compatPadingTop = getStatusBarHeight(activity)//状态栏的高度
        val headerSize = resources.getDimensionPixelOffset(R.dimen.home_header_size)
        val navBarHeight = resources.getDimensionPixelOffset(R.dimen.tab_bar_height)
        val tabStripHeight = resources.getDimensionPixelOffset(R.dimen.tabstrip_height)
        slidingDistance = headerSize - navBarHeight - compatPadingTop - tabStripHeight
    }


    fun initRecyclerView(){
        //给recylcer列表增加info_panel 一样高的headview
        val header = View(context)
        header.layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
        )
        header.layoutParams.height = resources.getDimensionPixelOffset(R.dimen.home_header_size)
        adapter.setHeaderView(header)
        val mLinearLayout = LinearLayoutManager(activity)
        reclerview.setLayoutManager(mLinearLayout)
        reclerview.adapter=adapter
        reclerview.addOnScrollListener(object :RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                //move head view（根据recyclerview 移动的dy来移动head_view）
                scrolledY += dy
                scrollChangeHeader(scrolledY)
            }
        })
    }
    //根据页面滑动距离改变Header方法
    fun scrollChangeHeader(scrolledY_new:Int){
        // Log.e(TAG, "scrollChangeHeader: scrolledY="+scrolledY );
        //scrolledY 是随着listview下滑而增大，列表上滑回到一开始， scrolledeY是0
        var scrolledY=0
        if (scrolledY_new < 0) {
            scrolledY = 0
        }else{
            scrolledY = scrolledY_new
        }

        if (scrolledY < slidingDistance) {
            //head view
            var deep = scrolledY * 230 / slidingDistance
            llHeader.setPadding(0, -scrolledY, 0, 0)
            if (deep < 60) deep = 60
            if (deep > 255) deep = 255
            gray_cover.setBackgroundColor(Color.argb(deep, 0x22, 0x22, 0x22))
            //indo content
            var y = 255 - scrolledY * 320 / slidingDistance
            if (y < 30) y = 30
            if (y > 255) y = 255
//            img1.setBackgroundColor(Color.argb(y, 0xff, 0x00, 0x00))
            touImg.setImageAlpha(y)
            img1.setImageAlpha(y)
            img2.setImageAlpha(y)
            img3.setImageAlpha(y)
            img4.setImageAlpha(y)
            img5.setImageAlpha(y)
            name.setTextColor(Color.argb(y, 0xff, 0xff, 0xff))
            b1.setTextColor(Color.argb(y, 0xff, 0xff, 0xff))
            b2.setTextColor(Color.argb(y, 0xff, 0xff, 0xff))
            b3.setTextColor(Color.argb(y, 0xff, 0xff, 0xff))
            b4.setTextColor(Color.argb(y, 0xff, 0xff, 0xff))
            b5.setTextColor(Color.argb(y, 0xff, 0xff, 0xff))

        } else {//列表滑动到很下面，数值非常大（actionbar处于最小状态）
            //head view
            llHeader.setPadding(0, -slidingDistance, 0, 0)
            gray_cover.setBackgroundColor(Color.argb(230, 0x22, 0x22, 0x22))
            touImg.setImageAlpha(0)
            img1.setImageAlpha(0)
            img2.setImageAlpha(0)
            img3.setImageAlpha(0)
            img4.setImageAlpha(0)
            img5.setImageAlpha(0)
            name.setTextColor(Color.argb(0, 0xff, 0xff, 0xff))
            b1.setTextColor(Color.argb(0, 0xff, 0xff, 0xff))
            b2.setTextColor(Color.argb(0, 0xff, 0xff, 0xff))
            b3.setTextColor(Color.argb(0, 0xff, 0xff, 0xff))
            b4.setTextColor(Color.argb(0, 0xff, 0xff, 0xff))
            b5.setTextColor(Color.argb(0, 0xff, 0xff, 0xff))


        }
    }

    fun initMusicItem(){
        val music_item= mutableListOf<MyMusicItemBean>()
        music_item.add(MyMusicItemBean(R.mipmap.ic_launcher,"我喜欢的音乐","心动模式",""))
        music_item.add(MyMusicItemBean(R.mipmap.ic_launcher,"私人FM","来这里找好歌",""))
        music_item.add(MyMusicItemBean(R.mipmap.ic_launcher,"ACG专区","","最近使用"))
        music_item.add(MyMusicItemBean(R.mipmap.ic_launcher,"爵士电台","最in爵士乐","推荐"))
        music_item.add(MyMusicItemBean(R.mipmap.ic_launcher,"云村正能量","聆听经典","推荐"))
        val mybean=MyBean()
        mybean.type=1
        mybean.data=music_item
        datas.add(mybean)
    }

    fun initRecently(){
        val data= MyRecentlyItemBean("","","3","视频:xxx","继续播放")
        val mybean=MyBean()
        mybean.type=2
        mybean.data=data
        datas.add(mybean)
        adapter.setNewData(datas)
    }

    fun initMyCreateSongSheet(){



    }



}