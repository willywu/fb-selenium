 
/**
 * Autoclick the giraffe game.  Heck yeah.
 * 
 * @author willywu
 */
public class FreeGiftsGame extends BaseGame {
    
    public static final String RACE_BUTTON = "app2415466380_raceButton";
    public static final String DIFFICULTY_DROPDOWN = "app2415466380_difficulty";

    public void openLandingPage() {
        s.open("/freegifts/games.php?action=race");
    }
    
    public void playGame() {
        s.select(DIFFICULTY_DROPDOWN, "Hard");
        for (int i=0; i<10000; i++) {
            s.mouseUp(RACE_BUTTON);
            if (i % 100 == 0) {
                System.out.println(String.format("Clicked %s times...", i));
            }
        }
    }
}
