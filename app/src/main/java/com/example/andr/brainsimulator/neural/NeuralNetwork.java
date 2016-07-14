package com.example.andr.brainsimulator.neural;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by André on 02/07/2015.
 */
public class NeuralNetwork {

    private int numInputs;

    private int numOutputs;

    //storage for each layer of neurons including the output layer
    private List<Layer> layers;

    private float bias;

    public NeuralNetwork() {

    }

    //calculates the outputs from a set of inputs
    List<Double> Update(List<Double> inputs) {
        List<Double> outputs;

        int cWeight = 0;
        //first check that we have the correct amount of inputs
        if (inputs.size() != numInputs)
        {
            //just return an empty vector if incorrect.
            return Collections.emptyList();
        }
        outputs = new ArrayList<Double>();
        //For each layer....
        for (int i=0; i<numHiddenLayers + 1; ++i)
        {
            if ( i > 0 )
            {
                inputs = outputs;
            }
            outputs.clear();

            cWeight = 0;

            //for each neuron sum the (inputs * corresponding weights).Throw
            //the total at our sigmoid function to get the output.
            for (int j=0; j<layers.get(i).numNeurons; ++j)
            {
                double netinput = 0;
                int NumInputs = layers.get(i).neurons.get(j).numInputs;

                //for each weight
                for (int k=0; k<NumInputs - 1; ++k)
                {
                    //sum the weights x inputs
                    netinput += layers.get(i).neurons.get(j).weight[k] *
                            inputs.get(cWeight++);
                }
                //add in the bias
                netinput += layers.get(i).neurons.get(j).weight[NumInputs-1] * bias;

                //we can store the outputs from each layer as we generate them.
                //The combined activation is first filtered through the sigmoid
                //function
                outputs.add(Sigmoid(netinput, CParams::dActivationResponse));

                cWeight = 0;
            }
        }
        return outputs;
    }

    //sigmoid response curve
    double Sigmoid(double activation, double response) {
        return 0.0;
    }
}
