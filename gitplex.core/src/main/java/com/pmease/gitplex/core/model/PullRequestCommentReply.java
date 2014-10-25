package com.pmease.gitplex.core.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class PullRequestCommentReply extends AbstractPullRequestCommentReply {

	@ManyToOne
	@JoinColumn(nullable=false)
	private PullRequestComment comment;
	
	@Override
	public PullRequestComment getComment() {
		return comment;
	}

	public void setComment(PullRequestComment comment) {
		this.comment = comment;
	}

}
