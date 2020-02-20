//package com.zay.music.module.mainmodule.adapter;
//
//import android.util.SparseArray;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.viewpager.widget.PagerAdapter;
//
//public abstract class IPagerAdapter extends PagerAdapter {
//    private SparseArray<Object> mScrapItems = new SparseArray<>();
//
//    public IPagerAdapter() {
//    }
//
//    /**
//     * Hydrating an object is taking an object that exists in memory,
//     * that doesn't yet contain any domain data ("real" data),
//     * and then populating it with domain data.
//     */
//    @NonNull
//    protected abstract Object hydrate(@NonNull ViewGroup container, int position);
//
//    protected abstract void populate(@NonNull ViewGroup container, @NonNull Object item, int position);
//
//    protected abstract void destroy(@NonNull ViewGroup container, int position, @NonNull Object object);
//
//    @Override
//    @NonNull
//    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//        Object item = mScrapItems.get(position);
//        if (item == null) {
//            item = hydrate(container, position);
//            mScrapItems.put(position, item);
//        }
//        populate(container, item, position);
//        return item;
//    }
//
//    @Override
//    public final void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        destroy(container, position, object);
//
//    }
//
//    /**
//     * sometimes you may need to perform some operations on all items,
//     * such as perform cleanup when the ViewPager is destroyed
//     * once the action return true, then do not handle remain items
//     *
//     * @param action
//     */
//    public void each(@NonNull Action action) {
//        int size = mScrapItems.size();
//        for (int i = 0; i < size; i++) {
//            Object item = mScrapItems.valueAt(i);
//            if (action.call(item)) {
//                break;
//            }
//        }
//    }
//
//    public interface Action {
//        /**
//         * @return true to intercept forEach
//         */
//        boolean call(Object item);
//    }
//}
//
