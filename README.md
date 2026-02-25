# 🚛 Sistema Logístico - Programación Orientada a Objetos

## 📌 Descripción

Este proyecto implementa un sistema logístico en Java aplicando los principios de:

- Herencia
- Encapsulamiento
- Sobrescritura (@Override)
- Polimorfismo
- Validación con setters

El sistema maneja diferentes tipos de transporte como:

- 🚛 CamionDeReparto
- 🚢 BuqueCarga

---

## 🏗️ Estructura del Proyecto

### 🔹 Clase Padre: `Transporte`

Atributos:
- `String idTrasporte`
- `double combustible`
- `double capacidadCarga`

Métodos:
- `viajar(int distancia)`
- `setCombustible(double nivel)`
- `setCapacidadCarga(double carga)`
- Getters correspondientes

---

### 🚛 Clase Hija: `CamionDeReparto`

- Atributo adicional:
  - `boolean tieneRefrigeracion`

- Sobrescribe:
  - `viajar(int distancia)`

📌 Si tiene refrigeración:
- El consumo de combustible es el doble (2 unidades por cada 10 km).

📌 Si no tiene:
- Se comporta como transporte normal.

---

### 🚢 Clase Hija: `BuqueCarga`

- Atributo:
  - `int cantidadContenedores`

Métodos adicionales:
- `atracarEnPuerto()`
- `mostrarDatos()`

Se comporta como transporte normal al viajar.

---

## 🧪 Pruebas Realizadas en Main

### 1️⃣ Instanciación Segura
- Camión con refrigeración activa.
- Buque con 50 contenedores.

### 2️⃣ Validación de Setter
Se intenta usar:

```java
setCombustible(-20);