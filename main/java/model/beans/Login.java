package model.beans;

import java.io.Serializable;

public class Login implements Serializable {

    private String application;
    private String appAccountName;
    private boolean isActive;
    private String jobTitle;
    private String department;

    public Login() {
    }

    public Login(String application, String appAccountName, boolean isActive, String jobTitle, String department) {
        this.application = application;
        this.appAccountName = appAccountName;
        this.isActive = isActive;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getAppAccountName() {
        return appAccountName;
    }

    public void setAppAccountName(String appAccountName) {
        this.appAccountName = appAccountName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Login{" +
                "application='" + application + '\'' +
                ", appAccountName='" + appAccountName + '\'' +
                ", isActive=" + isActive +
                ", jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
