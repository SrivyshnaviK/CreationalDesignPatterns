package com.Vyshnavi.objectpoolDP;

class ReusablePool extends Reusable{
    private int maxPoolSize=3,currentObject=1;
    public Reusable getInstance(){
        return new Reusable("Connection Instance:"+currentObject);
    }
    public void releaseInstance(){
        currentObject--;
    }
    public String acquireInstance(){
        String string;
        if(currentObject<=maxPoolSize) {
            string=  getInstance()+" "+currentObject;
            currentObject++;
        }
        else
            string= "Connection Object in Use...Wait for an application to release";
        return string;
    }
}
