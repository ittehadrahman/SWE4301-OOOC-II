class Error {
    public void Code(String s)
    {
        if(s.compareTo("C_400") == 0)
        {
            System.out.println("Bad Request");
        }
        if(s.compareTo("C_401") == 0)
        {
            System.out.println("Unauthorized");
        }
        if(s.compareTo("C_403") == 0)
        {
            System.out.println("Forbidden");
        }
        if(s.compareTo("C_404") == 0)
        {
            System.out.println("Not Found");
        }
        if(s.compareTo("C_408") == 0)
        {
            System.out.println("Request Timeout");
        }
    }
}
