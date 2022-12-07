(ns ogbe.fulcro.mui.icons.storm
  #?(:cljs (:require
            ["@mui/icons-material/Storm" :default Storm]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-storm
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Storm)))