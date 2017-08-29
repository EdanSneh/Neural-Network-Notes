import java.lang.Math;

class NSigmoid{
  float bias;
  float weight;
  public NSigmoid(float bias, float weight){
    this.bias = bias;
    this.weight = weight;
  }
  public float compute(float input){
    float output = (float)(1.0) / (float)(1.0+Math.exp(-(this.weight*input-this.bias)));
    return output;
  }


}
