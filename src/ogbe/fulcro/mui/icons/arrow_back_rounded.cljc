(ns ogbe.fulcro.mui.icons.arrow-back-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ArrowBackRounded" :default ArrowBackRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-back-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowBackRounded)))