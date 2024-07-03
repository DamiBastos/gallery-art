function noDisable() {
    var email = document.querySelector("#email").value;
    var btnSubmit = document.querySelector("#btnSubmit");
    
    // Comprueba si el correo electrónico tiene un formato válido
    var isValidEmail = validateEmail(email);
    
    if (email.length > 0 && isValidEmail) {
        btnSubmit.classList.add("btn-dark");
        btnSubmit.removeAttribute("disabled");
    } else {
        btnSubmit.classList.remove("btn-dark");
        btnSubmit.setAttribute("disabled", "disabled");
    }
}
// Función para validar el formato del correo electrónico
function validateEmail(email) {
    // Patrón para verificar el correo electrónico
    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailPattern.test(email);
}




   // Obtener una referencia al botón
   const adminButton = document.getElementById('adminButton');

   // Agregar un evento de clic al botón
   adminButton.addEventListener('click', () => {
       // Llamada a la API
       fetch('https://ejemplo.com/api/datos')
           .then(response => response.json()) // Convertir la respuesta a JSON
           .then(data => {
               // Manejar los datos recibidos
               console.log(data);
               // Aquí puedes agregar código para manejar los datos de la API
           })
           .catch(error => {
               console.error('Error al llamar a la API:', error);
           });
   });