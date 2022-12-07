(ns ogbe.fulcro.mui.icons.cake-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CakeRounded" :default CakeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cake-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CakeRounded)))