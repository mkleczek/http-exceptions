package org.kleczek.io.http.exceptions.checked;

public class Http424FailedDependencyException extends Http4xException
{

    Http424FailedDependencyException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 424;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
