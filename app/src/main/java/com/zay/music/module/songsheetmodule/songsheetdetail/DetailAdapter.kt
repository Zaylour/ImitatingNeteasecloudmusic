package com.zay.music.module.songsheetmodule.songsheetdetail

import com.chad.library.adapter.base.BaseDelegateMultiAdapter
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.facebook.drawee.view.SimpleDraweeView
import com.zay.music.R
import com.zay.music.module.bean.MyBean

class DetailAdapter : BaseQuickAdapter<SongSheetDeatilBean.PlaylistBean.TracksBean, BaseViewHolder>(R.layout.song_sheeet_detail_item) {
    override fun convert(helper: BaseViewHolder, item: SongSheetDeatilBean.PlaylistBean.TracksBean) {
        helper.setText(R.id.sheet_num,"1")
        helper.setText(R.id.song_name,item.name)
        if(!item.ar.isEmpty()){
            helper.setText(R.id.song_creator,item.ar.get(0).name+" - "+item.al.name)
        }else{
            helper.setText(R.id.song_creator,item.al.name)
        }

    }

}