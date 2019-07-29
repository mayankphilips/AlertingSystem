# Alerting System
### Deatails: This is an alerting system that will generate patient details and compare the values with the standard values. If the values defer from standard values then it will raise an alert.
### The values for the patient deatils are generated randomly. The values are passed to the vital check module to check whether the values generated are valid or not.

vitalCheck Class
The vital check class has 3 functions which take body vitals data as an input and returns if any vital has gone out of the standard range.
The current system can output a single level alret , i.e either it will raise alert or not raise alert.

1. int pulseRateCheck : It takes and integer value "pulseRate" as an input that tells how many times a person\`s heart beat in a minute and returns an integer value encoding the level of alert that needs to be raised.

2. int tempratureCheck : It takes and integer value "temprature" as an input that tells how warm the person\`s body is at a given time and returns an integer value encoding the level of alert that needs to be raised.

3. int oxygenCheck : It takes and integer value "temprature" as an input that tells the amount of oxygen dissolved in person\`s blood and returns an integer value encoding the level of alert that needs to be raised.


alertRaising Class
The alert raising class has an function for raising the alert when reuired.

1. alertingFunc : It raises an alert according to the alertStatus it receives.
