package com.company;

class CustomException extends Exception{
    private String message;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity8 {
    public static void exceptionTest(String str) throws CustomException{
        if(str == null)
            new CustomException("String value is null");
        else
            System.out.println(str);

    }

    public static void main(String[] args) {
        try {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Won't execute");
        }catch (CustomException mae){
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }
}
