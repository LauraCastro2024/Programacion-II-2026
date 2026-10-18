# Programación II

## Diagrama de Clases de Implementación: Gestión de Biblioteca Universitaria

**Laura Castro**

**Programación II**

**17/05/2026**

---

## Diagrama de Clases

<!-- Insertar aquí la imagen original del diagrama de clases -->

---

## Breve descripción del Diagrama

El diagrama representa un sistema de gestión de biblioteca mediante las clases principales Libro, Usuario, Préstamo y Categoría.

La clase Libro contiene los datos título, autor y disponibilidad, y expone métodos para consultar y actualizar su estado de préstamo.

La clase Usuario registra nombre, dirección y número de identificación.

La clase Préstamo permite asociar un usuario con un libro y registrar la fecha del préstamo, la fecha de devolución y el estado, cuyos valores posibles son "activo" o "finalizado".

Se establece una relación de agregación entre Categoría y Libro, dado que una categoría puede agrupar varios libros, pero la existencia de cada libro no depende de la categoría a la que pertenece. Si una categoría es eliminada del sistema, los libros que la integraban continúan existiendo de forma independiente.

Un usuario puede realizar varios préstamos, mientras que cada préstamo corresponde a un único usuario.

A su vez, un libro puede aparecer en distintos préstamos a lo largo del tiempo gracias a los métodos marcarPrestado() y marcarDisponible(), que actualizan su disponibilidad en cada operación.

Las restricciones principales son dos: no registrar préstamos de libros no disponibles, y evitar que un mismo libro tenga más de un préstamo activo simultáneamente. Ambas restricciones quedan explícitas en el diagrama mediante una nota asociada a la clase Préstamo.
