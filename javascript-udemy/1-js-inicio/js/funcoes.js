
//funcao entrar

function entrar(){
    //variavel area vai pegar tudo oq tem dentro da div area-3
    //variavel texto vai armazenar o conteudo digitado no prompt
    var area = document.getElementById('area-3');
    var texto = prompt('Digite seu nome? ');

    area.innerHTML = texto;
}