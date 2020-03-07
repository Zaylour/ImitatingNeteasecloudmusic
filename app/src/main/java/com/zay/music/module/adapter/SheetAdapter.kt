package com.zay.music.module.adapter

import android.content.Intent
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.zay.music.R
import com.zay.music.module.bean.RecommendSongs
import com.zay.music.util.Util

import com.facebook.drawee.view.SimpleDraweeView
import com.zay.music.module.bean.SheetBean
import com.zay.music.module.songsheetmodule.songsheetdetail.SongSheetDetail


class SheetAdapter() : BaseQuickAdapter<SheetBean.PlaylistsBean, BaseViewHolder>(R.layout.personalized_item)  {
    override fun convert(helper: BaseViewHolder, item: SheetBean.PlaylistsBean) {
        val draweeView = helper.getView<SimpleDraweeView>(R.id.img)
        draweeView.setImageURI(item.coverImgUrl)
        helper.setText(R.id.num, Util.formatNum(item.playCount.toString(),false))
        helper.setText(R.id.name,item.name)
        setOnItemClickListener { adapter, view, position ->
            val intent=Intent(context, SongSheetDetail::class.java)
            intent.putExtra("songSheetId",item.id)
            context.startActivity(intent)
        }
    }

}