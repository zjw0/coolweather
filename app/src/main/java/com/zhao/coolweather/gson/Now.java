package com.zhao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhao on 2017/6/4.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public  More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
