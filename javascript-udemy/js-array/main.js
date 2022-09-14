var lista = ['bea', 'gui', 'mae', 1];

console.log(lista.length);
console.log(lista.indexOf('gui'));
console.log(lista.join("/"));
console.log(lista.pop());
console.log(lista.shift());
console.log(lista[1] = 'bea');
console.log(lista.push('mae'));

if(lista.indexOf('mae') > -1){
    alert('Esse item está na lista!');
} else {
    alert('item não encontrado');
}