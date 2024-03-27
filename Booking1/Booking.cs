using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Booking1
{
    abstract class Booking
    {
        string Name;
        int PhoneNumber;
        int ID;
        string Destination;

        public abstract void booking();
    }
}
