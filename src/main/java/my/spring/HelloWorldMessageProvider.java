package my.spring;

public class HelloWorldMessageProvider implements MProvider
{
    public String getMessage()
    {
        return "Hello, world";
    }
}
