package com.zay.music.module.mainmodule.adapter

import android.text.TextUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.facebook.drawee.view.SimpleDraweeView
import com.zay.music.R
import com.zay.music.module.mainmodule.bean.MyPlaylist
import com.zay.music.module.mainmodule.bean.RecommendSongs
import com.zay.music.module.mainmodule.bean.SongSheetA

class SongSheetAdapterB : BaseQuickAdapter<MyPlaylist.PlaylistBean, BaseViewHolder>(R.layout.my_songsheet_adapter)  {
    override fun convert(helper: BaseViewHolder, item: MyPlaylist.PlaylistBean?) {
        helper.getView<SimpleDraweeView>(R.id.img).setImageURI(item!!.coverimgurl)
        if(!TextUtils.isEmpty(item.name)){
            helper.setText(R.id.nameA,item.name)
        }
        if(!TextUtils.isEmpty(item.trackcount)){
            helper.setText(R.id.num,item.trackcount.toString()+"首")
        }
    }
}