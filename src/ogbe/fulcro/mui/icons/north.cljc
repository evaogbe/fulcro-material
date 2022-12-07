(ns ogbe.fulcro.mui.icons.north
  #?(:cljs (:require
            ["@mui/icons-material/North" :default North]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-north
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory North)))