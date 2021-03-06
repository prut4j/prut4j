package nl.florianslob.modelchecking.base.api;

import java.util.Optional;

@Deprecated
public interface IEnvironment {

    String getName();
    Optional exchange(Optional box) throws Exception;

    default void send(ProtocolMessage m) throws Exception {
        exchange(Optional.of(m));
    }

    default Object receive() throws Exception {
        return exchange(Optional.empty()).get();
    }
}