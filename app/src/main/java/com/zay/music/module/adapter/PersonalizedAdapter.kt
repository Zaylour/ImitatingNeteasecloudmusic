package com.zay.music.module.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.zay.music.R
import com.zay.music.module.bean.RecommendSongs
import com.zay.music.util.Util

import com.facebook.drawee.view.SimpleDraweeView


class PersonalizedAdapter() : BaseQuickAdapter<RecommendSongs.ResultBean, BaseViewHolder>(R.layout.personalized_item)  {



    override fun convert(helper: BaseViewHolder, item: RecommendSongs.ResultBean?) {
        val draweeView = helper.getView<SimpleDraweeView>(R.id.img) as SimpleDraweeView
        draweeView.setImageURI(item!!.picUrl)
        helper.setText(R.id.num, Util.formatNum(item.playCount.toString(),false))
        helper.setText(R.id.name,item.name)
    }

}