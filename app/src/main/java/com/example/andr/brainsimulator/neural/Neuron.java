package com.example.andr.brainsimulator.neural;

/**
 * Created by André on 02/07/2015.
 */
public class Neuron {

        //the number of inputs into the neuron

        int numInputs;
        //the weights for each input
        double weight[];

        Neuron() {
                //we need an additional weight for the bias hence the +1
                for (int i=0; i<numInputs+1; ++i)

                {

                        //set up the weights with an initial random value

                        weight.push_back(RandomClamped());

                }
        }
}
