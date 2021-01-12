public class LibraryFacade {
    private Library main;
    private Library oneill;
    private Library valente;
    private Library central;

    public LibraryFacade(){
        main = new MainLibrary();
        oneill = new ONeillLibrary();
        valente = new ValenteLibrary();
        central = new CentralLibrary();
    }

    public String getMainHours(){
        return main.pickUpHours();
    }

    public String getCentralHours(){
        return central.pickUpHours();
    }

    public String getValenteHours(){
        return valente.pickUpHours();
    }

    public String getONeillHours(){
        return oneill.pickUpHours();
    }
}
