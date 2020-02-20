package com.zay.music.module.mainmodule.adapter

import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.facebook.drawee.view.SimpleDraweeView

import com.zay.music.R
import com.zay.music.module.mainmodule.bean.NewSongBaen
import com.zay.music.module.mainmodule.bean.RecommendSongs

class NewSongAdapter  () : BaseQuickAdapter<NewSongBaen.ResultBean, BaseViewHolder>(R.layout.songs_item)  {

    override fun convert(helper: BaseViewHolder, item: NewSongBaen.ResultBean?) {
        helper.getView<SimpleDraweeView>(R.id.img).setImageURI(item!!.picUrl)
        helper.setText(R.id.songName,item.name)
        helper.setText(R.id.name," - "+item.song.artists[0].name)
        helper.setText(R.id.detail,item.song.album.name)
    }



}