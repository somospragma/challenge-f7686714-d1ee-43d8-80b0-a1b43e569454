# Diseño y Implementación de una Arquitectura de Capas

El sistema de una empresa de fintech requiere una arquitectura de capas para separar las responsabilidades y mejorar la mantenibilidad del código. Cada capa debe tener un propósito claro y debe estar correctamente conectada con las demás.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Implementación de una Arquitectura de Capas |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Gradle 8+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `gradle build` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de Capas

**Objetivo:** Identificar y definir las capas necesarias en la arquitectura.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Investiga sobre arquitecturas de capas y determina cuáles son las capas más comunes y su propósito.
- Define las capas para el sistema de fintech, considerando las responsabilidades y las interacciones entre ellas.

**Entregable:** Documento que describe las capas identificadas y su propósito.

<details>
<summary>Pistas de conocimiento</summary>

- Las capas comunes incluyen presentación, aplicación, dominio y persistencia.
- Cada capa debe tener una responsabilidad clara y debe interactuar con otras capas a través de interfaces bien definidas.

</details>

### Fase 2: Conexión de Capas

**Objetivo:** Establecer las conexiones entre las capas definidas.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Investiga sobre cómo conectar las capas en una arquitectura de capas.
- Establece las conexiones entre las capas definidas en la fase anterior, asegurando que cada capa interactúe correctamente con las demás.

**Entregable:** Documento que describe las conexiones establecidas entre las capas.

<details>
<summary>Pistas de conocimiento</summary>

- Las conexiones entre capas deben ser claras y seguir principios de bajo acoplamiento.
- Cada capa debe interactuar con las demás a través de interfaces bien definidas.

</details>

### Fase 3: Implementación de una Capa

**Objetivo:** Implementar una de las capas definidas.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Elige una de las capas definidas y comienza a implementarla.
- Asegúrate de que la capa implementada cumpla con su propósito y esté correctamente conectada con las demás capas.

**Entregable:** Código fuente de la capa implementada.

<details>
<summary>Pistas de conocimiento</summary>

- La implementación debe seguir buenas prácticas de diseño y codificación.
- Asegúrate de que la capa implementada esté correctamente conectada con las demás capas.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una arquitectura de capas y cuáles son sus ventajas?
- **paraQueSirve**: ¿Para qué sirve cada capa en una arquitectura de capas?
- **comoSeUsa**: ¿Cómo se conectan las capas en una arquitectura de capas?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una arquitectura de capas?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de una capa en una arquitectura de capas?

## Criterios de Evaluacion

- Definición clara de las capas y su propósito.
- Conexiones establecidas entre las capas.
- Implementación de una capa con buenas prácticas de diseño y codificación.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
