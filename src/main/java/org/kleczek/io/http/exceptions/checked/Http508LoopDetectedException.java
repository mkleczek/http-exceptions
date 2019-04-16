package org.kleczek.io.http.exceptions.checked;

public class Http508LoopDetectedException extends Http5xException
{

    Http508LoopDetectedException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 508;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
