package my.spring;

import java.util.Objects;

public class StdOutMessageRenderer implements MRenderer
{
    private MProvider provider;

    public void render()
    {
        Objects.requireNonNull(provider,"provider cannot be null");

        System.out.println(provider.getMessage());
    }

    public void setProvider(MProvider provider)
    {
        this.provider = provider;
    }

    public MProvider getProvider()
    {
        return provider;
    }
}
