fn main(){
   let mut line1 = String::new();
   std::io::stdin().read_line(&mut line1).unwrap();
   
   let mut line2 = String::new();
   std::io::stdin().read_line(&mut line2).unwrap();
   let num2: f64 = line2.trim().parse().ok().expect("Try");
   
   let mut line3 = String::new();
   std::io::stdin().read_line(&mut line3).unwrap();
   let num3: f64 = line3.trim().parse().ok().expect("Try");
   
   println!("TOTAL = R$ {0:.2}", (num2 + num3 * 0.15))
}
