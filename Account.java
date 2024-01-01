import java.util.LinkedList;
public class Account{
    private String userName;
    private String accountType;

    public Account(){
        userName = "";
        accountType = "";

    }

    public Account(String name, String type){
        userName = name;
        accountType = type;
    }
    public String getuserName(){
        return userName;
    }
    public String getaccountType(){
        return accountType;
    }
    public void setuserName(String name){
        userName = name;
    }
    public void setaccountType(String type){
        accountType = type;
    }

    public String toString(){
        String S = "";
        S += userName + "\n";
        S += accountType + "\n";
        return S;
    }
}