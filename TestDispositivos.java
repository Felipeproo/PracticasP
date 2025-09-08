public class TestDispositivos {

    public static void main(String[] args) {

        // Instancias de dispositivos
        Computadoras Computadoras = new Computadoras("cuatro de ram", "Sony", "tipo psu", "tres horas");
        Tabletas Tabletas = new Tabletas("seis de ram", "Alcatel", "tipo c", "cinco horas");
        Telefonos Telefonos = new Telefonos("ocho de ram.", "iphone", "siete horas", "Tipo c");
        Laptops Laptops = new Laptops("dieciseis de ram.", "lenovo", "hdmi", "realtek", "ocho horas");

        // Array de DispositivosElectronicos y polimorfismo
        DispositivosElectronicos[] dispositivosElectronicos= new DispositivosElectronicos[4];

        dispositivosElectronicos[0] = Computadoras;
        dispositivosElectronicos[1] = Tabletas;
        dispositivosElectronicos[2] = Telefonos;
        dispositivosElectronicos[3] = Laptops;

        System.out.println("");

        // Mostrar información
        for (DispositivosElectronicos DispositivosElectronicos : dispositivosElectronicos) {
            System.out.println("Marca: " + DispositivosElectronicos.getMarca());
            System.out.println("Almacenamiento: " + DispositivosElectronicos.getAlmacenamiento());
            System.out.println("DuracionCarga: " + DispositivosElectronicos.DuracionCarga());
         
            if (DispositivosElectronicos instanceof Tabletas) {
               Tabletas  play = (Tabletas) DispositivosElectronicos;
            
               System.out.println("conectividad: " + play.getConectividad());
            }
        }
    }
}