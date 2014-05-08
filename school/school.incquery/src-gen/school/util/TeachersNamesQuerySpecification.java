package school.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import school.TeachersNamesMatcher;

/**
 * A pattern-specific query specification that can instantiate TeachersNamesMatcher in a type-safe way.
 * 
 * @see TeachersNamesMatcher
 * @see TeachersNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class TeachersNamesQuerySpecification extends BaseGeneratedQuerySpecification<TeachersNamesMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TeachersNamesQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected TeachersNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TeachersNamesMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "school.teachersNames";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("TN");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("TN", "java.lang.String"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_TN = body.getOrCreateVariableByName("TN");
      PVariable var__T = body.getOrCreateVariableByName("_T");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_TN, "TN")
      ));
      
      new TypeBinary(body, CONTEXT, var__T, var_TN, getFeatureLiteral("http://school.ecore", "Teacher", "name"), "http://school.ecore/Teacher.name");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TeachersNamesQuerySpecification INSTANCE = make();
    
    public static TeachersNamesQuerySpecification make() {
      return new TeachersNamesQuerySpecification();					
      
    }
  }
  
}
