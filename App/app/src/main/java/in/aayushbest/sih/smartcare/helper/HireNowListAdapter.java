package in.aayushbest.sih.smartcare.helper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import in.aayushbest.sih.smartcare.R;

public class HireNowListAdapter extends RecyclerView.Adapter<HireNowListAdapter.HireNowViewHolder>{
      private final List<HirePerson> mPersonList;
      private LayoutInflater mInflater;

     public HireNowListAdapter(Context context,List<HirePerson> persons){
         mInflater=LayoutInflater.from(context);
         mPersonList=persons;
     }
    class HireNowViewHolder extends RecyclerView.ViewHolder{
        private ImageView mHireNowImage;
        private TextView mHireNowName;
        final HireNowListAdapter mAdapter;
        public HireNowViewHolder(View itemView, HireNowListAdapter adapter){
            super(itemView);
            mAdapter=adapter;
            mHireNowName=(TextView)itemView.findViewById(R.id.nameHireNow);
            mHireNowImage=(ImageView)itemView.findViewById(R.id.imageHireNow);
        }
    }
    @Override
    public HireNowListAdapter.HireNowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView=mInflater.inflate(R.layout.content_hire_now_list,parent,false);
        return new HireNowViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(HireNowListAdapter.HireNowViewHolder holder, int position) {
        HirePerson person=mPersonList.get(position);
        holder.mHireNowImage.setImageResource(person.getPersonImage());
        holder.mHireNowName.setText(person.getPersonName());

    }

    @Override
    public int getItemCount() {
        return mPersonList.size();
    }
}
