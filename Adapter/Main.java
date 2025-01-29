package Adapter;

import Adapter.Adaptee.WeightMachineImpl;
import Adapter.Adapter.WeightMachineAdapter;
import Adapter.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
