# 👥 Gestión de Personas - Proyecto Java

Proyecto educativo de Java para aprender Git, control de versiones y programación orientada a objetos. Una aplicación simple pero efectiva para gestionar información de personas.

---

## 📋 Tabla de Contenidos

- [👥 Gestión de Personas - Proyecto Java](#-gestión-de-personas---proyecto-java)
  - [📋 Tabla de Contenidos](#-tabla-de-contenidos)
  - [✨ Características](#-características)
  - [🔧 Requisitos](#-requisitos)
  - [📁 Estructura del Proyecto](#-estructura-del-proyecto)
  - [📦 Instalación](#-instalación)
  - [🔨 Como Compilar](#-como-compilar)
  - [▶️ Como Ejecutar](#️-como-ejecutar)
  - [🎯 Clases Principales](#-clases-principales)
    - [Persona.java](#personajava)
      - [Propiedades](#propiedades)
      - [Métodos Principales](#métodos-principales)
  - [🔗 Gestión de Dependencias](#-gestión-de-dependencias)
  - [🤝 Contribuciones](#-contribuciones)
    - [Paso a paso para contribuir:](#paso-a-paso-para-contribuir)
  - [📚 Recursos Útiles](#-recursos-útiles)
  - [📝 Licencia](#-licencia)

---

## ✨ Características

- Creación y gestión de objetos Persona
- Getters y setters para acceso a propiedades
- Organización en paquetes profesionales
- Código limpio y bien documentado
- Ideal para aprender Git y control de versiones

---

## 🔧 Requisitos

- **Java 8** o superior
- **VS Code** (Visual Studio Code)
- **Extension Java Pack for VS Code** (recomendado)

---

## 📁 Estructura del Proyecto

```
Prueba_github/
├── src/
│   ├── App.java
│   └── net/salesianos/persona/
│       └── Persona.java
├── bin/
│   └── net/salesianos/persona/
│       └── Persona.class
├── lib/
│   └── (dependencias externas)
└── README.md
```

> Si deseas personalizar la estructura, abre `.vscode/settings.json` y actualiza los valores necesarios.

---

## 📦 Instalación

```bash
# Clonar el repositorio
git clone <URL_DEL_REPOSITORIO>

# Navegar al directorio
cd Prueba_github
```

---

## 🔨 Como Compilar

```bash
# Compilar sin correr
javac -d bin src/net/salesianos/persona/*.java
```

O usa VS Code:

- Presiona `Ctrl + Shift + B` para ejecutar la tarea de compilación predeterminada

---

## ▶️ Como Ejecutar

```bash
# Ejecutar la aplicación
java -cp bin net.salesianos.persona.App
```

---

## 🎯 Clases Principales

### Persona.java

Clase que representa una persona con información básica.

#### Propiedades

| Propiedad   | Tipo   | Descripción             |
| ----------- | ------ | ----------------------- |
| `nombre`    | String | Nombre de la persona    |
| `apellidos` | String | Apellidos de la persona |
| `edad`      | int    | Edad en años            |

#### Métodos Principales

- `getnombre()` - Retorna el nombre
- `setnombre(String)` - Establece el nombre
- `getapellidos()` - Retorna los apellidos
- `setapellidos(String)` - Establece los apellidos
- `getedad()` - Retorna la edad
- `setedad(int)` - Establece la edad

---

## 🔗 Gestión de Dependencias

La vista `JAVA PROJECTS` en VS Code permite gestionar tus dependencias. Más información en [java-dependency](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

---

## 🤝 Contribuciones

Este es un proyecto educativo. ¡Las contribuciones y mejoras son bienvenidas!

### Paso a paso para contribuir:

1. Fork del repositorio
2. Crea una rama para tu características (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

---

## 📚 Recursos Útiles

- [Documentación oficial de Java](https://docs.oracle.com/javase/)
- [Git & GitHub Learning Resources](https://docs.github.com/es/get-started)
- [VS Code Java Extension](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

---

## 📝 Licencia

Este proyecto está disponible bajo la licencia MIT.

---

**¡Felicidades! Ya estás listo para empezar a trabajar con Git y Java.** 🚀
