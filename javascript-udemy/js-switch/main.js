// Switch

document.write('<br> Escolha seu pedido: <br>');
document.write('<br> 0 - sorvete <br>');
document.write('1 - suco <br>');
document.write('2 - coca-cola <br><br>');

function pedir() {
    x = Number(prompt("O que deseja pedir?"));

    switch (x) {
        case 0:
            alert("Seu pedido é sorvete");
            break;
        case 1:
            alert("Seu pedido é suco");
            break;
        case 2:
            alert("Seu pedido é coca-cola");
            break;
        default:
            alert("Essa item não contém no cardápio!");
            break;
    }
}