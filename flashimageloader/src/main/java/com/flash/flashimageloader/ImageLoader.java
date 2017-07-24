package com.flash.flashimageloader;

import android.support.v4.app.Fragment;
import android.widget.ImageView;

/**
 * Created by tianxiaolei on 2017/7/24.
 */

public interface ImageLoader {
    void loadImage(ImageView imageView,ImageLoaderOptions options);
    void loadImage(Fragment fragment,ImageView imageView,ImageLoaderOptions options);
}
