package com.flash.flashimageloader;

import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by tianxiaolei on 2017/7/24.
 */

public class GlideImageLoader {
    public static void loadImage(ImageView imageView, ImageLoaderOptions options) {
        loadImage(null, imageView, options);
    }


    public static void loadImage(Fragment fragment, ImageView imageView, ImageLoaderOptions options) {
        if (fragment == null) {
            if (checkContext(imageView.getContext())) {
                loadOptions(loadOptions(Glide.with(imageView.getContext()),options), options).diskCacheStrategy(DiskCacheStrategy.SOURCE).dontAnimate().into(imageView);
            }

        } else {
            if (checkContext(fragment)) {
                loadOptions(loadOptions(Glide.with(fragment), options),options).diskCacheStrategy(DiskCacheStrategy.SOURCE).dontAnimate().into(imageView);
            }

        }

    }


    private static boolean checkContext(Object context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Fragment) {
            if (((Fragment) context).getActivity() == null) {
                return false;
            }
        }
        return true;
    }

    private static DrawableTypeRequest loadOptions(RequestManager requestManager, ImageLoaderOptions options) {
        if (options.getId() > 0) {
            return requestManager.load(options.getId());
        }
        return requestManager.load(options.getUrl());
    }

    private static DrawableRequestBuilder loadOptions(DrawableRequestBuilder requestBuilder, ImageLoaderOptions options) {
        if (options == null) {
            return requestBuilder;
        }

        if (options.getErrorHolderDrawable() != null) {
            requestBuilder.error(options.getErrorHolderDrawable());
        } else if (options.getErrorHolder() > 0) {
            requestBuilder.error(options.getErrorHolder());
        }

        if (options.getPlaceHolderDrawable() != null) {
            requestBuilder.placeholder(options.getPlaceHolderDrawable());
        } else if (options.getPlaceHolder() > 0) {
            requestBuilder.placeholder(options.getPlaceHolder());
        }

        return requestBuilder;
    }
}
