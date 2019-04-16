package org.kleczek.io.http.exceptions.checked;

public class Http300MultipleChoicesException extends Http3xWithLocationException
{

    private static final long serialVersionUID = 1L;

    Http300MultipleChoicesException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 300;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
