(ns ogbe.fulcro.mui.icons.arrow-forward-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ArrowForwardRounded" :default ArrowForwardRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-forward-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowForwardRounded)))