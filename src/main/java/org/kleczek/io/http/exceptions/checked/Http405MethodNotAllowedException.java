package org.kleczek.io.http.exceptions.checked;

public class Http405MethodNotAllowedException extends Http4xException
{

    Http405MethodNotAllowedException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 405;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
