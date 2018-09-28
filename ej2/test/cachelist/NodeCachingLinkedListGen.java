package cachelist;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.experimental.theories.ParametersSuppliedBy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(NodeCachingLinkedListSup.class)
public @interface NodeCachingLinkedListGen {

}
