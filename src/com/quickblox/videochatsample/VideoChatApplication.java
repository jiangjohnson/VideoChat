package com.quickblox.videochatsample;

import android.app.Application;

import com.quickblox.module.chat.smack.SmackAndroid;
import com.quickblox.module.users.model.QBUser;

public class VideoChatApplication extends Application {

   /* public static final int FIRST_USER_ID = 1686635;
    public static final String FIRST_USER_LOGIN = "jiangjohnson";
    public static final String FIRST_USER_PASSWORD = "98114955";
    //
    public static final int SECOND_USER_ID = 1710347;
    public static final String SECOND_USER_LOGIN = "JennyWang";
    public static final String SECOND_USER_PASSWORD = "98114955";
   */ 
    
	
	public static final int FIRST_USER_ID = 1686635;
    public static final String FIRST_USER_LOGIN = "jiangjohnson";
    public static final String FIRST_USER_PASSWORD = "98114955";
    //
    public static final int SECOND_USER_ID = 1739651;
    public static final String SECOND_USER_LOGIN = "jackycheng";
    public static final String SECOND_USER_PASSWORD = "98114955";

    //
    public static final String APPLICATION_ID = "15292";
    public static final String APPLICATION_KEY = "hmsywSHcw3vNmqV";
    public static final String APPLICATION_SECRET = "OfaKSbpDskZRtme";
    

    private QBUser currentUser;

    @Override
    public void onCreate() {
        super.onCreate();
        SmackAndroid.init(this);
    }

    public void setCurrentUser(int userId, String userPassword) {
        this.currentUser = new QBUser(userId);
        this.currentUser.setPassword(userPassword);
    }

    public QBUser getCurrentUser() {
        return currentUser;
    }
}
