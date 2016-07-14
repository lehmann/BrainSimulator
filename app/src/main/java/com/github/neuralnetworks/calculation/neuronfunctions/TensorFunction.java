package com.github.neuralnetworks.calculation.neuronfunctions;

import com.github.neuralnetworks.tensor.Tensor;

import java.io.Serializable;

/**
 * Implementations provide transformations to the elements of the matrix
 */
public interface TensorFunction extends Serializable {
    public void value(Tensor inputOutput);
}
