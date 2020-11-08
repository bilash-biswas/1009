import 'dart:io';
void main(){
  String num1;
  double num2,num3;

  num1 = stdin.readLineSync();
  num2 = double.parse(stdin.readLineSync());
  num3 = double.parse(stdin.readLineSync());

  double mul = num2 + (num3 * 0.15);
  var num = mul.toStringAsFixed(2);
  print("TOTAL = R\$ $num");
}
