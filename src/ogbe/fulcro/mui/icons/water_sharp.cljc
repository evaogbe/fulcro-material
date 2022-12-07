(ns ogbe.fulcro.mui.icons.water-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WaterSharp" :default WaterSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-water-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WaterSharp)))