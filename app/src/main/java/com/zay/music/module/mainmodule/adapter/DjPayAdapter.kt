package com.zay.music.module.mainmodule.adapter

import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.facebook.drawee.view.SimpleDraweeView

import com.zay.music.R
import com.zay.music.module.mainmodule.bean.DjPayBean
import com.zay.music.module.mainmodule.bean.RecommendSongs
import com.zay.music.util.Util

class DjPayAdapter() : BaseQuickAdapter<DjPayBean.DataBean.ListBean, BaseViewHolder>(R.layout.djpay_item)  {
    override fun convert(helper: BaseViewHolder, item: DjPayBean.DataBean.ListBean?) {
        helper.getView<SimpleDraweeView>(R.id.img).setImageURI(item!!.picUrl)
        helper.setText(R.id.title,item.creatorName)
        helper.setText(R.id.name,item.name)
    }
}