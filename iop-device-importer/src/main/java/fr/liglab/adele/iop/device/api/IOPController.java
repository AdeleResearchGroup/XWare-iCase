package fr.liglab.adele.iop.device.api;

import de.mannheim.wifo2.iop.identifier.IServiceID;
import de.mannheim.wifo2.iop.service.functionality.ICall;
import fr.liglab.adele.cream.annotations.ContextService;
import fr.liglab.adele.cream.annotations.State;

public @ContextService interface IOPController {

    public static @State  String BROADCAST_PORT		="broadcast.port";

    public static @State  String BROADCAST_ADDRESS	="broadcast.address";

	public Object invoke(IServiceID target, ICall call);
    
}
