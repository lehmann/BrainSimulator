package com.github.neuralnetworks.events;

import com.github.neuralnetworks.training.Trainer;

import java.util.EventObject;

/**
 * Base class for events during the training phase
 */
public class TrainingEvent extends EventObject {

    private static final long serialVersionUID = 1171094415041968041L;

    public TrainingEvent(Trainer<?> source) {
	super(source);
    }
}
