(ns ogbe.fulcro.mui.icons.star-half
  #?(:cljs (:require
            ["@mui/icons-material/StarHalf" :default StarHalf]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-half
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarHalf)))