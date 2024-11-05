@TimeEntry
Feature: Como usuario necesito registrar horas dentro de Clokify
Background:
  Given El usuario se encuentra en el Time Tracker con usuario 'oblivion1609@hotmail.com' y contraseña 'SnapShot33·'

@AddTimeExitoso
Scenario: Se agregan horas en un projecto de forma exitosa
  When El usuario ingresa una fecha '18/11/2024'
  And El usuario ingresa una hora inicio '20:00'
  And El usuario ingresa una hora final '21:00'
  And El usuario selecciona el projecto 'ProjectoA'
  And El usuario agrega la descripcion 'Beta'
  And El usuario hace click en ADD
  Then El usuario verifica que se cargaron las horas

@AddCancelado
Scenario: Se realiza una carga de horas pero se cancela antes de generarla
  When El usuario hace click en Timer
  And El usuario selecciona el projecto 'ProjectoA'
  And El usuario agrega la descripcion 'Omega'
  And El usuario hace click en START
  And El usuario hace click en el menu de tres puntos
  And El usuario hace click en discard para cancelar la entrada de tiempo iniciada
  Then El usuario reafirma la accion haciendo click en DISCARD
  And El usuario visualiza mensaje Timer cancelled

@ModifyTimeEntryExitoso @Do
Scenario: Se realiza una modificacion de los datos de un time entry
  When El usuario modifica la descripcion actual por 'Ya modificado'
  And El usuario selecciona  projecto
  And El usuario selecciona una etiqueta
  And El usuario modifica la hora inicio '10:00'
  Then El usuario visualiza un mensaje que indica que la hora inicial se modifico
