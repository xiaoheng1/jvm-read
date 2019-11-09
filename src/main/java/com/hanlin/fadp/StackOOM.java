package com.hanlin.fadp;

public class StackOOM {

    private static int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }
    public static void main(String[] args) throws Throwable {
        StackOOM stackOOM = new StackOOM();

        try{
            stackOOM.stackLeak();
        }catch (Throwable e){
            System.out.println(stackLength);
            throw e;
        }

    }
}
