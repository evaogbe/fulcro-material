(ns ogbe.fulcro.mui.icons.arrow-left-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ArrowLeftRounded" :default ArrowLeftRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-left-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowLeftRounded)))