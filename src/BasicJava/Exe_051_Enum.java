package BasicJava;

public class Exe_051_Enum {
    public static void main(String[] args) {

        System.out.println(Locators.page_button.getLocator());
        System.out.println(Locators.page_input.getLocator());
    }
}

enum Locators{
    page_button("#btn"),
    page_input("#input");

    private String locator;

    Locators(String locator) {
        this.locator=locator;
    }

    String getLocator()
    {
        return this.locator;
    }
}
