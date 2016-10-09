package annotations;

import java.lang.annotation.*;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@Documented
@Retention(SOURCE)
public @interface CustomSuppressWarning {

    String value() default "all";
}
