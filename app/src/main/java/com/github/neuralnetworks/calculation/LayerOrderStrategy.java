package com.github.neuralnetworks.calculation;

import com.github.neuralnetworks.architecture.Connections;
import com.github.neuralnetworks.architecture.Layer;

import java.io.Serializable;
import java.util.List;

/**
 * Strategy for ordering layers within the neural network graph
 */
public interface LayerOrderStrategy extends Serializable {

    public List<ConnectionCandidate> order();

    public static class ConnectionCandidate {

	public Connections connection;
	public Layer target;

	public ConnectionCandidate(Connections connection, Layer target) {
	    super();
	    this.connection = connection;
	    this.target = target;
	}
    }
}
