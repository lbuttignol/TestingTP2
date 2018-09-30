# TestingTP2

# Ejercicio 1

En este ejercicio se utilizan las herramientas EvoSuite y Randoop para testear
la clase BitChromosome.java. En principio se crearon test utilizando diversas 
configuraciones de las herramientas nombradas anteriormente, como los resultados 
obtenidos no fueron los esperados, se agregó el método equals en la calse 
Chromosome.java y se volvieron a crear test con las configuraciones ya evaluadas,
obteniendo mejores resultados. Los tests generados por ambas herramientas se 
concentraron en un solo archivo para facilitar los análisis de cobertura, los
cuales fueron de 100% tanto para cobertura de código como para Mutation Score. 

# Ejercicio 2

En este ejercicio se utiliza la herramienta Korat para generar instancias de 
NodeCachingLinkedList. Estas instancias son utilizadas por un generador de 
objetos NodeCachingLinkedList de JUnit, para ser suministrados a las diferentes
teorías implementadas para probar el código. Con esta metodología se obtuvo un 
100% de cobertura de código y 100% de Mutation Score para los métodos en análisis
(add y remove de NodeCachingLinkedList.java) 

# Ejercicio 3

En este ejercicio se utiliza la herramienta IntelliTest (Ex Pex) para generar test
automáticamente, se agregaron contratos a los métodos en instancia de prueba
utilizando Code Contracts para mejorar los resultados obtenidos anteriormente. De
esta forma se obtuvo una cobertura del código del 100% para los métodos requeridos
(patternIndex, cal de EjercicioPex.cs y add, remove de ArrayList.cs). 
