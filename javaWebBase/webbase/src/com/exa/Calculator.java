package com.exa;

public class Calculator {
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public double getResult() {
        return result;
    }


    public void setResult(double result) {
        this.result = result;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    private String first;
    private String second;
    private double result;
    private String operator;

    public void calculate(){
        double one = Double.parseDouble(first);
        double two = Double.parseDouble(second);

        try {
            if(operator.equals("+")){

                result =  one+ two;

            }else  if(operator.equals("-")){
                result = one - two;
            }else if(operator.equals("*")){
                result  =one * two;

            }else if(operator.equals("/")){
                result = one /two;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }


    }

}
