package com.zay.music.module.mainmodule.adapter

import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.zay.music.R
import com.zay.music.module.mainmodule.bean.RecommendSongs
import com.zay.music.util.Util

import com.facebook.drawee.view.SimpleDraweeView

import android.net.Uri
import com.facebook.drawee.drawable.ProgressBarDrawable


class PersonalizedAdapter() : BaseQuickAdapter<RecommendSongs.ResultBean, BaseViewHolder>(R.layout.personalized_item)  {



    override fun convert(helper: BaseViewHolder, item: RecommendSongs.ResultBean?) {
        val draweeView = helper.getView<SimpleDraweeView>(R.id.img) as SimpleDraweeView
        draweeView.setImageURI(item!!.picUrl)
        helper.setText(R.id.num, Util.formatNum(item.playCount.toString(),false))
        helper.setText(R.id.name,item.name)
    }

}