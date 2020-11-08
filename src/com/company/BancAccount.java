package com.company;

public class BancAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }


    public void deposit(double sum){
        amount += sum;


    }

    public void withDraw( double sum) throws LimitException {
        if(amount < sum){

            throw new LimitException("У вас недостаточно баланса", 2.5);

        }else {
            amount -= sum ;
            System.out.println("Вы сняли со счета" + sum);
            System.out.println("Ваш счет " + amount );
        }

    }



}
