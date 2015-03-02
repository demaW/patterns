package com.epam.patterns.factory;

public class PageFactory {

    public Page getPage(String pageType) {
        if (pageType == null) {
            return null;
        }
        if (pageType.equalsIgnoreCase("homepage")) {
            return new HomePage();
        } else if (pageType.equalsIgnoreCase("aboutpage")) {
            return new AboutPage();
        }
        return null;
    }


}
