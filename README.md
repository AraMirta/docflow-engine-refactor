# 📄 DocFlow Engine - Refactorización con Patrones de Diseño

Este proyecto representa una refactorización del sistema "DocFlow Engine", aplicando 5 patrones de diseño clásicos: Observer, Command, Proxy, Factory Method y Template Method.

## 🎯 Objetivo

Reestructurar un sistema monolítico de procesamiento de documentos, separando responsabilidades en clases más pequeñas, flexibles y mantenibles.

## 🧱 Patrones Aplicados

- **Observer**: para notificar a múltiples canales (email, Slack)
- **Command**: para encapsular acciones como la facturación
- **Proxy**: para controlar el acceso según el plan del usuario
- **Factory Method**: para crear lectores de diferentes fuentes
- **Template Method**: para definir el flujo general de procesamiento

## 💻 Tecnologías

- Java 17+
- IntelliJ IDEA
- Git / GitHub

## 🚀 Cómo ejecutar
Ejecutar `MainDocFlowApp` como aplicación Java

## 🗂️ Estructura del Proyecto

- `processor/`: contiene la lógica de procesamiento principal y el proxy
- `command/`: encapsula acciones ejecutables
- `observer/`: notificaciones desacopladas
- `reader/`: lectores de documentos
- `flow/`: definición de flujo y algoritmos

## 👩‍💻 Autor

- Mirta Arabel – Técnica en Desarrollo de Software
- Julio 2025 – Refactorización de Código – IES Manuel Belgrano
