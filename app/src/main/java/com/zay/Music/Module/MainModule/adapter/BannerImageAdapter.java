//package com.zay.Music.Module.MainModule.adapter;
//
//import android.content.Context;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.bumptech.glide.Glide;
//import com.bumptech.glide.request.RequestOptions;
//import com.youth.banner.adapter.BannerAdapter;
//import com.zay.Music.Module.MainModule.bean.BannerDataBean;
//
//import java.util.List;
//
//public class BannerImageAdapter extends BannerAdapter<BannerDataBean, BannerImageAdapter.BannerViewHolder> {
//    Context context;
//    RequestOptions options;
//
//
//    public BannerImageAdapter(List<BannerDataBean> mDatas, Context context) {
//        //设置数据，也可以调用banner提供的方法,或者自己在adapter中实现
//        super(mDatas);
//        this.context=context;
//        this.options=new RequestOptions();
//    }
//
//
//    //创建ViewHolder，可以用viewType这个字段来区分不同的ViewHolder
//    @Override
//    public BannerViewHolder onCreateHolder(ViewGroup parent, int viewType) {
//        ImageView imageView = new ImageView(parent.getContext());
//        //注意，必须设置为match_parent，这个是viewpager2强制要求的
//        imageView.setLayoutParams(new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT));
//        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//        return new BannerViewHolder(imageView);
//    }
//
//    @Override
//    public void onBindView(BannerViewHolder holder, BannerDataBean data, int position, int size) {
//        //holder.imageView.setImageResource(data.getImageRes());
//        Glide.with(context).setDefaultRequestOptions(options).load(data.getImageRes()).into( holder.imageView);
//    }
//
//    class BannerViewHolder extends RecyclerView.ViewHolder {
//        ImageView imageView;
//
//         BannerViewHolder(@NonNull ImageView view) {
//            super(view);
//            this.imageView = view;
//        }
//    }
//}
