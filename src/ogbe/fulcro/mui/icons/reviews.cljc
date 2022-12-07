(ns ogbe.fulcro.mui.icons.reviews
  #?(:cljs (:require
            ["@mui/icons-material/Reviews" :default Reviews]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reviews
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Reviews)))