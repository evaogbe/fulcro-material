(ns ogbe.fulcro.mui.icons.stars
  #?(:cljs (:require
            ["@mui/icons-material/Stars" :default Stars]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stars
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Stars)))