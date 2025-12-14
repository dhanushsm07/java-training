package com.training.exceptionExample;

public class UncheckedException {
    public static void main(String[] args) {
        int a=0;

        try{
            int b = 100/a;
        }
        catch(ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
