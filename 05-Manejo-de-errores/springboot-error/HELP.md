# Manejo De Errores en SpringBoot

- handle : Manejar

## Manejo Global de Errores con ``@RestControllerAdvice``
> Este componente intercepta las excepciones lanzadas por los controladores y permite personalizar la respuesta de error.

````java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(Exception ex) {
        return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
````
- En este ejemplo, el método ``handleResourceNotFound`` maneja una excepción personalizada ``ResourceNotFoundException`` y devuelve una respuesta con un código de estado HTTP 404 (Not Found). El método ``handleGlobalException`` se encarga de todas las demás excepciones no controladas.

> Para controlar errores de tipo de ``notFound()`` recordar agregar la configuración ``spring.mvc.throw-exception-if-no-handler-found=true;`` y también ``spring.web.resources.add-mappings=false`` en nuestra ``application.properties``