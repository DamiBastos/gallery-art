  function getObras() {
    const respuesta = fetch(`https://api.mercadolibre.com/sites/MLA/search?q=escultura`);

    //2 invocar
    respuesta
        .then(response => response.json())
        .then(response => renderObra(response))//fulfilled
        .catch(error => dibujarError(error))//rejected
  }

  function renderObra(response) {
    const obras = response.results;
    let rows = '';
    for(let obra of obras) {
        rows += `
        <tr>
            <td>${obra.title}</td>
              <td>
              <img src="${obra.thumbnail}" alt="" class="img-fluid">
            </td>
        </tr>
        `
    }
    // document.getElementById("peliculas").innerHTML = rows;
    document.querySelector('#listadoObras').innerHTML = rows;
}