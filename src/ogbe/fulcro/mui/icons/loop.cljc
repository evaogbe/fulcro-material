(ns ogbe.fulcro.mui.icons.loop
  #?(:cljs (:require
            ["@mui/icons-material/Loop" :default Loop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-loop
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Loop)))