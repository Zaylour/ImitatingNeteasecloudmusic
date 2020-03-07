package com.zay.music.module.songsheetmodule.allsongsheetfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.drawee.view.SimpleDraweeView
import com.wuyr.litepager.LitePager
import com.wuyr.litepager.LitePager.STATE_DRAGGING_LEFT
import com.zay.music.R
import com.zay.music.base.BaseFragmentBinding
import com.zay.music.databinding.AllSongSheetBinding
import com.zay.music.databinding.FragmentMvRecommendBinding
import com.zay.music.module.adapter.PersonalizedAdapter
import com.zay.music.module.adapter.SheetAdapter
import com.zay.music.module.mainmodule.video.subFragment.RecommendMvFragment
import kotlinx.android.synthetic.main.all_song_sheet.*
import com.chad.library.adapter.base.BaseQuickAdapter
import androidx.annotation.NonNull
import com.chad.library.adapter.base.listener.OnItemClickListener


class AllSongSheet() : BaseFragmentBinding<AllSheetViewModel, AllSongSheetBinding>() {
    override val layoutId: Int
        get() = R.layout.all_song_sheet
    var tabName = ""
    var position = 0
    var sheetAdapter:SheetAdapter?=null
    constructor(position:Int,tabName: String) : this() {
        this.position = position
        this.tabName = tabName
    }

    companion object {
        fun instance(position:Int,tabName: String): AllSongSheet {
            return AllSongSheet(position,tabName)
        }
    }

    override fun init() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        initRecyclerView()

    }

    fun initRecyclerView() {
        sheetAdapter = SheetAdapter()
        sheetAdapter!!.data.clear()
        val mLinearLayout = GridLayoutManager(activity, 3, RecyclerView.VERTICAL,false)
        mRecyclerView.setLayoutManager(mLinearLayout)
        mRecyclerView.adapter=sheetAdapter
        mViewModel.getTopPlaylist(tabName)
        mViewModel.topPlaylistLiveData.observe(binding.lifecycleOwner!!, Observer {
            if(position==0){
                mLitePager.visibility=View.VISIBLE
                val subList = it.playlists.subList(0, 3)
                subList.forEach {
                    val layoutView = View.inflate(activity, R.layout.one_sheet_top, null)
                    val simpleDraweeView = layoutView.findViewById<SimpleDraweeView>(R.id.img)
                    simpleDraweeView.setImageURI(it.coverImgUrl)
                    val title = layoutView.findViewById<TextView>(com.zay.music.R.id.title)
                    title.text=it.name
                    mLitePager.addViews(layoutView)
                }
                mLitePager.setOnScrollListener( object :LitePager.OnScrollListener{
                    override fun onStateChanged(newState: Int) {

                    }
                })
                sheetAdapter!!.setNewData(it.playlists.subList(4, it.playlists.size-1))
            }else{
                mLitePager.visibility=View.GONE
                sheetAdapter!!.setNewData(it.playlists)
//                sheetAdapter!!. setOnItemClickListener { adapter, view, position ->
//
//
//
//                }
            }
        })



    }
}