
# Diseño orientado a objetos para una empresa de alquiler de vehículos

---

## Introducción

Se presenta el diseño orientado a objetos para una aplicación destinada a una empresa de alquiler de vehículos. El sistema debe permitir realizar altas y bajas de vehículos, calcular la suma de los precios de alquiler diario, obtener los vehículos con mayor y menor precio de alquiler diario y contar la cantidad de motos que poseen una determinada cilindrada.

El diseño se realiza a partir del Diagrama de Clases Conceptual dado, en el cual existe una clase general Vehiculo y dos clases derivadas: Auto y Moto. La clase Vehiculo reúne los datos comunes de todos los vehículos, mientras que Auto y Moto incorporan atributos propios.

Como el precio de alquiler diario se calcula de forma diferente según el tipo de vehículo, se define el método precioAlquilerDiario() como una operación polimórfica.

---

## a) Elección de un diseño para esta realidad

### Tipos Abstractos de Datos elegidos

**Vehiculos = Diccionario(Vehiculo)**

Colección de vehículos registrados en el sistema. Se elige un diccionario porque cada vehículo puede identificarse de forma única mediante su matrícula. La matrícula será utilizada como clave para buscar, insertar o eliminar vehículos.

**Vehiculo = matricula x marca x año**

Representa los atributos comunes a todos los vehículos. Se define como clase abstracta, porque en el sistema no se registrarán vehículos genéricos, sino vehículos concretos: autos o motos.

**Auto = Vehiculo x cantidadPuertas x precioBase**

Representa un vehículo de tipo auto. Hereda los atributos generales de Vehiculo y agrega los atributos propios necesarios para calcular su precio de alquiler diario.

**Moto = Vehiculo x cilindrada x precioBase**

Representa un vehículo de tipo moto. Hereda los atributos generales de Vehiculo y agrega los atributos propios necesarios para calcular su precio de alquiler diario y para resolver el requerimiento de contar motos por cilindrada.

**CapaLogica = Vehiculos**

Clase fachada que contiene la colección de vehículos y ofrece los métodos necesarios para resolver los requerimientos del sistema.

### Observaciones que justifican la elección

Se elige una colección general Vehiculos porque los requerimientos trabajan sobre todos los vehículos registrados, sin importar inicialmente si son autos o motos. Por ejemplo, para calcular la suma de precios de alquiler diario o para obtener el vehículo con mayor y menor precio, se debe recorrer la colección completa.

Se utiliza un diccionario porque la matrícula permite identificar de forma única a cada vehículo. Esto facilita la búsqueda de vehículos, evita duplicados en el alta y simplifica la baja.

La clase Vehiculo se considera abstracta porque representa una generalización de los tipos concretos Auto y Moto. No se espera crear objetos que sean solamente vehículos, sino objetos que pertenezcan a alguna de sus clases derivadas.

El uso de herencia permite evitar la repetición de atributos comunes, como matrícula, marca y año. A su vez, el uso de polimorfismo permite que el método precioAlquilerDiario() se invoque sobre cualquier vehículo, pero que se ejecute de manera diferente según se trate de un auto o una moto.

---

## b) Desglose de requerimientos

### Requerimiento 1a: Alta de vehículo

**Entrada:**

Datos del vehículo a ingresar.

Para un auto:

- matrícula
- marca
- año
- cantidad de puertas
- precio base

Para una moto:

- matrícula
- marca
- año
- cilindrada
- precio base

**Salida:**

- Confirmación de alta exitosa.
- Mensaje de error si ya existe un vehículo con la misma matrícula.

**Proceso:**

1. Recibir los datos del vehículo.
2. Verificar si la matrícula ya existe en el diccionario de vehículos.
3. Si la matrícula existe, no se realiza el alta y se informa el error.
4. Si la matrícula no existe, se crea el objeto correspondiente:
   - un objeto Auto, si el vehículo a registrar es un auto;
   - un objeto Moto, si el vehículo a registrar es una moto.
5. Insertar el vehículo en el diccionario, usando la matrícula como clave.
6. Informar que el alta fue realizada correctamente.

### Requerimiento 1b: Baja de vehículo

**Entrada:**

- matrícula del vehículo a eliminar.

**Salida:**

- Confirmación de baja exitosa.
- Mensaje de error si no existe un vehículo con esa matrícula.

**Proceso:**

1. Recibir la matrícula del vehículo.
2. Verificar si la matrícula existe en el diccionario de vehículos.
3. Si la matrícula no existe, informar que no se puede realizar la baja.
4. Si la matrícula existe, eliminar el vehículo del diccionario.
5. Informar que la baja fue realizada correctamente.

### Requerimiento 2: Calcular suma de precios de alquiler diario

**Entrada:**

No se reciben datos externos. Se utiliza la colección de vehículos registrados.

**Salida:**

- suma total de los precios de alquiler diario de todos los vehículos.

**Proceso:**

