Feature: Agendar cita en la pagina web

  Como usuario que necesita agendar una cita medica,
  Quiero poder ingresar a la página web y seleccionar la opción de Agendar cita
  Para poder programar mi cita de manera facil y conveniente.

  Scenario: Agendar una cita en la pagina web
    Given que estoy en la pagina web de la clinica medica
    When selecciono la opcion de Agendar cita y el sistema debe mostrarme un formulario para ingresar mi informacion conveniente
      | username | password           | date       | comment                                           |
      | John Doe | ThisIsNotAPassword | 26/03/2023 | Necesito reservar mi cita para la fecha ingresada |
    Then   la confirmacion de la cita se mostrara en el siguiente mensaje "Appointment Confirmation"