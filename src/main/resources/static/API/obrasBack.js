const options = {
  method: "GET",
  headers: {
    accept: "application/json",
    Authorization:
      "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJhYTJjYTAwZDYxZWIzOTEyYjZlNzc4MDA4YWQ3ZmNjOCIsInN1YiI6IjYyODJmNmYwMTQ5NTY1MDA2NmI1NjlhYyIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.4MJSPDJhhpbHHJyNYBtH_uCZh4o0e3xGhZpcBIDy-Y8",
  },
};

function getObras() {
  const respuesta = fetch(`http://localhost:8080/obra`);

  respuesta
    .then((response) => response.json())
    .then((response) => renderObras(response)) //fulfilled
    .catch((error) => dibujarError(error)); //rejected
}

function renderObras(response) {
  const obras = response;
  let rows = "";
  for (let obra of obras) {
    rows += `
        <tr>
            <td>${obra.titulo}</td>
            <td>${obra.anio}</td>
            <td>${obra.descripcion}</td>
            <td class="td-obras">
              <img src="../Imagenes/Obras de arte/Pinturas/${obra.img}" alt="${obra.titulo}" class="img-fluid" height="100px">
            </td>
            <td class="td-container-buttons">
            <div class="div-operaciones">
              <button onclick="delObra(${obra.id})">
                <i class="bi bi-trash-fill"></i>
              </button>  
              </div>
            </td>
        </tr>
        `;
  }
  // document.getElementById("peliculas").innerHTML = rows;
  document.querySelector("#listadoObras").innerHTML = rows;
}

function delObra(id) {
  const respuesta = fetch(`http://localhost:8080/obra/eliminar/${id}`, {
    method: "DELETE",
  });

  respuesta
    .then((response) => okDel(response)) //fulfilled
    .catch((error) => dibujarError(error)); //rejected
}

function okDel(response) {
  document.querySelector("#listadoObras").innerHTML = "Se eliminó exitosamente";
}

function dibujarError(error) {
  document.querySelector("#listadoObras").innerHTML = error;
}
