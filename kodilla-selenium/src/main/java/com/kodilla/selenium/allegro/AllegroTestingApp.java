/*package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");              // [1]
        WebDriver driver = new ChromeDriver();                    // [2]
        driver.get("https://www.allegro.pl/");                     // [3]

        WebElement inputField = driver.findElement(By.xpath("//+[@id=\"main_wrapper\"]/div/span/span/select[3]")); // [4]
        inputField.sendKeys("Mavic mini");
        //inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        //inputField.sendKeys("Haslo");

        //Select category = new Select(categoryCombo);
        //category = new Select(categoryCombo);
        //category.selectByIndex(3);


    }
}*/
