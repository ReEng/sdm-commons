package de.mdelab.resourceSetSynchronizer.protocols;

import org.apache.log4j.Logger;
import org.eclipse.net4j.signal.RequestWithConfirmation;
import org.eclipse.net4j.signal.SignalProtocol;
import org.eclipse.net4j.util.io.ExtendedDataInputStream;
import org.eclipse.net4j.util.io.ExtendedDataOutputStream;

import de.mdelab.resourceSetSynchronizer.SynchronizerAdapter;

/**
 * Superclass of all synchronizer requests. It can be parameterized with the type of the expected
 * result and holds a reference to the synchronizer adapter on which this request works (usually
 * also the adapter that sent the request). Furthermore, it sends this adapter's UUID and receives
 * the remote adapter's UUID before sending or receiving any additional data.
 * 
 * Subclasses must override doRequesting() to send data, and doConfirming() to receive the response
 * from the server.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <RESULT>
 */
public abstract class SynchronizerRequestWithConfirmation<RESULT> extends RequestWithConfirmation<RESULT> {
    protected static final Logger LOGGER = Logger.getLogger(SynchronizerRequestWithConfirmation.class);

    private final SynchronizerAdapter synchronizerAdapter;

    private String remoteAdapterUUID;

    public SynchronizerRequestWithConfirmation(SignalProtocol<?> protocol, Enum<?> literal,
            SynchronizerAdapter synchronizerAdapter) {
        super(protocol, literal);

        assert synchronizerAdapter != null;

        this.synchronizerAdapter = synchronizerAdapter;
    }

    /**
     * Return the synchronizer adapter to which this request belongs.
     * 
     * @return the synchronizer adapter to which this request belongs.
     */
    protected SynchronizerAdapter getSynchronizerAdapter() {
        return this.synchronizerAdapter;
    }

    /**
     * Return the remote adapter's UUID.
     * 
     * @return the remote adapter's UUID.
     */
    protected String getRemoteAdapterUUID() {
        return this.remoteAdapterUUID;
    }

    @Override
    protected final void requesting(ExtendedDataOutputStream out) throws Exception {
        LOGGER.info("requesting()");

        /*
         * Send own adapter UUID
         */
        out.writeObject(this.synchronizerAdapter.getAdapterUUID());

        this.doRequesting(out);
    }

    @Override
    protected final RESULT confirming(ExtendedDataInputStream in) throws Exception {
        /*
         * receive remote adapter UUID
         */
        this.remoteAdapterUUID = (String) in.readObject();

        LOGGER.info("confirming(), sender: " + this.remoteAdapterUUID);

        return this.doConfirming(in);
    }

    /**
     * Sends the request to the server using the provided output stream.
     * 
     * @param out
     * @throws Exception
     */
    protected abstract void doRequesting(ExtendedDataOutputStream out) throws Exception;

    /**
     * Receives the server's response using the provided input stream.
     * 
     * @param in
     * @return
     * @throws Exception
     */
    protected abstract RESULT doConfirming(ExtendedDataInputStream in) throws Exception;
}
