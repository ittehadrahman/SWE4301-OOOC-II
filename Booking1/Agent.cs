using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Booking1
{
    internal class Agent
    {
        public void airbooking()
        {
            Air_Booking airbook = new Air_Booking();
            airbook.booking();
        }
        public void busbooking()
        {
            Bus_Booking busbook = new Bus_Booking();
            busbook.booking();
        }
    }
}
