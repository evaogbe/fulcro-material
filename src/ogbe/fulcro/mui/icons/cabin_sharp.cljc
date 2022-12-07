(ns ogbe.fulcro.mui.icons.cabin-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CabinSharp" :default CabinSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cabin-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CabinSharp)))