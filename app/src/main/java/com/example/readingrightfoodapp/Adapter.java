package com.example.readingrightfoodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private List<PostPjojo> dataList;
    private Context context;

    public Adapter(Context context,List<PostPjojo> dataList){
        this.context=context;
        this.dataList = dataList;
    }



    @NonNull

    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.ViewHolder holder, int position) {
        int CategoryImage = Integer.parseInt(dataList.get(position).getStrCategoryThumb());
        String CategoryId =  dataList.get(position).getIdCategory();
        String CategoryName = dataList.get(position).getStrCategory();
        String CategoryDes = dataList.get(position).getStrCategoryDescription();

        holder.setData(CategoryImage,CategoryId,CategoryName,CategoryDes);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView CImg;
        private TextView CName;
        private TextView CId;
        private TextView CDesc;

        public ViewHolder(@NonNull  View itemView) {

            super(itemView);
            CImg = itemView.findViewById(R.id.strCategoryThumb);
            CName = itemView.findViewById(R.id.strCategory);
            CId = itemView.findViewById(R.id.idCategory);
            CDesc = itemView.findViewById(R.id.strCategoryDescription);




        }

        public void setData(int categoryImage, String categoryId, String categoryName, String categoryDes) {

        CImg.setImageResource(categoryImage);
        CId.setText(categoryId);
        CName.setText(categoryName);
        CDesc.setText(categoryDes);


        }
    }
}




