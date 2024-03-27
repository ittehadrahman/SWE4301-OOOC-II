using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Booking1
{
    internal class Average
    {
        public void average(string a, params double[] values)
        {
            double sum = 0;
            int n = 0;
            double average;
            foreach (int value in values)
            {
                sum += value;
                n++;
            }
            average = sum / n;
            Console.WriteLine(a + Convert.ToString(average));

        }
    }
}
