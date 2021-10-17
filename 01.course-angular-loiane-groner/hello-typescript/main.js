var minhaVar = 'minha variavel';
function minhaFunc(x, y) {
    return x + y;
}
// ES ou ES 2015
var num = 2;
var PI = 3.14;
// JavaScript Vanila (Puro)
var numeros = [1, 2, 3];
numeros.map(function (valor) {
    return valor * 2;
});
// ES 2015
numeros.map(function (valor) {
    valor * 2;
});
var Matematica = /** @class */ (function () {
    function Matematica() {
    }
    Matematica.prototype.soma = function (x, y) {
        return x + y;
    };
    return Matematica;
}());