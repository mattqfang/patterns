package com.optum.cs.training.patterns.composite;

import java.util.List;
import java.util.Optional;

import com.optum.cs.training.patterns.model.SelectionState;

public interface MultiSelectable {
	void select();
	void select(SelectionState state);
	void unselect();
	void add(MultiSelectable selectable);
	void remove(MultiSelectable selectable);
	List<MultiSelectable> getChildren();
	Optional<MultiSelectable> getParent();
	void setParent(MultiSelectable selectable);
	String getSelectionCriteria();
	
	String getLabel();
	void setLabel(String label);
	
	boolean isLeaf();
	boolean isRoot();
	
}
