(ns ogbe.fulcro.mui.icons.stars-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StarsSharp" :default StarsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stars-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarsSharp)))