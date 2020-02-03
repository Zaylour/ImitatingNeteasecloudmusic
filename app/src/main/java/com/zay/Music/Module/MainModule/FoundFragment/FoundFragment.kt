package com.zay.Music.Module.MainModule.FoundFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.stx.xhb.androidx.XBanner
import com.zay.Music.Module.MainModule.bean.BannerDataBean
import com.zay.Music.R
import kotlinx.android.synthetic.main.foundfragment_layout.*
import android.widget.Toast
class FoundFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View? = null
        try {
            view = inflater.inflate(
                R.layout.foundfragment_layout,
                container, false)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initBanner()
    }

    //初始化banner
    fun initBanner(){
        val bannerDates= mutableListOf<BannerDataBean>()
        bannerDates.add(BannerDataBean("ceshi"))
        bannerDates.add(BannerDataBean("ceshi"))
        bannerDates.add(BannerDataBean("ceshi"))
        //添加轮播图片数据（图片数据不局限于网络图片、本地资源文件、View 都可以）,刷新数据也是调用该方法
        xbanner.setBannerData(bannerDates);
        //加载广告图片
        xbanner.loadImage(XBanner.XBannerAdapter { banner, model, view, position ->
            //1、此处使用的Glide加载图片，可自行替换自己项目中的图片加载框架
            //2、返回的图片路径为Object类型，你只需要强转成你传输的类型就行，切记不要胡乱强转！
            Glide.with(context!!)
                .load((model as BannerDataBean).getXBannerUrl())
                .placeholder(R.mipmap.ceshi)
                .error(R.mipmap.ceshi)
                .into(view as ImageView)
        })
        xbanner.setOnItemClickListener(XBanner.OnItemClickListener { banner, model, view, position ->
            Toast.makeText(
                context,
                "点击了第" + position + "图片",
                Toast.LENGTH_SHORT
            ).show()
        })
    }


}