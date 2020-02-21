package com.zay.music.module.mainmodule.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.facebook.drawee.view.SimpleDraweeView
import com.zay.music.R
import com.zay.music.module.mainmodule.bean.MvBean
import com.zay.music.module.mainmodule.bean.NewSongBaen

class MvAdapter : BaseQuickAdapter<MvBean.DatasBean, BaseViewHolder>(R.layout.mv_item)  {
    override fun convert(helper: BaseViewHolder, item: MvBean.DatasBean?) {
        helper.getView<SimpleDraweeView>(R.id.video_img).setImageURI(item!!.data.coverUrl)
        helper.getView<SimpleDraweeView>(R.id.touxiang).setImageURI(item.data.creator.avatarUrl)
        helper.setText(R.id.name,item.data.creator.nickname)
        helper.setText(R.id.video_title,item.data.title)

    }
}