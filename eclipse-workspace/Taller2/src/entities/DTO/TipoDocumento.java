package entities.DTO;

public class TipoDocumento {
    
    private Long idTipoDocumento;

    private String descripcion;

    private String abreviatura;

    // Constructor vacío
    public TipoDocumento() {}

      // Getters y Setters
    public Long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    // Método toString para imprimir el objeto fácilmente
    @Override
    public String toString() {
        return "TipoDocumento{" +
                "idTipoDocumento=" + idTipoDocumento +
                ", descripcion='" + descripcion + '\'' +
                ", abreviatura='" + abreviatura + '\'' +
                '}';
    }
}

