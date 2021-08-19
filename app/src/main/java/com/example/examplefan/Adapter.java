package com.example.examplefan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Model> modelMain;

    public Adapter(List<Model> modelMain){
        this.modelMain = modelMain;
        System.out.println(this.modelMain);
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_main, parent, false);
        System.out.println(this.modelMain);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int pos){
        final Model data = modelMain.get(pos);

        holder.firstName.setText(data.getFirstName());
        holder.lastName.setText(data.getLastName());
        holder.email.setText(data.getEmail());
    }

    @Override
    public int getItemCount(){
        return modelMain.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView firstName;
        public TextView lastName;
        public TextView email;

        public ViewHolder(View itemView){
            super(itemView);

            firstName = itemView.findViewById(R.id.tFirstName);
            lastName = itemView.findViewById(R.id.tLastName);
            email = itemView.findViewById(R.id.tEmail);
        }
    }

}
