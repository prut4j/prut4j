/* !!! IMPORTANT !!!
 * !!! This code is generated from a protocol definition. !!!
 * !!! Any Changes made to this code could be overridden. !!!
 * !!! If you want to change the protocol, change its definition and regenerate this code. !!!
 **/
package nl.florianslob.modelchecking.generated;

// Import types from the API
import nl.florianslob.modelchecking.base.api.v2.*;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class GeneratedChessProtocolWithPlayerNames implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFromalice2Tobob = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrombobToalice = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromaliceTobob = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "alice": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									monitor.wait();
									break;
								case 1:
									monitor.wait();
									break;
								case 2:
									monitor.wait();
									break;
								case 3:
									if (queueFrombobToalice.peek() != null ) {
										monitor.notifyAll();
										state = 4;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrombobToalice.take());
									}
									monitor.wait();
									break;
								case 4:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "bob";
										}
										if (receiver.equals("bob")) {
											monitor.notifyAll();
											state = 5;
											queueFromaliceTobob.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 5:
									monitor.wait();
									break;
								case 6:
									monitor.wait();
									break;
								default: throw new Exception("State number out of bounds");
							}
						}
					}
					
				}
			};
			case "alice2": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "bob";
										}
										if (receiver.equals("bob")) {
											monitor.notifyAll();
											state = 1;
											queueFromalice2Tobob.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 1:
									monitor.wait();
									break;
								case 2:
									monitor.wait();
									break;
								case 3:
									monitor.wait();
									break;
								case 4:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "bob";
										}
										if (receiver.equals("bob")) {
											monitor.notifyAll();
											state = 1;
											queueFromalice2Tobob.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 5:
									monitor.wait();
									break;
								case 6:
									monitor.wait();
									break;
								default: throw new Exception("State number out of bounds");
							}
						}
					}
					
				}
			};
			case "bob": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									monitor.wait();
									break;
								case 1:
									if (queueFromalice2Tobob.peek() != null ) {
										monitor.notifyAll();
										state = 2;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromalice2Tobob.take());
									}
									monitor.wait();
									break;
								case 2:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "alice";
										}
										if (receiver.equals("alice")) {
											monitor.notifyAll();
											state = 3;
											queueFrombobToalice.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 3:
									monitor.wait();
									break;
								case 4:
									monitor.wait();
									break;
								case 5:
									if (queueFromaliceTobob.peek() != null ) {
										monitor.notifyAll();
										state = 6;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromaliceTobob.take());
									}
									monitor.wait();
									break;
								case 6:
									monitor.wait();
									break;
								default: throw new Exception("State number out of bounds");
							}
						}
					}
					
				}
			};
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "bob","alice","alice2" };
	}
	
	@Override
	public Object[] dummies(){
		return new Object[]{"TestStringDummy"};
	}
	
	@Override
	public int getState(){
		return this.state;
	}
}