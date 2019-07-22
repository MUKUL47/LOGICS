/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class bank_const {
    public static void main(String[] args) {
        bank b = new bank("mukul",123);
        b.deposit(100);
        b.deposit(20);
        b.withdraw(1220);
    }
}

class bank{
    public float balance=0;
    public float deposit=0;
    public float withdraw=0;
    private String name;
    private int AccNum;
    
    public bank(String name, int AccNum) {
        this.name = name;
        this.AccNum = AccNum;
        System.out.println("Hello : "+getName()+"\n Your account number : "+getAccNum());
    }

    public String getName() {
        return name;
    }

    public int getAccNum() {
        return AccNum;
    }

    
    public void deposit(float amount){
        this.deposit=amount;
        System.out.println("Amount deposited : "+showDeposit());
        this.balance+=amount;    
        System.out.println("Total balance : "+showBalance());
    }
    public void withdraw(float amount){
        this.withdraw=amount;
        System.out.println("Amount withdraw : "+showWithdraw());
        if(amount>this.balance){
            System.out.println("Not enough balance");
        }
        else{
             this.balance-=amount;    
        System.out.println("Total balance : "+showBalance());
           }
        
        
    }
    float showDeposit(){
        return this.deposit;
    }
    float showBalance(){
        return this.balance;
    }
    float showWithdraw(){
        return this.withdraw;
    }
    
    
}