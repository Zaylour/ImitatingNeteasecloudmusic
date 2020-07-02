package com.zay.music.module.adapter

import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.facebook.drawee.view.SimpleDraweeView
import com.google.android.material.shape.RoundedCornerTreatment
import com.zay.music.R
import com.zay.music.module.bean.MvBean
import jp.wasabeef.glide.transformations.RoundedCornersTransformation


class MvAdapter : BaseQuickAdapter<MvBean.DatasBean, BaseViewHolder>(R.layout.mv_item)  {
    var transform: RoundedCornersTransformation = RoundedCornersTransformation(20,0)
    var  options = RequestOptions().transform(transform).dontAnimate()


    override fun convert(helper: BaseViewHolder, item: MvBean.DatasBean) {
        setAnimationWithDefault(AnimationType.AlphaIn)
        addChildClickViewIds(R.id.playBtn)
       // val simpleDraweeView = helper.getView<SimpleDraweeView>(R.id.video_img)
//        simpleDraweeView.setImageURI(item!!.data.coverUrl)


//        val gsyVideoPlayer = helper.getView<StandardGSYVideoPlayer>(R.id.detail_player)
//        val view=SimpleDraweeView(context)
//        view.scaleType=ImageView.ScaleType.CENTER_CROP
//        view.setImageURI(item.data?.previewUrl.toString())
//        gsyVideoPlayer.thumbImageView=view
//        if(item.data.urlInfo!=null){
//            gsyVideoPlayer.setUp(item.data.urlInfo.url,true,null,null,item.data.title)
//        }
//        //增加title
//        gsyVideoPlayer.getTitleTextView().setVisibility(View.GONE)
//        //设置返回键
//        gsyVideoPlayer.getBackButton().setVisibility(View.GONE)
//        //设置全屏按键功能
//        gsyVideoPlayer.getFullscreenButton()
//            .setOnClickListener(object : View.OnClickListener {
//                override fun onClick(v: View) {
//                    gsyVideoPlayer.startWindowFullscreen(context, false, true)
//                }
//            })
//        //防止错位设置
//        if(item.data.urlInfo!=null){
//            gsyVideoPlayer.setPlayTag(item.data.urlInfo.id)
//        }
//        gsyVideoPlayer.setPlayPosition(getItemPosition(item))
//        //是否根据视频尺寸，自动选择竖屏全屏或者横屏全屏
//        gsyVideoPlayer.setAutoFullWithSize(true)
//        //音频焦点冲突时是否释放
//        gsyVideoPlayer.setReleaseWhenLossAudio(false)
//        //全屏动画
//        gsyVideoPlayer.setShowFullAnimation(true)
//        //小屏时不触摸滑动
//        gsyVideoPlayer.setIsTouchWiget(false)


        helper.getView<SimpleDraweeView>(R.id.touxiang).setImageURI(item.data.creator.avatarUrl)
        Glide.with(context).setDefaultRequestOptions(options).load(item.data.coverUrl).into(helper.getView(R.id.detail_img))
        helper.setText(R.id.name,item.data.creator.nickname)
        helper.setText(R.id.video_title,item.data.title)
    }
}