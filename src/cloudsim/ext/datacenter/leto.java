/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cloudsim.ext.datacenter;

import java.util.Map;

/**
 *
 * @author Jayakrishna US
 */

public class leto extends VmLoadBalancer {
	
	private Map<Integer, VirtualMachineState> vmStatesList;
	private int currVm = -1;

	public leto(Map<Integer, VirtualMachineState> vmStatesList){
		super();
		
		this.vmStatesList = vmStatesList;
	}

	/* (non-Javadoc)
	 * @see cloudsim.ext.VMLoadBalancer#getVM()
	 */
	public int getNextAvailableVm(){
		currVm++;
		
		if (currVm >= vmStatesList.size()){
			currVm = 0;
		}
		
		allocatedVm(currVm);
		
		return currVm;
		
	}
}

