import Modelo.Pelicula;
import Modelo.Serie;
import calculo.CalculadoraDeTiempo;

import java.util.Scanner;

public class Principal {
    Pelicula peliculaUsuario = new Pelicula();
    Serie serieUsuario = new Serie();
    CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();

    public void muestraElMenu() {
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);

        while (opcion != 9){
            String Menu = """
                    Bienvenido(a) a ScreenMatch
                    1) Registrar nueva Pelicula
                    2) Registrar una nueva serie
                    3) Calculadora de tiempo
                    9) Salir
                    """;
            System.out.println(Menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la pelicula");
                    int fechaDLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos de la pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDelanzamiento(fechaDLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el numero de temporadas de la serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la cantidad de episodios por temporadas");
                    int episodiosPorTemporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos de los episodios por temporadas");
                    int minutosPorEpisodios = teclado.nextInt();
                    teclado.nextLine();

                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDelanzamiento(fechaDLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporadas(episodiosPorTemporadas);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(minutosPorEpisodios);
                    serieUsuario.muestraFichaTecnica();
                    break;

                case 3:
                    calculadoraDeTiempo.incluye(peliculaUsuario);
                    calculadoraDeTiempo.incluye(serieUsuario);
                    System.out.printf("Tiempo de duracion en minutos de los titulos seleccioados: " +
                            calculadoraDeTiempo.getTiempoTotal() + " minutos");
                    break;
                case 9:
                    System.out.println(" saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            };
        }
    }
}
