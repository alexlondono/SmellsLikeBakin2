package com.aletronics.smellslikebakin;
//
// Created by Alex on 1/26/2017 for Project: SmellsLikeBakin2
//

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends RecyclerView.Adapter
{
	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

		return new ListViewHolder(view);
	}

	@Override
	public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
	{
		((ListViewHolder) holder).bindView(position);
	}

	@Override
	public int getItemCount()
	{
		return Recipes.names.length;
	}

	private class ListViewHolder extends RecyclerView.ViewHolder implements OnClickListener
	{
		private TextView mTextView;
		private ImageView mImageView;

		public ListViewHolder(View itemView)
		{
			super(itemView);
			mTextView = (TextView) itemView.findViewById(R.id.itemText);
			mImageView = (ImageView) itemView.findViewById(R.id.itemImage);
			itemView.setOnClickListener(this);
		}

		public void bindView(int position)
		{
			mTextView.setText(Recipes.names[position]);
			mImageView.setImageResource(Recipes.resourceIds[position]);
		}

		@Override
		public void onClick(View v)
		{

		}
	}
}
