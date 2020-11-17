using System;

namespace Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            string a;
            double b,c;
            a = Convert.ToString(Console.ReadLine());
            b = Convert.ToDouble(Console.ReadLine());
            c = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("TOTAL = R$ " + string.Format("{0:0.00}", (b + c * 0.15)));
            Console.ReadLine();
        }
    }
}
