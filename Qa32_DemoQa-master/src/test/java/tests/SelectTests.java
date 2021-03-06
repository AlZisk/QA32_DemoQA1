package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SelectTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.select().selectItemWidgets();
        app.select().clickSelectMenu();

    }

    @Test
    public void oldStyleSelectMenu() {
        app.select().selectColor("Red");
        app.select().pause(2000);
        app.select().selectColor("Green");
        app.select().pause(2000);
        app.select().selectColor("Blue");
        app.select().pause(2000);
        app.select().selectColor("Red");

    }

    @Test
    public void standardMultiSelectTest() {
        app.select().multiSelectCar("volvo,saab,opel");
    }

    @Test
    public void selectOneTest() {
        app.select().selectSalutation("Mrs.");
        app.select().pause(2000);
        app.select().selectSalutation("Mr.");
        app.select().pause(2000);
        app.select().selectSalutation("Dr.");
    }

    @Test
    public void selectValue(){
        app.select().selectGroupOption("Group 1, option 1");

    }
}
