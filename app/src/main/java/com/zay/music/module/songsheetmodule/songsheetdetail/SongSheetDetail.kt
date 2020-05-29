package com.zay.music.module.songsheetmodule.songsheetdetail

import android.os.Bundle
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.facebook.drawee.view.SimpleDraweeView
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import com.zay.music.R
import com.zay.music.databinding.SongsheetDetailBinding
import com.zay.music.module.adapter.SongSheetPagerAdapter
import com.zay.music.module.songsheetmodule.SongSheetViewModel
import kotlinx.android.synthetic.main.songsheet_detail.*
import android.renderscript.Element.U8_4
import android.renderscript.ScriptIntrinsicBlur
import android.renderscript.RenderScript
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.renderscript.Allocation
import android.renderscript.Element
import androidx.core.graphics.drawable.toBitmap
import androidx.core.graphics.drawable.toDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
class SongSheetDetail : AppCompatActivity(){
    lateinit var mViewModel: SongSheetDetailModel
    var mAdapter: DetailAdapter?=null
    lateinit var binding : SongsheetDetailBinding
    var id=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.songsheet_detail)
        QMUIStatusBarHelper.translucent(this)
        QMUIStatusBarHelper.setStatusBarLightMode(this)
        binding.lifecycleOwner=this
        mViewModel= ViewModelProvider(this).get(SongSheetDetailModel::class.java)
        id=intent.getStringExtra("songSheetId")!!
        initRecyclerView()
    }

    fun initRecyclerView(){
        mAdapter=DetailAdapter()
        val mLinearLayout = LinearLayoutManager(this)
        mRecyclerView.setLayoutManager(mLinearLayout)
        mRecyclerView.adapter=mAdapter
        mViewModel.getData(id)
        mViewModel.dataLiveData.observe(this, Observer {
            //歌单图片
            sheetImg.setImageURI(it.playlist.coverImgUrl)
            //歌单名称
            name.text=it.playlist.name
            //歌单创建者头像
            myImg.setImageURI(it.playlist.creator.avatarUrl)
            //歌单创建者姓名
            creator.text=it.playlist.creator.nickname
            //描述
            describeInfo.text=it.playlist.description
            //总共几首
            num.text="(共"+it.playlist.trackCount+"首)"
            //收藏了几首
            sc_num.text="收藏("+it.playlist.subscribedCount+")"
            Glide.with(this).load(it.playlist.coverImgUrl).into(object :CustomTarget<Drawable>(){
                override fun onLoadCleared(placeholder: Drawable?) {}
                override fun onResourceReady(
                    resource: Drawable,
                    transition: Transition<in Drawable>?
                ) {
                    val bitmap = blur(resource.toBitmap())
                    mAppBarLayout.background= BitmapDrawable(bitmap)
                }
            })
            mAdapter?.setNewData(it.playlist.tracks)
        })
    }

    private fun blur(bitmap: Bitmap, radius: Float=25f): Bitmap {
        val output = Bitmap.createBitmap(bitmap) // 创建输出图片
        val rs = RenderScript.create(this) // 构建一个RenderScript对象
        val gaussianBlue = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs)) // 创建高斯模糊脚本
        val allIn = Allocation.createFromBitmap(rs, bitmap) // 创建用于输入的脚本类型
        val allOut = Allocation.createFromBitmap(rs, output) // 创建用于输出的脚本类型
        gaussianBlue.setRadius(radius) // 设置模糊半径，范围0f<radius<=25f
        gaussianBlue.setInput(allIn) // 设置输入脚本类型
        gaussianBlue.forEach(allOut) // 执行高斯模糊算法，并将结果填入输出脚本类型中
        allOut.copyTo(output) // 将输出内存编码为Bitmap，图片大小必须注意
        rs.destroy() // 关闭RenderScript对象，API>=23则使用rs.releaseAllContexts()
        return output
    }
}