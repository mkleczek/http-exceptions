package org.kleczek.io.http.exceptions.checked;

public class Http415UnsupportedMediaTypeException extends Http4xException
{

    Http415UnsupportedMediaTypeException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 415;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
