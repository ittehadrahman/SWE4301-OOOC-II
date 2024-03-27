using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Booking1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Bus_Booking busbooking = new Bus_Booking();
            Air_Booking airbooking = new Air_Booking();
            airbooking.booking();
            busbooking.booking();

            Agent agent = new Agent();
            string type = Console.ReadLine();
            if (type == "airbook")
            {
                agent.airbooking();
            }
            else if(type == "busbook")
            {
                agent.busbooking();
            }
            Average av = new Average();
            av.average("interesting_average", 1, 2);
        }
    }
}