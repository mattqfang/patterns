package com.optum.cs.training.patterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.optum.cs.training.patterns.model.SelectionState;

public class MultiSelectableImpl implements MultiSelectable {

	private Optional<MultiSelectable> parent = Optional.empty();
	private List<MultiSelectable> chrildren = new ArrayList<>();
	private String label;
	private SelectionState selection;
	@Override
	public void select() {
		selection = SelectionState.YES;
		if (!isRoot()) {
			parent.get().select(SelectionState.YES);
		}
		if (!isLeaf()) {
			chrildren.stream().peek(s -> s.select(SelectionState.YES));
		}
	}
	
	protected void updateParentSelection() {
		if (isRoot()) {
			return;
		}
		
		
	} 
	
	@Override
	public void select(SelectionState state) {
		selection = state;
	}

	@Override
	public void unselect() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(MultiSelectable selectable) {
		this.chrildren.add(selectable);
	}

	@Override
	public void remove(MultiSelectable selectable) {
		this.chrildren.remove(selectable);
	}

	@Override
	public List<MultiSelectable> getChildren() {
		return this.chrildren;
	}

	@Override
	public Optional<MultiSelectable> getParent() {
		return this.parent;
	}

	@Override
	public void setParent(MultiSelectable selectable) {
		this.parent = Optional.ofNullable(selectable);
	}

	@Override
	public String getSelectionCriteria() {
		return "";
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public boolean isLeaf() {
		return chrildren.isEmpty();
	}

	@Override
	public boolean isRoot() {
		return !parent.isPresent();
	}

	
}
