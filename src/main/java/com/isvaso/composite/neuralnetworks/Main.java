package com.isvaso.composite.neuralnetworks;

/**
 * How to connect ArrayList to Single element like a Neuron chains. <br>
 * This is how you can implement a composite design pattern in a very general fashion.
 */
public class Main {

    public static void main(String[] args) {
        Neuron neuron = new Neuron();
        Neuron neuron2 = new Neuron();
        NeuronLayer layer = new NeuronLayer();
        NeuronLayer layer2 = new NeuronLayer();

        neuron.connectTo(neuron2);
        neuron.connectTo(layer);
        layer.connectTo(neuron);
        layer.connectTo(layer2);
    }
}
