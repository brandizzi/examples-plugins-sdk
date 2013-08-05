package com.liferay.examples.localizededitor;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.examples.localizededitor.model.Post;
import com.liferay.examples.localizededitor.model.impl.PostImpl;
import com.liferay.examples.localizededitor.service.PostLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class PostPortlet
 */
public class PostPortlet extends MVCPortlet {

	public void savePost(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException {
		long postId = ParamUtil.getLong(request, "postId");

		Map<Locale, String> title =
				LocalizationUtil.getLocalizationMap(request, "title");
		Map<Locale, String> content =
				LocalizationUtil.getLocalizationMap(request, "content");

		Post post = (postId > 0) 
				? PostLocalServiceUtil.getPost(postId) 
				: new PostImpl();

		post.setTitleMap(title);
		post.setContentMap(content);

		if (postId > 0) {
			post.setPostId(postId);
			PostLocalServiceUtil.updatePost(post);
		}
		else {
			post.setPostId(CounterLocalServiceUtil.increment(Post.class.getName()));
			PostLocalServiceUtil.addPost(post);
		}
	}

}
