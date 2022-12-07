(ns ogbe.fulcro.mui.icons.grain-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GrainSharp" :default GrainSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grain-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GrainSharp)))