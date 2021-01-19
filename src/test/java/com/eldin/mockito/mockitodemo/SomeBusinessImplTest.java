package com.eldin.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int result=someBusiness.findTheGreatestFromAllData();
        assertEquals(24, result);

    }

    class DataServiceStub implements DataService {

        @Override
        public int[] retrieveAllData() {
            return new int[]{24,6,15};
        }
    }
}