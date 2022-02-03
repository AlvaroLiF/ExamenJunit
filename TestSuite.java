package cuentas;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestMovimiento.class,TestCuenta.class})

public class TestSuite{

}
