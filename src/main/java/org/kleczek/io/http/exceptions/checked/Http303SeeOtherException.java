package org.kleczek.io.http.exceptions.checked;

public class Http303SeeOtherException extends Http3xWithLocationException
{

    private static final long serialVersionUID = 1L;

    Http303SeeOtherException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 303;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
