package ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javatask3_grocerylistapp.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtProductName, txtProductDescription;
    Public ImageView imageView;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

         imageView = (ImageView) itemView.findViewById(R.id.product_image);
        imageView = (ImageView) itemView.findViewById(R.id.product_image);
        imageView = (ImageView) itemView.findViewById(R.id.product_image);
    }

    @Override
    public void onClick(View view)
    {

    }
}
