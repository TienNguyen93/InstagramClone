package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, & server based on the values in the Heroku settings
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ilq4Bvudl4Ha41rrjuxfosZnxjtTY2nx3qTDrBgV")
                .clientKey("ZzeqcFbGONA0DY87HMTy8iNGT4FdtfUEyHxNcf3l")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
