package com.zay.music.module.mainmodule.adapter

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseDelegateMultiAdapter
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.delegate.BaseMultiTypeDelegate

import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.zay.music.R
import com.zay.music.module.mainmodule.bean.MyBean
import com.zay.music.module.mainmodule.bean.MyMusicItemBean
import com.zay.music.module.mainmodule.bean.MyRecentlyItemBean
import com.zay.music.module.mainmodule.bean.RecommendSongs
import com.zay.music.module.mainmodule.my.SpacesItemDecoration
import kotlinx.android.synthetic.main.foundfragment_layout.*

//(R.layout.collect_song_item)
class CollectSongAdapter : BaseDelegateMultiAdapter<MyBean, BaseViewHolder>() {
    init {
        setMultiTypeDelegate(object : BaseMultiTypeDelegate<MyBean>() {
            override fun getItemType(data: List<MyBean>, position: Int): Int {
                //    1:我的音乐布局  2.最近播放  3.创建歌单，收藏歌单
                return data.get(position).type
            }
        })

        getMultiTypeDelegate()!!
            .addItemType(1, R.layout.my_music_item)
            .addItemType(2, R.layout.my_recently_item)
            .addItemType(3, R.layout.my_songsheet_item)
    }

    override fun convert(helper: BaseViewHolder, item: MyBean?) {
        // 1:我的音乐布局  2.最近播放  3.创建歌单，收藏歌单
        when (helper.itemViewType) {
            1 -> {
                val adapter = MyMusicItemAdapter()
                val mLinearLayout = LinearLayoutManager(context)
                mLinearLayout.orientation = LinearLayoutManager.HORIZONTAL
                val myMusicReccyView = helper.getView<RecyclerView>(R.id.myMusicReccyView)
                myMusicReccyView.setLayoutManager(mLinearLayout)
                myMusicReccyView.addItemDecoration(SpacesItemDecoration())
                myMusicReccyView.adapter = adapter
                myMusicReccyView.addItemDecoration(SpacesItemDecoration())
                adapter.setNewData(item!!.data as MutableList<MyMusicItemBean>)
            }
            2->{
                val myRecentlyItemBean = item!!.data as MyRecentlyItemBean
                helper.setText(R.id.num,myRecentlyItemBean.num+"首")
                helper.setText(R.id.nameB,myRecentlyItemBean.nameB)
                helper.setText(R.id.nameC,myRecentlyItemBean.nameC)
            }
            3->{

            }

        }
    }
}