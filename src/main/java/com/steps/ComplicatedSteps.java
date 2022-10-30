package com.steps;


import com.pages.ComplicatedPage;

public class ComplicatedSteps {


    ComplicatedPage complicatedpage;

    public void openUrl(){

    }

    public void clickDressOption(){
        complicatedpage.Dress.click();

    }

    public void clickCasualDress(){

        complicatedpage.CasualDress.click();

    }

    public void clickAddToTrolly(){
        complicatedpage.AddToCart.click();
    }

    public void clickProccedToCheckout(){
        complicatedpage.ProccedToCheckout.click();


    }

    public void clickDelete(){
        complicatedpage.Delete.click();
    }


    public void clickPrinttedDress(){

        complicatedpage.PrintedDress.click();

    }

}
