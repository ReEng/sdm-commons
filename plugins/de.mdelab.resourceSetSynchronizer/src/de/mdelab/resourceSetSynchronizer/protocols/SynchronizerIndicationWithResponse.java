package de.mdelab.resourceSetSynchronizer.protocols;

import org.apache.log4j.Logger;
import org.eclipse.net4j.signal.IndicationWithResponse;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;

/**
 * Superclass of all SynchronizerIndications of the synchronization protocol. It already holds a
 * reference to the synchronizer adapter. It also receives the remote adapter's UUID (can be read
 * using getRemoteAdapterUUID()) and sends this synchronizer adapter's UUID before receiving or
 * sending additional data.
 * 
 * Subclasses must override doIndicating() to receive data, and doResponding() to send data back to
 * the client.
 * 
 * @author Stephan Hildebrandt.
 * 
 */
public abstract class SynchronizerIndicationWithResponse extends IndicationWithResponse {
    private static final Logger LOGGER = Logger.getLogger(SynchronizerIndicationWithResponse.class);

    private final SynchronizerAdapter synchronizerAdapter;

    private String remoteAdapterUUID;

    public SynchronizerIndicationWithResponse(SignalProtocol<?> protocol, Enum<?> literal,
            SynchronizerAdapter synchronizerAdapter) {
        super(protocol, literal);

        assert synchronizerAdapter != null;

        this.synchronizerAdapter = synchronizerAdapter;
    }

    /**
     * Return the synchronizer adapter on which this indication works.
     * 
     * @return the synchronizer adapter on which this indication works.
     */
    protected SynchronizerAdapter getSynchronizerAdapter() {
        return this.synchronizerAdapter;
    }

    /**
     * Return the UUID of the remote adapter.
     * 
     * @return the UUID of the remote adapter.
     */
    protected String getRemoteAdapterUUID() {
        return this.remoteAdapterUUID;
    }

    @Override
    protected final void indicating(ExtendedDataInputStream in) throws Exception {
        /*
         * Receive remoteAdapterUUID
         */
        this.remoteAdapterUUID = (String) in.readObject();

        LOGGER.info("indicating(), sender: " + this.remoteAdapterUUID);

        this.doIndicating(in);
    }

    @Override
    protected final void responding(ExtendedDataOutputStream out) throws Exception {
        LOGGER.info("responding(), receiver: " + this.remoteAdapterUUID);

        /*
         * Send this adapter UUID
         */
        out.writeObject(this.synchronizerAdapter.getAdapterUUID());

        this.doResponding(out);
    }

    /**
     * Receives data from the client using the provided input stream.
     * 
     * @param in
     * @throws Exception
     */
    protected abstract void doIndicating(ExtendedDataInputStream in) throws Exception;

    /**
     * Sends data to the client using the provided output stream.
     * 
     * @param out
     * @throws Exception
     */
    protected abstract void doResponding(ExtendedDataOutputStream out) throws Exception;

}
