package Modelo;

public class Titulo {
    private String nombre ;
    private int tiempoDeDuracionEnMinutos;
    private int fechaDelanzamiento;
    private double evaluacion;
    private boolean incluidoEnPlanBasico;
    private String sinopsis ;
    private double mediaEvaluacionUsuario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public int getFechaDelanzamiento() {
        return fechaDelanzamiento;
    }

    public void setFechaDelanzamiento(int fechaDelanzamiento) {
        this.fechaDelanzamiento = fechaDelanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public boolean isIncluidoEnPlanBasico() {
        return incluidoEnPlanBasico;
    }

    public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico) {
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public double getMediaEvaluacionUsuario() {
        return mediaEvaluacionUsuario;
    }

    public void setMediaEvaluacionUsuario(double mediaEvaluacionUsuario) {
        this.mediaEvaluacionUsuario = mediaEvaluacionUsuario;
    }

    public void muestraFichaTecnica(){
        System.out.println("#####Ficha Tecnica#####");
        System.out.println("Nombre del titulo: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDelanzamiento);
        System.out.println("Tiempo de duraicon: " + getTiempoDeDuracionEnMinutos() + " minutos");
    };
}
