package com.flash.flashimageloader;

import android.graphics.drawable.Drawable;

/**
 * Created by tianxiaolei on 2017/7/24.
 */

public class ImageLoaderOptions {
    //Glide的设置项
    private int placeHolder = -1; //当没有成功加载的时候显示的图片
    private int errorHolder = -1;  //加载错误的时候显示的drawable
    private int id;
    private String url;
    private Drawable placeHolderDrawable;
    private Drawable errorHolderDrawable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(int placeHolder) {
        this.placeHolder = placeHolder;
    }

    public int getErrorHolder() {
        return errorHolder;
    }

    public void setErrorHolder(int errorHolder) {
        this.errorHolder = errorHolder;
    }

    public Drawable getPlaceHolderDrawable() {
        return placeHolderDrawable;
    }

    public void setPlaceHolderDrawable(Drawable placeHolderDrawable) {
        this.placeHolderDrawable = placeHolderDrawable;
    }

    public Drawable getErrorHolderDrawable() {
        return errorHolderDrawable;
    }

    public void setErrorHolderDrawable(Drawable errorHolderDrawable) {
        this.errorHolderDrawable = errorHolderDrawable;
    }

    public ImageLoaderOptions(int id,String url,int placeHolder, int errorHolder, Drawable placeHolderDrawable, Drawable errorHolderDrawable) {
        this.placeHolder = placeHolder;
        this.errorHolder = errorHolder;
        this.placeHolderDrawable = placeHolderDrawable;
        this.errorHolderDrawable = errorHolderDrawable;
        this.id = id;
        this.url = url;
    }

    public static final class Builder{
        private int placeHolder=-1;
        private int errorHolder=-1;
        private Drawable placeHolderDrawable;
        private Drawable errorHolderDrawable;
        private int id;
        private String url;

        public Builder (){}

        public Builder placeHolder(int placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }

        public Builder placeHolder(Drawable placeHolder){
            this.placeHolderDrawable = placeHolder;
            return this;
        }

        public Builder errorHolder(int errorHolder){
            this.errorHolder = errorHolder;
            return this;
        }

        public Builder errorHolder(Drawable errorHolder){
            this.errorHolderDrawable = errorHolder;
            return this;
        }

        public Builder load(int id){
            this.id = id;
            return this;
        }

        public Builder load(String url){
            this.url = url;
            return this;
        }

        public ImageLoaderOptions build(){
            return new ImageLoaderOptions(id,url,placeHolder,errorHolder,placeHolderDrawable,errorHolderDrawable);
        }
    }
}
