package com.github.neuralnetworks.training.random;

import com.github.neuralnetworks.tensor.Tensor;

import java.io.Serializable;

/**
 * Base interface for random initialization of arrays
 */
public interface RandomInitializer extends Serializable {
    public void initialize(Tensor t);
}
