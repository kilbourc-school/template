public abstract class House {

    /**
     * requiremental methods
     */
    public abstract void prepFoundation();
    public abstract void createFrame();
    public abstract void installDrywall();
    public abstract void addWindows();
    public abstract void addElectrical();
    public abstract void addPlumbing();


    /**
     * big print line
     */
    public void buildHouse(){
     prepFoundation();
     createFrame();
     installDrywall();
     addWindows();
     addElectrical();
     addPlumbing();
    }
}
