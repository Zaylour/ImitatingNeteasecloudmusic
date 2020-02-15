package com.zay.music.module.mainmodule.adapter

import android.text.TextUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.zay.music.R
import com.zay.music.module.mainmodule.bean.MyPlaylist
import com.zay.music.module.mainmodule.bean.RecommendSongs
import com.zay.music.module.mainmodule.bean.SongSheetA

class SongSheetAdapterA : BaseQuickAdapter<MyPlaylist.PlaylistBean, BaseViewHolder>(R.layout.my_songsheet_adapter)  {
    val roundedCorners = RoundedCorners(20)
    var  options = RequestOptions.bitmapTransform(roundedCorners).dontAnimate()
    override fun convert(helper: BaseViewHolder, item: MyPlaylist.PlaylistBean?) {
        Glide.with(context).setDefaultRequestOptions(options).load(item!!.coverimgurl).into(helper.getView(R.id.img))
        if(!TextUtils.isEmpty(item.name)){
            helper.setText(R.id.nameA,item.name)
        }
        if(!TextUtils.isEmpty(item.trackcount)){
            helper.setText(R.id.num,item.trackcount.toString()+"首")
        }



    }
}