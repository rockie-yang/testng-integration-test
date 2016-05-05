[![Build Status](https://travis-ci.org/rockiey/testng-integration-test.svg?branch=master)](https://travis-ci.org/rockiey/junit-integration-test)

# TestNG integration test example


TestNG is a great test framework. At most of the time is used for unit test.
While it can also be used for integration test.

### Unit Test

* is a software testing method
* test a piece of code
* methods as interfaces
* does not install the software being developed
* mocks can be used to isolate external dependencies

### Integration Test
* is a software testing method
* test the software. The software is called SUT (System Under Test)
* the whole software is a black box
* the software usually need be installed
* mocks can be used to isolate external dependencies

## A maven example project for integration test framework.

In this case, the project is a test project. All code are used for testing.
While we can split the testing into two parts.

* integration test
* unit test the integration test

### suporting function for integration test


Some functions will be needed to support intetration test. The following parts are most common functions needed for integration test.

* interface module which connect to the SUT (System Under Test), REST, WebService, SSH
* authentication in order to connect to the SUT.
* data collection



### unit test the testing

All unit tests are located at directory src/test.

Surefire plugin has great support for unit test.

Default tesgng pattern for file are

* ***/IT*.java
* ***/*IT.java

Execute unit test with following command

```bash
	mvn test
```

In the example the following two test cases will be run

```java
	class TestUnit1
	class TestUnit2
```

The report will be located at

```bash
	${basedir}/target/surefire-reports
```

## integration test

All integration test are located at directory src/test

Failsafe plugin has great support for integration test.

Default failsafe pattern for file are

* ***/IT*.java
* ***/*IT.java
* ***/*ITCase.java

Execute integration test with following command.

```bash
	mvn verify
```

Execute only integration test by ignore unit test with following command.
```bash
	mvn verify -Dskip.surefire.tests
```

In the example the following two test cases will be run

```java
	class TestUnit1
	class TestUnit2
```

The report will be located at

```bash
	${basedir}/target/failsafe-reports
```


### smoke integration

Default failsafe pattern configured in this example is

* ***/ITSmoke*.java

Execute integration test with following command.

```bash
	mvn verify -P smoke
```

Execute only integration test by ignore unit test with following command.
```bash
	mvn verify -P smoke -Dskip.surefire.tests
```

### nightly integration

Default failsafe pattern configured in this example is

* ***/ITNightly*.java

Execute integration test with following command.

```bash
	mvn verify -P nightly
```

Execute only integration test by ignore unit test with following command.
```bash
	mvn verify -P nightly -Dskip.surefire.tests
```

### weekly integration test

Default failsafe pattern configured in this example is

* ***/ITWeekly*.java

Execute integration test with following command.

```bash
	mvn verify -P weekly
```

Execute only integration test by ignore unit test with following command.
```bash
	mvn verify -P weekly -Dskip.surefire.tests
```

