package MainPackage;

public class Main {
    
    private static MainScreen MainScreen = new MainScreen();
    private static Database Database = new Database();
    
    public static void main(String[] args) {
        
        init();
        
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                Database.saveScientists();
            }
        }));
        
    }
    
    private static void init(){
        Database.loadPlanets();
        Database.loadScientists();
        MainScreen.renderPublicPlanets();
        MainScreen.renderScientists();
        
        MainScreen.getPublicPlanetsTree().addMouseListener( MainScreen.addMouseListenerTree1() );
        MainScreen.getPublicPlanetsTree().setComponentPopupMenu( MainScreen.getPopUpMenu() );
        
        MainScreen.getDiscoveredPlanetsTree().addMouseListener( MainScreen.AddMouseListenerTree2() );
        MainScreen.getDiscoveredPlanetsTree().setComponentPopupMenu( MainScreen.getPopUpMenu() );
        
        MainScreen.setVisible(true);
    }

    public static Database getDatabase() {
        return Database;
    }

    public static void setDatabase(Database Database) {
        Main.Database = Database;
    }
    
    public static MainScreen getMainScreen() {
        return MainScreen;
    }

    public static void setMainScreen(MainScreen MainScreen) {
        Main.MainScreen = MainScreen;
    }
    
    
}
