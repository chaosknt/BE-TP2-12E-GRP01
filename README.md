<h1>Composición y Agregación </h1>

<h2>Ejercicio 1 </h2>
<p>Crear la clase NumeroTelefonico, la cual tiene como atributos numéricos característica ,numeroDeAbonado y codigoDePais , además un atributo de tipo TIpoDeLinea que indicará el
tipo de línea (CELULAR, FIJO, FAX). Generar los constructores por defecto y parametrizado y los setters y getters que creas necesarios. Tiene también un método llamado getValor() que
devolverá un String en formato “(+PPP) CCCC-AAAA”, donde +PPP es un signo más (+) seguido por el código del país. </p>
<p>Crear también la clase EMail cuyo constructor deberá recibir un único String con el formato “cuenta@dominio.del.mail”. Para llenar los atributos cuenta y dominio , ambos de tipo String,
se deberá usar el método split(separador) de la clase String, usando la arroba (”@”) como separador. El método getValor() devolverá el String con la “reconstrucción” de la dirección,
utilizando ambos atributos más la arroba. </p>
<p>Por último, crear la clase Persona (su constructor recibe apellido y nombre ) podrá contener de 0 a N teléfonos y de 0 a N emails. Su método mostrarTodo() debe mostrar por pantalla el
contenido completo de la persona. Por ejemplo: </p>
<p>Messi, Lionel<br>
Telefonos:<br>
Celular: 549-114111-2222<br>
Celular: 068-032444-5678 Fijo: 054-4411-5472 email: lio@messi.com <br>
</p>

<h2>Ejercicio 2</h2>

<p>Reutilizando las clases del ejercicio anterior, extender la clase Persona para que pueda tener de 0 a N Mascotas (contiene el nombre y el tipo de animal, ambos String). Debe tener los
métodos necesarios para agregar nuevos datos o eliminar cada uno de los existentes (menos los datos de la persona). Determinar si corresponde utilizar composición y agregación.
Una salida posible podría ser la siguiente: </<p>
<p> Messi, Lionel
Telefonos:<br>
Celular: 549-114111-2222<br>
Celular: 068-032444-5678 Fijo: 054-4411-5472 Emails:<br>
lio@messi.com<br>
liomessi_newells@hotmail.com<br>
Mascotas:<br>
Perro, Pluto Gato, Felix Conejo, Bugs  </p>

<h2>Ejercicio 3</h2>

<p>Crear la clase Vivienda que tendrá una Dirección (compuesta por: calle, altura, piso y departamento) y que además pueda contener personas (nombre, apellido y edad) y muebles
(nombre, material y color). La salida deberá ser la siguiente:</p>

<p>Vivienda 1:<br>
Direccion: Montañeses 1234 4°”C”<br>
Personas:<br>
Nombre: Arturo Roman, Edad: 53 Nombre: Mónica Gaztambide, Edad: 35<br>
Muebles:<br>
Mesa de Madera color Marrón.<br>
Mesada de Mármol color Rojo<br>
Perchero de Metal color Negro<br>
Sillón de Cuero color Azul </p>

<h2>Ejercicio 4</h2>

<p>Reutilizando la clase Vivienda del ejercicio anterior, crear la clase Edificio que contenga una colección de viviendas. A través del método realizarMudanza(), que recibirá el piso y
departamento de origen, y el piso y departamento de destino, se deberá trasladar personas y muebles de una vivienda a la otra. Determinar en qué casos corresponde utilizar composición
y en cuales corresponde utilizar agregación. Finalmente, el método mostrarTodo() mostrará  por pantalla el detalle completo de todas sus viviendas. La salida deberá ser: </p>

<p>Vivienda 1:<br>
Direccion: Montañeses 1234 4°”C”<br>
Personas:<br>
Nombre: Arturo Roman, Edad: 53<br>
Nombre: Mónica Gaztambide, Edad: 35<br>
Muebles:<br>
Mesa de Madera color Marrón.<br>
Mesada de Mármol color Rojo<br>
Perchero de Metal color negro Sillón de cuero color azul<br>
Vivienda 2:<br>
Direccion: Montañeses 1234 2°”B”<br>
Personas:<br>
Muebles:<br>
SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA 2<br>
Vivienda 1:<br>
Direccion: Montañeses 1234 4°”C”<br>
Personas:<br>
Muebles:<br>
Vivienda 2:<br>
Direccion: Montañeses 1234 2°”B”<br>
Personas:<br>
Nombre: Arturo Roman, Edad: 53 Nombre: Mónica Gaztambide, Edad: 35<br>
Muebles:<br>
Mesa de Madera color Marrón.<br>
Mesada de Mármol color Rojo<br>
Perchero de Metal color negro<br>
Sillón de cuero color azul </p>
