# Programación Avanzada - Actividad 3

## Temas

- Manejo de errores y excepciones
- Implementación de GitHub Actions
- Integración continua
- Dockerización

## Requisitos

- El producto debe contener 3 excepciones predeterminadas y 3 personalizadas
- Se debe utilizar GitHub Actions
    
  - En el workflow se ejecutaron los siguientes jobs:
  
    - Set up JDK 17
    - Download and Install SpotBugs
    - Clean previous builds
    - Compile Java
    - Run SpotBugs
    - Run Java
    - Download and Install OWASP Dependency-Check
    - Run OWASP Dependency-Check
    - Create Dockerfile
    - Build Docker image
    - Run Docker container
  
## Ejecución

El código contiene dos situaciones:
1. Manejo del pedido de un producto que utiliza un patrón de diseño **builder** e 
implementa 3 excepciones predeterminadas.
2. Un validador de contraseñas que requiere tres condiciones a cumplir para aceptar
una contraseña válida.

Todo se ejecuta desde el archivo `Main` que muestra los diferentes escenarios para lanzar las excepciones.

