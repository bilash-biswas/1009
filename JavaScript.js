var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var A = String(lines.shift());
var B = parseFloat(lines.shift());
var C = parseFloat(lines.shift());
var E = B + C * 0.15;
console.log("TOTAL = R$ " + E.toFixed(2));
