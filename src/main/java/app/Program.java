package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.ListarVehiculosView;
import views.Menu;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        //ListarVehiculosView view = new ListarVehiculosView(this);
           Menu v1 = new Menu();
       v1.setVisible(true);
    }
}
