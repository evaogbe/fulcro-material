(ns ogbe.fulcro.mui.icons.pets-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PetsSharp" :default PetsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pets-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PetsSharp)))