package org.kleczek.io.http.exceptions.checked;

public class Http302FoundException extends Http3xWithLocationException
{
    private static final long serialVersionUID = 1L;

    Http302FoundException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 302;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
