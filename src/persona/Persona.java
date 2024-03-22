package persona;


public class Persona {
 private String nombre;
 private String Edad;
 private String cedula;  
 private char Sexo;
 private int peso;
 private int altura;

    public Persona(String nombre, String Edad, String cedula, char Sexo, int peso, int altura) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.cedula = cedula;
        this.Sexo = Sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }

    public Persona(String nombre, String Edad, char Sexo) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public String getCedula() {
        return cedula;
    }

    public char getSexo() {
        return Sexo;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", Edad=").append(Edad);
        sb.append(", cedula=").append(cedula);
        sb.append(", Sexo=").append(Sexo);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }

    public int calcularImc (double peso, double altura ){
        int pesoBajo = -1;
        int pesoIdeal =0;
        int sobrePeso = 1;
        if(peso/Math.pow(altura,2)<20){
        System.out.println("ud lo que esta es desnutrido");
        return pesoBajo;
    }
    if(peso/Math.pow(altura,2)>=20 && peso/Math.pow(altura,2) <=25 ){
        System.out.println("estas por debajo de tu peso ideal");
    return pesoIdeal ;
    }
    else{
        System.out.println("tienes sobrepeso");
        return sobrePeso;
    }
   
    
    }
    public boolean esMayorDeEdad (int edad){
    if(edad<18){
    return false;
    }
    else{
    return true;
    }
    }
    public void comprobarSexo (char sexo){
    if (sexo != 'H' && sexo != 'M') {
            sexo = 'H';
        }
        System.out.println("El sexo es: " + sexo);
    }
    public int generacionCedula (){
    int cedula= (int) ((double) Math.random()*1000000000);   
    return cedula;
    }
    }

