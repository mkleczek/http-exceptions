package org.kleczek.io.http.exceptions.checked;

import java.util.Formattable;
import java.util.Optional;

public interface Details extends Formattable
{

    Optional<String> responseHeader(String string);

}
