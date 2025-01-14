
package tema4;

public class SocioClubPadel {
    private int codigoSocio;
    private String nombreApellidos;
    private int edad;
    private String telefono;
    private String correo;
    private boolean padresSonSocios;
    public static final int CUOTABASE = 800; //Es una constante de clase porque es static, y con estas no vale poner el this.
    
    //Constructor

    public SocioClubPadel(int codigoSocio, String nombreApellidos, int edad, String telefono, String correo, boolean padresSonSocios) {
        this.codigoSocio = codigoSocio;
        this.nombreApellidos = nombreApellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.padresSonSocios = padresSonSocios;
    }
    
    // Constructor creado mas corto para hacer el main mas rapidio
    public SocioClubPadel(String nombreApellidos, int edad, boolean padresSonSocios) {
        this.nombreApellidos = nombreApellidos;
        this.edad = edad;
        this.padresSonSocios = padresSonSocios;
    }
    
    

    @Override //Modificar para estetica
    public String toString() {
        return "SocioClubPadel{" + "codigoSocio=" + codigoSocio + ", nombreApellidos=" + nombreApellidos + ", edad=" + edad + ", telefono=" + telefono + ", correo=" + correo + ", padresSonSocios=" + padresSonSocios + '}';
    }

    public int getCodigoSocio() {
        return codigoSocio;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isPadresSonSocios() {
        return padresSonSocios;
    }

    public static int getCUOTABASE() {
        return CUOTABASE;
    }

    public void setCodigoSocio(int codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPadresSonSocios(boolean padresSonSocios) {
        this.padresSonSocios = padresSonSocios;
    }
    
   public double calcularCuota(float descuento){ //Método sobrecargado del de abajo que es el principal
      return CUOTABASE * (1-descuento/100);
   }

   
    public double calcularCuota(){
        double abonar = CUOTABASE;
        if(this.edad >= 65){
            abonar = CUOTABASE *(1-0.40); //Calculo del porcentaje y restarlo. Es lo mismo que * 400 / 100.
        }else if(this.edad <= 21){
            if (padresSonSocios) {
                abonar = CUOTABASE * (1-0.25);
            }else abonar = CUOTABASE * (1-0.45);
        }
        return Math.round(abonar);
    } 
   
}
