package com.github.neuralnetworks.training.backpropagation;

import com.github.neuralnetworks.tensor.Tensor;

import java.io.Serializable;

/**
 * Implementations provide output error derivative
 */
public interface OutputErrorDerivative extends Serializable {
    public void getOutputErrorDerivative(Tensor activation, Tensor target, Tensor result);
}
