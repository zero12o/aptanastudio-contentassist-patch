/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.json.parsing.ast;

/**
 * JSONNumberNode
 */
public class JSONNumberNode extends JSONNode
{
	private String _text;

	/**
	 * JSONNumberNode
	 */
	public JSONNumberNode(String text)
	{
		super(JSONNodeType.NUMBER);

		this._text = text;
	}

	/*
	 * (non-Javadoc)
	 * @see com.aptana.editor.json.parsing.ast.JSONNode#accept(com.aptana.editor.json.parsing.ast.JSONTreeWalker)
	 */
	@Override
	public void accept(JSONTreeWalker walker)
	{
		walker.visit(this);
	}

	/*
	 * (non-Javadoc)
	 * @see com.aptana.parsing.ast.ParseNode#getText()
	 */
	public String getText()
	{
		return this._text;
	}
}
