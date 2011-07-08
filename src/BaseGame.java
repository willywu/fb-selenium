import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

/**
 * Basic game, handles FB login and Selenium object
 * 
 * @author willywu
 */
public abstract class BaseGame {
    
    Selenium s;
    
    public static final String EMAIL_ID = "id=email";
    public static final String PASSWORD_ID = "id=pass";
    public static final String LOGIN_BUTTON_XPATH = "//input[@value='Log In']";
    public static final String DEFAULT_SELENIUM_TIMEOUT = Integer.toString(20*1000); // 20 seconds
    
    public BaseGame() {
        s = new DefaultSelenium("localhost", 4444, "*firefox", "http://apps.facebook.com/");
    }
    
    public void init(String un, String pw) {
        s.start();
        s.open("/");
        s.type(EMAIL_ID, un);
        s.type(PASSWORD_ID, pw);
        s.click(LOGIN_BUTTON_XPATH);
        s.waitForPageToLoad(DEFAULT_SELENIUM_TIMEOUT);
    }
    
    public void tearDown() {
        s.stop();
    }
    
    public abstract void openLandingPage();
    
    public abstract void playGame();
    
}
