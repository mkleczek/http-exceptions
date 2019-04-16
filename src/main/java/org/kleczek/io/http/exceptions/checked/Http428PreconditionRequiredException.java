package org.kleczek.io.http.exceptions.checked;

public class Http428PreconditionRequiredException extends Http4xException
{

    Http428PreconditionRequiredException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 428;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
