// Criando funções
// Função Entrar :

// EXEMPLO 1 : MÉTODO 1 
function entrar() {
    var area = document.getElementById('area-1');
    var texto = prompt('Digite seu nome?');

    //quando o ação é cancela pelo usuário o retorno é NULL (nulo)
    if(texto == '' || texto == null){
        alert('Digite seu nome novamente!');
        area.innerHTML = 'Bem Vindo ...'
    } else{
        area.innerHTML = 'Bem Vindo ' + texto;
    }

}

// EXEMPLO 2 : MÉTODO 2

//nome é a variavel que vai armazenar o 'bea' do html
function entrar_2(nome){
    var area = document.getElementById('area-2');
    var texto = prompt('Digite seu sobrenome?');

    if(texto == '' || texto == null){
        alert('Digite seu sobrenome novamente!');
        area.innerHTML = 'Bem Vindo ...';
    } else{
        area.innerHTML = 'Bem Vindo ' + nome + " " + texto;
    }

}

// ATIVIDADE: passar por parâmetro o nome e a idade. 

function entrar_3(nome, idade){
    var area = document.getElementById('area-3');
    var texto = prompt('Digite seu sobrenome novamente!');

    if(texto == '' || texto == null){
        alert('Digite seu sobrenome novamente!');
        area.innerHTML = 'Bem Vindo ...';
    } else{
        area.innerHTML = 'Bem Vindo ' + nome + " " + texto + ", " + idade + " de idade";
    }
}