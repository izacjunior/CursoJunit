package atividade9;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"atividade5", "atividade8"})
//@IncludePackages("atividade8")
//@ExcludePackages("atividade8")
//@SelectClasses({RepetirTests.class, NestedTests.class})
//@IncludeClassNamePatterns("^.*SuiteA?$")
@ExcludeClassNamePatterns("^.*SuiteA?$")
//@IncludeTags("Teste1")
//@ExcludeTags("Teste1")

public class SuiteTestes {

}
