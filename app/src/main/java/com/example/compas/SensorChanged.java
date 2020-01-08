//package com.example.compas;
//
//import android.hardware.Sensor;
//import android.hardware.SensorEvent;
//import android.hardware.SensorEventListener;
//import android.hardware.SensorManager;
//import android.view.animation.Animation;
//import android.view.animation.RotateAnimation;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//public class SensorChanged implements SensorEventListener {
//
//    ImageView imgDynamic;
//    TextView txtDegrees, txtDegreesInfo;
//    private float actualDegrees = 0f;
//    private SensorManager sensorManager;
//
//    @Override
//    public void onSensorChanged(SensorEvent sensorEvent) {
//        float degree = Math.round(sensorEvent.values[0]);
//
//
//        txtDegrees.setText("Degree from North: ");
//        txtDegreesInfo.setText(Float.toString(degree) + "°");
//
//
//
//        RotateAnimation ra = new RotateAnimation(actualDegrees, -degree, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//
//        ra.setDuration(210);
//
//        ra.setFillAfter(true);
//
//        imgDynamic.startAnimation(ra);
//        actualDegrees = -degree;
//    }
//
//    @Override
//    public void onAccuracyChanged(Sensor sensor, int i) {
//
//    }
//}
