(ns ogbe.fulcro.mui.icons.padding-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PaddingRounded" :default PaddingRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-padding-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaddingRounded)))