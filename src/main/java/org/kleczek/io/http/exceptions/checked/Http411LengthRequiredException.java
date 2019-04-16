package org.kleczek.io.http.exceptions.checked;

public class Http411LengthRequiredException extends Http4xException
{

    Http411LengthRequiredException(final Details details)
    {
        super(details);
        // TODO Auto-generated constructor stub
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 411;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
