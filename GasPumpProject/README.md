Software Systems Architectures
===================================================================================================

Gas Pump Project
----------------------------------------------------------------------------------------------------------------------------------------------------------

 Design patterns:
----------------------------------------------------------------------------------------------------------------------------------------------------------
i. State pattern

  Classes related to this de-centralized state pattern are implemented in com.gaspumpproj.model.state package. Here, StateVMModel is the "VM" class. State is the abstract State superclass. There are state classes as InitialState, S0, S1, S2, S3, S4, S5, S6, S8 which are the subclasses of State class. These State classes are responsible for performing both actions and state transitions.

ii. Strategy pattern:

This pattern is Implemented in package "com.gaspumpproj.strategy.action" of the GasPumpProj. OutputProcessor is the client class that needs to be initialized with proper action strategies. Each package contains 3 classes. One super and two subclasses which corresponds to each action. One class is the abstract strategy that groups different implementations of a specific strategy. The other 2 classes are GasPump-1 and GasPump-2 specific implementation for the meta-actions of the model.

iii. Abstract factory pattern

This pattern is implemented in package "com.gaspumpproj.factory" of the GasPumpProj. AbstractFactory is the abstract superclass. AbstractFactoryGP1 is the factory that returns the necessary driver objects for GasPump1. AbstractFactoryGP2 is the factory that returns the necessary driver objects for GasPump2.


Run Project
------------------------------------------------------------------------------------------------------------------------------------------------------------

To run the executable go to the specific directory where we stored GasPumpProj.jar.
Then use following command to run the project.

    $ java -jar GasPumpProj.jar 
    
