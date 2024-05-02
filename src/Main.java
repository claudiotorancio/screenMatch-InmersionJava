import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenidos a la inmersion java");
        //System.out.println("Pelicula Matrix");

        int fechaDelanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnPlanBasico = true;
        String nombre = "matrix";
        String sinopsis = """
                Matrix la mejor pelicula del milenio
                """;
        double mediaEvaluacionUsuario =  0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Año: " +fechaDelanzamiento);
        System.out.println("Puntuacion: " + evaluacion);
        System.out.println(incluidoEnPlanBasico);

        double mediaEvaluacion =( 4.5 + 4.8 + 3)/3;

        System.out.println("La media evaluacion es: " + mediaEvaluacion);

        if (fechaDelanzamiento >=  2023) {
            System.out.println("Pelicula popular");
        }else {
            System.out.println("Pelicula Retro");
        }

        for (int i = 0; i < 3 ; i++) {
           Scanner teclado = new Scanner(System.in);
            System.out.println("ingresa evaluacion");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println(" la evaluaxion de matrix matrix" +
                "realizada por el usuario es: " + mediaEvaluacionUsuario/3);

    }
}