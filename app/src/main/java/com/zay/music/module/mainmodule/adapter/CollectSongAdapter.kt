package com.zay.music.module.mainmodule.adapter

import android.graphics.Color
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseDelegateMultiAdapter
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.delegate.BaseMultiTypeDelegate

import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.tencent.mmkv.MMKV
import com.zay.music.R
import com.zay.music.module.mainmodule.bean.*
import com.zay.music.module.mainmodule.found.NewSongItemDecoration
import com.zay.music.module.mainmodule.my.SongItemDecoration
import com.zay.music.module.mainmodule.my.SpacesItemDecoration
import com.zay.music.util.ToastMessage
import kotlinx.android.synthetic.main.foundfragment_layout.*

//(R.layout.collect_song_item)
class CollectSongAdapter : BaseDelegateMultiAdapter<MyBean, BaseViewHolder>() {
    var kv = MMKV.defaultMMKV()
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
                val userId = kv.decodeString("userId")
                val recycViewA = helper.getView<RecyclerView>(R.id.tabA_RacyclerView)
                val recycViewB = helper.getView<RecyclerView>(R.id.tabB_RacyclerView)
                val mLinearLayout = GridLayoutManager(context, 2, RecyclerView.VERTICAL,false)
                val mLinearLayout2 = GridLayoutManager(context, 2, RecyclerView.VERTICAL,false)
                val songSheetA= mutableListOf<MyPlaylist.PlaylistBean>()
                val playlist = item!!.data as MyPlaylist
                val playlistData = playlist.playlist
                val iterator = playlistData.iterator()
                while(iterator.hasNext()){
                    val bean = iterator.next()
                    if(bean.userid.equals(userId)){
                        songSheetA.add(bean)
                        iterator.remove()
                    }
                }

                val tabAdapter=SongSheetAdapterA()
                recycViewA.layoutManager=mLinearLayout
                recycViewA.adapter=tabAdapter
                recycViewA.addItemDecoration(SongItemDecoration())
                tabAdapter.setNewData(songSheetA)

                val tabBdapter=SongSheetAdapterB()
                recycViewB.layoutManager=mLinearLayout2
                recycViewB.adapter=tabBdapter
                recycViewB.addItemDecoration(SongItemDecoration())
                tabBdapter.setNewData(playlistData)

                helper.getView<TextView>(R.id.titleA).setOnClickListener {


                    helper.setGone(R.id.tabA_RacyclerView,false)
                    helper.setGone(R.id.tabB_RacyclerView,true)
                    helper.getView<TextView>(R.id.titleA).setTextColor(Color.parseColor("#333333"))
                    helper.getView<TextView>(R.id.titleB).setTextColor(Color.parseColor("#9B9B9B"))
                }

                helper.getView<TextView>(R.id.titleB).setOnClickListener {
                    helper.setGone(R.id.tabA_RacyclerView,true)
                    helper.setGone(R.id.tabB_RacyclerView,false)
                    helper.getView<TextView>(R.id.titleA).setTextColor(Color.parseColor("#9B9B9B"))
                    helper.getView<TextView>(R.id.titleB).setTextColor(Color.parseColor("#333333"))
                }
            }
        }
    }
}