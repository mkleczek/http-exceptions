package org.kleczek.io.http.exceptions.checked;

public final class HttpUnknownCodeException extends HttpException
{
    private static final long serialVersionUID = 1L;
    private final int code;

    public HttpUnknownCodeException(final int code,
                                    final Details details)
    {
        super(details);
        this.code = code;
    }

    @Override
    public String getMessage()
    {
        return String.format("%d %s", code(), details());
    }

    @Override
    public int code()
    {
        return code;
    }
}
