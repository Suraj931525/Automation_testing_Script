package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.setup;
import com.pom.AddTobag;
import com.pom.AddToWishList;
import com.pom.SearchBox;
import com.pom.Sign_Up;

public class test{

    @BeforeClass
    public void setupBrowser() {

        setup.initializeDriver();
    }

    @Test(priority = 1)
    public void signupTest() {

        Sign_Up signup = new Sign_Up();
        signup.signup();
    }

    @Test(priority = 2)
    public void searchTest() {

        SearchBox search = new SearchBox();
        search.search();
    }

    @Test(priority = 3)
    public void wishlistTest() {

        AddToWishList wishlist = new AddToWishList();
        wishlist.addToWishList();
    }

    @Test(priority = 4)
    public void addBagTest() {

        AddTobag bag = new AddTobag();
        bag.addBag();
    }

    @AfterClass
    public void closeBrowser() {

        setup.closeDriver();
    }
}