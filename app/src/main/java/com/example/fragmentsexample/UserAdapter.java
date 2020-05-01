//package com.example.fragmentsexample;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//
//import androidx.annotation.NonNull;
//import androidx.databinding.DataBindingUtil;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.fragmentsexample.databinding.UserListItemBinding;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
//
//    private List<User> userList;
//    private OnItemClickListener listener;
//
//    public interface OnItemClickListener {
//        void onClick(View view, int position);
//    }
//
//    public UserAdapter(List<User> userList) {
//        this.userList = userList;
//    }
//
//    public void setListener(OnItemClickListener listener) {
//        this.listener = listener;
//    }
//
//    public User getUserAt(int position) {
//        return userList.get(position);
//    }
//
//
//    @NonNull
//    @Override
//    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//        UserListItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.user_list_item, parent, false);
//        return new UserViewHolder(binding);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
//        holder.binding.user.setText(userList.get(position).getmName());
//        holder.binding.user.setText(userList.get(position).getmEmail());
//    }
//
//    @Override
//    public int getItemCount() {
//        return userList.size();
//    }
//
//    public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//        UserListItemBinding binding;
//
//        public UserViewHolder(@NonNull UserListItemBinding binding) {
//            super(binding.getRoot());
//            this.binding = binding;
//            this.binding.getRoot().setOnClickListener(this);
//        }
//
//        @Override
//        public void onClick(View v) {
//            listener.onClick(v, getAdapterPosition());
//        }
//
//    }
//
//}
