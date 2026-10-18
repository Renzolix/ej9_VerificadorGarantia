# Ejercicio 9: VerificadorGarantia

## Explicación Lógica
1. **Verificación de Tipo (`instanceof`):** Evalúa en tiempo de ejecución el tipo concreto de la instancia antes de intentar acceder a métodos específicos.
2. **Downcasting Seguro:** El moldeo explícito `(VideojuegoFisico) p` sólo se ejecuta cuando la comprobación booleana confirma el tipo, evitando excepciones de casteo `ClassCastException`.
3. **Restricción `final`:** Marcar un método como `final` imposibilita que las subclases puedan sobrescribirlo, congelando su comportamiento.