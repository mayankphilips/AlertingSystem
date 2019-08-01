# Alerting System

## Details: The user of this tool is a nurse in the ICU. The patient’s vital signs are sensed and formatted into a JSON-string by a patient-monitoring device. The formatted data keeps arriving periodically. When a parameter goes out-of-range, an alert is given on the console-output.

As in the real time scenario we don't have patient monitoring system, the project is modified such that it creates random patient data and evaluates it against standard values. If any of the parameter goes out of range then an alert is given.

ControllerModule Class
void controllerFunction : It takes input from input generating module and sends it to validate module. If any of the values are invalid then it gives notification in console. Then it sends patient data to vitalcheck module to check for the out of range values and give alert.

Inputgenerating class
getDetails: It will create random patient data by using a random generating function and pass it to Controller module.

vitalCheck Class
The vital check class has 3 functions which take body vitals data as an input and returns if any vital has gone out of the standard range.
The current system can output a single level alret , i.e either it will raise alert or not raise alert.

1. int pulseRateCheck : It takes and integer value "pulseRate" as an input that tells how many times a person\`s heart beat in a minute and returns an integer value encoding the level of alert that needs to be raised.

2. int tempratureCheck : It takes and integer value "temprature" as an input that tells how warm the person\`s body is at a given time and returns an integer value encoding the level of alert that needs to be raised.

3. int oxygenCheck : It takes and integer value "temprature" as an input that tells the amount of oxygen dissolved in person\`s blood and returns an integer value encoding the level of alert that needs to be raised.


alertRaising Class
The alert raising class has an function for raising the alert when reuired.

1. alertingFunc : It raises an alert according to the alertStatus it receives.
