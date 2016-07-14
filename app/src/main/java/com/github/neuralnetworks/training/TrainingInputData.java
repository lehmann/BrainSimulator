package com.github.neuralnetworks.training;

import com.github.neuralnetworks.tensor.Tensor;

import java.io.Serializable;

/**
 * Training input data with target value
 * Batch Input and target are provided as matrices (each column/row is one training example)
 */
public interface TrainingInputData extends Serializable {
    public Tensor getInput();
    public Tensor getTarget();
}
