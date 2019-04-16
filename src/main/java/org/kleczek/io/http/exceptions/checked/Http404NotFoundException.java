package org.kleczek.io.http.exceptions.checked;

public class Http404NotFoundException extends Http4xException
{

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 404;

    Http404NotFoundException(final Details details)
    {
        super(details);
    }

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
