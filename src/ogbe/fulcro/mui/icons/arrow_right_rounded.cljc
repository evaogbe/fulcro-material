(ns ogbe.fulcro.mui.icons.arrow-right-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ArrowRightRounded" :default ArrowRightRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-right-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowRightRounded)))