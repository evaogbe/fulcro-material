(ns ogbe.fulcro.mui.icons.man-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ManRounded" :default ManRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-man-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ManRounded)))