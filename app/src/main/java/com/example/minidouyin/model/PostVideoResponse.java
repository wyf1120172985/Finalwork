package com.example.minidouyin.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    @SerializedName("success")
     private  boolean success ;
     @SerializedName("result")
    private Feed item ;

    public void setItem(Feed item) {
        this.item = item;
    }

    public Feed getItem() {
        return this.item;
    }



    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }


}
