package com.example.hwn_26_06_springconditional;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile(){
        return "Current profile is dev.";
    }
}
