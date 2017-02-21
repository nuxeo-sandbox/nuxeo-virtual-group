package org.nuxeo.virtual.group;

import java.util.LinkedList;
import java.util.List;

import org.nuxeo.ecm.platform.computedgroups.AbstractGroupComputer;
import org.nuxeo.ecm.platform.usermanager.NuxeoPrincipalImpl;

public class GroupComputer extends AbstractGroupComputer{

	@Override
	public List<String> getAllGroupIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getGroupMembers(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getGroupsForUser(NuxeoPrincipalImpl nuxeoPrincipal) {
		String role = (String) nuxeoPrincipal.getModel().getPropertyValue("role");
		String location = (String) nuxeoPrincipal.getModel().getPropertyValue("location");
		List<String> groups = new LinkedList();
		if(location != null && !"".equals(location) && role != null && !"".equals(role)){
			groups.add(location+"-"+role);
		}
		return groups;
	}

	@Override
	public List<String> getParentsGroupNames(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getSubGroupsNames(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
