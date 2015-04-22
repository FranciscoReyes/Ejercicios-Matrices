/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HorariosClase;
// añadir restriccion nombre vacio
// añadir Seguro? al pulsar X en el juego
// añadir colores ventanainicio para User
/**
 *
 * @author Francisco A. Reyes
 */
public class Horario {
    SesionClase [][] horario;
    private int dias;
    private int sesiones;
   
    
    public Horario(int sesionesDia, int dias) {
        horario = new SesionClase [dias][sesionesDia];
        this.dias = dias;
        this.sesiones = sesionesDia;
        
    }
    
    public void setSesionClase(int sesionDia, int dia, String asignatura, String aula, String profesorado) {
        SesionClase sClase;
        horario [dia][sesionDia] = new SesionClase (asignatura, aula, profesorado);
    }
    
    @Override
    public String toString() {
        String muestraHorario = "";
        for (int i=0; i<dias; i++) {
            muestraHorario += ("Día: " + (i+1) +"\n----------\n");
            for (int j=0; j<sesiones;j++) {
                if (horario[i][j] == null) {
                    muestraHorario += ("Sesion " + (j+1) + ": Vacío\n");
                } else {
                    muestraHorario += ("Sesion " + (j+1) + ": " + horario[i][j].toString());
                }
                
            }
        }
        return muestraHorario;
    }
    
}
