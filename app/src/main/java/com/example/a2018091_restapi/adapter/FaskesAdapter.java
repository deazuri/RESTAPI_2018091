package com.example.a2018091_restapi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a2018091_restapi.R;
import com.example.a2018091_restapi.model.DataItem;

import java.util.List;

public class FaskesAdapter extends RecyclerView.Adapter<FaskesAdapter.FaskesViewHolder>{
  private final Context context;
  private List<DataItem> faskesList;

  public FaskesAdapter(Context context, List<DataItem> faskesList) {
    this.context = context;
    this.faskesList = faskesList;
  }

  public List<DataItem> getFaskesList() {
    return faskesList;
  }

  public void setFaskesList(List<DataItem> faskesList) {
    this.faskesList = faskesList;
  }


  @NonNull
  @Override
  public FaskesAdapter.FaskesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_faskes, parent, false);
    return new FaskesViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull FaskesAdapter.FaskesViewHolder holder, int position) {
    DataItem faskesList = getFaskesList().get(position);
    holder.textView1.setText(faskesList.getNama());
    holder.textView2.setText(faskesList.getAlamat());
    holder.textView3.setText(faskesList.getStatus());
  }

  @Override
  public int getItemCount() {
    return faskesList.size();
  }

  public class FaskesViewHolder extends RecyclerView.ViewHolder {
    TextView textView1, textView2, textView3;
    public FaskesViewHolder(@NonNull View itemView) {
      super(itemView);
      textView1 = itemView.findViewById(R.id.textView1);
      textView2 = itemView.findViewById(R.id.textView2);
      textView3 = itemView.findViewById(R.id.textView3);
    }
  }
}
