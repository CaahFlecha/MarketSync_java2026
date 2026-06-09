# Módulo de Gestión de Empleados

Se desarrolló e integró el módulo de gestión de empleados dentro del sistema MarketSync, implementando las operaciones CRUD (Crear, Leer, Actualizar y Eliminar) utilizando Java, Swing, Hibernate ORM y PostgreSQL.

## Funcionalidades implementadas

- Registro de nuevos empleados.
- Consulta y listado de empleados en tabla.
- Búsqueda y filtrado de empleados.
- Edición y actualización de registros existentes.
- Eliminación de empleados con confirmación previa.
- Gestión del estado del empleado (Activo/Inactivo).
- Asignación de cargos mediante JComboBox.

## Validaciones implementadas

- Validación de campos obligatorios.
- Validación de cédula obligatoria.
- Control de cédula duplicada para evitar registros repetidos.
- Restricción de ingreso únicamente numérico en los campos Cédula y Teléfono.
- Validación de longitud para números telefónicos.
- Validación del formato de fecha de registro.
- Verificación de fechas válidas.
- Validación de selección obligatoria de cargo.

## Mejoras en la interfaz

- Habilitación y deshabilitación dinámica de componentes.
- Gestión de estados de la interfaz (Nuevo, Editar, Guardar, Cancelar y Eliminar).
- Carga automática de datos al seleccionar un registro.
- Mensajes informativos y de confirmación mediante JOptionPane.
- Limpieza automática de campos después de cada operación.

## Correcciones realizadas

- Corrección de mapeos de entidades Hibernate.
- Corrección de consultas HQL utilizando entidades en lugar de tablas.
- Solución de errores relacionados con sesiones y transacciones.
- Corrección del funcionamiento del botón Actualizar.
- Optimización del flujo de edición y actualización de registros.

## Resultado

El módulo de empleados quedó completamente funcional, permitiendo registrar, consultar, modificar y eliminar empleados de manera segura, aplicando validaciones y manteniendo la integridad de los datos.
