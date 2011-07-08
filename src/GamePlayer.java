
/**
 * Autoplay some FB games
 * 
 * @author willywu
 */
public class GamePlayer {
    
    public static final String username = "wu62086";
    public static final String password = "mysecretpassword";
    
    public static void main(String[] args) {
        FreeGiftsGame g = new FreeGiftsGame();
        try {
            g.init(username, password);
            g.openLandingPage();
            g.playGame();
        } finally {
            g.tearDown();
        }
    }
        
}
