package com.github.neuralnetworks.calculation;

import com.github.neuralnetworks.tensor.Tensor;

import java.io.Serializable;

/**
 * Implementations should calculate the output error, which will be presented as the result of the training. This is not the same as the output error derivative in BP.
 */
public interface OutputError extends Serializable {
    public void addItem(Tensor networkOutput, Tensor targetOutput);
    public float getTotalNetworkError();
    public int getTotalErrorSamples();
    public int getTotalInputSize();
    public void reset();
}
