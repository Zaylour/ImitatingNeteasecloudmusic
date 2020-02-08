package com.zay.music.module.mainmodule.adapter

import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.zay.music.R
import com.zay.music.module.mainmodule.bean.DjPayBean
import com.zay.music.module.mainmodule.bean.RecommendSongs
import com.zay.music.util.Util

class DjPayAdapter() : BaseQuickAdapter<DjPayBean.DataBean.ListBean, BaseViewHolder>(R.layout.djpay_item)  {
    val roundedCorners = RoundedCorners(20)
    var  options = RequestOptions.bitmapTransform(roundedCorners).dontAnimate()
    override fun convert(helper: BaseViewHolder?, item: DjPayBean.DataBean.ListBean?) {
        Glide.with(mContext).setDefaultRequestOptions(options).load(item!!.picUrl).into(helper!!.getView(R.id.img))
        helper.setText(R.id.title,item.creatorName)
        helper.setText(R.id.name,item.name)
    }
}