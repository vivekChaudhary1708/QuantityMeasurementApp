package com.bridgelabz.quantitymeasurement;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testEquality_SameValue() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(feet1.equals(feet2));
    }

    @Test
    public void testEquality_DifferentValue() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(2.0);
        assertFalse(feet1.equals(feet2));
    }

    @Test
    public void testEquality_NullComparison() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(feet1.equals(null));
    }

    @Test
    public void testEquality_NonNumericInput() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        Object nonNumeric = new Object();
        assertFalse(feet1.equals(nonNumeric));
    }

    @Test
    public void testEquality_SameReference() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(feet1.equals(feet1));
    }


    @Test
    public void testInchesEquality_SameValue() {
        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches i2 = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(i1.equals(i2));
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches i2 = new QuantityMeasurementApp.Inches(2.0);
        assertFalse(i1.equals(i2));
    }

    @Test
    public void testInchesEquality_NullComparison() {
        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i1.equals(null));
    }

    @Test
    public void testInchesEquality_NonNumericInput() {
        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
        Object nonNumeric = new Object();
        assertFalse(i1.equals(nonNumeric));
    }

    @Test
    public void testInchesEquality_SameReference() {
        QuantityMeasurementApp.Inches i1 = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(i1.equals(i1));
    }
}