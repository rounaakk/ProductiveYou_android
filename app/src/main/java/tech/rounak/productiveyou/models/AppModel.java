package tech.rounak.productiveyou.models;

import android.graphics.drawable.Drawable;

/**
 * Created by Rounak
 * For more info visit https://rounak.tech
 **/

public class AppModel {
    private String appName;
    private String appPkgName;
    private Drawable appIcon;
    private String usageTime ;
    private long usageMillis;


    public AppModel(String name, String pkgName, Drawable icon, String usageTime, long usageMillis) {
        this.appName = name;
        this.appPkgName = pkgName;
        this.appIcon = icon;
        this.usageTime = usageTime;
        this.usageMillis = usageMillis;
    }

    public long getUsageMillis() {
        return usageMillis;
    }

    public void setUsageMillis(long usageMillis) {
        this.usageMillis = usageMillis;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Drawable getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }

    public String getAppPkgName() {
        return appPkgName;
    }

    public void setAppPkgName(String appPkgName) {
        this.appPkgName = appPkgName;
    }

    public String getUsageTime() {
        return usageTime;
    }

    public void setUsageTime(String usageTime) {
        this.usageTime = usageTime;
    }
}
