# Practica-tdd-mvn


# junit-browserstack
[JUnit](http://junit.org/junit4/) Integration with BrowserStack.

![JUnit](http://junit.org/junit4/images/junit-logo.png)

## Setup
* Clone the repo
* Install dependencies `mvn install`

## Running your tests
* To run a parallel test, run `mvn test -P sample`

## Notes
* To test on a different set of browsers, check out our [platform configurator](https://www.browserstack.com/automate/java#setting-os-and-browser)
* You can export the environment variables for the Username and Access Key of your BrowserStack account. 

  * For Unix-like or Mac machines:
  ```
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
  ```

  * For Windows:
  ```
  set BROWSERSTACK_USERNAME=<browserstack-username>
  set BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
  ```
