package com.zay.music.module.mainmodule.adapter

import android.text.TextUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.zay.music.R
import com.zay.music.module.mainmodule.bean.MyMusicItemBean
import com.zay.music.util.Util

class MyMusicItemAdapter : BaseQuickAdapter<MyMusicItemBean, BaseViewHolder>(R.layout.my_music_item2){
    val roundedCorners = RoundedCorners(20)
    var  options = RequestOptions.bitmapTransform(roundedCorners).dontAnimate()
    override fun convert(helper: BaseViewHolder, item: MyMusicItemBean?) {
        Glide.with(context).setDefaultRequestOptions(options).load(item!!.imgUrl).into(helper.getView(R.id.img))
        helper.setText(R.id.nameA,item.nameA)
        helper.setText(R.id.nameB,item.nameB)
        if(TextUtils.isEmpty(item.nameC)){
            helper.setGone(R.id.nameC,true)
        }else{
            helper.setGone(R.id.nameC,false)
            helper.setText(R.id.nameC,item.nameC)
        }
    }
}