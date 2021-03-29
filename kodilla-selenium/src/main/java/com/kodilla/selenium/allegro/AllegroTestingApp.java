package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllegroTestingApp {

    private static WebElement categoryCombo;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");              // [1]
        WebDriver driver = new ChromeDriver();                    // [2]
        driver.get("https://www.allegro.pl/");                     // [3]

        WebElement inputField = driver.findElement(By.cssSelector("#opbox-listing")); // [4]
        List<WebElement> element = driver.findElements(By.className("#opbox-listing"));
        inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        inputField.sendKeys("Mavic mini");

        Select category = new Select(categoryCombo);
        category = new Select(categoryCombo);
        category.selectByIndex(3);


    }
}
