
# Diseña tu Plataforma Educativa: Proyecto POO y Metodología

---

## Análisis del escenario

El sistema corresponde a una plataforma educativa en línea destinada al repaso de contenidos mediante preguntas de opción múltiple. Su objetivo es permitir la creación, almacenamiento y resolución de preguntas de manera automática.

Los usuarios principales son:

- **Creador de preguntas:** encargado de crear, modificar, eliminar y consultar preguntas dentro del sistema.
- **Estudiante:** usuario que responde preguntas seleccionadas aleatoriamente y visualiza el resultado final de la evaluación.

Desde la Programación Orientada a Objetos (POO), el dominio puede representarse mediante clases como Pregunta, Respuesta, Evaluación, Estudiante y Puntaje, facilitando la modularidad y organización del sistema.

Cada clase representará una entidad del problema con atributos y métodos propios, favoreciendo la abstracción, modularidad y reutilización del código, principios fundamentales de la Programación Orientada a Objetos.

---

## Cuestionario para relevamiento de requerimientos

### Preguntas para el creador de preguntas

1. ¿Qué datos debe contener cada pregunta?
2. ¿Cuántas opciones de respuesta tendrá?
3. ¿Debe existir una única respuesta correcta?
4. ¿Las preguntas deben clasificarse por tema o dificultad?
5. ¿El sistema debe permitir crear, modificar y eliminar preguntas?
6. ¿Qué validaciones deben realizarse antes de guardar una pregunta?
7. ¿Debe existir una búsqueda de preguntas por categoría?
8. ¿El sistema debe permitir importar o exportar preguntas?

### Preguntas para el estudiante

1. ¿Cuántas preguntas desea responder por evaluación?
2. ¿Las preguntas deben mostrarse aleatoriamente?
3. ¿Debe visualizar el resultado al finalizar?
4. ¿Qué información debe contener el puntaje final?
5. ¿Debe poder repetir la evaluación?
6. ¿Qué debe ocurrir si deja preguntas sin responder?
7. ¿Desea visualizar cuánto tiempo demoró en completar la evaluación?

---

## Identificación de expertos

Los expertos relevantes para este proyecto son:

- **Docentes**, quienes pueden asesorar sobre contenidos y elaboración de preguntas.
- **Analistas funcionales**, responsables del relevamiento y documentación de requerimientos.
- **Desarrolladores orientados a objetos**, que aportan conocimientos sobre diseño de clases y estructura del sistema.
- **Testers**, encargados de validar el funcionamiento y detectar errores.
- **Estudiantes**, quienes aportan información sobre usabilidad y experiencia de usuario.
- **Especialistas en experiencia de usuario (UX)**, quienes pueden asesorar sobre diseño de interfaces claras y accesibles para los estudiantes.

---

## Simulación de entrevista y bosquejo de requerimientos

Para realizar el relevamiento de información se entrevistó a un compañero que representó el rol de creador de preguntas de la plataforma.

Durante la entrevista se utilizaron las preguntas elaboradas en el cuestionario. El entrevistado indicó que cada pregunta debería incluir un enunciado claro, cuatro opciones de respuesta y una única respuesta correcta. También consideró importante que las preguntas puedan clasificarse por tema y nivel de dificultad.

Además, señaló que el sistema debe permitir crear, modificar, eliminar y consultar preguntas almacenadas en una base de datos. El entrevistado destacó que el sistema debería validar que no existan campos vacíos y mostrar mensajes de confirmación cuando una operación se complete correctamente.

En relación con el estudiante, expresó que debería poder seleccionar una cantidad determinada de preguntas para responder, recibir preguntas al azar y visualizar al finalizar el puntaje obtenido junto con la cantidad de respuestas correctas e incorrectas.

---

## Bosquejo de requerimientos

### Requerimientos funcionales

- **RF01:** El sistema debe permitir registrar preguntas de opción múltiple.
- **RF02:** El sistema debe permitir modificar y eliminar preguntas existentes.
- **RF03:** El sistema debe clasificar preguntas por tema y dificultad.
- **RF04:** El sistema debe validar campos obligatorios antes de guardar información.
- **RF05:** El sistema debe seleccionar preguntas aleatoriamente.
- **RF06:** El sistema debe calcular automáticamente el puntaje final.
- **RF07:** El sistema debe mostrar resultados correctos e incorrectos al finalizar la evaluación.

### Requerimientos no funcionales

- **RNF01:** La interfaz debe ser sencilla e intuitiva.
- **RNF02:** El sistema debe ser modular y mantenible.
- **RNF03:** El sistema debe garantizar que únicamente el creador de preguntas pueda modificar o eliminar preguntas almacenadas.

---

## Conclusión

La metodología orientada a objetos permite analizar el sistema mediante clases y objetos relacionados con el dominio del problema. El relevamiento de requerimientos resulta fundamental antes de la programación, ya que permite comprender las necesidades de los usuarios y diseñar un sistema organizado, reutilizable y mantenible.

El relevamiento realizado coincide con las etapas de análisis y requerimientos planteadas en las metodologías orientadas a objetos.

---

## Referencias

Pérez, D. (s.f). Introducción a la Programación Orientada a Objetos. Programación 2. Material del curso.

Pérez, D. (s.f). Conceptos fundamentales POO. Características Java. Programación 2. Material del curso.

Pérez, D. (s.f). Metodología para desarrollo de Sistemas Orientados a Objetos. Programación 2. Material del curso.


