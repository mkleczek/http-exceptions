package org.kleczek.io.http.exceptions.checked;

public class Http422UnprocessableEntityException extends Http4xException
{

    Http422UnprocessableEntityException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 422;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