1. Inicializar una variable acumuladora en cero.
2. Recorrer todos los vehículos del diccionario.
3. Para cada vehículo, invocar el método precioAlquilerDiario().
4. El cálculo se realiza de forma polimórfica:
   - si el vehículo es un auto:

     `precioAlquilerDiario = precioBase + cantidadPuertas * 100`

   - si el vehículo es una moto:

     `precioAlquilerDiario = precioBase + cilindrada * 0.5`

5. Sumar cada precio obtenido al acumulador.
6. Devolver la suma total.

### Requerimiento 3: Obtener vehículos con mayor y menor precio de alquiler diario

**Entrada:**

No se reciben datos externos. Se utiliza la colección de vehículos registrados.

**Salida:**

- datos del vehículo con mayor precio de alquiler diario;
- datos del vehículo con menor precio de alquiler diario;
- mensaje de error si no hay vehículos registrados.

**Proceso:**

1. Verificar si el diccionario de vehículos está vacío.
2. Si está vacío, informar que no es posible realizar la operación.
3. Si no está vacío, tomar el primer vehículo como referencia inicial para mayor y menor precio.
4. Recorrer todos los vehículos registrados.
5. Para cada vehículo, invocar precioAlquilerDiario().
6. Comparar el precio obtenido con el mayor precio registrado hasta el momento.
7. Si el precio es mayor, actualizar el vehículo de mayor precio.
8. Comparar el precio obtenido con el menor precio registrado hasta el momento.
9. Si el precio es menor, actualizar el vehículo de menor precio.
10. Devolver los datos de ambos vehículos.

### Requerimiento 4: Contar motos por cilindrada

**Entrada:**

- cilindrada a consultar.

**Salida:**

- cantidad de motos registradas con esa cilindrada.

**Proceso:**

1. Recibir la cilindrada buscada.
2. Inicializar un contador en cero.
3. Recorrer todos los vehículos registrados.
4. Para cada vehículo, verificar si corresponde a una moto.
5. Si el vehículo es una moto, consultar su cilindrada.
6. Si la cilindrada coincide con la ingresada, incrementar el contador.
7. Al finalizar el recorrido, devolver el contador.

---

## c) Especificación del diseño elegido

### Diagrama de Clases de Implementación en UML

En el siguiente diagrama se representan únicamente los atributos de las clases, de acuerdo con lo solicitado en la consigna. Los métodos se detallan posteriormente en la especificación de cada clase.

**Diagrama de clases**

<!-- Insertar aquí la imagen original del diagrama UML -->

---

### Especificación de cada clase

## Clase Vehiculo

**Tipo de clase:**

Abstracta.

**Atributos:**

- `matricula : String`
- `marca : String`
- `anio : int`

**Constructor:**

- `Vehiculo(String matricula, String marca, int anio)`

**Selectores:**

- `getMatricula() : String`
- `getMarca() : String`
- `getAnio() : int`

**Modificadores necesarios:**

- `setMarca(String marca) : void`
- `setAnio(int anio) : void`

No se incluye modificador para la matrícula porque se considera un identificador único del vehículo. Modificarla podría afectar la clave utilizada en el diccionario.

**Métodos específicos:**

- `datosVehiculo() : String`

  Devuelve los datos generales del vehículo: matrícula, marca y año.

**Método polimórfico:**

- `precioAlquilerDiario() : float`

Este método se declara en la clase Vehiculo, pero se implementa en las clases derivadas. Se considera abstracto porque no existe una fórmula general para todos los vehículos, sino una fórmula diferente según el tipo concreto.

---

## Clase Auto

**Hereda de:**

Vehiculo

**Atributos:**

- `cantidadPuertas : int`
- `precioBase : float`

**Constructor:**

- `Auto(String matricula, String marca, int anio, int cantidadPuertas, float precioBase)`

**Selectores:**

- `getCantidadPuertas() : int`
- `getPrecioBase() : float`

**Modificadores necesarios:**

- `setCantidadPuertas(int cantidadPuertas) : void`
- `setPrecioBase(float precioBase) : void`

**Métodos específicos:**

No se requieren métodos específicos adicionales para resolver los requerimientos planteados.

**Método polimórfico:**

- `precioAlquilerDiario() : float`

**Proceso del método:**

```text
precioAlquilerDiario = precioBase + cantidadPuertas * 100
```

Este método sobrescribe la operación definida en la clase abstracta Vehiculo.

---

## Clase Moto

**Hereda de:**

Vehiculo

**Atributos:**

- `cilindrada : int`
- `precioBase : float`

**Constructor:**

- `Moto(String matricula, String marca, int anio, int cilindrada, float precioBase)`

**Selectores:**

- `getCilindrada() : int`
- `getPrecioBase() : float`

**Modificadores necesarios:**

- `setCilindrada(int cilindrada) : void`
- `setPrecioBase(float precioBase) : void`

**Métodos específicos:**

No se requieren métodos específicos adicionales para resolver los requerimientos planteados.

