package com.arcrobotics.ftclib.hardware;


/**
 * This class is a class for the Rev Color Sensor V3, a sensor that includes both a RGB color sensor
 * and an IR Proximity sensor.
 *
 * <p>Normally, one must declare this sensor as two objects, a DistanceSensor and a ColorSensor
 */
public class RevColorSensorV3 {

  SensorRevTOFDistance sensorRevTOFDistance;
  SensorColor sensorColor;

  /*
  public RevColorSensorV3(HardwareMap hardwareMap, String name){
      sensorTOFDistance = new SensorTOFDistance(hardwareMap.get(DistanceSensor.class, name));
      sensorColor = new SensorColor(hardwareMap.get(ColorSensor.class, name));
  } */

  public SensorColor getSensorColor() {
    return sensorColor;
  }

  public SensorRevTOFDistance getSensorRevTOFDistance() {
    return sensorRevTOFDistance;
  }

  // @Override
  public void disable() {}

  // @Override
  public String getDeviceType() {
    return "Rev Color Sensor V3";
  }
}
