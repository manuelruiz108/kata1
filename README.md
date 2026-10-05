# Kata 1: Generador de ID de Empleados

## Objetivo
Con este proyecto se trata de familiarizarse con el entorno de Intellij IDEA
y el uso de Git y Github. Creando un microproyecto en mi caso un gestor de ID

## Como compilar
1. Abre el proyecto en el IDE.
2. Ir hacia la clase main de la rama master
3. Ejecutar main.java

## Dependencias y versión JDK
Java version "1.8.0_501"  
Oracle openJDK 24.0.2

## Estructura de la entrega y clases
El proyecto se encuentra en el paquete kata1.ulpgc y está compuesto por dos clases:

Employee.java: Modela empleados con un nombre, apellido, id, y departamento. Mediante
el método uniqueID() se crea un ID único para cada empleado y se muestra el texto
formateado gracias a la función toString()

main.java: Crea los empleados para posteriormente imprimir sus datos por pantalla
con el método toString() de la clase Employee

## Flujo Git
Se han utilizado un total de 3 ramas diferentes(develop1, develop2, develop3) aparte del la
principal para llevar acabo la repetición de la kata. Se realizó un merge de la rama develop3
en master. El flujo de commits en general siguió la siguiente estructura para cada rama:
1. Constructor created
2. Getters added
3. UniqueID() created
4. ToString() created
5. Main created
6. Objects Employees created
7. Prints added

## Pasos para clonar y comprobar el repositorio
Primero nos situaremos en la terminal que nos ofrece el Intellij IDE  
Luego nos situaremos por ejemplo en otra carpeta como podría ser el escritorio -> cd Desktop  
Clonaremos el repositorio -> git clone https://github.com/manuelruiz108/kata1  
Posteriormente nos situaremos en la nueva carpeta -> cd kata1  
Comprobaremos la compilación del programa con los siguientes comandos:  
javac src/main/java/kata1/ulpgc/*.java -d out  
java -cp out kata1.ulpgc.main  

## Enlace
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

## Repetición de la kata
Para repetir la kata varias veces cree una rama distinta por cada repetición
llamándolas develop1, develop2 y develop3. Como único cambio entre repeticiones
podemos apreciar como en la rama develop1 la clase Employee está transformada
en una record class a diferencia de las otras dos ramas.

## Verificación
```text
   Paula Gutierrez with ID: Leg-9632 works at Legal
   Tomás Pérez with ID: Res-97 works at Research
