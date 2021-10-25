# OOPCourse
Este repositorio contiene programas que permite entender mejor la Programación Orientada a Objetos

La OPP se compone de 4 elementos:
- Clases
- Propiedades
- Métodos
- Objetos

Y de 4 pilares fundamentales:
- Abstracción
- Herencia
- Polimorfismo
- Encapsulamiento

Las clases tienen como caracteristicas:
- Son modulares
- Dividir el programa en diferentes partes
- Separar las clases en archivos diferentes, así podemos garantizar manenimiento y distribución

# Caso analizado
Se realizara el analisis y desarrollo de una plataforma tipo Uber

## Análisis:

Se cuentan con los siguientes escenarios:

1. Un usuario requiere ir de un punto A a un punto B
2. El usuario mediante una aplicación realiza la solicitud ingresando la ruta a realizar.
3. Se cuentan con diferentes tipos de servicios Uber disponibles como son UberX, UberBlack, UberPool y UberVan y cada uno de estos tiene asociado un Conductor.
4. El usuario elige el servicio a tomar y así se genera el valor a pagar y la forma de pago.

## Objetos:

1. User: Quién realiza la solicitud.
2. Route: La ruta desde el punto A al punto B.
3. UberX: Servicio de Uber
4. UberPool: Servicio de Uber
5. UberBlack: Servicio de Uber
6. UberVan: Servicio de Uber
7. Driver: La persona que conduce el Uber.
8. Card: Forma de pago.
9. PayPal: Forma de pago.
10. Cash: Forma de pago.
11. Trip: Quién ejecuta el viaje, que ruta se seleccionó, la forma de pago, el valor, el servicio seleccionado