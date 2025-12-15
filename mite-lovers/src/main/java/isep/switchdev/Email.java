package isep.switchdev;

import isep.switchdev.Enum.Country;

public class Email {

    private String userName;
    private String domain;



    public Email(String userName, String domain) {
        this.userName=userName;
        this.domain=domain;
    }


    public String getUserName() {return userName;}

    public String getDomain() {return domain;}


    public void setUserName(String userName) {this.userName=userName;}

    public void setDomain(String domain) {this.domain=domain;}

    public String getFullEmail(){return userName + "@"+domain;}

    @Override
    public String toString(){
        return getFullEmail();
    }
}
