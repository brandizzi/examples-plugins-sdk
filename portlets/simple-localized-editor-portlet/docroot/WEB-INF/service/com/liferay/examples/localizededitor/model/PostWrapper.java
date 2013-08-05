/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.examples.localizededitor.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Post}.
 * </p>
 *
 * @author adam
 * @see Post
 * @generated
 */
public class PostWrapper implements Post, ModelWrapper<Post> {
	public PostWrapper(Post post) {
		_post = post;
	}

	@Override
	public Class<?> getModelClass() {
		return Post.class;
	}

	@Override
	public String getModelClassName() {
		return Post.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("postId", getPostId());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long postId = (Long)attributes.get("postId");

		if (postId != null) {
			setPostId(postId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	/**
	* Returns the primary key of this post.
	*
	* @return the primary key of this post
	*/
	@Override
	public long getPrimaryKey() {
		return _post.getPrimaryKey();
	}

	/**
	* Sets the primary key of this post.
	*
	* @param primaryKey the primary key of this post
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_post.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the post ID of this post.
	*
	* @return the post ID of this post
	*/
	@Override
	public long getPostId() {
		return _post.getPostId();
	}

	/**
	* Sets the post ID of this post.
	*
	* @param postId the post ID of this post
	*/
	@Override
	public void setPostId(long postId) {
		_post.setPostId(postId);
	}

	/**
	* Returns the title of this post.
	*
	* @return the title of this post
	*/
	@Override
	public java.lang.String getTitle() {
		return _post.getTitle();
	}

	/**
	* Returns the localized title of this post in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized title of this post
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale) {
		return _post.getTitle(locale);
	}

	/**
	* Returns the localized title of this post in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this post. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale, boolean useDefault) {
		return _post.getTitle(locale, useDefault);
	}

	/**
	* Returns the localized title of this post in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized title of this post
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId) {
		return _post.getTitle(languageId);
	}

	/**
	* Returns the localized title of this post in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this post
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId,
		boolean useDefault) {
		return _post.getTitle(languageId, useDefault);
	}

	@Override
	public java.lang.String getTitleCurrentLanguageId() {
		return _post.getTitleCurrentLanguageId();
	}

	@Override
	public java.lang.String getTitleCurrentValue() {
		return _post.getTitleCurrentValue();
	}

	/**
	* Returns a map of the locales and localized titles of this post.
	*
	* @return the locales and localized titles of this post
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getTitleMap() {
		return _post.getTitleMap();
	}

	/**
	* Sets the title of this post.
	*
	* @param title the title of this post
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_post.setTitle(title);
	}

	/**
	* Sets the localized title of this post in the language.
	*
	* @param title the localized title of this post
	* @param locale the locale of the language
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale) {
		_post.setTitle(title, locale);
	}

	/**
	* Sets the localized title of this post in the language, and sets the default locale.
	*
	* @param title the localized title of this post
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_post.setTitle(title, locale, defaultLocale);
	}

	@Override
	public void setTitleCurrentLanguageId(java.lang.String languageId) {
		_post.setTitleCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized titles of this post from the map of locales and localized titles.
	*
	* @param titleMap the locales and localized titles of this post
	*/
	@Override
	public void setTitleMap(
		java.util.Map<java.util.Locale, java.lang.String> titleMap) {
		_post.setTitleMap(titleMap);
	}

	/**
	* Sets the localized titles of this post from the map of locales and localized titles, and sets the default locale.
	*
	* @param titleMap the locales and localized titles of this post
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitleMap(
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Locale defaultLocale) {
		_post.setTitleMap(titleMap, defaultLocale);
	}

	/**
	* Returns the content of this post.
	*
	* @return the content of this post
	*/
	@Override
	public java.lang.String getContent() {
		return _post.getContent();
	}

	/**
	* Returns the localized content of this post in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized content of this post
	*/
	@Override
	public java.lang.String getContent(java.util.Locale locale) {
		return _post.getContent(locale);
	}

	/**
	* Returns the localized content of this post in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized content of this post. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getContent(java.util.Locale locale,
		boolean useDefault) {
		return _post.getContent(locale, useDefault);
	}

	/**
	* Returns the localized content of this post in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized content of this post
	*/
	@Override
	public java.lang.String getContent(java.lang.String languageId) {
		return _post.getContent(languageId);
	}

	/**
	* Returns the localized content of this post in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized content of this post
	*/
	@Override
	public java.lang.String getContent(java.lang.String languageId,
		boolean useDefault) {
		return _post.getContent(languageId, useDefault);
	}

	@Override
	public java.lang.String getContentCurrentLanguageId() {
		return _post.getContentCurrentLanguageId();
	}

	@Override
	public java.lang.String getContentCurrentValue() {
		return _post.getContentCurrentValue();
	}

	/**
	* Returns a map of the locales and localized contents of this post.
	*
	* @return the locales and localized contents of this post
	*/
	@Override
	public java.util.Map<java.util.Locale, java.lang.String> getContentMap() {
		return _post.getContentMap();
	}

	/**
	* Sets the content of this post.
	*
	* @param content the content of this post
	*/
	@Override
	public void setContent(java.lang.String content) {
		_post.setContent(content);
	}

	/**
	* Sets the localized content of this post in the language.
	*
	* @param content the localized content of this post
	* @param locale the locale of the language
	*/
	@Override
	public void setContent(java.lang.String content, java.util.Locale locale) {
		_post.setContent(content, locale);
	}

	/**
	* Sets the localized content of this post in the language, and sets the default locale.
	*
	* @param content the localized content of this post
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setContent(java.lang.String content, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_post.setContent(content, locale, defaultLocale);
	}

	@Override
	public void setContentCurrentLanguageId(java.lang.String languageId) {
		_post.setContentCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized contents of this post from the map of locales and localized contents.
	*
	* @param contentMap the locales and localized contents of this post
	*/
	@Override
	public void setContentMap(
		java.util.Map<java.util.Locale, java.lang.String> contentMap) {
		_post.setContentMap(contentMap);
	}

	/**
	* Sets the localized contents of this post from the map of locales and localized contents, and sets the default locale.
	*
	* @param contentMap the locales and localized contents of this post
	* @param defaultLocale the default locale
	*/
	@Override
	public void setContentMap(
		java.util.Map<java.util.Locale, java.lang.String> contentMap,
		java.util.Locale defaultLocale) {
		_post.setContentMap(contentMap, defaultLocale);
	}

	@Override
	public boolean isNew() {
		return _post.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_post.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _post.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_post.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _post.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _post.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_post.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _post.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_post.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_post.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_post.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.LocaleException {
		_post.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public java.lang.Object clone() {
		return new PostWrapper((Post)_post.clone());
	}

	@Override
	public int compareTo(com.liferay.examples.localizededitor.model.Post post) {
		return _post.compareTo(post);
	}

	@Override
	public int hashCode() {
		return _post.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.examples.localizededitor.model.Post> toCacheModel() {
		return _post.toCacheModel();
	}

	@Override
	public com.liferay.examples.localizededitor.model.Post toEscapedModel() {
		return new PostWrapper(_post.toEscapedModel());
	}

	@Override
	public com.liferay.examples.localizededitor.model.Post toUnescapedModel() {
		return new PostWrapper(_post.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _post.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _post.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_post.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PostWrapper)) {
			return false;
		}

		PostWrapper postWrapper = (PostWrapper)obj;

		if (Validator.equals(_post, postWrapper._post)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Post getWrappedPost() {
		return _post;
	}

	@Override
	public Post getWrappedModel() {
		return _post;
	}

	@Override
	public void resetOriginalValues() {
		_post.resetOriginalValues();
	}

	private Post _post;
}