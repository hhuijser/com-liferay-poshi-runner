/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.poshi.runner.elements;

import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.Node;

import java.util.List;

/**
 * @author Kenji Heigel
 */
public class MacroDefinitionPoshiElement extends DefinitionPoshiElement {

	@Override
	public PoshiElement clone(Element element) {
		if (isElementType(getElementName(), element)) {
			return new MacroDefinitionPoshiElement(element);
		}

		return null;
	}

	@Override
	public PoshiElement clone(
		PoshiElement parentPoshiElement, String readableSyntax) {

		if (isElementType(readableSyntax)) {
			return new MacroDefinitionPoshiElement(
				parentPoshiElement, readableSyntax);
		}

		return null;
	}

	protected MacroDefinitionPoshiElement() {
	}

	protected MacroDefinitionPoshiElement(Element element) {
		super(element);
	}

	protected MacroDefinitionPoshiElement(
	List<Attribute> attributes, List<Node> nodes) {

		super(attributes, nodes);
	}

	protected MacroDefinitionPoshiElement(
		PoshiElement parentPoshiElement, String readableSyntax) {

		super(parentPoshiElement, readableSyntax);
	}

	protected String getFileType() {
		return _FILE_TYPE;
	}

	private static final String _FILE_TYPE = "macro";

}