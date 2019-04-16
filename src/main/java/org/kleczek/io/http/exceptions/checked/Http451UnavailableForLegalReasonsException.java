package org.kleczek.io.http.exceptions.checked;

public class Http451UnavailableForLegalReasonsException extends Http4xException
{

    Http451UnavailableForLegalReasonsException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 451;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
