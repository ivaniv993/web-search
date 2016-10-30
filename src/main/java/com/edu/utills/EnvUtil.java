package com.edu.utills;

/**
 * Created by iivaniv on 27.10.2016.
 */
public enum EnvUtil {

    HOME_PLACE("HOME_PLACE"),
    WORK_PLACE("WORK_PLACE");

    private String name;

    EnvUtil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
