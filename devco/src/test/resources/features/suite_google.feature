# language:es
  ## Author: jairo Andres Garcia - jairo_garcia82122@elpoli.edu.co

 Característica: Yo como usuario
   Deseo automatizar la suite de gooogle
   para saber de que forma opera

  Antecedentes:
    Dado me encuentro en la pagina de google

    @CrearCuenta
    Escenario: Abrir cuenta google
      Cuando procedo abrir la suite de google y dar clic en la opcion "Cuenta"
      Y Procedemos a crear una cuenta nueva llenamos los datos
      |nombre|apellido|username|contrasena|
      |Jairo| Garcia     |   Jagarc  |  Andres12345. |
      Entonces Verifico el mensaje mensaje "Una cuenta. Todo Google a tu disposición."

    @BuscarDato
    Escenario: Abrir Busqueda google
      Cuando procedo abrir la suite de google y dar clic en la opcion "Búsqueda"
      Y procedo a buscar una palabra
      Entonces Observo titulos relaciónados con la palabra ingresada "Los Del Sur"

   @Buscardireccion
   Escenario: Abrir google maps
     Cuando procedo abrir la suite de google y dar clic en la opcion "Maps"
     Y ingreso selecciono Tiendas
     Entonces verifica un nombre de Tienda llamada "COMESTIBLES EL SARCO"


   @BuscarVideo
   Escenario: Abrir youtube google
     Cuando procedo abrir la suite de google y dar clic en la opcion "YouTube"
     Y ingreso el nombre del video "programacion java"
     Entonces verifica el titulo del video "Curso de programación JAVA desde cero"


   @Traductor
   Escenario: Abrir traductor google
     Cuando procedo abrir la suite de google y dar clic en la opcion "Traductor"
     Y ingreso la palabra "Hello"
     Entonces verifica la traduccion "Hola"




