package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

    BancAccount bank = new BancAccount();
    bank.deposit(20000);
    while (true){
        try{
            bank.withDraw(4500);
        } catch (LimitException e ){
            bank.withDraw(bank.getAmount());
            break;

        }


    }




    }
}
