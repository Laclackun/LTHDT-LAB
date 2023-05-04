/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_02.Bai_1;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TNMT
 */
public class AccountList {
    private Account[] accList;
    private int count;

    public AccountList() {
        this(10);
    }

    public AccountList(int n) {
        if (n > 0) {
            accList = new Account[n];
        } else {
            accList = new Account[10];
        }
        count = 0;
    }
    
public boolean addAccount(Account account) {
    if (count < accList.length) {
        accList[count++] = account;
        return true;
    }
    return false;
}


public void printAccountList() {
    for (Account account : accList) {
        if (account != null) {
            System.out.println(account.toString());
        }
    }
}

    public Account[] getAccounts() {
    return accList;
}


    @Override
    public String toString() {
        return "AccountList [accList=" + Arrays.toString(accList) + ", count=" + count + "]";
    }


}
