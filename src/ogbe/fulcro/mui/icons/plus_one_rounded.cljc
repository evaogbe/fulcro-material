(ns ogbe.fulcro.mui.icons.plus-one-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PlusOneRounded" :default PlusOneRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-plus-one-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlusOneRounded)))