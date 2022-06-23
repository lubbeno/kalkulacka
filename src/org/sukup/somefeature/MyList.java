package org.sukup.somefeature;

public class MyList {

    private String  operatingSystem;
    private String homeDir;
    private String userName;
    private int processorLevel;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getHomeDir() {
        return homeDir;
    }

    public void setHomeDir(String homeDir) {
        this.homeDir = homeDir;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getProcessorLevel() {
        return processorLevel;
    }

    public void setProcessorLevel(String processorLevel) {
        this.processorLevel = Integer.parseInt(processorLevel);
    }
}