**Método polimórfico:**

- `precioAlquilerDiario() : float`

**Proceso del método:**

```text
precioAlquilerDiario = precioBase + cilindrada * 0.5
```

Este método sobrescribe la operación definida en la clase abstracta Vehiculo.

---

## Clase Vehiculos

**Tipo de clase:**

Colección de objetos.

Representa un diccionario de vehículos. La clave será la matrícula y el valor será un objeto de tipo Vehiculo. Como Vehiculo es una clase abstracta, los objetos almacenados serán instancias concretas de Auto o de Moto.

**Atributos:**

- `h : Hash<String, Vehiculo>`

**Constructor:**

- `Vehiculos()`

**Selectores / operaciones primitivas:**

- `member(String matricula) : boolean`

  Indica si existe un vehículo con la matrícula recibida.

- `find(String matricula) : Vehiculo`

  Devuelve el vehículo asociado a la matrícula recibida.

- `esVacia() : boolean`

  Indica si la colección está vacía.

- `largo() : int`

  Devuelve la cantidad de vehículos registrados.

**Modificadores necesarios / operaciones primitivas:**

- `insert(Vehiculo v) : void`

  Inserta un vehículo en la colección.

- `delete(String matricula) : void`

  Elimina un vehículo de la colección según su matrícula.

**Métodos específicos:**

- `sumaPreciosAlquilerDiario() : float`

  Recorre todos los vehículos e invoca precioAlquilerDiario() en cada uno. Devuelve la suma total.

- `vehiculoMayorPrecioAlquilerDiario() : Vehiculo`

  Recorre la colección y devuelve el vehículo con mayor precio de alquiler diario.

- `vehiculoMenorPrecioAlquilerDiario() : Vehiculo`

  Recorre la colección y devuelve el vehículo con menor precio de alquiler diario.

- `contarMotosPorCilindrada(int cilindrada) : int`

  Recorre la colección, identifica las motos y cuenta cuántas tienen la cilindrada indicada.

---

## Clase CapaLogica

**Tipo de clase:**

Fachada.

La clase CapaLogica funciona como punto de acceso a las operaciones principales del sistema.

**Atributos:**

- `vehiculos : Vehiculos`

**Constructor:**

- `CapaLogica()`

**Selectores:**

No se incluyen selectores directos para acceder a la colección completa, porque se busca proteger la estructura interna del sistema.

**Modificadores necesarios:**

No se incluyen modificadores para reemplazar directamente la colección de vehículos.

**Métodos específicos asociados a los requerimientos:**

- `altaAuto(String matricula, String marca, int anio, int cantidadPuertas, float precioBase) : boolean`

  Crea un auto y lo agrega a la colección si no existe otro vehículo con la misma matrícula.

- `altaMoto(String matricula, String marca, int anio, int cilindrada, float precioBase) : boolean`

  Crea una moto y la agrega a la colección si no existe otro vehículo con la misma matrícula.

- `bajaVehiculo(String matricula) : boolean`

  Elimina el vehículo correspondiente a la matrícula recibida, si existe.

- `calcularSumaPreciosAlquilerDiario() : float`

  Devuelve la suma de los precios de alquiler diario de todos los vehículos registrados.

- `obtenerVehiculoMayorPrecioAlquilerDiario() : Vehiculo`

  Devuelve el vehículo con mayor precio de alquiler diario.

- `obtenerVehiculoMenorPrecioAlquilerDiario() : Vehiculo`

  Devuelve el vehículo con menor precio de alquiler diario.

- `contarMotosPorCilindrada(int cilindrada) : int`

  Devuelve la cantidad de motos registradas que tienen la cilindrada indicada.

---

## Tratamiento del polimorfismo

El método precioAlquilerDiario() se declara en la clase abstracta Vehiculo, pero se implementa en las clases derivadas Auto y Moto.

En la clase Auto, el cálculo es:

```text
precioAlquilerDiario = precioBase + cantidadPuertas * 100
```

En la clase Moto, el cálculo es:

```text
precioAlquilerDiario = precioBase + cilindrada * 0.5
```

De esta manera, la colección Vehiculos puede recorrer objetos tratados como Vehiculo e invocar el método precioAlquilerDiario() sin preguntar previamente si el objeto es un auto o una moto. Cada objeto ejecuta la versión del método que corresponde a su tipo concreto.

---

## Conclusión

El diseño propuesto cumple con los requerimientos planteados porque permite registrar y eliminar vehículos, calcular la suma de precios de alquiler diario, obtener los vehículos con mayor y menor precio y contar motos según una cilindrada dada.

La elección de una clase abstracta Vehiculo, junto con las clases derivadas Auto y Moto, permite aplicar herencia y polimorfismo. Además, el uso de un diccionario de vehículos facilita la búsqueda, el alta y la baja mediante matrícula como clave única. La clase CapaLogica organiza el acceso a las operaciones principales del sistema y permite mantener separada la lógica de la aplicación.
