package cl.desafiolatam.desafioweather;

public class DailyWeather {
    private String ciudad;
    private String fecha;
    private String imagen;
    private String temperatura;
    private String unidad;

    @Override
    public String toString() {
        return "DailyWeather{" +
                "ciudad='" + ciudad + '\'' +
                ", fecha='" + fecha + '\'' +
                ", imagen='" + imagen + '\'' +
                ", temperatura='" + temperatura + '\'' +
                ", unidad='" + unidad + '\'' +
                '}';
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
